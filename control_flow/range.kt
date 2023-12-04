fun main(){
    // catatan : range tidak bisa berfungsi apabila di start tidak dari nomor 1
    // val Rangebilangan = 30..45 step 31

    val rangebilangan = 1..20 step 2
    rangebilangan.forEach{
        print("$it ")
    }
    println(rangebilangan.step)

    // range to
    val bilanganRangeTo = 1.rangeTo(15)
    for (i in bilanganRangeTo) {
        println("bilangan range to : $i")
    }

    val characterRangeTo = 'A'.rangeTo('J')
    for (j in characterRangeTo) {
        println("character A range to J : $j")
    }

    // range down
    val bilanganRangeDown = 15.downTo(1)
    for (k in bilanganRangeDown) {
        println("bilangan range down to : $k")
    }
}