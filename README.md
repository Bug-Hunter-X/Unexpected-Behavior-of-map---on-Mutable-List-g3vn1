This repository demonstrates an unexpected behavior of the `map()` function in Kotlin when used with mutable lists.  The `map()` function in Kotlin, unlike some other languages, returns a *new* list containing the transformed elements. This behavior can be unexpected, especially for developers coming from languages where `map()` modifies the original list in place.

The `bug.kt` file showcases this behavior with an example that illustrates how `map()` does not modify the original mutable list, while the `bugSolution.kt` file offers solutions to achieve the desired in-place modification.