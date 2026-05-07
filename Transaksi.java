public class Transaksi {

    private String namaPembeli;
    private String metodePembayaran;
    private int totalBayar;

    public Transaksi(String namaPembeli, String metodePembayaran, int totalBayar) {
        this.namaPembeli = namaPembeli;
        this.metodePembayaran = metodePembayaran;
        this.totalBayar = totalBayar;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public int getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(int totalBayar) {
        this.totalBayar = totalBayar;
    }

    public void tampilTransaksi() {
        System.out.println("Nama Pembeli      : " + namaPembeli);
        System.out.println("Metode Pembayaran : " + metodePembayaran);
        System.out.println("Total Bayar       : " + totalBayar);
    }
}