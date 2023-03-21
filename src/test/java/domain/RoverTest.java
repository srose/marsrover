package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class RoverTest {

    @Test
    public void rover_starting_north_turn_left_heading_west() {

        var rover = new Rover(CardinalDirection.NORTH);

        rover.turnLeft();

        Assertions.assertThat(rover.getDirection())
                .isEqualTo(CardinalDirection.WEST);
    }

}
