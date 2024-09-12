package Task2

 open class Smartphone {
     var model : String = ""
     var legendary : Boolean = true

     fun callnumber (number : String) {
         var numberChars =  number.toCharArray()
         when {
             numberChars.size != 12 -> println("Неправильно набран номер")
             numberChars[0] != '+' || numberChars[1] != '7' -> println("Номер должен начинаться с символов +7")
             else -> println("Вызов на номер $number")
         }

     }

     override fun toString(): String {
         return "Smartphone(legendary='$legendary', model='$model')"
     }


 }