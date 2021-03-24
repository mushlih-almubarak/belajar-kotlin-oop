/* Kotlin mendukung pembuatan constructor lebih dari satu
Constructor yang utama yang terdapat di Class, disebut primary constructor, constructor tambahan yang bisa kita buat lagi adalah "secondary constructor"
Saat membuat constructor, kita wajib memanggil primary constructor jika ada primary constructor
Kita juga bisa membuat Secondary Constructor tanpa harus membuat Primary Constructor
 */

package data

class Mobil(Merek: String, Nama: String, Tahun: Int) {

    init {
        println("Mobil $Merek dibuat pada tahun $Tahun")
    }

    constructor(Merek: String, Nama: String) : this(Merek, Nama, 2020) {
        println("Secondary Constructor 1")
    }

    constructor(Merek: String) : this(Merek, "") {
        println("Secondary Constructor 2")
    }

    var brand: String = Merek
    var name: String = Nama
    var year: Int = Tahun
}