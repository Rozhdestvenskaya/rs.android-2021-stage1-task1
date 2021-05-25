package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val result = ArrayList<String>()

        val roundBrackets = mutableListOf<Int>()
        val squareBrackets = mutableListOf<Int>()
        val angleBrackets = mutableListOf<Int>()

        for (i in inputString.indices) {
            when (inputString[i]) {
                '(' -> roundBrackets.add(i)
                '[' -> squareBrackets.add(i)
                '<' -> angleBrackets.add(i)
                ')' -> {
                    result.add(inputString.substring(roundBrackets.removeLast() + 1, i))
                }
                ']' -> {
                    result.add(inputString.substring(squareBrackets.removeLast() + 1, i))
                }
                '>' -> {
                    result.add(inputString.substring(angleBrackets.removeLast() + 1, i))
                }
            }
        }

        return result.toTypedArray()
    }
}



