package by.rudakd.lesson7.task2;

public class State extends Region {
    protected String stateName;
    private Region[] stateRegions;

    public State(String stateName) {
        this.stateName = stateName;
    }

    public State() {
    }

    public String[] showRegionCentres(Region[] a, District[] b, City[] c) {
        Region[] arrayRegions = showRegions(a);
        int countCentres = 0;
        int index = 0;

        for (int i = 0; i < arrayRegions.length; i++) {
            if(arrayRegions[i].isRegionCentre(b, c).compareTo(" ") != 0){
                countCentres++;
            }
        }
        String[] arrayOfRegionCentres = new String[countCentres];
        for (int i = 0; i < arrayRegions.length; i++) {
            if(arrayRegions[i].isRegionCentre(b, c).compareTo(" ") != 0){
                arrayOfRegionCentres[index] = arrayRegions[i].isRegionCentre(b, c);
                index++;
            }
        }

        return arrayOfRegionCentres;
    }

    public double calculateStateSquare(Region[] a, District[] b) {
        int stateSquare = 0;
        Region[] arrayRegions = showRegions(a);
        for (int i = 0; i < arrayRegions.length; i++) {
            stateSquare += arrayRegions[i].regionSquare(b);
        }
        return stateSquare;
    }

    public Region[] showRegions(Region[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].state.compareTo(this.stateName) == 0) {
                count++;
            }
        }
        Region[] stateRegions = new Region[count];
        int stateIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].state.compareTo(this.stateName) == 0) {
                stateRegions[stateIndex] = a[i];
                stateIndex++;
            }
        }
        return stateRegions;
    }

    public void isCapital(Region[] a, District[] b, City[] c) {
        Region[] arrayRegions = showRegions(a);
        District[] arrayDistricts;
        City[] arrayCities;

        for (int i = 0; i < arrayRegions.length; i++) {
            arrayDistricts = arrayRegions[i].showDistricts(b);
            for (int j = 0; j < arrayDistricts.length; j++) {
                arrayCities = arrayDistricts[j].showCities(c);
                for (int k = 0; k < arrayCities.length; k++) {
                    if (arrayCities[k].capital) {
                        System.out.println(arrayCities[k].cityName + " is a capital of " + this.stateName);
                    }
                }

            }
        }
    }
}
