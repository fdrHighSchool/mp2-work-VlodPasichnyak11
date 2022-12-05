class Main {
  public static void main(String[] args) {
    System.out.println(letterGrade(100));
    System.out.println(letterGrade(75));
    System.out.println(letterGrade(54));
  }
  public static String letterGrade(int g){
    String grade = "";

    if (g >= 90){
      grade = "A";
    }
    if (g >= 80 && g < 90){
      grade = "B";
    }
    if (g >= 70 && g < 80){
      grade = "C";
    }
    if (g >= 60 && g < 70){
      grade = "D";
    }
    if (g < 65){
      grade = "F";
    }
    return grade;
  }
}
