package Home4;

import java.util.Comparator;

public class CountryAreaComparator implements Comparator<ECountry> {

    public int compare(ECountry namecountry1, ECountry namecountry2) {
        if (namecountry1.getAreaofthecountry() == namecountry2.getAreaofthecountry()) {
            return 0;
        }
        if (namecountry1.getAreaofthecountry() > namecountry2.getAreaofthecountry()) {
            return 1;
        }
        // namecountry1.getAreaofthecountry() < namecountry2.getAreaofthecountry()
            return -1;
    }
}