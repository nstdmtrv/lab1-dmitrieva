package com.example.kotlin_test3

import kotlin.math.sqrt

class PrimeNumberCalculator {

    fun isPrime(num: Int): Boolean {
        if (num < 2) return false
        for (i in 2..sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) return false
        }
        return true
    }

    fun sumOfPrimes(numbers: List<Int>): Int {
        return numbers.filter { isPrime(it) }.sum()
    }
}