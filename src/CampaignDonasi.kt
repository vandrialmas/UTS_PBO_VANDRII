class CampaignDonasi(
    private val namaCampaign: String,
    private val target: Double
) {

    private var saldoTerkumpul: Double = 0.0
        private set

    fun tambahDonasi(jumlah: Double): Boolean {
        return if (saldoTerkumpul + jumlah <= target) {
            saldoTerkumpul += jumlah
            true
        } else {
            false
        }
    }

    fun cekProgress() {
        println("Campaign: $namaCampaign")
        println("Progress: Rp$saldoTerkumpul / Rp$target")
    }
}