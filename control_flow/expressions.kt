fun main(){
    val waktu_istirahat = 12
    val waktu_sekarang = 13

    // cara satu
    if(waktu_sekarang>waktu_istirahat){
        println("waktu istirahat tiba")
    }else{
        println("belum waktunya istirahat")
    }

    // cara dua
    val isIstirahat = if(waktu_sekarang>waktu_istirahat) "waktu istirahat telah tiba" else "belum waktunya istirahat"
    println(isIstirahat)
}