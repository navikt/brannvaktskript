#!/home/areh/.sdkman/candidates/kotlin/current/bin/kotlinc -script

val are = "@are.husby"
val joar = "@joar.aurdal"
val frode = "@frode.ankill.kampe"
val vilde = "@vilde.stefferud"
val erlend = "@erlend.wiklem"

val man = "Mandag "
val tir = "Tirsdag"
val ons = "Onsdag "
val tor = "Torsdag"
val fre = "Fredag "

val dagerIgjenDenneUka = listOf(man, tir, ons, tor, fre)
val personerPåJobbDenneUka = setOf(
    are,
    joar,
//    vilde,
    frode,
    erlend
)

fun print(dag: String, person: String) {
    val padding = dagerIgjenDenneUka.maxOf { it.length }
    println("\t${dag.padEnd(padding)}: $person")
}

fun loop(dager: List<String>, personer: List<String>) {
    if (dager.isEmpty()) Unit
    else if (personer.isEmpty()) loop(dager, personerPåJobbDenneUka.shuffled())
    else {
        print(dager.first(), personer.first())
        loop(dager.drop(1), personer.drop(1))
    }
}

println("Ukas brannvakter:")
loop(dagerIgjenDenneUka, personerPåJobbDenneUka.shuffled())
println("Generert av Ares 'LotteryTech 3000 Futurecom Digital-Deluxe'")
println(
    "${personerPåJobbDenneUka.size} personer var med i lotteriet: " +
            personerPåJobbDenneUka.map { it.replace("@", "") }.sorted().joinToString(", ")
)
println()
