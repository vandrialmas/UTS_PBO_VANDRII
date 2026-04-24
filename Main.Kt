fun main() {

    val donatur = Donatur("Vandri", 100000.0)
    val pengelola = Pengelola("Admin")
    val campaign = CampaignDonasi("Bantu Mahasiswa", 150000.0)
    val sistem = SistemDonasi()

    println("=== LOGIN ===")
    donatur.login()
    pengelola.login()

    println("\n=== CEK SALDO AWAL ===")
    donatur.cekSaldo()

    println("\n=== SIMULASI GAGAL (SALDO KURANG) ===")
    val jumlah1 = donatur.isiFormDonasi(200000.0)
    sistem.prosesDonasi(donatur, campaign, jumlah1)

    println("\n=== SIMULASI SUKSES ===")
    val jumlah2 = donatur.isiFormDonasi(50000.0)
    sistem.prosesDonasi(donatur, campaign, jumlah2)

    println("\n=== STATUS DONASI ===")
    donatur.lihatStatus(campaign)

    println("\n=== FITUR PENGELOLA ===")
    pengelola.buatBerita()
    pengelola.lihatProgress(campaign)

    println("\n=== SALDO AKHIR ===")
    donatur.cekSaldo()
}
