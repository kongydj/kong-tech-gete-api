//package com.example.gete.plugin.controller;
//
//import com.example.gete.plugin.model.entity.Entrance;
//import com.example.gete.plugin.model.request.EntranceRequest;
//import com.example.gete.plugin.response.ApiResponse;
//import com.example.gete.plugin.service.EntranceService;
//import com.example.gete.plugin.view.SerializeView;
//import com.fasterxml.jackson.annotation.JsonView;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.validation.Valid;
//
//@RequestMapping("/entrance")
//@Controller
//public class EntranceController {
//
//    /*private final EntranceService entranceService;
//
//    public EntranceController(EntranceService entranceService) {
//        this.entranceService = entranceService;
//    }
//
//    @PostMapping
//    @JsonView(SerializeView.NextDetail.class)
//    public ResponseEntity<ApiResponse<Entrance>> createSchedule(@Valid @RequestBody EntranceRequest entranceRequest) {
//        Entrance entrance = entranceService.createEntrance(entranceRequest);
//        return new ResponseEntity<>(new ApiResponse<>(entrance), HttpStatus.OK);
//    }*/
//}
