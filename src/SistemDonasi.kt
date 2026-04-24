class SistemDonasi {

    fun prosesDonasi(
        donatur: Donatur,
        campaign: CampaignDonasi,
        jumlah: Double
    ) {

        println("Memproses donasi...")

        if (jumlah <= 0) {
            println("ERROR: Nominal tidak valid")
            return
        }

        if (!donatur.kurangiSaldo(jumlah)) {
            println("ERROR: Saldo tidak cukup")
            return
        }

        if (!campaign.tambahDonasi(jumlah)) {
            println("ERROR: Melebihi target campaign")
            return
        }

        println("Donasi berhasil Rp$jumlah")
    }
}