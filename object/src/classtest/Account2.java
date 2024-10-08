<<<<<<< HEAD
package classtest;

public class Account2 {
    // 계좌번호(accountNo) : 101-11-12345
    // 계좌주(owner) : 홍길동
    // 잔액(balance) : 10000000
    private String accountNo;
    private String owner;
    private int balance;

    public Account2(String accountNo, String owner, int balance) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }

    // 기능
    // 예금하다(deposit)
    // 잔액 = 잔액 + 예금액
    // 리턴 없음
    void deposit(int amount) {
        balance += amount;
    }

    // 출금하다(withdraw)
    // 잔액 = 잔액 - 출금액
    // 잔액 return
    int withdraw(int amount) {
        if (amount < balance) {
            return -1;

        }
        balance -= amount;
        return balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Account2 [accountNo=" + accountNo + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
=======
package classtest;

public class Account2 {
    // 계좌번호(accountNo) : 101-11-12345
    // 계좌주(owner) : 홍길동
    // 잔액(balance) : 10000000
    private String accountNo;
    private String owner;
    private int balance;

    public Account2(String accountNo, String owner, int balance) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }

    // 기능
    // 예금하다(deposit)
    // 잔액 = 잔액 + 예금액
    // 리턴 없음
    void deposit(int amount) {
        balance += amount;
    }

    // 출금하다(withdraw)
    // 잔액 = 잔액 - 출금액
    // 잔액 return
    int withdraw(int amount) {
        if (amount < balance) {
            return -1;

        }
        balance -= amount;
        return balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Account2 [accountNo=" + accountNo + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
>>>>>>> ce0a999417578a8be48c26f5566072d556a7963e
