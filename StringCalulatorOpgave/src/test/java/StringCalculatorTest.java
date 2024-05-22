import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void calculate_GivenEmptyString_Return0() {
        //Arrange: maak een lege string
        String string = "";
        //Act: calculate de string
        int result = StringCalculator.calculate(string);
        //Assert: het resultaat moet 0 zijn
    }
}