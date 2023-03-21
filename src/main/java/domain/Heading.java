package domain;

public class Heading {

    public CardinalDirection turnRight(CardinalDirection direction) {
        return switch (direction) {
            case NORTH -> CardinalDirection.EAST;
            case SOUTH -> CardinalDirection.WEST;
            case WEST -> CardinalDirection.NORTH;
            case EAST -> CardinalDirection.SOUTH;
        };
    }

    public CardinalDirection turnLeft(CardinalDirection direction) {
        return switch (direction) {
            case NORTH -> CardinalDirection.WEST;
            case SOUTH -> CardinalDirection.EAST;
            case WEST -> CardinalDirection.SOUTH;
            case EAST -> CardinalDirection.NORTH;
        };
    }
}
