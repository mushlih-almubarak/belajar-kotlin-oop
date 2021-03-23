package Data

// Kode yang ada di file ini akan di panggil di main function pada file "Constructors"

class Mobil(parameterMerek:String, parameterTahun:Int = 2020) {

    /* Kita tidak bisa membuat kode program seenaknya pada "Constructors", karena ini bukan function
    Jika kita ingin membuat kode program di dalam Constructors, maka kita dapat menggunakan kode "init" */

    /*Kita tidak bisa membuat kode program seperti ini:
    println("Mobil $parameterMerek dibuat pada tahun $parameterTahun")
    Namun kita harus memasukkannya ke dalam blok "init" seperti di bawah ini*/

    init {
        println("Mobil $parameterMerek dibuat pada tahun $parameterTahun")
    }
    var merek = parameterMerek
    var tahun = parameterTahun
}