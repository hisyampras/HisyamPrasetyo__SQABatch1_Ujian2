package NoEmpat;

import java.util.Scanner;

public class HitungJarak {

	public static void main(String[]args) {
		// Silakan isi bagian ini
		Scanner scan    = new Scanner(System.in);
		double sisa;
		int sisaJarak, jarakPerLiter, ubahwaktu;
		int totalJam;
		 System.out.print("Masukkan sisa BBM dalam tangki (liter) : ");
	        sisaJarak = scan.nextInt();

	      System.out.print("Masukkan konsumsi BBM kendaraan (km/liter) : ");
	      jarakPerLiter= scan.nextInt();
	      
	      	
	        
	        sisa       = sisaJarak * ((double) jarakPerLiter);
	      
	        System.out.printf("kecepatan rata rata anda adalah "+ "%d jam/km", sisaJarak);
		
//		System.out.print(sisaJarak);
		}
		static double hitungSisaJarak(double sisa, double jarakPerLiter) {
		double sisaJarak = sisa * jarakPerLiter;
		return sisaJarak;
		
		}

}
