import java.util.Scanner;

public class PrimeNumber{
  public static void main(String[] args){
    Scanner keyboard = new Scanner (System.in);
    int primeNumber;

    System.out.println("Please enter a number to see if it's a prime number: ");
    primeNumber = keyboard.nextInt();
    System.out.println(isPrimeNumber(primeNumber));

  }

  public static boolean isPrimeNumber(int num){
    if(num == 1){
      return false;
    }
    for (int i = 2; i < num; i++){
      if (num % 2 == 0)
        return false;
    }
    return true;
  }
}
