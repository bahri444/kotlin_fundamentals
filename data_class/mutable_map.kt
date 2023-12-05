fun main(args: Array<String>) {
    val myMaps = mapOf(
        "timur" to "barat",
        "utara" to "selatan",
        "timur" to "utara",
        "barat" to "selatan"
    )
    val mutableMap = myMaps.toMutableMap()
    mutableMap.put("saepul","bahri")
    mutableMap.put("bahri","emet")
    println(mutableMap)
}