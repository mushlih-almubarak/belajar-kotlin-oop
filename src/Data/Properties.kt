package Data
/* Untuk membuat "properties" pada Kotlin, kita harus memasukkan ke body classnya (yang di dalam kurung kurawal)
Properties bisa berupa mutable (bisa berubah), dan juga immutable (tidak bisa berubah)
Properties adalh variabel yang ada di dalam object
 */
class Alamat{
    // Setelah tanda sama dengan (=) adalah data deafultnya
    var namaDepan: String = ""
    // null artinya boleh kosong
    var namaTengah: String? = null
    var namaBelakang: String = ""
}