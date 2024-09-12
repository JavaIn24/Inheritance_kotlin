package Task1

class Cat : Animal() {
    override fun toString(): String {
        return "Объект : Кошка по имени $name и весом $weith "
    }

    fun huntingMouse () {
        println("Кошка охотится на мышь")
    }
}