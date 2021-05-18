package O6Kyu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

//https://www.codewars.com/collections/javascript-6kyu

/*
* What is your favourite day of the week? Check if it's the most frequent day of the week in the year.

You are given a year as integer (e. g. 2001). You should return the most frequent day(s) of the week in that year. The result has to be a list of days sorted by the order of days in week (e. g. ['Monday', 'Tuesday'], ['Saturday', 'Sunday'], ['Monday', 'Sunday']). Week starts with Monday.

Input: Year as an int.

Output: The list of most frequent days sorted by the order of days in week (from Monday to Sunday).

Preconditions:

Week starts on Monday.
Year is between 1583 and 4000.
Calendar is Gregorian.
*
* Kata.mostFrequentDays(2427) => {"Friday"}
Kata.mostFrequentDays(2185) => {"Saturday"}
Kata.mostFrequentDays(2860) => {"Thursday", "Friday"}
*
* 2427,Friday
2185,Saturday
2860,Thursday,Friday
1770,Monday
1785,Saturday
1901,Tuesday
* */

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static O6Kyu.K003_MostFrequentWeekDays.*;

class K003_MostFrequentWeekDaysTest {

    @DisplayName("Title")
    @ParameterizedTest
    @MethodSource("generateDataTest02")
    void test02(String[] frequentDays, int year){
        assertArrayEquals(frequentDays,mostFrequentDays(year));

    }

    static Stream<Arguments> generateDataTest02(){
        return Stream.of(
                Arguments.of(new String[] {"Monday"}, 1770),
                Arguments.of(new String[] {"Saturday"}, 1785),
                Arguments.of(new String[] {"Tuesday"}, 1901),
                Arguments.of(new String[] {"Saturday"}, 2135),
                Arguments.of(new String[] {"Sunday"}, 3043),
                Arguments.of(new String[] {"Monday"}, 2001),
                Arguments.of(new String[] {"Sunday"}, 3150),
                Arguments.of(new String[] {"Tuesday"}, 3230),
                Arguments.of(new String[] {"Friday", "Saturday"}, 2016),
                Arguments.of(new String[] {"Wednesday"}, 1986),
                Arguments.of(new String[] {"Thursday"}, 3361),
                Arguments.of(new String[] {"Saturday"}, 1910),
                Arguments.of(new String[] {"Monday", "Tuesday"}, 1968),
                Arguments.of(new String[] {"Wednesday"}, 1794),
                Arguments.of(new String[] {"Monday", "Sunday"}, 1984),
                Arguments.of(new String[] {"Saturday", "Sunday"}, 2000)

        );
    }




}