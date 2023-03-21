package domain;

public class Rover {

    private CardinalDirection direction;

    private final Heading heading = new Heading();

    public Rover(CardinalDirection startDirection) {
        direction = startDirection;
    }

    public CardinalDirection getDirection() {
        return this.direction;
    }

    public void turnLeft() {
        this.direction = heading.turnLeft(this.direction);
    }
}
