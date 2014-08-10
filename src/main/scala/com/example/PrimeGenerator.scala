package com.example

/**
 * Created by Igor_Glizer on 7/20/14.
 */
class PrimeGenerator {

  def For(i: Int) : Seq[Int] = {
    var primes = Seq[Int]()
    var i2 = i
    val target = Math.sqrt(i2).toInt + 1
    for(candidate <- 2 until target)
      while (i2 %  candidate == 0) {
        primes = primes :+  candidate
        i2 = i2 /  candidate
      }

    if (i2 > 1)
      primes = primes :+ i2

    primes
  }

}
