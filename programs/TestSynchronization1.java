package com.mahait.programs;

class Table {

	synchronized void printTable(int n) {// method not synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(900);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class TestSynchronization1 {
	public static void main(String args[]) {
		 Table obj = new Table();

		Thread t1 = new Thread(){
			public void run() {
				obj.printTable(5);
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				obj.printTable(100);
			}
		};

		t1.start();
		t2.start();
	}

}