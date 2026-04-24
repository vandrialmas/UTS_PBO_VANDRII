fun main() {

    val donatur = Donatur("Vandri", 100000.0)
    val pengelola = Pengelola("Admin")
    val campaign = CampaignDonasi("Bantu Mahasiswa", 150000.0)
    val sistem = SistemDonasi()

    println("=== LOGIN ===")
    donatur.login()
    pengelola.login()

    println("\n=== CEK SALDO ===")
    donatur.cekSaldo()

    println("\n=== GAGAL ===")
    val j1 = donatur.isiFormDonasi(200000.0)
    sistem.prosesDonasi(donatur, campaign, j1)

    println("\n=== SUKSES ===")
    val j2 = donatur.isiFormDonasi(50000.0)
    sistem.prosesDonasi(donatur, campaign, j2)

    println("\n=== HASIL ===")
    pengelola.lihatProgress(campaign)
}