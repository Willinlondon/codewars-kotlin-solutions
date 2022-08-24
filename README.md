# Codewars Solutions
#### by Willinlondon

Being a Codewars enthusiast, I have resisted the urge to use an IDE for a while now when solving katas, but as they have gotten harder and more complex, I have finally caved in and starting using Intellij to help me solve my Kotlin challenges at least.

The good news is that this allows me to upload and keep track of my solutions here. Feel free to compare, but I strongly urge you to complete any kata before looking at solutions online!

Below you will find all the instructions for each of the katas I have solved as well as internal links to the solution and tests.

Note that some kata use custom matchers for their tests and in many cases the tests have been rewritten and may use different imports. I have also added my own tests on some of the katas.

# Table of contents
* [8 kyu](#8kyu)
  1. [String Repeat](#StringRepeat)
  2. [Even or Odd](#EvenOrOdd)
  3. [Opposite Number](#OppositeNumber)
  4. [Return Negative](#ReturnNegative)
  5. [Convert a Number to a String!](#ConvertNumberToString)
  6. [Sum of positive](#SumOfPositive)
* [7 kyu](#7kyu)
  1. [Small enough? - Beginner](#SmallEnough)
  2. [Maximum Multiple](#MaximumMultiple)
  3. [Two Oldest Ages](#TwoOldestAges)
* [6 kyu](#6kyu)
  1. [Find the missing letter](#FindTheMissingLetter)
  2. [Equal Sides of an Array](#EqualSidesOfAnArray)
  3. [Roman Numerals Encoder](#RomanNumeralsEncoder)
  4. [Tribonacci Sequence](#TribonacciSequence)
  5. [Roman Numerals Decoder](#RomanNumeralsDecoder)
* [5 kyu](#5kyu)
* [4 kyu](#4kyu)
   1. [The Observed PIN](#TheObservedPIN)
* [3 kyu](#3kyu)
* [2 kyu](#2kyu)
* [1 kyu](#1kyu)

## 8 kyu <a name="8kyu"></a>

### String Repeat <a name="StringRepeat"></a>

* [Solution](src/main/kotlin/kyu8/stringRepeat.kt)<br>
* [Tests](src/test/kotlin/kyu8/StringRepeatTest.kt)

Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.

Examples (input -> output)
6, "I"     -> "IIIIII"
5, "Hello" -> "HelloHelloHelloHelloHello"

### Even or Odd <a name="EvenOrOdd"></a>

* [Solution](src/main/kotlin/kyu8/evenOrOdd.kt)<br>
* [Tests](src/test/kotlin/kyu8/EvenOrOddTest.kt)

Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.

### Opposite Number <a name="OppositeNumber"></a>

* [Solution](src/main/kotlin/kyu8/oppositeNumber.kt)<br>
* [Tests](src/test/kotlin/kyu8/OppositeNumberTest.kt)

Very simple, given an integer or a floating-point number, find its opposite.

Examples:

1: -1
14: -14
-34: 34

### Return Negative <a name="ReturnNegative"></a>

* [Solution](src/main/kotlin/kyu8/returnNegative.kt)<br>
* [Tests](src/test/kotlin/kyu8/ReturnNegativeTest.kt)

In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

Examples
Kata().makeNegative(1)  // return -1
Kata().makeNegative(-5) // return -5
Kata().makeNegative(0)  // return 0
Notes
The number can be negative already, in which case no change is required.
Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.

### Convert a Number to a String! <a name="#ConvertNumberToString"></a>

* [Solution](src/main/kotlin/kyu8/convertNumberToString.kt)<br>
* [Tests](src/test/kotlin/kyu8/ConvertNumberToStringTest.kt)

We need a function that can transform a number (integer) into a string.

What ways of achieving this do you know?

Examples (input --> output):
123  --> "123"
999  --> "999"
-100 --> "-100"

### Sum of positive <a name="SumOfPositive"></a>

* [Solution](src/main/kotlin/kyu8/sumOfPositive.kt)<br>
* [Tests](src/test/kotlin/kyu8/SumOfPositiveTest.kt)

You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.

## 7 kyu <a name="7kyu"></a>

### Small enough? - Beginner <a name="SmallEnough"></a>

* [Solution](src/main/kotlin/kyu7/smallEnough.kt)<br>
* [Tests](src/test/kotlin/kyu7/SmallEnoughTest.kt)

You will be given an array and a limit value. You must check that all values in the array are below or equal to the limit value. If they are, return true. Else, return false.

You can assume all values in the array are numbers.

### Maximum Multiple <a name="MaximumMultiple"></a>

* [Solution](src/main/kotlin/kyu7/maximumMultiple.kt)<br>
* [Tests](src/test/kotlin/kyu7/MaximumMultipleTest.kt)

Task
Given a Divisor and a Bound , Find the largest integer N , Such That ,

Conditions :
N is divisible by divisor

N is less than or equal to bound

N is greater than 0.

Notes
The parameters (divisor, bound) passed to the function are only positive values .
It's guaranteed that a divisor is Found .
Input >> Output Examples
maxMultiple (2,7) ==> return (6)
Explanation:
(6) is divisible by (2) , (6) is less than or equal to bound (7) , and (6) is > 0 .

maxMultiple (10,50)  ==> return (50)
Explanation:
(50) is divisible by (10) , (50) is less than or equal to bound (50) , and (50) is > 0 .*

maxMultiple (37,200) ==> return (185)
Explanation:
(185) is divisible by (37) , (185) is less than or equal to bound (200) , and (185) is > 0 .

### Two Oldest Ages <a name="TwoOldestAges"></a>

* [Solution](src/main/kotlin/kyu7/twoOldestAges.kt)<br>
* [Tests](src/test/kotlin/kyu7/TwoOldestAgesTest.kt)

The two oldest ages function/method needs to be completed. It should take an array of numbers as its argument and return the two highest numbers within the array. The returned value should be an array in the format [second oldest age,  oldest age].

The order of the numbers passed in could be any order. The array will always include at least 2 items. If there are two or more oldest age, then return both of them in array format.

For example (Input --> Output):

[1, 2, 10, 8] --> [8, 10]<br>
[1, 5, 87, 45, 8, 8] --> [45, 87]<br>
[1, 3, 10, 0] --> [3, 10]<br>

## 6 kyu <a name="6kyu"></a>

### Find the missing letter <a name="FindTheMissingLetter"></a>

* [Solution](src/main/kotlin/kyu6/findTheMissingLetter.kt)<br>
* [Tests](src/test/kotlin/kyu6/FindTheMissingLetterTest.kt)

#Find the missing letter

Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.

You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
The array will always contain letters in only one case.

Example:

['a','b','c','d','f'] -> 'e' ['O','Q','R','S'] -> 'P'

["a","b","c","d","f"] -> "e"
["O","Q","R","S"] -> "P"
(Use the English alphabet with 26 letters!)

Have fun coding it and please don't forget to vote and rank this kata! :-)

I have also created other katas. Take a look if you enjoyed this kata!

### Equal Sides of an Array <a name="EqualSidesOfAnArray"></a>

* [Solution](src/main/kotlin/kyu6/equalSidesOfAnArray.kt)<br>
* [Tests](src/test/kotlin/kyu6/EqualSidesOfAnArrayTest.kt)

You are going to be given an array of integers. Your job is to take that array and find an index N where the sum of the integers to the left of N is equal to the sum of the integers to the right of N. If there is no index that would make this happen, return -1.

For example:

Let's say you are given the array {1,2,3,4,3,2,1}:
Your function will return the index 3, because at the 3rd position of the array, the sum of left side of the index ({1,2,3}) and the sum of the right side of the index ({3,2,1}) both equal 6.

Let's look at another one.
You are given the array {1,100,50,-51,1,1}:
Your function will return the index 1, because at the 1st position of the array, the sum of left side of the index ({1}) and the sum of the right side of the index ({50,-51,1,1}) both equal 1.

Last one:
You are given the array {20,10,-80,10,10,15,35}
At index 0 the left side is {}
The right side is {10,-80,10,10,15,35}
They both are equal to 0 when added. (Empty arrays are equal to 0 in this problem)
Index 0 is the place where the left side and right side are equal.

Note: Please remember that in most programming/scripting languages the index of an array starts at 0.

Input:
An integer array of length 0 < arr < 1000. The numbers in the array can be any integer positive or negative.

Output:
The lowest index N where the side to the left of N is equal to the side to the right of N. If you do not find an index that fits these rules, then you will return -1.

Note:
If you are given an array with multiple answers, return the lowest correct index.

### Roman Numerals Encoder <a name="RomanNumeralsEncoder"></a>

* [Solution](src/main/kotlin/kyu6/romanNumeralsEncoder.kt)<br>
* [Tests](src/test/kotlin/kyu6/RomanNumeralsEncoderTest.kt)

Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral representation of that integer.

Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

Example:

encode(1000) // should return "M"
Help:

Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000
Remember that there can't be more than 3 identical symbols in a row.

More about roman numerals - http://en.wikipedia.org/wiki/Roman_numerals

### Tribonacci Sequence <a name="TribonacciSequence"></a>

* [Solution](src/main/kotlin/kyu6/tribonacciSequence.kt)<br>
* [Tests](src/test/kotlin/kyu6/TribonacciSequenceTest.kt)

Well met with Fibonacci bigger brother, AKA Tribonacci.

As the name may already reveal, it works basically like a Fibonacci, but summing the last 3 (instead of 2) numbers of the sequence to generate the next. And, worse part of it, regrettably I won't get to hear non-native Italian speakers trying to pronounce it :(

So, if we are to start our Tribonacci sequence with [1, 1, 1] as a starting input (AKA signature), we have this sequence:

[1, 1 ,1, 3, 5, 9, 17, 31, ...]
But what if we started with [0, 0, 1] as a signature? As starting with [0, 1] instead of [1, 1] basically shifts the common Fibonacci sequence by once place, you may be tempted to think that we would get the same sequence shifted by 2 places, but that is not the case and we would get:

[0, 0, 1, 1, 2, 4, 7, 13, 24, ...]
Well, you may have guessed it by now, but to be clear: you need to create a fibonacci function that given a signature array/list, returns the first n elements - signature included of the so seeded sequence.

Signature will always contain 3 numbers; n will always be a non-negative number; if n == 0, then return an empty array (except in C return NULL) and be ready for anything else which is not clearly specified ;)

If you enjoyed this kata more advanced and generalized version of it can be found in the Xbonacci kata

Personal thanks to Professor Jim Fowler on Coursera for his awesome classes that I really recommend to any math enthusiast and for showing me this mathematical curiosity too with his usual contagious passion :)

### Roman Numerals Decoder <a name="RomanNumeralsDecoder"></a>

* [Solution](src/main/kotlin/kyu6/romanNumeralsDecoder.kt)<br>
* [Tests](src/test/kotlin/kyu6/RomanNumeralsDecoderTest.kt)

Create a function that takes a Roman numeral as its argument and returns its value as a numeric decimal integer. You don't need to validate the form of the Roman numeral.

Modern Roman numerals are written by expressing each decimal digit of the number to be encoded separately, starting with the leftmost digit and skipping any 0s. So 1990 is rendered "MCMXC" (1000 = M, 900 = CM, 90 = XC) and 2008 is rendered "MMVIII" (2000 = MM, 8 = VIII). The Roman numeral for 1666, "MDCLXVI", uses each letter in descending order.

Example:

decode("XXI") // should return 21
Help:

Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000
Courtesy of rosettacode.org

## 5 kyu <a name="5kyu"></a>

## 4 kyu <a name="4kyu"></a>

### The Observed PIN <a name="TheObservedPIN"></a>

* [Solution](src/main/kotlin/kyu4/observedPin.kt)<br>
* [Tests](src/test/kotlin/kyu4/ObservedPinTest.kt)

Alright, detective, one of our colleagues successfully observed our target person, Robby the robber. We followed him to a secret warehouse, where we assume to find all the stolen stuff. The door to this warehouse is secured by an electronic combination lock. Unfortunately our spy isn't sure about the PIN he saw, when Robby entered it.

The keypad has the following layout:
<pre>
┌───┬───┬───┐<br>
│ 1 │ 2 │ 3 │<br>
├───┼───┼───┤<br>
│ 4 │ 5 │ 6 │<br>
├───┼───┼───┤<br>
│ 7 │ 8 │ 9 │<br>
└───┼───┼───┘<br>
    │ 0 │<br>
    └───┘<br>
</pre>
He noted the PIN 1357, but he also said, it is possible that each of the digits he saw could actually be another adjacent digit (horizontally or vertically, but not diagonally). E.g. instead of the 1 it could also be the 2 or 4. And instead of the 5 it could also be the 2, 4, 6 or 8.

He also mentioned, he knows this kind of locks. You can enter an unlimited amount of wrong PINs, they never finally lock the system or sound the alarm. That's why we can try out all possible (*) variations.

* possible in sense of: the observed PIN itself and all variations considering the adjacent digits

Can you help us to find all those variations? It would be nice to have a function, that returns an array (or a list in Java/Kotlin and C#) of all variations for an observed PIN with a length of 1 to 8 digits. We could name the function getPINs (get_pins in python, GetPINs in C#). But please note that all PINs, the observed one and also the results, must be strings, because of potentially leading '0's. We already prepared some test cases for you.

Detective, we are counting on you!

## 3kyu <a name="3kyu"></a>

## 2kyu <a name="2kyu"></a>

## 1kyu <a name="1kyu"></a>