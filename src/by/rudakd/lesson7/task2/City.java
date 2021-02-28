package by.rudakd.lesson7.task2;

public class City {
    protected String cityName;
    protected String district;
    protected boolean capital;
    protected boolean regionCentre;

    public City(String cityName, String district, boolean capital, boolean regionCentre) {
        this.cityName = cityName;
        this.district = district;
        this.capital = capital;
        this.regionCentre = regionCentre;
    }
    public City(){};

    @Override
    public String toString() {
        return "\nCity{" +
                "cityName='" + cityName + '\'' +
                ", district='" + district + '\'' +
                ", capital=" + capital +
                ", regionCentre=" + regionCentre +
                '}';
    }
}
