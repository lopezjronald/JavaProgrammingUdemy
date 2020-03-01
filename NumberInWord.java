import java.util.Scanner;

public class NumberInWord{
  public static void main(String[] args){
    Scanner keyboard = new Scanner (System.in);
    int number;
    System.out.println("Please enter a whole number: ");
    number = keyboard.nextInt();
    System.out.println(printNumberInWord(number));
  }

  public static String printNumberInWord(int num){
    String number;
    switch(num){
      case 0:
        number = "ZERO";
        break;
      case 1:
        number = "ONE";
        break;
      case 2:
        number = "TWO";
        break;
      case 3:
        number = "THREE";
        break;
      case 4:
        number = "FOUR";
        break;
      case 5:
        number = "FIVE";
        break;
      case 6:
        number = "SIX";
        break;
      case 7:
        number = "SEVEN";
        break;
      case 8:
        number = "EIGHT";
        break;
      case 9:
        number = "NINE";
        break;
      default:
        number = "OTHER";
    }
    return number;
  }
}
