# Codewars Solutions
#### by Willinlondon

Being a Codewars enthusiast, I have resisted the urge to use an IDE for a while now when solving katas, but as they have gotten harder and more complex, I have finally caved in and starting using Intellij to help me solve my Kotlin challenges at least.

The good news is that this allows me to upload and keep track of my solutions here. Feel free to compare, but I strongly urge you to complete any kata before looking at solutions online!

Below you will find all the instructions for each of the katas I have solved as well as internal links to the solution and tests.

# Table of contents
* [8 kyu](#8kyu)
* [7 kyu](#7kyu)
  1. [Small enough? - Beginner](#SmallEnough)
* [6 kyu](#6kyu)
* [5 kyu](#5kyu)
* [4 kyu](#4kyu)
   1. [The Observed PIN](#TheObservedPIN)
* [3 kyu](#3kyu)
* [2 kyu](#2kyu)
* [1 kyu](#1kyu)

## 8 kyu <a name="8kyu"></a>

## 7 kyu <a name="7kyu"></a>

### Small enough? - Beginner <a name="SmallEnough"></a>

* [Solution](src/main/kotlin/kyu7/smallEnough.kt)<br>
* [Tests](src/test/kotlin/kyu7/SmallEnoughTest.kt)

## 6 kyu <a name="6kyu"></a>

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