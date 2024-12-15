fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers) // Output: [2, 4]

    //Example of handling potential nulls
    val nullableList: List<Int?> = listOf(1, null, 3, 4, null)
    val nonNullEvenNumbers = nullableList.filterNotNull().filter { it % 2 == 0 }
    println(nonNullEvenNumbers) // Output: [4]
    
    //Another way to handle nulls using the elvis operator
    val nullableNumber: Int? = null
    val number = nullableNumber ?: 0
    println(number) //Output 0
} 