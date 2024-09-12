package Task1

fun main(){
    var cat = Cat()
    cat.name = "Жужа"
    cat.weith = 5
    println(cat.toString())
    cat.eating()
    cat.huntingMouse()
    println("------------------------")
    var dog = Dog()
    dog.name = "Кефир"
    dog.weith = 15
    println(dog.toString())
    dog.eating()
    dog.barking()
}