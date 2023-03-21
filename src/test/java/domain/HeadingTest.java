package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class HeadingTest {

    @ParameterizedTest
    @EnumSource
    public void turnLeft(Heading heading) {
        Assertions.assertThat(Heading.turnLeft(heading)).isEqualTo(Heading.turnLeftCode.get(heading));
    }

    @ParameterizedTest
    @EnumSource
    public void turnRight(Heading heading) {
        Assertions.assertThat(Heading.turnRight(heading)).isEqualTo(Heading.turnRightCode.get(heading));
    }
}
