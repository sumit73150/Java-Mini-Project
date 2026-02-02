// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class mini_project {
   public mini_project() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("\ud83d\udcda Smart Study Session Tracker \ud83d\udcda");
      System.out.print("Enter Student Name: ");
      String var2 = var1.nextLine();
      System.out.print("Enter number of study sessions today: ");
      int var3 = var1.nextInt();
      int var4 = 0;
      int var5 = 0;

      for(int var6 = 1; var6 <= var3; ++var6) {
         System.out.println("\nSession " + var6);
         System.out.print("Enter Subject Name: ");
         var1.nextLine();
         String var7 = var1.nextLine();
         System.out.print("Study time (in minutes): ");
         int var8 = var1.nextInt();
         System.out.print("Focus level (1 to 5): ");
         int var9 = var1.nextInt();
         var4 += var8;
         var5 += var9;
      }

      double var10 = (double)var5 / (double)var3;
      System.out.println("\n\ud83d\udcca Daily Study Report");
      System.out.println("Student: " + var2);
      System.out.println("Total Study Time: " + var4 + " minutes");
      System.out.println("Average Focus Level: " + var10);
      System.out.print("Feedback: ");
      if (var4 >= 300 && var10 >= 4.0) {
         System.out.println("\ud83d\udd25 Excellent! You're in deep focus mode.");
      } else if (var4 >= 180 && var10 >= 3.0) {
         System.out.println("\ud83d\udc4d Good job! Slight improvement needed.");
      } else if (var4 >= 60) {
         System.out.println("⚠️ You need more consistency.");
      } else {
         System.out.println("❌ Very low study time. Get serious!");
      }

      var1.close();
      System.out.println("\nKeep grinding \ud83d\udcaa");
   }
}
