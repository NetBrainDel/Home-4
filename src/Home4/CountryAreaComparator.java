package Home4;

import java.util.Comparator;

public class CountryAreaComparator implements Comparator<ECountry> {

    public int compare(ECountry country1, ECountry country2) {
        if (country1.getAreaofthecountry() == country2.getAreaofthecountry()) {
            return 0;
        }
        if (country1.getAreaofthecountry() > country2.getAreaofthecountry()) {
            return 1;
        }
        // country1.getAreaofthecountry() < country2.getAreaofthecountry()
            return -1;
    }
}