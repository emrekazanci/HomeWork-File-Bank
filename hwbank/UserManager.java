package com.bilgeadam.week05.hwbank;

public class UserManager {

	void otomatikEmailOlustur(User user) {
		System.out.println(user.email);
	}

	void bilgileriGoster(User user) {
		System.out.println("İsim: " + user.name + " Soyisim: " + user.surname + " Hesap No: " + user.account.hesapNo
				+ " Email: " + user.email + " Hesap bakiyeniz: " + user.account.bakiye + " Kalan kredi borcu: "
				+ user.account.istenenKredi);
	}

	void krediBasvurusundaBulun(Account account, int para) {
		System.out.println(para + " TL miktarında kredi başvurusunda bulunuldu.\nLütfen onay bekleyin.");
		account.istenenKredi += para;
	}

	void krediKartiBorcuOdeme(Account account, double taksit) {
		if (account.krediBasvurusu = true) {

			account.bakiye -= taksit;
			System.out.println("Ödenen miktar: " + taksit + " Kalan kredi borcunuz: " + account.bakiye);
		} else {
			System.out.println("Kredi borcunuz yoktur.");
		}
	}
}
