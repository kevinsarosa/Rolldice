fun main(){

    val askNama = println("Masukan nama pemain:")
    var pemain = readLine()!!.toString()
    val askRoll = println("kocok dadunya? (Y/N)")
    val jwbRoll = readLine()!!.toString().toUpperCase().trim()
    val dice =1..6
    val times = 1..5
    var score = 0



    askNama
    pemain
    askRoll
    jwbRoll

    if (jwbRoll == "Y"){
        for (i in times){
            println(dice.random())

        }
    }





}