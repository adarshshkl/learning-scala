
object obj extends  App {
  val name:String = "Scala" //val
  var name2:String ="Scala"//var
  /**** Lazy Evaluation****/
  val numbers = List(1,2,3,4)
  lazy val output = numbers.map(l=> l*2) // Evaluated at run time when needed
  /**** Blocks ****/
  println({val x = 1+1; x+5})
  /**** Functions ****/
  val multipleByThree = (y:Int) => y*3
  /**** Method ****/
  def dividedBy(z:Int):Int = z/3
  /**** Class ****/
  class name(firstName:String,lastName:String){
    def fullName(greet:String):Unit =
      println(greet+' '+firstName+' '+lastName)
  }
  val textPrint = new name("Adarsh","Shukla")
  textPrint.fullName("Welcome to Canada!!!!!")

  println(output) //Lazy evaluation of expression

  val x: Long = 987654321
  val y: Float = x  // 9.8765434E8 (note that some precision is lost in this case)
  println(y)
  val face: Char = '☺'
  val number: Int = face  // 9786
  println(number)
  println(number)

}


