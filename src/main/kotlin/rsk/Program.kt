package rsk

fun main (args:Array<String>){
    val ints= listOf(1,2,3,4,5,6)
    /*
    filter is a method that takes a lambda and filters from ints the one that match the condition in the curly brackets
    the expression inside lambda returns true or false then if it is true it is passed to the new val collection
    */
    val subsetInts=ints.filter { it<4 }
    //for(i:Int in subsetInts) println(i)
    //adds  a map method that that squares the numbers of the list and prints them
    val squaredInts=ints.map { it*it }

    //for (i:Int in squaredInts ) println(i)
    val subsetSquaredInts=ints.
                                filter { it<5 }.
                                map { it*it }
    //for (i:Int in subsetSquaredInts) println(i)

    val meetings= listOf(Meeting(1,"Board Meeting"),Meeting(2,"Committee meetings"))
    val titles: List<String> =meetings
        .filter { it->it.title.startsWith("C") }
        .map { m -> m.title }
    for (t in titles) println(t)
    }
class Meeting(val id:Int,val title:String){

}