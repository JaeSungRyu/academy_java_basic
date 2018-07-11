package account.one;
/**
 * 은행 계좌를 정의하는 클래스
 * -------------------------------------------
 * 계좌의 속성을 나타내기 위하여 두개의 멤버변수를 선언
 * 계좌번호 : accNumber
 * 계좌잔액 : balance
 * -------------------------------------------
 * 계좌의 잔액을 증가시키는 입금 메소드 : deposit(account)
 * 계좌의 현재상태를 출력하는 메소드 : print()
 */
public class Account {
	//1.멤버변수(실체변수) 선언수
	/*계좌번호*/
	int accNumber;
	/*잔액*/
	int balance;
	
	//2.생성자 선언부(생략)
	
	//3.메소드 선언부
	/**
	 * 입력된 amount만큼 
	 * 이 계좌의 잔액을 추가
	 * @param amount : 입금할 금액
	 */
	public void deposit(int amount) {
		balance += amount;
	}
	public void print() {
		System.out.printf("계좌번호 : %d | \t 계좌 잔액 : %d%n",
				          accNumber,balance);
	}
}
