package Task2

 open class Iphone {
    var  material : String = ""
    var model : String = ""
    var cost : Int = 0

     fun callnumber (number : String) {
        var numberChars =  number.toCharArray()
         when {
             numberChars.size != 12 -> println("Неправильно набран номер")
             numberChars[0] != '+' || numberChars[1] != '7' -> println("Номер должен начинаться с символов +7")
             else -> println("Вызов на номер $number")
         }

     }

     override fun toString(): String {
         return "Iphone(cost=$cost, material='$material', model='$model')"
     }


 }