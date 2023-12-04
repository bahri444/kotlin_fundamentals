fun main() {
    loop@ for (a in 1..14) {
        println("looping di luar")
 
        for (b in 1..14) {
            println("looping di dalam")
            if ( b > 2) break@loop
        }
    }
}