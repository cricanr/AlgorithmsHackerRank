"dog".hashCode
"ate".hashCode

val words = Seq("dog", "eat", "god", "ate", "tea")

val wordSums = words.map { word => word -> word.hashCode }

"dog".sorted
