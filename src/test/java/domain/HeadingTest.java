package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HeadingTest {

    @Test
    void starting_turning_right_is_correct() {
        var heading = new Heading(CardinalDirection.NORTH);

        heading.turnRight();

        var direction = heading.getDirection();
        assertThat(direction).isEqualTo(CardinalDirection.EAST);

    }

}
