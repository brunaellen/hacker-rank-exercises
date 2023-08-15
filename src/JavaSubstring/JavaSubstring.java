import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
* Link of the hackerhaqnk exercise: https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=false
*
* Get string input and apply substring() method.
* Use start ans end as a parameter in the substring method
* Get the result from the substrig method and print it.
* Add condition to check the start and end index
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();
        int startIndex = in.nextInt();
        int endIndex = in.nextInt();
        
        /*
        * indexOutOfBoundsException - if beginIndex or endIndex is negative, 
        if endIndex is greater than length(), 
        or if beginIndex is greater than endIndex
        *
        *
        * start index must be equals or greater than zero and 
        * start index must be less than end index of inputString;
        */
        if(inputString == null || inputString.isEmpty()){
            System.out.print("String cannot be null or empty"); 
        } else if(startIndex < 0 || endIndex < 0){
            System.out.print("index should not be negative");
        } else if(endIndex > inputString.length()){
            System.out.print("end index cannot be greater than the String length"); 
        } else if(startIndex > endIndex){
            System.out.print("Start index should be less than end index");
        } else {
            String outputSubstring = inputString.substring(startIndex, endIndex);
            System.out.print(outputSubstring);
        }
    }
}
