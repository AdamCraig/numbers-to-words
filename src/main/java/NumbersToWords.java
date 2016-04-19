import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class NumbersToWords {
  public static void main(String[] args) {}

    public static String convertToWords (Integer input) {
      String convertedString = "";

      HashMap<Integer, String> onesPlace = new HashMap<Integer, String>();

      onesPlace.put(1, "one");
      onesPlace.put(2, "two");
      onesPlace.put(3, "three");
      onesPlace.put(4, "four");
      onesPlace.put(5, "five");
      onesPlace.put(6, "six");
      onesPlace.put(7, "seven");
      onesPlace.put(8, "eight");
      onesPlace.put(9, "nine");

      convertedString = onesPlace.get(input);

      return convertedString;
    }
}
