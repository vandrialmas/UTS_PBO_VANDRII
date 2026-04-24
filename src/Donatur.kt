class Donatur(private val nama: String, saldoAwal: Double) {

    private var saldo: Double = saldoAwal
        private set

    fun login(): Boolean {
        println("$nama berhasil login")
        return true
    }

    fun cekSaldo() {
        println("Saldo $nama: Rp$saldo")
    }

    fun isiFormDonasi(jumlah: Double): Double {
        println("Form donasi diisi: Rp$jumlah")
        return jumlah
    }

    fun kurangiSaldo(jumlah: Double): Boolean {
        return if (jumlah <= saldo) {
            saldo -= jumlah
            true
        } else {
            false
        }
    }

    fun lihatStatus(campaign: CampaignDonasi) {
        println("Melihat status hasil donasi...")
    }
}