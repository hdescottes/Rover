package com.test.rover.direction;

/**
 * Constants used for the different possible direction
 */
public enum DirectionEnum {

    N(new NorthDirection()),
    E(new EastDirection()),
    S(new SouthDirection()),
    W(new WestDirection());

    private Direction direction;

    DirectionEnum(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }
}
