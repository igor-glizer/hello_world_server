package com.example

import org.specs2.mutable.{SpecificationWithJUnit, Specification}
import org.specs2.specification.Scope

/**
 * Created by Igor_Glizer on 7/20/14.
 */
class PrimeGeneratorTest extends SpecificationWithJUnit {

  trait Context extends Scope
  {
    val primes = new PrimeGenerator
  }

  "PrimeGenerator" should
    {


      "return empty list for 1" in new Context {
        primes.For(1) must beEmpty
      }

      "return (2) for 2" in new Context {
        primes.For(2) must containTheSameElementsAs(Seq(2))
      }

      "return (3) for 3" in new Context {
        primes.For(3) must containTheSameElementsAs(Seq(3))
      }

      "return (2,2) for 4" in new Context {
        primes.For(4) must containTheSameElementsAs(Seq(2,2))
      }

      "return (5) for 5" in new Context {
        primes.For(5) must containTheSameElementsAs(Seq(5))
      }

      "return (2,3) for 6" in new Context {
        primes.For(6) must containTheSameElementsAs(Seq(2,3))
      }

      "return (7) for 7" in new Context {
        primes.For(7) must containTheSameElementsAs(Seq(7))
      }

      "return (2,2,2) for 8" in new Context {
        primes.For(8) must containTheSameElementsAs(Seq(2,2,2))
      }

      "return (3,3) for 9" in new Context {
        primes.For(9) must containTheSameElementsAs(Seq(3,3))
      }

      "return (maxInt) for maxInt" in new Context {
        primes.For(Int.MaxValue) must containTheSameElementsAs(Seq(Int.MaxValue))
      }

    }

}
