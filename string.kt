fun main(){
    val myName ="Saepul Bahri"
    val getIndex = myName[0]
    println("semua isi variabel myName : $myName dan index ke-0 $getIndex")

    // looping index myname
    for (i in myName) {
        print("$i ")
    }

    println("")

    // implement escaped string
    val myAdres="melar, desa \"selebung\""
    println(myAdres)

    // implement row string
    val multiLineString = """
    line satu
    line dua
    line tiga
    line ke-n
    """.trimIndent()
    println(multiLineString)
}