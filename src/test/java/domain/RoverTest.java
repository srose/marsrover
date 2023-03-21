package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class RoverTest {

    @Test
    public void rover_starting_north_turn_left_heading_west() {

        CardinalDirection startCoordinate = CardinalDirection.NORTH;

        Heading headingStub = Mockito.mock(Heading.class);
        Mockito.when(headingStub.turnLeft(CardinalDirection.NORTH)).
                thenReturn(CardinalDirection.WEST);

        var rover = new Rover(startCoordinate, headingStub);

        rover.turnLeft();

        var heading = rover.getDirection();

        Assertions.assertThat(heading)
                .isEqualTo(CardinalDirection.WEST);
    }

}
