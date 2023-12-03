fun main(){
    val myTextNull: String? = null
    println(myTextNull)

   val testingTextNull: String?=null
//    mengelola nilai valiabel yang kita tandai sebagai nullable (tidak error) dengan if
   if(testingTextNull != null){
    val panjangText = testingTextNull.length
    println("hitung panjang teks null : "+panjangText)

    // output itdak nampil akan tetapi code tidak error
   }
}