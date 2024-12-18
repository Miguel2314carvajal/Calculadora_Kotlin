fun main() {
    var opcion = 0

    while (opcion != 4) {
        println("\n*** Menú de Cálculo de Áreas ***")
        println("1. Calcular el área de un cuadrado")
        println("2. Calcular el área de un círculo")
        println("3. Calcular el área de un triángulo")
        println("4. Salir")
        print("Elija una opción: ")

        opcion = readLine()?.toIntOrNull() ?: 0

        if (opcion == 1) {
        
            println("Ingrese el lado del cuadrado:")
            val lado = readLine()?.toDoubleOrNull()
            if (lado != null) {
                val area = lado * lado
                println("El área del cuadrado es: $area")
            } else {
                println("Por favor, ingrese un número válido.")
            }
        } else if (opcion == 2) {
            
            println("Ingrese el radio del círculo:")
            val radio = readLine()?.toDoubleOrNull()
            if (radio != null) {
                val area = 3.14 * radio * radio
                println("El área del círculo es: $area")
            } else {
                println("Por favor, ingrese un número válido.")
            }
        } else if (opcion == 3) {
            
            println("Ingrese la base del triángulo:")
            val base = readLine()?.toDoubleOrNull()
            println("Ingrese la altura del triángulo:")
            val altura = readLine()?.toDoubleOrNull()
            if (base != null && altura != null) {
                val area = (base * altura) / 2
                println("El área del triángulo es: $area")
            } else {
                println("Por favor, ingrese números válidos.")
            }
        } else if (opcion == 4) {
            println("Saliendo del programa...")
        } else {
            println("Opción no válida, por favor intente de nuevo.")
        }
    }
}
