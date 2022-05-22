import java.text.DecimalFormat

var tasaCambio = 0.0
var pesosEnCaja = 0.0
var dolaresEnCaja = 0.0

fun main(){
    print("Ingresa la tasa de cambio de dolar a peso: $ ")
    tasaCambio = readLine()!!.toDouble()

    print("Ingresa la cantidad de pesos para la apertura de caja:$ ")
    pesosEnCaja = readLine()!!.toDouble()

    print("Ingresa la cantidad de dolares para la apertura de caja:$ ")
    dolaresEnCaja = readLine()!!.toDouble()

    controlDeOperaciones()
}


fun controlDeOperaciones(){
    print("\n Ingresa la cantidad de dolares a cambiar: $")
    var dolaresACambiar = readLine()!!.toDouble()

    dolaresEnCaja += dolaresACambiar

    var pesosAEntregar = tasaCambio * dolaresACambiar

    pesosEnCaja -= pesosAEntregar

    val formato = "#,###.00"

    println("""
        **Recibo**
        Pesos a entregar: $${DecimalFormat(formato).format(pesosAEntregar)}
        Pesos en caja:$${DecimalFormat(formato).format(pesosEnCaja)}
        Dolares en caja:$${DecimalFormat(formato).format(dolaresEnCaja)}
        
        """.trimIndent()
    )

    controlDeOperaciones()

}