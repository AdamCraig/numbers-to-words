import org.junit.*;
import static org.junit.Assert.*;

public class NumbersToWordsTest {

  @Test
  public void convertToWords_returnsConvertedStringForOnesPlaces_convertedString() {
    NumbersToWords testConvert = new NumbersToWords();
    String expected = "one";
    assertEquals(expected, testConvert.convertToWords(1));
  }

}
