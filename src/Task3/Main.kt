package Task3
fun main (){
    var array = arrayOf(3, 67, 1, 55, 65, 89, 23)
    for (i in array.indices){
        if (array[i] %5 ==0){
            println(array[i])
        }
    }
}
