fun main(){
    val myBilangan = listOf(4, 4, 6, 5, 6, 7, 8, 0, 2, null, 9, null)

    // loop continue
    for (dataBilangan in myBilangan) {
        if(dataBilangan == null) continue
        println("Hasil loop continue : $dataBilangan")
    }

    // loop break
    for (dataBilangan in myBilangan) {
        if(dataBilangan == null) break
        println("Hasil loop break : $dataBilangan")
    }
}