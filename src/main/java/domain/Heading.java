package domain;

public class Heading {
    private CardinalDirection direction;

    public Heading(CardinalDirection direction) {
        this.direction = direction;
    }

    public void turnRight() {
        this.direction = switch (this.direction) {
            case NORTH -> CardinalDirection.EAST;
            case SOUTH -> CardinalDirection.WEST;
            case WEST -> CardinalDirection.NORTH;
            case EAST -> CardinalDirection.SOUTH;
        };
    }

    public CardinalDirection getDirection() {
        return direction;
    }

    public void turnLeft() {
        this.direction = switch (this.direction) {
            case NORTH -> CardinalDirection.WEST;
            case SOUTH -> CardinalDirection.EAST;
            case WEST -> CardinalDirection.SOUTH;
            case EAST -> CardinalDirection.NORTH;
        };
    }
}
