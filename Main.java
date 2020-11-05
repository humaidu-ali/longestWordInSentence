import java.util.*; 
import java.io.*;


class Main {


    public static String LongestWord(String sen) {
    // code goes here  
    //String longest = Arrays.stream(sen.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
    //System.out.println(longest);
    //return longest;

    
    //String regex = "/[^a-zA-Z0-9 ]/g";
    //sen = sen.replace(sen,regex);
    //"[^a-z^0-9]"
    return Arrays.stream(sen.split("[^a-z^0-9]")).max(Comparator.comparingInt(String::length)).orElse(null).toString();

  } 
  
  

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    String input = s.nextLine();
    System.out.print(LongestWord(input)); 
  }

}

