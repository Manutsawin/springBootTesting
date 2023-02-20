package com.king.mongkut.testing.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CalculationServiceTest {

    @InjectMocks
    private CalculationService calculationService;

    @Test

    void should_return_success_when_call_plus_with_number1_and_number2(){
        int result = calculationService.plus("2","3");
        assertEquals(5,result);
    }

    @Test
    void should_return_error_when_call_plus_with_number1_and_number2() {
        assertThrows(NumberFormatException.class, () -> {
            calculationService.plus("b", "3");
        });
    }

    void should_return_number_when_call_minus_given_number1_and_number2() {
        // Given
        // When
        int actual = calculationService.minus("10", "5");

        // Then
        assertEquals(5, actual);
    }

    @Test
    void should_return_minus_one_when_call_minus_given_number1_is_X() {
        // Given
        // When
        int actual = calculationService.minus("X", "5");

        // Then
        assertEquals(-1, actual);
    }

    @Test
    void should_return_divide_value_when_call_divided_given_umber1_more_than_number2(){
        //Given
        String number1 = "10";

        //When
        int actual = calculationService.devided(number1,"5");

        //then
        assertEquals(2,actual);
    }

    @Test
    void  should_return_divided_value_when_call_divided_given_number1_less_than_number2(){
        //Given
        String number1 = "10";

        //When
        int actual = calculationService.devided("5",number1);

        //then
        assertEquals(0,actual);
    }

    @Test
    void given_number1_ss_string(){
        //Given
        String number1 = "10";

        //When
        int actual = calculationService.devided("XX",number1);

        //then
        assertEquals(-1,actual);
    }
}