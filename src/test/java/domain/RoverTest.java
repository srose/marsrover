package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static domain.Heading.NORTH;
import static domain.Heading.SOUTH;

public class RoverTest {

    @Test
    public void executeCommandChain() {
        var startPosition = new Coordinate(2, 2);
        var startHeading = NORTH;
        var rover = new Rover(startPosition, startHeading);

        rover.execute("FLFFLRL");

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Coordinate(0,3));
        Assertions.assertThat(rover.getHeading()).isEqualTo(SOUTH);
    }

}
