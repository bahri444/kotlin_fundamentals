fun main(){
    val indigo_satu = Warna.indigoSatu
    val indigo_dua = Warna.indigoDua
    val indigo_tiga = Warna.indigoTiga
    println("$indigo_satu, $indigo_dua, $indigo_tiga")
}
enum class Warna(val value: Int) {
    indigoSatu(0x1C54B2),
    indigoDua(0x2979FF),
    indigoTiga(0x5393FF)
}