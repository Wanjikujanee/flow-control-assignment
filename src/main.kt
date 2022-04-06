
fun main() {
  findodd()
    var q=names(arrayOf("joyce","lucy","esther","jane","virgy","ephy"))
    drink(4)
    drink(7)
    drink(15)
    drink(3)
    multiple()


}
fun findodd(){
    for(x in 1..100){
        if(x %2!=0){

        }
        println(x)
    }

}
fun names(names:Array<String>):Int{
var num=0
    names.forEach {p->
        if (p.length>5)
            num++

    }
    return num
}
fun drink(age:Int){
    if (age>6){

    }
    println("milk")


      println("fanta orange")

}
fun multiple(){
   for(y in 1..100 ){
   if (y%3==0){
       println(y)
   }
    if (y%5==0){
        println("buzz")
    }
   else if(y%3==0||y%5==0){
       println("fizzbuzz")
    }


       }
}