import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class NumbersToWords {
  public static void main(String[] args) {}

    public static String convertToWords (String input) {
      String convertedString = "";
      ArrayList<String> convertedStringArray = new ArrayList<String>();

      HashMap<String, String> ones = new HashMap<String, String>();
      ones.put("1", "one");
      ones.put("2", "two");
      ones.put("3", "three");
      ones.put("4", "four");
      ones.put("5", "five");
      ones.put("6", "six");
      ones.put("7", "seven");
      ones.put("8", "eight");
      ones.put("9", "nine");

      HashMap<String, String> tens = new HashMap<String, String>();
      tens.put("0", "and");
      tens.put("10", "ten");
      tens.put("11", "eleven");
      tens.put("12", "twelve");
      tens.put("13", "thirteen");
      tens.put("14", "fourteen");
      tens.put("15", "fifteen");
      tens.put("16", "sixteen");
      tens.put("17", "seventeen");
      tens.put("18", "eighteen");
      tens.put("19", "nineteen");

      String finalOnes = "";
      String finalTens = "";

      convertedStringArray.add(0, "");
      convertedStringArray.add(1, "");

      for ( String key : tens.keySet() ) {
        if ( key == input ) {
          convertedString = tens.get(key);
          convertedStringArray.add(0, convertedString);
          finalTens = convertedStringArray.get(0);
        }
      }

      for ( String key : ones.keySet() ) {
        if ( key == input ) {
          convertedString = ones.get(key);
          convertedStringArray.add(1, convertedString);
          finalOnes = convertedStringArray.get(1);
        }
      }

      String finalString = finalTens + finalOnes;

      return finalString;
    }
}
