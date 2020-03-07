package com.plesk;

class FizzBuzz {

    public String processNumber(int toConvertNo) {

        if ((toConvertNo % 15) == 0) {
            return "FizzBuzz";
        }
        else if ((toConvertNo % 3) == 0) {
            return "Fizz";
        }
        else if ((toConvertNo % 5) == 0) {
            return  "Buzz";
        }
        else {
            return String.valueOf(toConvertNo);
        }
    }
}

//test1

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