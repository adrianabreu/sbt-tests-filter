package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.Tag
  
object MyTag extends Tag("MyTag")
  
class ExampleSpec extends AnyFlatSpec {

  it must "add correctly" in {
    val sum = 4 + 1
    assert(sum === 5)
  }
  
  it must "subtract correctly" taggedAs(MyTag) in {
    val diff = 4 - 1
    assert(diff === 3)
  }

  it must "multiply correctly" taggedAs(MyTag) in {
    val total = 4 * 2
    assert(total === 8)
  }
}