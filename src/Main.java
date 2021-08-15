public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1200;
        int bonus;

        if (refill > 1_000) {
            bonus = refill / 100;
            System.out.println("Кол-во бонусов = " + bonus);
        } else {
            bonus = 0;
            System.out.println("Бонусов нет");
        }

        int total = balance + refill + bonus;
        System.out.println("Итоговая сумма = " + total);
    }
}
