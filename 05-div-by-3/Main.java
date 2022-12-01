class Main{
  public static void main(String [] args){
    divBy3(46);
  }
  public static void divBy3(int x){
    String str = "";
    str += x;
    int len = str.length();
    int sum = 0;
    int i = 0;
    
    while (i < len) {
      sum += str.charAt(i);
      i++;
    }

    if (sum % 3 == 0){
      System.out.println("It is divisible by 3. ");
    }
    else{
      System.out.println("It is not divisible by 3.");
    }
  }
}
