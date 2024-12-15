fun main() {
    val mutableList = mutableListOf(1, 2, 3)

    // Solution 1: Using mapIndexed to modify the list in place
    mutableList.mapIndexed { index, value -> 
        mutableList[index] = value * 2
    }
    println(mutableList) // Output: [2, 4, 6]

    val mutableList2 = mutableListOf(1,2,3)
    // Solution 2: Using forEach to modify the list in place
    mutableList2.forEachIndexed { index, value -> 
        mutableList2[index] = value * 2
    }
    println(mutableList2) // Output: [2, 4, 6]
    
    // Solution 3: Creating a new list using map and reassigning
    val mutableList3 = mutableListOf(1,2,3)
    mutableList3.clear()
    mutableList3.addAll(mutableList2.map { it * 2 })
    println(mutableList3) // Output: [2,4,6]
} 