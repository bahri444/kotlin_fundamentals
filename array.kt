fun main(){
    val dataArray = arrayOf(4,1,9,4,4,4,12)
    for (j in dataArray) {
        print(j)
    }
    println()
    println("--looping pertama berakhir--")

    // penggabungan data array
    val mixDataArr = arrayOf(4,1,9, "saepul", "bahri", false)
    for (i in mixDataArr) {
        print(i)
    }
    println()
    println("--looping kedua berakhir--")

    // data array hanya bilangan integer
    val dataByInteger=intArrayOf(4,1,9,4,4,4)
    for (l in dataByInteger) {
        print(l)
    }
}