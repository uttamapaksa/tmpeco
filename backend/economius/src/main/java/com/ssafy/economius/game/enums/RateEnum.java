package com.ssafy.economius.game.enums;

import lombok.Getter;

@Getter
public enum RateEnum {

    INITIAL_INTEREST_RATE(5),
    INITIAL_ZERO_VALUE(0),
    MAX_GAME_TURN(1000),
    INITIAL_MONEY(100_000_000),
    ISSUE_COUNT(5),

    FIRST_PRIZE_TAX(15),
    SECOND_PRIZE_TAX(10),
    THIRD_PRIZE_TAX(5),
    FOURTH_PRIZE_TAX(0),

    FIRST_PRIZE(1),
    SECOND_PRIZE(2),
    THIRD_PRIZE(3),
    FOURTH_PRIZE(4),

    SALARY(3000000),
    GOLD_RATE_LOWER_BOUND(-5),
    GOLD_RATE_UPPER_BOUND(10),

    STOCK_RATE_LOWER_BOUND(-5),
    STOCK_RATE_UPPER_BOUND(10),

    BUILDING_RATE_LOWER_BOUND(-5),
    BUILDING_RATE_UPPER_BOUND(10),

    INTEREST_RATE_LOWER_BOUND(-5),
    INTEREST_RATE_UPPER_BOUND(10),

    MAX_BOARD_SIZE(36),
    STOCK_DIVIDENDS_RATE(100),

    MOVEMENT_CARD_LOWER_BOUND(1),
    MOVEMENT_CARD_UPPER_BOUND(10),
    MOVEMENT_CARD_SIZE(3),
    ;



    private final int value;

    RateEnum(int value) {
        this.value = value;
    }
}
