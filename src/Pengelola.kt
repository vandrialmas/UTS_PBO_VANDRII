class Pengelola(private val nama: String) {

    fun login(): Boolean {
        println("Pengelola $nama login")
        return true
    }

    fun buatBerita() {
        println("Berita donasi dibuat")
    }

    fun lihatProgress(campaign: CampaignDonasi) {
        campaign.cekProgress()
    }
}