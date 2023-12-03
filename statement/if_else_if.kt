fun main(){
    val bilangan_satu = 12
    val bilangan_dua = 23
    val output :String
    output= if(bilangan_satu > bilangan_dua){
        "pernyataan benar"
    }else if(bilangan_dua > bilangan_satu){
        "pernyataan else if benar"
    }else{
        "pernyataan tidak valid"
    }
    print(output)
}