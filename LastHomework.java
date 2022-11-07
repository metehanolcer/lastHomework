package com.metehanolcer;

public class LastHomework {

	public static void main(String[] args) {
		// 1- verilen sehirler arrayinde ";" dan öncesini ayırıyoruz(split())
		// ayırdğımız bu veriyi yeni bir arraye atıyoruz.
		// ve yeni arrayı ekrana bastırıyoruz,
		
		// 2- daha sonra
		// “Adananın plaka kodu 01” örnek çıktışı gibi ekrana tekrar bastırıyoruz
		// Sehirleri plaka kodlarıyla birlikte bir diziye atayalım daha sonra
		
		// split()
		// indexOf()
		// substring()
		
		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
				+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";

		String[] arrOfSehirler = sehirler.split("-|;");

		for (int i = 0; i < arrOfSehirler.length; i++) {
			System.out.println(arrOfSehirler[i]);
		}

		for (int i = 0; i < arrOfSehirler.length; i++) {
			if (i % 2 == 0) {
				System.out.println(arrOfSehirler[i + 1] + " adlı şehrin plaka kodu: " + arrOfSehirler[i]);

			}
		

		}
	}
}


