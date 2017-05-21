class Main{
 public static void main(String[] args){
  
	Alat a = new Alat("ALLBRAND","ALLTYPE",0);
  	Gitar g = new Gitar("Fender","Acoustick",7000000,"Pilih Warna");
  	Drum d = new Drum("Zildian","ElectricPad",13000000,"Pilih Setdrum");
	
	//Class Abstract
	Gitarabs ga = new Gitarabs();
	Drumabs da = new Drumabs();

	//Encapsulation set pada class	
	g.setWarna("Maroon");	
	d.setSetdrum("Standart");	

	//Encapsulation get pada class
	//polymorphism
	a.spekAlat(); 
	a.suara();  
  	g.spekGitar();
  	g.suara();
	ga.cara();
	d.spekDrum();
	d.suara();
	da.cara();

//Enkapsulasi dari data Hiding merupakan menyembunyikan attribute suatu objek dari objek lain, dengan memberikan modifier private.
//Sedangkan Class Abstract yaitu suatu class yang tidak bisa dibuat menjadi objek, dan berperan sebagai ‘kerangka dasar’ bagi class turunannya.
	
  System.out.println("------------------");


 }
}
