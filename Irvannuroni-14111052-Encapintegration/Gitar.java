class Gitar extends Alat{
 private String Warna;
 
 public void cara(){
 System.out.println("Cara   : Petik"); 
 }

 public void suara(){
 System.out.println("Efek   : Walkwah"); 
 }
 
 public Gitar(String Merk, String Tipe, int Harga, String Warna){
  super(Merk, Tipe, Harga); //Konstruktor
  this.Warna = Warna;
 }
 
 public String getWarna(){
  return Warna;
 }
 
 public void setWarna(String Warna){
  this.Warna = Warna;
 }
 
 public void spekGitar(){
  System.out.println("\nSpesifikasi Gitar");
  System.out.println("------------------");
  System.out.println("Warna  : " + getWarna());
  System.out.println("Merk   : " + getMerk());
  System.out.println("Tipe   : " + getTipe());
  System.out.println("Harga  : " + getHarga());
 }
}

//Class Abstract
class Gitarabs extends CaraMain {

 public void cara(){
 System.out.println("Cara   : Petik"); 
 }
}