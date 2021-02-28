package by.rudakd.lesson7.task2;

public class Region extends District {
    protected String regionName;
    protected String state;
    protected double regionSquare;

    public Region(String regionName, String state) {
        this.regionName = regionName;
        this.state = state;
    }

    public Region() {
    }

    public District[] showDistricts(District[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].region.compareTo(this.regionName) == 0) {
                count++;
            }
        }
        District[] regionDistricts = new District[count];
        int regionIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].region.compareTo(this.regionName) == 0) {
                regionDistricts[regionIndex] = a[i];
                regionIndex++;
            }
        }
        return regionDistricts;
    }

    public double regionSquare(District[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].region.compareTo(this.regionName) == 0) {
                this.regionSquare += a[i].districtSquare;
            }
        }
        return this.regionSquare;
    }

    public String isRegionCentre(District[] a, City[] b) {
        District[] arrayDistrict = showDistricts(a);
        City[] arrayCities;
        String isCityCentre = " ";
        for (int i = 0; i < arrayDistrict.length; i++) {
            arrayCities = arrayDistrict[i].showCities(b);
            for (int j = 0; j < arrayCities.length; j++) {
                if (arrayCities[j].regionCentre) {
                    isCityCentre = arrayCities[j].cityName;
                }
            }
        }
        return isCityCentre;
    }

    @Override
    public String toString() {
        return "Region{" +
                "regionName='" + regionName + '\'' +
                ", state='" + state + '\'' +
                ", regionSquare=" + regionSquare +
                '}';
    }
}
