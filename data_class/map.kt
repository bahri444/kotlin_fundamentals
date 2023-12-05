fun main(args: Array<String>) {
    val myMaps = mapOf(
        "timur" to "barat",
        "utara" to "selatan",
        "timur" to "utara",
        "barat" to "selatan"
    )
    println(myMaps.getValue("utara"))
}