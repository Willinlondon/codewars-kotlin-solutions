fun twoOldestAges(ages: List<Int>): List<Int> {
    val highestAgesIndex = ages.size - 1
    val secondHighestAgesIndex = ages.size - 2
    return ages.sorted().slice(secondHighestAgesIndex..highestAgesIndex)
}