class Main {
  public static void main(String[] args) {
    System.out.println(isLeapYear(2020));
    System.out.println(isLeapYear(1900));
    System.out.println(isLeapYear(2024));
  }
  public static boolean isLeapYear(int x){
    if (x % 4 == 0){
      if (x % 100 == 0){
        if (x % 400 == 0){
          return true;
        }
        else{
          return false;
        }
      }
      else{
        return true;
      }
    }
    else{
      return false;
    }
  }
}
