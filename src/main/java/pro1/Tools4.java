package pro1;

import java.util.Arrays;

public class Tools4
{
    public static double maximumValue(Number[] numbers)
    {
        double max = 0;
        for(var n :  numbers){
            max = Math.max(n.doubleValue(), max);
            //NEBO
            //if( n.doubleValue() > max ){
            //    max = n.doubleValue();
            //}
            }
        //NEBO
        //return Arrays.stream(numbers).mapToDouble(Number::doubleValue).max().getAsDouble();

        return max;
    }
}
