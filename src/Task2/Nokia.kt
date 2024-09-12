package Task2

class Nokia : Iphone() {
    override fun toString(): String {
        return "Объект NoKia ( cтоимостью : $cost, из материала :'$material', " +
                "модель : '$model')"
    }
}