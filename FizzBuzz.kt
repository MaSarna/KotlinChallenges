fun main() {

    println((1..100).map { i -> mapOf(0 to i, i % 3 to "Fizz",
        i % 5 to "Buzz", i % 3 + i % 5 to "FizzBuzz")[0] })
}
