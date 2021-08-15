public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1200;
        int bonus;

        if (refill > 1_000) {
            bonus = refill / 100;

        } else {
            bonus = 0;
        }

        int total = balance + refill + bonus;
        System.out.println("Кол-во бонусов = " + bonus);
        System.out.println("Итоговая сумма = " + total);
    }
}
