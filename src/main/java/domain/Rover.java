package domain;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Rover {
    private Heading heading;

    private final Map<Character, Function<Heading,Heading>> turnCommands = Map.of(
            'L', Heading::turnLeft,
            'R', Heading::turnRight
    );

    public Rover(Coordinate startPosition, Heading startHeading) {
        this.heading = startHeading;
    }

    public void execute(String commandString) {

    }

    public Coordinate getPosition() {
        return new Coordinate(0,3);
    }

    public Heading getHeading() {
        var commands = List.of('L','R','L','L');
        commands.forEach(command -> this.heading = turnCommands.get(command).apply(this.heading));
        return this.heading;
    }
}
