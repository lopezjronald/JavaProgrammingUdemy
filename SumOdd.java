public class SumOdd{
  public static void main(String[] args){
    System.out.println(isOdd(-1));
    System.out.println(sumOdd(1, 100));
    System.out.println(sumOdd(100, 100));
    System.out.println(sumOdd(13, 13));

  }

  public static boolean isOdd(int num){
    if (num < 0){
      return false;
    }
    if (num % 2 != 0){
      return true;
    }
    return false;
  }

  public static int sumOdd(int start, int end){
    if (end < start || end < 0 || start < 0){
      return -1;
    }
    int total = 0;
    for (int i = start; i <= end; i++){
      if (isOdd(i) == true){
        total += i;
      }
    }
    return total;

  }
}
