class Alat{
 private String Merk;
 private String Tipe;
 private int Harga;
 
 public void suara(){
 System.out.println("Efek   : Berbunyi"); 
 }

 public Alat(String Merk, String Tipe, int Harga){
  this.Merk = Merk;
  this.Tipe = Tipe;
  this.Harga = Harga;
 }
 
 public String getMerk(){
  return Merk;
 }
 
 public String getTipe(){
  return Tipe;
 }
 
 public int getHarga(){
  return Harga;
 }
 
 public void setMerk(String Merk){
  this.Merk = Merk;
 }
 
 public void setTipe(String Tipe){
  this.Tipe = Tipe;
 }
 
 public void spekAlat() {
  System.out.println("\nInfo Alat Musik");
  System.out.println("------------------");
  System.out.println("Merk   : " + getMerk());
  System.out.println("Tipe   : " + getTipe());
  System.out.println("Harga  : " + getHarga());
 }
}