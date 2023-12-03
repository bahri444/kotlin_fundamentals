fun main(){
    val mahasiswa = setMahasiswa("TI17200048","Saepul Bahri","Melar, Desa Selebung Rembiga",22)
    println(mahasiswa)
}
fun setMahasiswa(nim:String, nama:String, alamat:String, semester:Int):String{
    return "Anda adalah mahasiswa dengan NIM $nim, Nama $nama, alamat $alamat, semester $semester"
}