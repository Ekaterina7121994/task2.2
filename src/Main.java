public class Main {
    public static void main(String[] args) {
        int initialAccount = 200;  // начальный счет
        int depositAmount = 8000;   // сумма пополнения
        int totalAmount;           // итоговый счет
        int bonus;                 // бонус
        if (depositAmount >= 1000) {
            bonus = depositAmount / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Начальный счет: " + initialAccount);
        System.out.println("Сумма пополнения: " + depositAmount);
        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговый счет: " + (totalAmount = depositAmount + bonus + initialAccount));

    }
}