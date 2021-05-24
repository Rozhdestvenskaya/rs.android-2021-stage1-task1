package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
            val anna = (bill.sum() - bill[k]) / 2
            val cashback = (b - anna)
            return if (cashback != 0) cashback.toString()
            else "bon appetit"
    }
}
