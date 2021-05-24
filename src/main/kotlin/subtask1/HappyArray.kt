package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {

        val happyArray  = ArrayList<Int>()
        happyArray.plusAssign(sadArray[0])

        for (index in 1..sadArray.size - 2) {
            val sum = sadArray[index - 1] + sadArray[index + 1]

            if(sadArray[index] < sum) {
                happyArray.plusAssign(sadArray[index])}

        }

        happyArray.plusAssign(sadArray[sadArray.size - 1])
        return happyArray.toIntArray()
    }
}
