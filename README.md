# Codewars Solutions
#### by Willinlondon

Being a Codewars enthusiast, I have resisted the urge to use an IDE for a while now when solving katas, but as they have gotten harder and more complex, I have finally caved in and starting using Intellij to help me solve my Kotlin challenges at least.

The good news is that this allows me to upload and keep track of my solutions here. Feel free to compare, but I strongly urge you to complete any kata before looking at solutions online!

Below you will find all the instructions for each of the katas I have solved as well as internal links to the solution and tests.

Note that some kata use custom matchers for their tests and in many cases the tests have been rewritten and may use different imports. I have also added my own tests on some of the katas.

# Table of contents
* [8 kyu](#8kyu)
  1. [String Repeat](#StringRepeat)
* [7 kyu](#7kyu)
  1. [Small enough? - Beginner](#SmallEnough)
  2. [Maximum Multiple](#MaximumMultiple)
  3. [Two Oldest Ages](#TwoOldestAges)
* [6 kyu](#6kyu)
  1. [Find the missing letter](#FindTheMissingLetter)
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