import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OldFashionPoundApp {

  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("^\\s*(\\d+[p])(\\d+[s])\\s*(\\d+[p])\\s*([+\\-*/])\\s*(\\d+[p])(\\d+[s])\\s*(\\d+[p])\\*$", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("5p 17s 12p + 3p 4s 10p");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  }
}