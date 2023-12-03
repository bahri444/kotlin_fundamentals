fun main(){

    // cara satu
    val my_text: String? = null
    val panjangText = my_text?.length?: 44
    println(panjangText)

    // cara dua (cara satu sama maksudnya dengan cara dua)
    val panjangTextDua = if(my_text != null) my_text.length else 48
    println(panjangTextDua)
}