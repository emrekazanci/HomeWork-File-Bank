package com.bilgeadam.week05.hwbank;

public class Account {
	String hesapNo;
	double bakiye;
	boolean krediBasvurusu;
	double istenenKredi;

	public Account() {
		int randomSayi = (int) (Math.random()*100000);
		this.hesapNo = String.valueOf(randomSayi);
	}

	public Account(String hesapNo) {
		super();
		this.hesapNo = hesapNo;
	}
	
}
