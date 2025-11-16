fun main() {
    // Step 1: Find the first 50 prime numbers and store them in a list
    val primeList = mutableListOf<Int>()
    var num = 2
    while (primeList.size < 50) {
        if (isPrime(num)) {
            primeList.add(num)
        }
        num++
    }

    // Print the list of first 50 prime numbers
    println("First 50 Prime Numbers:")
    println(primeList)

    // Step 2: Create a list of the first 50 even numbers
    val evenList = (1..50).map { it * 2 }

    // Step 3: Add even numbers to the prime list
    val combinedList = primeList + evenList

    // Print the combined list
    println("\nCombined List (Primes + Evens):")
    println(combinedList)
}

// Function to check if a number is prime
fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}
