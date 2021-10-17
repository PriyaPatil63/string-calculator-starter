package calculator;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


class StringCalculatorShould {
	
    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    
    
}
