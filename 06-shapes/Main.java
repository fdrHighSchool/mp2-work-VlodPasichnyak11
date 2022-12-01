class Main {
  public static void main(String[] args) {
    System.out.println("Shapes!");
    System.out.println();

    // TEST CASES:
    square(1);
    System.out.println();
    square(4);
    System.out.println();
    
    rectangle(2, 4);
    System.out.println();
    rectangle(4, 2);
    System.out.println();
    
    rightTriangle(3);
    System.out.println();
    rightTriangle(6);
    System.out.println();

    triangle(3);
    System.out.println();
    triangle(6);
    System.out.println();
  } // end main method

  public static void square(int s) {
    for (int row = 0; row < s; row++) {
      for (int col = 0; col < s; col++) {
        System.out.print("* ");
      } // end col for loop
      System.out.println();
    } // end row for loop
  } // end square method

  public static void rectangle(int l, int w) {
    for (int row = 0; row < l; row ++){
       for (int col = 0; col < w; col++) {
        System.out.print("* ");
      }
      System.out.println();
    } 
    
    /*
    example: rectangle(2, 4) 
              * * * * 
              * * * * 
    */
    
  } // end rectangle method

  public static void rightTriangle(int s) {
    for (int row = 1; row <= s; row ++){
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    
    /*
    example: rightTriangle(3) 
              *  
              * *
              * * *
    */    
  } // end rightTriangle method

  public static void triangle(int s){
    for(int row = 0; row < s; row++){
      for(int col = 0; col < s - row; col++){
        System.out.print(" ");
      }
      for(int col = 0; col <= row; col++){
        System.out.print(" ");
        System.out.print("*");
      }
      System.out.println();
    }
  }
    /*
    example: triangle(3) 
              *
             * * 
            * * * 
    */
  
   // end triangle method
} // end class
