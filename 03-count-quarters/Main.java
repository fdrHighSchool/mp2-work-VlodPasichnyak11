class Main {
  public static void main(String[] args) {
    System.out.println(countQuarters(64));
    System.out.println(countQuarters(1278));
    System.out.println(countQuarters(9));
  }
  public static int countQuarters(int cents){
    String str = "";
    str += cents;

    if (str.length() == 1) {
      return 0;
    }
    
    String value = str.substring(str.length() - 2);
    return Integer.parseInt(value)/25;
  }
}
