public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1010;

        if (refill > 1_000) {
            int bonus = refill / 100;
            int total = balance + refill + bonus;
            System.out.println("Кол-во бонусов = " + bonus);
            System.out.println("Итоговая сумма = " + total);
        } else {
            int total = balance + refill;
            System.out.println("Бонусов нет");
            System.out.println("Итоговая сумма = " + total);
        }
    }
}
