package App

import Data.Mobil
/*Saat kita membuat Object, maka kita seperti memanggil sebuah function
Di dalam class Kotlin, kita bisa membuat "Constructors", Constructors mirip seperti function yang akan dipanggil saat pertama kali Object dibuat.
Mirip seperti di Function, kita bisa memberi parameter pada Constructors
 */
fun main() {
    val mobilToyota = Mobil("Toyota", "Avanza")
    var mobilAvanza = Mobil("Avanza", "Almaz")

    println(mobilToyota.merek)
    println(mobilToyota.tahun)
    println(mobilAvanza.merek)
    println(mobilAvanza.tahun)
}