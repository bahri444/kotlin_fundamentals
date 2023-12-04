fun main(){
    val myBilanganRange = when(val bilrange = getRangeBilanganRandom()){
        in 20..70 -> 70 * bilrange
        in 71..120 -> 120 * bilrange
        else -> bilrange
    }
    // println(myBilanganRange)

}
fun getRangeBilanganRandom() = Random.nextInt(170)