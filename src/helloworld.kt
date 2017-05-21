/**
 * Created by Joel on 5/21/2017.
 */
fun main(args: Array<String>) {
    println("Hello World!")

    print("World is composed of " + arrayOf("people", "organizations", "things", "events", "locations").joinToString())

    println()

    println("A person can be related to " + arrayOf("language", "academic discipline", "skill", "occupation").joinToString())
}
