import java.util.Scanner;

public class hadiah3 {
	
	
	public static void main (String args[]){
		
		
		 Scanner input = new Scanner(System.in);
		 
		 String nama,predikat;
		 int nilaitugas1, nilaitugas2, nilaitugas3, nilaimid, nilaifinal;
		 double nilairata, nilaiakhir;
		 
		 
		System.out.print("Masukkan Nama anda : ");
		nama = input.nextLine();
		System.out.print("Masukkan Nilai Tugas 1 : ");
		nilaitugas1 = input.nextInt();
		System.out.print("Masukkan Nilai Tugas 2 : ");
		nilaitugas2 = input.nextInt();
		System.out.print("Masukkan Nilai Tugas 3 : ");
		nilaitugas3 = input.nextInt();
		System.out.print("Masukkan Nilai Mid : ");
		nilaimid = input.nextInt();
		System.out.print("Masukkan Nilai Final : ");
		nilaifinal = input.nextInt();
		
		 
		nilairata=((nilaitugas1+nilaitugas2+nilaitugas3)/3);
		
		nilaiakhir=(nilairata*30/100)+(nilaimid*30/100)+(nilaifinal*40/100);
		 
		 
		if (nilaiakhir >= 80) {
			predikat="A";
		} else
		if (nilaiakhir >= 60 & nilaiakhir < 80) {
			predikat="B";
		} else
		if (nilaiakhir >= 50 & nilaiakhir < 60) {
			predikat="C";
		} else
		if (nilaiakhir >= 40 & nilaiakhir < 50) {
			predikat="C";
		} else {
			predikat="E";
		}
		 
		System.out.println(); 
		 
		System.out.print(" Nama anda : " + nama + "\n"); 
		
		System.out.print(" Nilai Akhir anda : " + nilaiakhir + "\n");
		
		System.out.print(" Nilai Predikat anda : " + predikat + "\n");  
		 
	}



}