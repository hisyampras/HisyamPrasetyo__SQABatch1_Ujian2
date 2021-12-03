package NoTiga;

import java.util.Scanner;

public class HitungCepat {
	public static void main(String[]args) {
		// Silakan isi bagian ini
		
		// TODO Auto-generated method stub
				Scanner scan    = new Scanner(System.in);
				double waktu;
				int jarak, kecepatan, ubahwaktu;
				int totalJam, IWaktu;
				 System.out.print("Masukan jarak (kilometer) : ");
			        jarak    = scan.nextInt();

			      System.out.print("Masukan waktu (jam) : ");
			      kecepatan       = scan.nextInt();
			      
			      	jarak = jarak * 1000;
			        kecepatan   = kecepatan * 1000;
			        
			        waktu       = jarak / ((double) kecepatan / 3600);
			        ubahwaktu  = (int) waktu;

			        IWaktu    = ubahwaktu % 3600;
			        totalJam    = (ubahwaktu - IWaktu) / 3600; 
			        System.out.printf("kecepatan rata rata anda adalah "+ "%d jam/km", totalJam);
		}
		static void hitungKecepatan(int hitungKecepatan ) {
		//Silakan isi bagian ini dan ganti “anu” dengan kode yang tepat
			new HitungCepat();
			System.out.println(hitungKecepatan);
			
			
		}
}
