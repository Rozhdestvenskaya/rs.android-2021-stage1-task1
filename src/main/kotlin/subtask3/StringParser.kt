package subtask3

class StringParser {

    // TODO: Complete the following function

    //реализация по порядку
    fun getResult(inputString: String): Array<String> {

        val list = ArrayList<String>()

        for (i in inputString.indices) {
            if (inputString[i] == '(') {
                val t = inputString.substring(i)
                list.add(t.substringAfter('(').substringBefore(')'))
            } else if (inputString[i] == '<') {
                val t = inputString.substring(i)
                list.add(t.substringAfter('<').substringBefore('>'))
            } else if (inputString[i] == '[') {
                val t = inputString.substring(i)
                list.add(t.substringAfter('[').substringBefore(']'))
            }
        }
        return list.toTypedArray()
    }
}

//реализация не по порядку
//        val result = ArrayList<String>();
//        result.addAll(findSubstrings(inputString, '<', '>'))
//        result.addAll(findSubstrings(inputString, '(', ')'))
//        result.addAll(findSubstrings(inputString, '[', ']'))
//        return result.toTypedArray()

//    private fun findSubstrings (original : String, openChar : Char, closeChar : Char): List<String> {
//        val positions = ArrayList<Int>()
//        for(i in original.indices){
//            if(original[i] == openChar) positions.add(i)
//        }
//
//        val output = ArrayList<String>()
//
//        for(i in positions){
//            val subString = original.substring(i)
//            val closePosition = subString.indexOf(closeChar)
//            if(closePosition > 0) {
//                val result = subString.substring(1, closePosition)
//                output.add(result)
//            }
//        }
//        return output
//    }

