package adder

import org.scalatest._
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class AdderTest extends FlatSpec with Matchers {

  "Adder" should "add one to 2" in {
    val adder = new Adder
    adder.addOne(2) should be (3)
  }
}