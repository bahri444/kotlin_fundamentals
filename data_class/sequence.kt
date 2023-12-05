fun main() {
    val myNumber = generateSequence(1){it + 1 }
    myNumber.take(10).forEach{print("$it")}
}