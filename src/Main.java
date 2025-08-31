//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int balance = 100;

        int new_balance = 200;
        int result;
        if(new_balance >= 1000) {
            result = balance +new_balance+ (new_balance/100);
        }
        else{
            result = balance +new_balance;

        }
        System.out.println((result));
    }
}