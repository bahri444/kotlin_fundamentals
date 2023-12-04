data class Mahasiswa(val NIM: String, val Nama: String, val Semester: Int)
fun main(){
    val dataMahasiswa = Mahasiswa("TI17200048", "Saepul Bahri", 7)
    val dataMahasiswa2 = Mahasiswa("TI17200054", "Siti Wahyuni", 7)
    val dataMahasiswa3 = Mahasiswa("TI17200024", "Fatimatuzzahra", 7)

    val dataMahasiswa4 = dataMahasiswa.copy()
    val dataMahasiswa5 = dataMahasiswa2.copy()
    val dataMahasiswa6 = dataMahasiswa3.copy()
 
    println(dataMahasiswa4)
    println(dataMahasiswa5)
    println(dataMahasiswa6)
}