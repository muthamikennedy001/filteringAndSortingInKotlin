package rsk

class Meeating(val id:Int,val title:String) {
    val people= listOf(Person("Sam"),Person("Alex"))
}

data class Person(val name: String) {

}
