package com.bilgeadam.week05.hwbank;

public class Main {

	public static void main(String[] args) {
		Account account1 = new Account();
		AccountManager accountManager = new AccountManager();
		User user1 = new User("Emre", "Kazanci", account1);
		UserManager userManager = new UserManager();
		AdminManager adminManager = new AdminManager();
		
		accountManager.paraYatir(account1, 500);
		accountManager.paraYatir(account1, 2000);
		accountManager.paraCek(account1, 1200);
		accountManager.hesapBilgileriniGoster(account1);
		System.out.println("---------------");
		userManager.otomatikEmailOlustur(user1);
		userManager.bilgileriGoster(user1);
		userManager.krediBasvurusundaBulun(account1, 100000);
		//adminManager.krediBasvurusunuOnayla(account1);
		adminManager.krediBasvurusunuReddet(account1);
		
		accountManager.hesapBilgileriniGoster(account1);
		System.out.println("-----------");
		userManager.krediKartiBorcuOdeme(account1, 12000);
		userManager.krediKartiBorcuOdeme(account1, 15000);
		userManager.bilgileriGoster(user1);
		
	}

}
