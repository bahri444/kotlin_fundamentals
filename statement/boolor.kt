fun main(){
    val jamMulaiKuliah = 13
    val jamSelesaiKuliah = 17
    val jamSekarang = 24

    val isPulang = if ((jamSekarang >= jamMulaiKuliah) || (jamSekarang <= jamSelesaiKuliah)){
        true
    }else{
        false
    }
    print("jam mulai perkuliahan : $isPulang")
}