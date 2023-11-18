public class BankAccount {
    private float balance =0;
    public void deposit(float n){
        balance+=n;
    }
    public void withdraw(float n){
        if (n>balance){
            System.out.println("Not enough balance to withdraw");
        }else{
            if(n>500){
                balance-=n;
                System.out.println("Caution! You are withdrawing a large amount of money ("+n+" PLN)");
            }else{
                balance-=n;
            }
        }
    }
    public float getBalance(){
        return balance;
    }
    public static void main(String[] args) {
        BankAccount n = new BankAccount();
        n.deposit(500);
        System.out.println(n.getBalance());
        n.deposit(200);
        System.out.println(n.getBalance());
        n.withdraw(300);
        System.out.println(n.getBalance());
        n.deposit(1000);
        n.withdraw(900);
        System.out.println(n.getBalance());
    }
}
