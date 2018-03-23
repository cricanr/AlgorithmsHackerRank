package hackerRank.algorithms

import org.scalatest._

class GroupAnagramTest extends WordSpec with Matchers {
  "The Group anagrams" when {
    "Calling findGroupAnagrams with (dog, eat, god, ate, tea)" should {
      "return [ [dog,god], [eat,ate,tea]]" in {
        GroupAnagram.findGroupAnagrams(Seq("dog", "eat", "god", "ate", "tea")) shouldBe
          Seq(Seq("dog", "god"), Seq("eat", "ate", "tea"))
      }
    }

    "Calling findGroupAnagrams with empty list" should {
      "return empty list" in {
        GroupAnagram.findGroupAnagrams(Seq()) shouldBe
          Seq()
      }
    }

    "Calling findGroupAnagrams with 1 empty item" should {
      "return empty item" in {
        GroupAnagram.findGroupAnagrams(Seq("")) shouldBe
          Seq(Seq(""))
      }
    }
  }
}
