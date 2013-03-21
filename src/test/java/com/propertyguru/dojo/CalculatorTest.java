package com.propertyguru.dojo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void enterAndShowANumber() {
        Calculator calculator = new Calculator();

        calculator.enter("0");

        assertThat(calculator.display(), equalTo("0"));
    }
}
