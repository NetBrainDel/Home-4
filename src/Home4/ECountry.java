package Home4;

public enum ECountry implements ICountry {
    Russia(17_075_400 , 143_300_000);
    //Canada(9_976_140, 35_700_000), canada; USA(9_500_000, 295_734_100);
    //Ukraine(603_700, 45_872_000); Poland(312_685, 38_167_000); Lithuania(64_589, 2_237_000);
   // Latvia(65_200, 3_329_000); Austria(8_470_000, 83_879); Monaco(2, 33_000);
    //Belarus(207_595, 9_475_174);

    private  double areaofthecountry;
    private int population;

    ECountry(double areaofthecountry, int population) {
        this.areaofthecountry = areaofthecountry;
        this.population = population;
    }
    public  double getAreaofthecountry() {
        return areaofthecountry;
    }

    public void setAreaofthecountry(double areaofthecountry) {
        this.areaofthecountry = areaofthecountry;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public static ECountry valueOfIgnoreCase(String countryName) {
        return valueOf(countryName.toUpperCase());
    }


}
