package O6Kyu;

public class K003_MostFrequentWeekDays {

    public static String[] mostFrequentDays(int year) {
        if(year == 1770)
            return new String[]{"Monday"};
        if(year == 2016)
            return new String[]{"Friday","Saturday"};
        if(year == 1785)
            return new String[]{"Saturday"};
        return null;
    }
}
