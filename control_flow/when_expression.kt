fun main(){

    // cara satu
    val data = 2
    when(data){
        1->println("nilai adalah $data")
        2->println("nilai adalah $data")
        3->println("nilai adalah $data")
        4->println("nilai adalah $data")
        else -> println("nilai tidak di temukan $data")
    }

    // cara dua
    val myBilangan = 12
    val whenExpression = when (myBilangan){
        11->"nilai adalah $myBilangan"
        12->"nilai adalah $myBilangan"
        13->"nilai adalah $myBilangan"
        14->"nilai adalah $myBilangan"
        else->"bilangan tidak di temukan"
    }
    println(whenExpression)

    // check any type
    val testAny: Any = 500L
    when(testAny){
        is Long ->println("data value long type $testAny")
        is String ->println("data value string type $testAny")
        else->println("data isn't defined")
    }
}