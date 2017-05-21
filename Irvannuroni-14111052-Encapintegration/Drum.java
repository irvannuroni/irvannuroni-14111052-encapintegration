class Drum extends Alat{
 private String Setdrum;
 
 public void cara(){
 System.out.println("Cara   : Pukul"); 
 }

 public void suara(){
 System.out.println("Efek   : Manchine"); 
 }

 public Drum(String Tipe, String Jenis, int Harga, String Setdrum){
  super(Tipe, Jenis, Harga); //Memanggil Konstruktor pada SuperClass
  this.Setdrum = Setdrum;
 }
 
 public String getSetdrum(){
  return Setdrum;
 }
 
 public void setSetdrum(String Setdrum){
  this.Setdrum = Setdrum;
 }
 
 public void spekDrum(){
  System.out.println("\nSpesifikasi Drum");
  System.out.println("------------------");
  System.out.println("Set    : " + getSetdrum());
  System.out.println("Merk   : " + getMerk());
  System.out.println("Tipe   : " + getTipe());
  System.out.println("Harga  : " + getHarga());
 }
}

//Class Abstract
class Drumabs extends CaraMain {

 public void cara(){
 System.out.println("Cara   : Pukul"); 
 }
}