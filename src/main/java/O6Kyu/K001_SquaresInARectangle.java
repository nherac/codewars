package O6Kyu;

import java.util.function.IntBinaryOperator;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class K001_SquaresInARectangle {
     public static long findSquares(int x, int y){
         if(x<= 0 || y<=0)
             throw new IllegalArgumentException("The sides should be positive numbers and more than 0");
         if (x<y)
             throw new  IllegalArgumentException("The side first always being equal to or greater than the second.");
         return findSquaresLegalArgSides2(x,y);

    }

    private static long findSquaresLegalArgSides(int longestSide, int smallestSide){

         IntBinaryOperator operation = (subtotal, element)-> {
             //System.out.println("en el acumulator" + subtotal);
            // System.out.println("en el stream " + element);
             var bigSide = (longestSide -smallestSide) + element;
             subtotal = subtotal + (element * bigSide);
             return subtotal;
         };

         var result =  IntStream.rangeClosed(1,smallestSide)
                                    .reduce(0,operation);

        return result;

    }

    private static long findSquaresLegalArgSides2(int longestSide, int smallestSide){

        IntUnaryOperator operation = element-> {
                                                var bigSide = (longestSide -smallestSide) + element;
                                                return (element * bigSide);
                                                };

        var result =  IntStream.rangeClosed(1,smallestSide)
                                   .map(operation)
                                   .sum();
        return result;

    }
}
