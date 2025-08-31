//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int Balance = 100;

        int NewBalance = 200;
        int Result;
        if (NewBalance >= 1000) {
            Result = Balance + NewBalance + (NewBalance / 100);
        } else {
            Result = Balance + NewBalance;

        }
        System.out.println((Result));
    }
}