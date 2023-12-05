data class Mahasiswa(val NIM: String, val Nama:String, val Semester: Int)
fun main(){
    val dataMahasiswa = Mahasiswa("TI17200048","Saepul Bahri", 7)
    // val NIM = dataMahasiswa.component1()
    // val Nama = dataMahasiswa.component2()
    // val Semester = dataMahasiswa.component3()

    val (NIM,Nama, Semester) = dataMahasiswa

    println("$NIM, $Nama, $Semester")
}