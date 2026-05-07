//  ENCAPSULATION 
public class Produk {
private String namaProduk;
private String bukuFiksi;
private String Novel;
private int kodeBuku;
    
public Produk (String namaProduk, String bukuFiksi, String Novel, int kodeBuku) {
this.namaProduk= namaProduk;
this.bukuFiksi= bukuFiksi;
this.Novel= Novel;
this.kodeBuku= kodeBuku;   
}
public String getnamaProduk (){
    return namaProduk;
}
public void setnamaProduk (String namaProduk) {
    this.namaProduk= namaProduk;
}

public String getbukuFiksi (){
    return bukuFiksi;
}
public void setbukuFiksi (String bukuFiksi){
    this.bukuFiksi=bukuFiksi;
}
public String getNovel (){
    return Novel;
}
public void setNovel (String Novel){
    this.Novel=Novel;

    
}public int getkodeBuku (){
   return kodeBuku;
}
public void setkodeBuku (int kodeBuku){
   this.kodeBuku=kodeBuku;
}

}
