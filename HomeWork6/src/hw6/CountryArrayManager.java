package hw6;

public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() < newArray[minIdx].getPopulation()) {
                    minIdx = j;
                }
            }
            Country temp = newArray[minIdx];
            newArray[minIdx] = newArray[i];
            newArray[i] = temp;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() > newArray[maxIdx].getPopulation()) {
                    maxIdx = j;
                }
            }
            Country temp = newArray[maxIdx];
            newArray[maxIdx] = newArray[i];
            newArray[i] = temp;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - 1; j++) {
                if (newArray[j].getArea() > newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - 1; j++) {
                if (newArray[j].getArea() < newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() > key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() < key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    public NorthAmericaCountry[] filterAfricaCountry() {

        NorthAmericaCountry[] newArr = new NorthAmericaCountry[countries.length];
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof NorthAmericaCountry) {
                newArr[i] = (NorthAmericaCountry) countries[i];
            }
        }
        return newArr;
    }

    public AsiaCountry[] filterAsiaCountry() {
        AsiaCountry[] newArr = new AsiaCountry[countries.length];
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof AsiaCountry) {
                newArr[i] = (AsiaCountry) countries[i];
            }
        }
        return newArr;
    }

    public EuropeCountry[] filterEuropeCountry() {
        EuropeCountry[] newArr = new EuropeCountry[countries.length];
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof EuropeCountry) {
                newArr[i] = (EuropeCountry) countries[i];
            }
        }
        return newArr;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        NorthAmericaCountry[] newArr = new NorthAmericaCountry[countries.length];
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof NorthAmericaCountry) {
                newArr[i] = (NorthAmericaCountry) countries[i];
            }
        }
        return newArr;

    }

    public OceaniaCountry[] filterOceaniaCountry() {
        OceaniaCountry[] newArr = new OceaniaCountry[countries.length];
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof OceaniaCountry) {
                newArr[i] = (OceaniaCountry) countries[i];
            }
        }
        return newArr;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        SouthAmericaCountry[] newArr = new SouthAmericaCountry[countries.length];
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof SouthAmericaCountry) {
                newArr[i] = (SouthAmericaCountry) countries[i];
            }
        }
        return newArr;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] mostPopulous = new Country[howMany];
        for (int i = 0; i < countries.length - 1; i++) {
            for (int j = i + 1; j < countries.length; j++) {
                if (countries[i] != null && countries[j] != null && countries[i].getPopulation() < countries[j].getPopulation()) {
                    Country temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }
            }
        }
        for (int i = 0; i < howMany; i++) {
            mostPopulous[i] = countries[i];
        }
        return mostPopulous;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] mostPopulous = new Country[howMany];
        for (int i = 0; i < countries.length - 1; i++) {
            for (int j = i + 1; j < countries.length; j++) {
                if (countries[i] != null && countries[j] != null && countries[i].getPopulation() > countries[j].getPopulation()) {
                    Country temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }
            }
        }
        for (int i = 0; i < howMany; i++) {
            mostPopulous[i] = countries[i];
        }
        return mostPopulous;
    }

    public Country[] filterLargestAreaCountries(int howMany) {

        Country[] largestArea = new Country[howMany];
        for (int i = 0; i < countries.length - 1; i++) {
            for (int j = i + 1; j < countries.length; j++) {
                if (countries[i] != null && countries[j] != null && countries[i].getArea() < countries[j].getArea()) {
                    Country temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }
            }
        }
        for (int i = 0; i < howMany; i++) {
            largestArea[i] = countries[i];
        }
        return largestArea;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] largestArea = new Country[howMany];
        for (int i = 0; i < countries.length - 1; i++) {
            for (int j = i + 1; j < countries.length; j++) {
                if (countries[i] != null && countries[j] != null && countries[i].getArea() > countries[j].getArea()) {
                    Country temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }
            }
        }
        for (int i = 0; i < howMany; i++) {
            largestArea[i] = countries[i];
        }
        return largestArea;
    }

    public Country[] filterHighestGdpCountries(int howMany) {


        Country[] highGDP = new Country[howMany];
        for (int i = 0; i < countries.length - 1; i++) {
            for (int j = i + 1; j < countries.length; j++) {
                if (countries[i] != null && countries[j] != null && countries[i].getGdp() < countries[j].getGdp()) {
                    Country temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }
            }
        }
        for (int i = 0; i < howMany; i++) {
            highGDP[i] = countries[i];
        }
        return highGDP;
    }

    public Country[] filterLowestGdpCountries(int howMany) {


        Country[] lowGDP = new Country[howMany];
        for (int i = 0; i < countries.length - 1; i++) {
            for (int j = i + 1; j < countries.length; j++) {
                if (countries[i] != null && countries[j] != null && countries[i].getGdp() > countries[j].getGdp()) {
                    Country temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }
            }
        }
        for (int i = 0; i < howMany; i++) {
            lowGDP[i] = countries[i];
        }
        return lowGDP;
    }
}
