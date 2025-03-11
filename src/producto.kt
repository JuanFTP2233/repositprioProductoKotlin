import java.util.Scanner

class Producto {
    var codigoPro: String = ""
    var nombrePro: String = ""
    var precioPro: Double = 0.0
    var cantidadStock: Int = 0

    constructor()
    constructor(codigoPro: String, nombrePro: String, precioPro: Double, cantidadStock: Int) {
        this.codigoPro = codigoPro
        this.nombrePro = nombrePro
        this.precioPro = precioPro
        this.cantidadStock = cantidadStock
    }

    fun crearProducto() {
        val scanner = Scanner(System.`in`)
        println("Ingrese el código del producto:")
        this.codigoPro = scanner.nextLine()
        println("Ingrese el nombre del producto:")
        this.nombrePro = scanner.nextLine()
        println("Ingrese el precio del producto:")
        this.precioPro = scanner.nextDouble()
        println("Ingrese la cantidad en stock:")
        this.cantidadStock = scanner.nextInt()
    }

    fun venderProducto(): Boolean {
        val scanner = Scanner(System.`in`)
        println("Ingrese la cantidad a vender:")
        val cantidad = scanner.nextInt()
        return if (cantidad <= cantidadStock) {
            cantidadStock -= cantidad
            true
        } else {
            false
        }
    }

    fun reponerStock() {
        val scanner = Scanner(System.`in`)
        println("Ingrese la cantidad a reponer:")
        val cantidad = scanner.nextInt()
        cantidadStock += cantidad
    }

    fun aplicarDescuento() {
        val scanner = Scanner(System.`in`)
        println("Ingrese el porcentaje de descuento:")
        val porcentaje = scanner.nextDouble()
        precioPro -= precioPro * (porcentaje / 100)
    }

    fun mostrarInformacion() {
        println("Código: $codigoPro, Nombre: $nombrePro, Precio: $precioPro, Stock: $cantidadStock")
    }

    fun aumentarPrecio() {
        val scanner = Scanner(System.`in`)
        println("Ingrese el porcentaje de aumento:")
        val porcentaje = scanner.nextDouble()
        precioPro += precioPro * (porcentaje / 100)
    }

    fun calcularValorTotalInventario(): Double {
        return precioPro * cantidadStock
    }

    override fun toString(): String {
        return "Producto(codigoPro='$codigoPro', nombrePro='$nombrePro', precioPro=$precioPro, cantidadStock=$cantidadStock)"
    }
}