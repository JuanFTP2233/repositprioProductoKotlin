fun main() {

    val listaProducto = mutableListOf<Producto>()
    val P1 = Producto()
    listaProducto.add(P1)

    while (true) {
        println("Productos de una tienda xd")
        println("CrearPro 1")
        println("venderPro 2" )
        println("reponerStock 3")
        println("Descuento 4")
        println("MostarInfo 5")
        println("aumentar precio 6")
        println("calcular 7")
        println("Salir 8")
        print("Seleccione una opción: ")
        when (readLine()?.toIntOrNull()) {
            1 -> P1.crearProducto()
            2 -> P1.venderProducto()
            3 -> P1.reponerStock()
            4 -> P1.aplicarDescuento()
            5 -> P1.mostrarInformacion()
            6 -> P1.aumentarPrecio()
            7 -> P1.calcularValorTotalInventario()
            8 -> {
                println("Saliendo del sistema...")
                return
            }

            else -> println("Opción inválida. Intente nuevamente.\n")
        }
    }
}

