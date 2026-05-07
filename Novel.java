public class Novel extends Produk {

    private String penulis;

    public Novel(String namaProduk, String bukuFiksi, String Novel, int kodeBuku, String penulis) {
        super(namaProduk, bukuFiksi, Novel, kodeBuku);
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void tampilInfo() {
        System.out.println("Nama Produk : " + getnamaProduk());
        System.out.println("Buku Fiksi  : " + getbukuFiksi());
        System.out.println("Novel       : " + getNovel());
        System.out.println("Kode Buku   : " + getkodeBuku());
        System.out.println("Penulis     : " + penulis);
    }
}