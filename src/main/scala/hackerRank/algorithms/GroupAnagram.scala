package hackerRank.algorithms

/* group anagram strings
  dog, eat, god, ate, tea
  output should be [ [dog,god], [eat,ate,tea]]
*/

object GroupAnagram {
  def findGroupAnagrams(words: Seq[String]): Seq[Seq[String]] = {
    if (words.isEmpty) Seq.empty else if (words.lengthCompare(1) == 0) Seq(Seq(words.head)) else
      words.map(word => findAnagrams(word, words)).distinct
  }

  def findAnagrams(word: String, compareWords: Seq[String]): Seq[String] = {
    val originalWord = word.sorted

    compareWords.filter(compareWord => compareWord.sorted.equalsIgnoreCase(originalWord) && !compareWord.equalsIgnoreCase(originalWord))
  }
}

