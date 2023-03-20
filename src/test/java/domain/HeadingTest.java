package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class HeadingTest {

    @ParameterizedTest()
    @MethodSource("cardinalDirectionCombinationsTurnRight")
    void starting_turning_right_is_correct(CardinalDirection starting, CardinalDirection result) {
        var heading = new Heading(starting);

        heading.turnRight();

        var direction = heading.getDirection();

        assertThat(direction).isEqualTo(result);
    }

    private static Stream<Arguments> cardinalDirectionCombinationsTurnRight() {
        return Stream.of(
                arguments(CardinalDirection.NORTH, CardinalDirection.EAST),
                arguments(CardinalDirection.EAST, CardinalDirection.SOUTH),
                arguments(CardinalDirection.SOUTH, CardinalDirection.WEST),
                arguments(CardinalDirection.WEST, CardinalDirection.NORTH)
        );
    };

    @ParameterizedTest()
    @MethodSource("cardinalDirectionCombinationsTurnLeft")
    void starting_turning_left_is_correct(CardinalDirection starting, CardinalDirection result) {
        var heading = new Heading(starting);

        heading.turnLeft();

        var direction = heading.getDirection();

        assertThat(direction).isEqualTo(result);
    }

    private static Stream<Arguments> cardinalDirectionCombinationsTurnLeft() {
        return Stream.of(
                arguments(CardinalDirection.NORTH, CardinalDirection.WEST),
                arguments(CardinalDirection.EAST, CardinalDirection.NORTH),
                arguments(CardinalDirection.SOUTH, CardinalDirection.EAST),
                arguments(CardinalDirection.WEST, CardinalDirection.SOUTH)
        );
    };

}
