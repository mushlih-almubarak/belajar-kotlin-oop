package App

import Data.Nama

fun main() {
    // Objectnya adalah kata-kata setelah kode "val"
    // Untuk menulis classnya, letakkan setelah tanda sama dengan (=), diikuti dengan buka dan tutup kurung ()
    val Mushlih = Nama()
    val Syakira = Nama()
    val Hadziq = Nama()

    // Secara deafult, saat memprint sebuah object, Kotlin akan memprint object berupa semacam lokasi memori Kita
    println(Mushlih)
    println(Syakira)
    println(Hadziq)
}