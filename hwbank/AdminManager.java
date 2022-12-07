package com.bilgeadam.week05.hwbank;

public class AdminManager {

	void krediBasvurusunuOnayla(Account account) {
		if (account.krediBasvurusu = true) {
			System.out.println("Başvurunuz onaylanmıştır.");
			account.bakiye += account.istenenKredi;
		} else {
			System.out.println("Kredi başvurusu yapılmadı.");
		}
	}

	void krediBasvurusunuReddet(Account account) {
		if (account.krediBasvurusu = true) {
			System.out.println("Başvurunuz reddedilmiştir.");
			account.istenenKredi = 0;
			
		} else {
			System.out.println("Kredi başvurusu yapılmamış.");
		}
	}
}
