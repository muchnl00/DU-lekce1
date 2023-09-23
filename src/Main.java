import java.math.BigDecimal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

   public static void ukol1() {
        System.out.println("Hello world!");
   }
   public static void ukol2() {
        String uzivatel = "Karel";
        System.out.println(uzivatel);
    }

    public static void ukol3() {
        int pocetLekci = 10;
        System.out.println(pocetLekci);
    }

    public static void ukol4() {
        double price = 10.0;
        System.out.println(price);
    }

    public static void ukol5() {
        BigDecimal value = BigDecimal.ZERO;

        for (int i = 0; i < 10; i++) {
            value = value.add(BigDecimal.valueOf(0.1));
        }

        System.out.println(value);

    }

    public static void ukol6() {
        BigDecimal cena = BigDecimal.ZERO;
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }

    public static void ukol7() {
        int vykonMotoru = 120;
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: "+velikostKosile+".");
    }

    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!");
    }

    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou "
                +"zkratkou <Ctrl>+</> - použij lomítko "
                +"na numerické klávesnici.");
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();

        String name = "Karel Novák";
                System.out.println("Jméno prodejce je: "+name+".");

        String birth = "3. února 1988";
                System.out.println("Datum narození prodejce je: "+birth+".");

        int PocetSmluv = 6;
                System.out.println("Počet dosud sjednaných smluv je: "+PocetSmluv+".");

        int Mnozstvi = 24;
                System.out.println("Celkové množství prodané mrkve je: "+Mnozstvi+"t.");

        String town = "Praze";
                System.out.println("Prodejce sídlí v: "+town+".");

        String SPZ = "7S92798";
                System.out.println("Registrační značka vozidla je: "+SPZ+".");

        double spotreba = 7.25;
                System.out.println("Spořeba firemního vozidla je: "+spotreba+"l/100km.");

        String IPadresa = "192.168.1.1, 255.255.255.0";
                System.out.println("IP adresa je: "+IPadresa+".");


    }
}
