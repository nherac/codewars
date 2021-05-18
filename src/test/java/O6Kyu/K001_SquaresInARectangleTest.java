package O6Kyu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static O6Kyu.K001_SquaresInARectangle.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static org.junit.jupiter.api.Assertions.*;

/*
https://www.codewars.com/kata/5a62da60d39ec5d947000093/train/java
Realized that
2*1 = 2
3*2 = 6
Then, findSquares(3,2) is 8

findSquares(11,4)
11*4 = 44
10*3 = 30 =>74
9*2 = 18 => 74+18 = 92
8*1 = 8 =>92 +8  =>100



* */

class K001_SquaresInARectangleTest {


    @ParameterizedTest
    @CsvFileSource(resources = "/01_Test_Arguments_xSide_ySide_illegal")
    @DisplayName("Introducing invalid parameters cause IllegalArgumentException")
    void testIncorrectValues(int xSide, int ySide, String message){
        Throwable throwable = assertThrows(IllegalArgumentException.class,
                                           ()->findSquares(xSide,ySide));
        assertThat(throwable.getMessage(),containsStringIgnoringCase(message));

    }


    @DisplayName("Squares in a Rectangle")
    @ParameterizedTest
    @CsvFileSource(resources = "/02_Test_xSide_ySide_Result_CorrectArguments")
    void testValuesChecked(int xSide, int ySide, int result){
        assertEquals(result, findSquares(xSide,ySide));
    }

    @DisplayName("Squares in a Rectangle first solution using Streams and Reduce")
    @ParameterizedTest
    @CsvFileSource(resources = "/02_Test_xSide_ySide_Result_CorrectArguments")
    void test01(int xSide, int ySide, int result){
        assertEquals(result, findSquaresLegalArgSides(xSide,ySide));
    }

    @DisplayName("Second Solution using map and sum")
    @ParameterizedTest
    @CsvFileSource(resources = "/02_Test_xSide_ySide_Result_CorrectArguments")
    void test02(int xSide, int ySide, int result){
        assertEquals(result, findSquaresLegalArgSides2(xSide,ySide));
    }

    @DisplayName("third solution using recursion")
    @ParameterizedTest
    @CsvFileSource(resources = "/02_Test_xSide_ySide_Result_CorrectArguments")
    void test03(int xSide, int ySide, int result){
        assertEquals(result, findSquaresLegalArgSides3(xSide,ySide));
    }

    @DisplayName("Given-When-Then")
    @ParameterizedTest
    @CsvFileSource(resources = "/To-Do")
    void testName(String... args) {
        //Arrange
        //Act
        //Test

    }



}

