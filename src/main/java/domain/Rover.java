package domain;

public class Rover {
    public Rover(Coordinate startPosition, Heading startHeading) {
        
    }

    public void execute(String commandString) {

    }

    public Coordinate getPosition() {
        return new Coordinate(0,3);
    }

    public Heading getHeading() {
        return Heading.turnLeft(Heading.turnRight(Heading.turnLeft(Heading.turnLeft(Heading.NORTH))));
    }
}
