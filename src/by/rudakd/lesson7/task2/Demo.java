package by.rudakd.lesson7.task2;

import java.util.Arrays;

public class Demo extends State{
    public static void main(String[] args) {
        City city1 = new City("Minsk", "Minsk district", true, true);
        City city2 = new City("Vitebsk", "Vitebsk district", false, true);
        City city3 = new City("Novopolotsk", "Vitebsk district", false, false);
        City[] cities = new City[]{city1, city2, city3};

        District district1 = new District("Vitebsk district", 50, "Vitebsk region");
        District district2 = new District("Polotsk district", 60, "Vitebsk region");
        District district3 = new District("Orsha district", 70, "Vitebsk region");
        District district4 = new District("Brest district", 15, "Brest region");
        District district5 = new District("Minsk district", 15, "Minsk region");
        District[] districts = new District[]{district1, district2, district3, district4, district5};

        Region region1 = new Region("Vitebsk region", "Belarus");
        Region region2 = new Region("Brest region", "Belarus");
        Region region3 = new Region("Grodno region", "Belarus");
        Region region4 = new Region("Minsk region", "Belarus");
        Region[] regions = new Region[]{region1, region2, region3, region4};

        State belarus = new State("Belarus");
        belarus.isCapital(regions, districts, cities);
        System.out.println();

        System.out.println("There are " + belarus.showRegions(regions).length + " regions in " + belarus.stateName);
        System.out.println();

        System.out.println("The square of " + belarus.stateName + " = " + belarus.calculateStateSquare(regions, districts));
        System.out.println();

        System.out.println("The centres of the regions are " + Arrays.toString(belarus.showRegionCentres(regions, districts, cities)));


    }
}
