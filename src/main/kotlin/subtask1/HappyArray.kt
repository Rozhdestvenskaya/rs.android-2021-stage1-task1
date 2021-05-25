package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        return happy(sadArray.toMutableList()).toIntArray()
    }

    fun happy(str: MutableList<Int>) : MutableList<Int>{
        var isHappy = true
        for (index in str.indices ) {
            if(index>=1 && index < str.size -1) {
                val sum = str[index - 1] + str[index + 1]
                if(str[index] > sum) {
                    str.remove(str[index])
                    isHappy = false
                }
            }
            if(isHappy == false) happy(str)
        }
        return str
    }
}
