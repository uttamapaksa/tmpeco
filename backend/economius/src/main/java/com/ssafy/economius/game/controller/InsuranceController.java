package com.ssafy.economius.game.controller;

import com.ssafy.economius.game.dto.request.InsuranceRequest;
import com.ssafy.economius.game.dto.response.InsuranceVisitResponse;
import com.ssafy.economius.game.dto.response.SavingVisitResponse;
import com.ssafy.economius.game.service.InsuranceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Slf4j
@Controller
@RequiredArgsConstructor
public class InsuranceController {

    private final SimpMessagingTemplate template; //특정 Broker로 메세지를 전달
    private final InsuranceService insuranceService;

    @MessageMapping(value = "/{roomId}/insurance")
    public void visitInsurance(@DestinationVariable int roomId, InsuranceRequest insuranceRequest) {
        Map<String, Object> headers = Map.of("success", true);
        InsuranceVisitResponse insuranceVisitResponse = insuranceService.visitInsurance(roomId, insuranceRequest);
        template.convertAndSend("/sub/" + roomId, headers);
    }

    @MessageMapping(value = "/{roomId}/joinInsurance")
    public void joinInsurance(@DestinationVariable int roomId, InsuranceRequest insuranceRequest) {
        Map<String, Object> headers = Map.of("success", true);
        insuranceService.joinInsurance(roomId, insuranceRequest);
        template.convertAndSend("/sub/" + roomId, headers);
    }

    @MessageMapping(value = "/{roomId}/finishInsurance")
    public void finishInsurance(@DestinationVariable int roomId, InsuranceRequest insuranceRequest) {
        Map<String, Object> headers = Map.of("success", true);
        insuranceService.stopInsurance(roomId, insuranceRequest);
        template.convertAndSend("/sub/" + roomId, headers);
    }

}