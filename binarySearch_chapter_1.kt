fun binarySearch(list: List<Int>, num: Int): Int? {
    var low = 0 // нижняя граница
    var high = list.size - 1 // верхняя граница
    while (low <= high) {
    	var mid = (low + high)/2 // середина
    	var guess = list[mid]
    	if (num == guess) return mid
      else if (guess > num) high = mid - 1
      else low = mid + 1
    }
    return null
}


fun main() {
    val sortedList = (0..100 step 2).toList()
    println(binarySearch(sortedList, 2)) // 1
    println(binarySearch(sortedList, 3)) // null
}
