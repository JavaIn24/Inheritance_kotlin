package Task1

 open class Animal  {
     var name : String = ""
     var weith : Int = 0

     fun eating (){
         println("Животное кушает")
     }

     override fun toString(): String {
         return "Animal(name='$name', weith=$weith)"
     }
 }