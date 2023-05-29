package rsk

fun main(args:Array<String>):Unit{
    val meetings= listOf(Meeating(1,"Board Meeting"), Meeating(2,"Committee Meeting"))
    val people: List<Person> =meetings
        .flatMap(Meeating::people)
        .distinct()
for (p in people) println(p.name)
}