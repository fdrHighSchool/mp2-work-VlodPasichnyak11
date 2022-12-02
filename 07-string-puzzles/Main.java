class Main{
  public static void main (String [] args){
    System.out.println(firstHalf("WooHoo"));
    System.out.println(firstHalf("HelloThere"));
    System.out.println(firstHalf("abcdef"));
    System.out.println(repeatEnd("Hello", 3));
    System.out.println(repeatEnd("Hello", 2));
    System.out.println(repeatEnd("Hello", 1));
    System.out.println(makeSarcastic("hello world"));
  }
  public static String firstHalf(String x){
    return x.substring(0, x.length() / 2);
  }
  public static String repeatEnd(String x, int n){
    String z = x.substring(x.length() - n);
    String e = "";
    for (int i = 0; i < n; i++){
      e += z;
    }
    return e;
  }
  public static String makeSarcastic(String a){
    String newString = "";
    for (int i = 0; i < a.length(); i++){
        String character = a.substring(i, i + 1);
        if (i%2 == 0){
          newString += character.toLowerCase();
        }
        else {
          newString += character.toUpperCase();
        }
    }
    return newString;
  }
}
