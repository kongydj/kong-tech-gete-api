package com.example;

//import com.example.gete.plugin.model.Member;
//import com.example.gete.plugin.repository.MemberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableResourceServer
@SpringBootApplication
//@EnableAutoConfiguration(exclude = RepositoryRestMvcAutoConfiguration.class)
public class ApiApplication {

	@Bean
	public ResourceServerConfigurerAdapter resourceServerConfigurerAdapter() {
		return new ResourceServerConfigurerAdapter() {
			@Override
			public void configure(HttpSecurity http) throws Exception {
				http.headers().frameOptions().disable();
				http.authorizeRequests()
						.antMatchers("/members", "/members/**").access("#oauth2.hasScope('read')")
						//.antMatchers("/op/**").access("#oauth2.hasScope('IOS')")
						.antMatchers("/op/**").access("#oauth2.hasScope('AAA')")
						//.antMatchers("/test/**").permitAll()
						.anyRequest().authenticated();
			}
		};
	}

	/**
	 * API를 조회시 출력될 테스트 데이터
	 * @param memberRepository
	 * @return
	 */
	/*@Bean
	public CommandLineRunner commandLineRunner(MemberRepository memberRepository) {
		return args -> {
			memberRepository.save(new Member("이철수", "chulsoo", "test111"));
			memberRepository.save(new Member("김정인", "jungin11", "test222"));
			memberRepository.save(new Member("류정우", "jwryu991", "test333"));
		};
	}*/

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
}

/**
 * 권한 코드 테스트를 위해 만든 컨트롤러
 */
@Controller
@RequestMapping("test")
class TestController {
	@RequestMapping("authorization-code")
	@ResponseBody
	public String authorizationCodeTest(@RequestParam("code") String code) {
		String curl = String.format("curl " +
				"-F \"grant_type=authorization_code\" " +
				"-F \"code=%s\" " +
				"-F \"scope=read\" " +
				"-F \"client_id=foo\" " +
				"-F \"client_secret=bar\" " +
				"-F \"redirect_uri=http://localhost:8080/test/authorization-code\" " +
				"\"http://foo:bar@localhost:8080/oauth/token\"", code);
		return curl;
	}

	@RequestMapping("login")
	@ResponseBody
	public void login() {
		System.out.println("----login----");
	}
}

/**
 * 권한 코드 테스트를 위해 만든 컨트롤러
 */
@Controller
@RequestMapping("op")
class OpController {
	@RequestMapping("authorization-code")
	@ResponseBody
	public String authorizationCodeTest(@RequestParam("code") String code) {
		String curl = String.format("curl " +
				"-F \"grant_type=authorization_code\" " +
				"-F \"code=%s\" " +
				"-F \"scope=read\" " +
				"-F \"client_id=foo\" " +
				"-F \"client_secret=bar\" " +
				"-F \"redirect_uri=http://localhost:8080/test/authorization-code\" " +
				"\"http://foo:bar@localhost:8080/oauth/token\"", code);
		return curl;
	}

	@RequestMapping("login")
	@ResponseBody
	public void login() {
		System.out.println("----login----");
	}
}