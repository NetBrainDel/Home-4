package Home4;

import java.util.Scanner;

import static Home4.ECountry.Russia;

public class mainCountry {
    public static void main(String[] args) {

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
