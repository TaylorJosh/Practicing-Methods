public class MethodReturnTypes {
   
   //String method
   public static String myStringMethod() {
    return "This is my method!";
  }


   //int method
   public static int myIntMethod(int x) {
    return 5 * x;
  }


   //boolean method
   public static boolean myBooleanMethod(int y) {
    return 5 < y;
  }
   
    public static void main(String[] args) throws Exception {
        System.out.println(myStringMethod());
        System.out.println(myIntMethod(3));
        System.out.println(myBooleanMethod(100));

    }
}
