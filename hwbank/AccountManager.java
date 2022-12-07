package com.bilgeadam.week05.hwbank;

public class AccountManager {

	public void paraYatir(Account account, double miktar) {
		if (miktar < 10000) {
			account.bakiye += miktar;
			System.out.println(miktar + " TL yatırdınız. Güncel bakiyeniz: " + account.bakiye);
		} else {
			System.out.println(miktar + " Tl çok fazla. Bu kadaar yatıramazsınız!");
		}
	}

	public void paraCek(Account account, double miktar) {
		if (miktar > account.bakiye) {
			System.out.println("Bakiyeniz yetersiz. " + miktar + " TL para çekemezsiniz.");
		} else {
			account.bakiye -= miktar;
			System.out.println(miktar + " TL çektiniz. Güncel bakiyeniz: " + account.bakiye);
		}
	}

	public void hesapBilgileriniGoster(Account account) {
		System.out.println("Hesap No: " + account.hesapNo + " Güncel bakiyeniz: " + account.bakiye);
	}

}
