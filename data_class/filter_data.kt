fun main() {
    val myBilangan = listOf(11,12,13,14,15,20,21,22,16,17,18,19)

    // filtering data
    val filteringData = myBilangan.filter{it % 2 == 0}
    println("data filtering : $filteringData")

    // not filtering data
    val notFilteringData = myBilangan.filterNot{it % 2 == 0}
    println("data not filtering : $notFilteringData")

    // mapping data
    val maping_data = myBilangan.map{it * 10}
    println("maping data : $maping_data")

    // counting data
    println("bilangan count : " + myBilangan.count())

    val firstStartNumber = myBilangan.find{it % 2 == 1}
    val firstOnNullBilangan = myBilangan.firstOrNull{it % 2 == 3}
    println(firstStartNumber)
    println(firstOnNullBilangan)

    // sorting data ascending
    val ascSort = myBilangan.sorted()
    println(ascSort)

    // descending sorting
    val descSorted = myBilangan.sortedDescending()
    println(descSorted)

}