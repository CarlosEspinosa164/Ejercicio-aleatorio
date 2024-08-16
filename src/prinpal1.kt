import kotlin.random.Random

fun main() {
    var moneda : Int
    var puntc = 0
    var punts = 0
    var cont = 1
    while(cont<21){
        moneda= Random.nextInt(1,3)
        if (moneda==1){
            println("cara")
            puntc++
        }else if (moneda==2){
            println("sello")
            punts++
        }
        cont++
    }
    if (puntc>punts){
        println("El ganador es cara con $puntc a $punts de sello")
    }else{
        println("El ganador es sello con $punts a $puntc de cara")
    }


}

