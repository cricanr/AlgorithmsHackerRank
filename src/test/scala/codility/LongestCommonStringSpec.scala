package codility

import org.scalatest.{Matchers, WordSpec}

class LongestCommonStringSpec extends WordSpec with Matchers {
  "Given 2 strings 'LCLC' and ''CLCL" when {
    "looking the longest common string between" should {
      "return 'LCL'" in {
        val s1 = "LCLC"
        val s2 = "CLCL"

        val longestCommonString = LongestCommonString.longestCommonString(s1, s2)

        longestCommonString should equal("LCL")
      }
    }
  }

}
