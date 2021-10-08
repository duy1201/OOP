import java.util.ArrayList;

public class Account {
    private double balance = 0.0;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance += amount;
        }
    }

    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
        }
    }

    /**
     * This is addTransaction.
     * @param amount amount
     * @param operation operation
     */
    public void addTransaction(double amount, String operation) {
        if (operation != Transaction.DEPOSIT && operation != Transaction.WITHDRAW) {
            System.out.println("Yeu cau khong hop le!");
        } else if (operation == Transaction.DEPOSIT) {
            deposit(amount);
            transitionList.add(new Transaction(operation, amount, balance));
        } else {
            withdraw(amount);
            transitionList.add(new Transaction(operation, amount, balance));
        }
    }

    /**
     * This is printTransaction.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            double soDu = transitionList.get(i).getBalance();
            double tienNapRut = transitionList.get(i).getAmount();
            System.out.printf("%s%d%s", "Giao dich ", i + 1, ":");
            if (transitionList.get(i).getOperation() == Transaction.DEPOSIT) {
                System.out.printf("%s%.2f%s%.2f%s\n", " Nap tien $", 
                tienNapRut, ". So du luc nay: $", soDu, ".");
            } else {
                System.out.printf("%s%.2f%s%.2f%s\n", " Rut tien $", 
                tienNapRut, ". So du luc nay: $", soDu, ".");
            }
        }
    }

    public static void main(String[] args) {

    }
}
