package ch06.sec15;

import java.util.Scanner;

public class BankApplication {


		private static Account[] accounArray = new Account[100];
		private static Scanner scanner = new Scanner(System.in);
		
		public static void main(String[] args) {
			boolean run = true;
			while(run) {
				System.out.println("--------------------------");
				System.out.println("1. 계좌생성 | 2. 계죄목록 | 3. 예금 | 4. 출금 | 5. 종료");
				System.out.print("선택> ");
				
				int selecNo = scanner.nextInt();
				if(selecNo == 1) {
					createAccount();
				} else if(selecNo == 2 ) {
					accountList();
				} else if(selecNo == 3) {
					deposit();
				} else if(selecNo == 4) {
					withdraw();
				} else if(selecNo == 5) {
					run = false;
				}
			}
			System.out.println("프로그램 종료");
	 }
		
		//계좌 생성하기
		public static void createAccount() {
			System.out.println("--------------------");
			System.out.println("계좌생성");
			System.out.println("--------------------");
			
			System.out.print("계좌번호");
			String ano = scanner.next();
			
			System.out.print("계좌주");
			String owner = scanner.next();
			
			System.out.print("초기금액");
			int balance = scanner.nextInt();
			
			Account newAccount = new Account(ano, owner, balance);
			for(int i=0; i<accounArray.length; i++) {
				if(accounArray[i] == null) {
				accounArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
				}
			}
		}
//계좌 목록 보기
		public static void accountList() {
			System.out.println("----------------");
			System.out.println("계좌목록");
			System.out.println("----------------");
			for(int i=0; i<accounArray.length; i++) {
				Account account = accounArray[i];
				if(account != null) {
					System.out.print(account.getAno());
					System.out.print("     ");
					System.out.print(account.getOwner());
					System.out.print("     ");
					System.out.print(account.getBalance());
					System.out.println();
				}
			}
		}
		
//예금하기
		public static void deposit() {
			System.out.println("----------------");
			System.out.println("예금");
			System.out.println("----------------");
			System.out.println("계좌번호: ");
			String ano = scanner.next();
			System.out.print("예금액: ");
			int money = scanner.nextInt();
			Account account = findAccount(ano);
			if(account == null) {
				System.out.println("결과: 계좌가 없습니다.");
				return;
			}
			account.setBalance(account.getBalance() + money);
			System.out.println("결과: 예금이 성공되었습니다.");
		}
		
		//출금하기
		public static void withdraw() {
			System.out.println("----------------");
			System.out.println("출금");
			System.out.println("----------------");
			System.out.println("계좌번호: ");
			String ano = scanner.next();
			System.out.print("출금액: ");
			int money = scanner.nextInt();
			Account account = findAccount(ano);
			if(account == null) {
				System.out.println("결과: 계좌가 없습니다.");
				return;
			}
			account.setBalance(account.getBalance() + money);
			System.out.println("결과: 출금이 성공되었습니다.");
		}
		
		//Account 배열에서 ano와 동일한 Account 객체 찾기
		public static Account findAccount(String ano) {
			Account account = null;
			for(int i = 0; i < accounArray.length; i++) {
				if(accounArray[i] != null) {
					String dbAno = accounArray[i].getAno();
					if(dbAno.equals(ano)) {
						account = accounArray[i];
						break;
					}
				}
			}
			return account;
		}
}