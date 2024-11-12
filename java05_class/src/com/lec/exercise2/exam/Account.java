package com.lec.exercise2.exam;

public class Account {
		private int balance;
		final int MIN_BALANCE = 0;
		final int MAX_BALANCE = 1000000;
		

		public int getBalance() {
			return balance;
		}

//		public void setBalance(int balance) {
//			if(balance < MIN_BALANCE) {getBalance();}
//			else if(balance > MAX_BALANCE) {getBalance();}
//			else {this.balance = balance;}
//		}
		
		public void setBalance(int balance) {
			if(balance>=MIN_BALANCE&&balance<=MAX_BALANCE) {this.balance = balance;}
			else {getBalance();}
		}
		
		
		

}


//void setter(int balance){
//	if(balance>=MIN_BALANCE && balance<=MAX_BALANCE) {
//	this.balance = balance;
//	}
//	System.out.println("잔고는:"+this.balance);
//}
//int getter() {
//	return balance;
//}