package Data

class Nama{
    var namaDepan:String = ""
    var namaTengah: String? = null
    var namaBelakang:String = ""
}

fun main() {
    // Untuk merubah datanya, gunakan tanda titik (.) setelah nama object, kemudian diikuti dengan nama propertiesnya
    val Mushlih = Nama()
    Mushlih.namaDepan = "Mushlih"

    val Syakira = Nama()
    Syakira.namaDepan = "Syakira"

    val Hadziq = Nama()
    Hadziq.namaDepan = "Hadziq"

    // Untuk memprintnya, gunakan tanda titik (.) setelah nama object, kemudian diikuti dengan nama propertiesnya
    println(Mushlih.namaDepan)
    println(Syakira.namaDepan)
    println(Hadziq.namaDepan)
}