package com.plesk;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    FizzBuzz fizzBuzz;
    TestInfo testInfo;
    TestReporter testReporter;

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        fizzBuzz = new FizzBuzz();
    }

//    @BeforeEach
//    void init() {
//        fizzBuzz = new FizzBuzz();
//    }

    @Nested
    @DisplayName("Testing single numbers")
    class testSingleNumbers {

        @Test
        //@DisplayName("")
        void testFizzBuzzReturns1() {
            assertEquals("1", fizzBuzz.processNumber(1));
            assertEquals("2", fizzBuzz.processNumber(2));
            assertEquals("4", fizzBuzz.processNumber(4));
            assertEquals("11", fizzBuzz.processNumber(11));
        }

        @Test
        void testFizzBuzzMultipleOf3() {
            assertEquals("Fizz", fizzBuzz.processNumber(3));
        }

        @Test
        void testFizzBuzzMultipleOf5() {
            assertEquals("Buzz", fizzBuzz.processNumber(5));
        }

        @Test
        void testFizzBuzzMultipleOf3And5() {
            assertEquals("FizzBuzz", fizzBuzz.processNumber(15));
        }
    }

    @Nested
    @Tag("Math")
    @DisplayName("Testing all 100 numbers ")
    class testAllNumbers {

        @Test
        void testFizzBuzzAll100Numbers () {
           System.out.print("Running " + testInfo.getDisplayName() + " with tags " + testInfo.getTags());
            for (int i = 1; i <= 100; i++) {
                fizzBuzz.processNumber(i);
            }
        }
    }
}

/*
    Write a program that prints the numbers from 1 to 100.
        But for multiples of three print "Fizz" instead of the
        number and for the multiples of five print "Buzz". For
        numbers which are multiples of both three and five
        print "FizzBuzz".

        Sample output:

        1
        2
        Fizz
        4
        Buzz
        Fizz
        7
        8
        Fizz
        Buzz
        11
        Fizz
        13
        14
        FizzBuzz
        16
        17
        Fizz
        19
        Buzz
        ... etc up to 100
*/