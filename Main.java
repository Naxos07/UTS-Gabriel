//Gabriel Naxos Podandy
//2515101053
public class Main {
    public static void main(String[] args) {


        BukuFiksi bf = new BukuFiksi(
                "Harry Potter",
                "Buku Fantasi",
                "Novel Petualangan",
                101,
                "Fantasy"
        );

        Novel nv = new Novel(
                "Laskar Pelangi",
                "Buku Fiksi",
                "Novel Pendidikan",
                202,
                "Andrea Hirata"
        );

       
        Transaksi tr = new Transaksi(
                "Gabriel",
                "M-Banking",
                150000
        );

        
        System.out.println("===== DATA BUKU FIKSI =====");
        bf.tampilInfo();

        System.out.println();

        System.out.println("===== DATA NOVEL =====");
        nv.tampilInfo();

        System.out.println();

        System.out.println("===== DATA TRANSAKSI =====");
        tr.tampilTransaksi();
    }
}
