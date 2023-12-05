fun main(args: Array<String>){
    val myData = setOf("TI17200048","Saepul Bahri", 7, 22, "melar desa selebung rembiga")
    println(myData)

    val bilanganA= setOf(11,21,21,22,34, 53, 45,8,9)
    val bilanganB= setOf(11,21,21,22,31, 51, 5,8,9)
    val bilanganC= setOf(22,90, 3, 9,8,9)

    val dataUnion = bilanganA.union(bilanganC)
    val insertSection = bilanganA.intersect(bilanganC)

    println(dataUnion)
    println(insertSection)
}