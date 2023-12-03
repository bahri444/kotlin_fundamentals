fun main(){
    val jamMulaiKuliah = 13
    val jamSelesaiKuliah = 17
    val jamSekarang = 24

    val isKuliah = if ((jamSekarang >= jamMulaiKuliah) && (jamSekarang <= jamSelesaiKuliah)){
        true
    }else{
        false
    }
    print("jam mulai perkuliahan : $isKuliah")
}