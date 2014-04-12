import adder._
import org.scalatest._

class AdderTest extends FlatSpec with Matchers {

  "Adder" should "add one to 2" in {
    val adder = new Adder
    adder.addOne(2) should be (3)
  }
}