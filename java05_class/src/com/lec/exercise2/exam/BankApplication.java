package com.lec.exercise2.exam;
import java.util.Scanner;

public class BankApplication {
     private static Account2[] accountArray = new Account2[100];
     private static Scanner scanner = new Scanner(System.in);
     
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
			System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	private static void createAccount()
	{
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		for (int i = 0; i < accountArray.length; i++) {
			Account2 account2 = accountArray[i];
			if (account2 != null && account2.getAno().equals(ano)) {
				System.out.println("이미 존재하는 계좌번호 입니다. 다시 생성 해주세요.");
				return;
			}
		}
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		Account2 account2 = new Account2(ano,owner,balance);

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account2;
				System.out.println("결과: 계좌가 생성되었습니다.");
				return;
			}

	}


	}
	
	// 계좌목록보기
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				Account2 account2 = new Account2(null,null,0);
				account2.setAno(accountArray[i].getAno());
				account2.setOwner(accountArray[i].getOwner());
				account2.setBalance(accountArray[i].getBalance());
				System.out.println(account2.getAno() + "   " + account2.getOwner() + "   " + account2.getBalance());
			}
		}
	}
	
	// 예금하기
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		for (int i = 0; i < accountArray.length; i++) {
			Account2 account2 = accountArray[i];

			if (account2 != null && account2.getAno().equals(ano)) {
				System.out.print("예금액: ");
				int balance = scanner.nextInt();
				accountArray[i].setBalance(accountArray[i].getBalance() + balance);
				System.out.println("결과: 예금이 성공되었습니다.");
				return;
			}
		}
		System.out.println("계좌번호가 없습니다. 다시 확인부탁드립니다.");
	}


	// 출금하기
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();

		for (int i = 0; i < accountArray.length; i++) {
			Account2 account2 = accountArray[i];

			if (account2 != null && account2.getAno().equals(ano)) {
				System.out.print("출금액: ");
				int balance = scanner.nextInt();
				accountArray[i].setBalance(accountArray[i].getBalance() - balance);
				System.out.println("결과: 출금이 성공되었습니다.");
				return;
			}
		}
		System.out.println("계좌번호가 없습니다. 다시 확인부탁드립니다.");

	}



	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account2 findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			Account2 account2 = accountArray[i];
			if (account2 != null && account2.getAno().equals(ano)) {
				return account2;
			}
		}
		return null;
	}

}
