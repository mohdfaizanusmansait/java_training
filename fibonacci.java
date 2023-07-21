public class fibonacci {
   public fibonacci() {
   }

   static void Fibonacci(int var0) {
      int var1 = 0;
      int var2 = 1;

      for(int var3 = 0; var3 < var0; ++var3) {
         System.out.println("" + var1 + " ");
         int var4 = var1 + var2;
         var1 = var2;
         var2 = var4;
      }

   }

   public static void main(String[] var0) {
      byte var1 = 10;
      Fibonacci(var1);
   }
}