package Junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCourse {
    @Test
    void successfulDivision() {
        int validnum1 = 6;
        int validnum2 = 2;
        int expected = 3; // Expected result of 6 / 2
        int result = Junit.Code.Course.div(validnum1, validnum2);
        assertEquals(expected, result, "6 divided by 2 should be 3");
    }

    public static void main(String[] args) {
        System.out.println("I am present for doing unit testing");
    }
}
