fun main() {
    
   fun forcechoke() {
       println("You are a beautiful girl full of goals in life")
   }
   
   forcechoke()
   
   fun calculateNumberGoodGuys(rebels: Int, ewoks:Int): Int {
       val goodGuys = rebels + ewoks
       return goodGuys
   }
   
    val rebels = calculateNumberGoodGuys(rebels: 5, ewoks:7)
    println("Darth Vader faced off against $rebels rebel scum")
    println("Darth Vader faced off against ${calculateNumberGoodGuys(rebels: 5, ewoks:7)} rebel scum")
    
    fun vaderisFeeling(mood: String = "angry"){
        println(mood)
    }
    vaderisFeeling()
    vaderisFeeling(mood: "meh")
    
   
    
    
    

}