package Task1

class Dog : Animal() {
    override fun toString(): String {
        return "Объект : Собака по имени $name и весом $weith "
    }

    fun barking (){
        println("Собака лает")
    }
}