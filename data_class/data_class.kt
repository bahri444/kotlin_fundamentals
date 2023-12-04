data class Mahasiswa(val NIM: String, val Nama: String, val Semester: Int)

fun main(){
     val dataMahasiswa = Mahasiswa("TI17200048", "Saepul Bahri", 7)
     println(dataMahasiswa)
}