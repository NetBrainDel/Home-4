package Home4;

import java.util.Scanner;

import static Home4.ECountry.Russia;

public class mainCountry {
    public static void main(String[] args) {
        System.out.println("введите название города из списка:\n " +
                "Russia\n" +
                " Ukraine\n" +
                " Poland\n" +
                " Lithuania\n" +
                " Latvia\n" +
                " Belarus\n" +
                " Austria\n" +
                " Monaco\n" +
                " USA\n" +
                " CANADA");
        Scanner in =  new Scanner( System.in);
        System.out.println("введите название города №1: ");
        String namecountry1 =  in.nextLine();
        System.out.println("введите название города №2: ");
        String namecountry2 =  in.nextLine();

        ICountry russia = ECountry.valueOfIgnoreCase(namecountry1);
        if (russia ==  ECountry.Russia) {
            System.out.println("NASHARASHA");
        }

        CountryAreaComparator comparator = new CountryAreaComparator();
        int Compare =  comparator.compare(ECountry.valueOfIgnoreCase(namecountry1), ECountry.valueOfIgnoreCase(namecountry2));

        if (Compare ==  0) {
            System.out.println("площадь: "  +  namecountry1 +  " равно площади: "  +  namecountry2);
        }
        if (Compare ==  1) {
            System.out.println("площадь: "  +  namecountry1 +  "больше чем площадь: "  +  namecountry2);
        }
        if (Compare == - 1) {
            System.out.println("площадь: " + namecountry1 + " меньше чем площадь:  " + namecountry2);

        }
    }
}
