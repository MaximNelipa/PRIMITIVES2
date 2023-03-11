public class Main {
    public static void main(String[] args) {

        int schet = 100;
        int depozit = 5000;
        int bonus;

        if (depozit > 1000) {
            bonus = depozit / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Счет клиента:" + (schet + depozit + bonus) + "рублей");
    }
}