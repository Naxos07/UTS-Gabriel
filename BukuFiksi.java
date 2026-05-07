//INHERITANCE
public class BukuFiksi extends Produk {

    private String genre;

    public BukuFiksi(String namaProduk, String bukuFiksi, String Novel, int kodeBuku, String genre) {
        super(namaProduk, bukuFiksi, Novel, kodeBuku);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void tampilInfo() {
        System.out.println("Nama Produk : " + getnamaProduk());
        System.out.println("Buku Fiksi  : " + getbukuFiksi());
        System.out.println("Novel       : " + getNovel());
        System.out.println("Kode Buku   : " + getkodeBuku());
        System.out.println("Genre       : " + genre);
    }
}