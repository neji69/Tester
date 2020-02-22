package homework_2;

public class Vending {

    private int balance;
    public int kursor;

    public void showMenu(Napitok spisok[]) {
        System.out.println("*МЕНЮ*");
        for (int i = 0; i < spisok.length; i++) {
            if (i == 0) {
                System.out.println("--------------------------------------------");
            }
            System.out.println("ID:" + spisok[i].getId() + " Название: " + spisok[i].getName() + " Цена: " + spisok[i].getPrice() + " руб.");

        }
    }

    public void pokypkaNapitka(int nomer, Napitok[] spisok) {
        switch (nomer) {
            case 100:
                if (balance >= spisok[0].getPrice()) {
                    System.out.println("Вы успешно купили :" + spisok[0].getName() + " осталось на балансе: " + (balance -= spisok[0].getPrice()));
                } else System.out.println("Не хватает денег!!! Нужно еще " + (spisok[0].getPrice() - balance));
                break;
            case 101:
                if (balance >= spisok[1].getPrice()) {
                    System.out.println("Вы успешно купили :" + spisok[1].getName() + " осталось на балансе: " + (balance -= spisok[1].getPrice()));
                } else System.out.println("Не хватает денег!!! Нужно еще " + (spisok[1].getPrice() - balance));
                break;
            case 102:
                if (balance >= spisok[2].getPrice()) {
                    System.out.println("Вы успешно купили :" + spisok[2].getName() + " осталось на балансе: " + (balance -= spisok[2].getPrice()));
                } else System.out.println("Не хватает денег!!! Нужно еще " + (spisok[2].getPrice() - balance));
                break;
            case 150:
                if (balance >= spisok[3].getPrice()) {
                    System.out.println("Вы успешно купили :" + spisok[3].getName() + " осталось на балансе: " + (balance -= spisok[3].getPrice()));
                } else System.out.println("Не хватает денег!!! Нужно еще " + (spisok[3].getPrice() - balance));
                break;
            case 111:
                if (balance >= spisok[4].getPrice()) {
                    System.out.println("Вы успешно купили :" + spisok[4].getName() + " осталось на балансе: " + (balance -= spisok[4].getPrice()));
                } else System.out.println("Не хватает денег!!! Нужно еще " + (spisok[4].getPrice() - balance));
                break;
            default:
                System.out.println("Некоректный выбор");
                break;

        }
    }

    public void setBalance(int vznos) {

        if (vznos < 0) System.out.println("Нельзя внести отрицательную сумму!");
        else this.balance += vznos;
    }

    public int getBalance() {
        return balance;
    }
}

