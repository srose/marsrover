package domain;

public class Rover {

    private CardinalDirection direction;

    private final Heading heading;

    public Rover(CardinalDirection startDirection) {
        direction = startDirection;
        this.heading = new Heading();
    }

    public Rover(CardinalDirection startDirection, Heading heading) {
        direction = startDirection;
        this.heading = heading;
    }

    public CardinalDirection getDirection() {
        return this.direction;
    }

    public void turnLeft() {
        this.direction = heading.turnLeft(this.direction);
    }
}
