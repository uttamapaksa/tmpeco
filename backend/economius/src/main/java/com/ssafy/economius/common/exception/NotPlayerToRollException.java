package com.ssafy.economius.common.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NotPlayerToRollException extends RuntimeException {

    private int code;
    private String message;
    private int roomId;
    private Long requestPlayer;
    private Long playerToRoll;
}
