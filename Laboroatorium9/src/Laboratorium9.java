
public class Laboratorium9 {
    public static void main(String[] args) {
        Customer c = new Customer();
        Account konto = new Account();
        konto.cashBalanse = 15000.0;
        c.name = "Marian Kowalski";
        c.address = "3 maja 54, Gdańsk";
        Stock akcje = new Stock();
        akcje.quantity = 10;
        akcje.ticker = "KGHM";
        System.out.println(c.name + c.address + "  Zarabia: " + konto.cashBalanse);
        System.out.println("Posiada akcje: " + akcje.ticker);
        System.out.println("Ilość akcji: " + akcje.quantity);
    }
}
