package com.example.gete.plugin.model.entity;

import com.example.gete.plugin.view.SerializeView;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "entrance")
//public class Entrance extends BaseEntity {
public class Entrance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(name = "name")
    private String name;

    @Setter
    @Column(name = "date")
    private LocalDate date;

    @Setter
    @Column(name = "last_connect_time")
    private LocalDateTime lastConnectTime;

    @Setter
    @Column(name = "macAddr")
    private String macAddr;

    /*@Builder
    public Entrance(String name, LocalDate date, LocalDateTime lastConnectTime, String macAddr) {
        this.name = name;
        this.date = date;
        this.lastConnectTime = lastConnectTime;
        this.macAddr = macAddr;
    }

    @JsonIgnore
    public String getSelfHashCode() {
        return String.format("%04d%02d%02d", date.getYear(), date.getMonthValue(), date.getDayOfMonth())
                + name
                + date
                + lastConnectTime
                + macAddr;
    }*/
}
