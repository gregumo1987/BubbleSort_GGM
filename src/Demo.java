public class Demo {
   public static void main(String []args) {
      String str[] = { "b", "e", "l", "l", "a","r","m","i","n","e"};
      String temp;
      System.out.println("Sorted string...");
      for (int a = 0; a < str.length; a++) {
         for (int i = a + 1; i < str.length; i++) {
            // comparing strings
            if (str[i].compareTo(str[a]) < 0) {
               temp = str[a];
               str[a] = str[i];
               str[i] = temp;
            }
         }
         System.out.println(str[a]);
      }
   }
}