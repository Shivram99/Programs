package com.mahait.Inheritance;

public class TestClass{
	public static void main(String[] args) {
		BarodaBank bb = new BarodaBank();
		IDBIBank idbiBank = new IDBIBank();
		ICICIBANK icici = new ICICIBANK();
		SBIBANK sbi = new SBIBANK();
		
		

		System.out.println("Bank Of Baroda : "+bb.getRateOfInterest());
		System.out.println("Bank Of IDBIBank : "+idbiBank.getRateOfInterest());
		System.out.println("Bank Of ICICIBANK : "+icici.getRateOfInterest());
		System.out.println("Bank Of SBIBANK : "+sbi.getRateOfInterest());
	}
}
