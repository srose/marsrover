package domain;

import java.util.Map;

public enum Heading {
    EAST, WEST, SOUTH, NORTH;

    static final Map<Heading, Heading> turnLeftCode = Map.of(
                Heading.NORTH, Heading.WEST,
                Heading.EAST, Heading.NORTH,
                Heading.SOUTH, Heading.EAST,
                Heading.WEST, Heading.SOUTH);

    public static final Map<Heading, Heading> turnRightCode = Map.of(
                Heading.NORTH, Heading.EAST,
                Heading.EAST, Heading.SOUTH,
                Heading.SOUTH, Heading.WEST,
                Heading.WEST, Heading.NORTH);

    public static Heading turnLeft(Heading heading) {
        return turnLeftCode.get(heading);
    }

    public static Heading turnRight(Heading heading) {
        return turnRightCode.get(heading);
    }
}



