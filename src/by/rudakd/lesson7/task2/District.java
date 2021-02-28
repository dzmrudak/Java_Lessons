package by.rudakd.lesson7.task2;

import java.util.Arrays;

public class District extends City {
    private String districtName;
    protected int districtSquare;
    protected String region;

    public District(String districtName, int districtSquare, String region) {
        this.districtName = districtName;
        this.districtSquare = districtSquare;
        this.region = region;
    }

    public District() {
    }

    public City[] showCities(City[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].district.compareTo(this.districtName) == 0) {
                count++;
            }
        }
        City[] districtCities = new City[count];
        int cityIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].district.compareTo(this.districtName) == 0) {
                districtCities[cityIndex] = a[i];
                cityIndex++;
            }
        }
        return districtCities;
    }

    @Override
    public String toString() {
        return "\n" + "District{" +
                "districtName='" + districtName + '\'' +
                ", districtSquare=" + districtSquare +
                ", region='" + region + '\'' +
                '}';
    }
}
