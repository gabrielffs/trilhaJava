public class Ex4_4 {
  public static void main(String[] args) {

      int a = 40;
      int b = 90;

      System.out.println(a + ", " + b);

      a = a + b; // 150
      b = a - b; // 50 
      a = a - b;

      System.out.println(a + ", " + b);
     
  }
}
