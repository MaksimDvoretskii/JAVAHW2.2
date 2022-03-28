public class Main {
    public static void main(String[] args) {

        int userBalance = 100; // баланс пользователя
        int bonusLevel; // единица измерения 1 рубль (бонус за каждые 100 рублей)
        int userPayment = 1800; // сумма пополнения
        boolean over = true;
        // логика программы
        int percent = (userPayment > 1000) ? 1 : 0;
        int bonus = userPayment / 100 * percent;
        int finalBalance = userBalance + userPayment + bonus;
        System.out.println("Спасибо за ваш платёж.Ваш баланс:" + userBalance + "руб.Ваш бонус:" + bonus + "руб.");
    }
}
