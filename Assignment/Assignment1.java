import java.util.Scanner;

public class Assignment1{
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         int n = 1;
         int i = 1;
         int sum = 0;
         while(n > 0){
               if(n <= 0)
                   {break;}
               n = input.nextInt();
               sum += n;
               i++;
         }
         System.out.println(sum);
     }
}