package rsk

fun main (args: Array<String>){
    val ints= listOf(1,2,3,4,5)
    /*
    declaring the predicates as variables so
    that they can be passed as parameters in the method
    */
    var largerthantwo={v:Int->v>2}

    /* checks if all the numbers in the list are larger than 2 */
    var  largeInts=ints.all(largerthantwo)
    println(largeInts)
    /* checks if any of the numbers in the list are larger than 2 */
    largeInts=ints.any(largerthantwo)
    println(largeInts)
    /* counts the numbers that are larger than 2 */
    var numberOfLargeInts=ints.count(largerthantwo)
    println(numberOfLargeInts)
    var found:Int?=ints.find(largerthantwo)
    println(found)
    found=ints.find {it>6}
    println(found)

}