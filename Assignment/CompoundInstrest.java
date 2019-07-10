import java.util.Scanner;

public class CompoundInstrest{
     public static void main(String[] args){
          
          Scanner input = new Scanner(System.in);
          System.out.println("Welcome to Herry banking system...");

        double AmountDeposit = 0;

         System.out.print("Enter Your Principal: ");
         double principal = input.nextDouble();

         System.out.print("Enter Rate: ");
         double rate =  input.nextDouble();

         System.out.print("How many Years: ");
         int year =  input.nextInt();

         System.out.println("Computing.....");

         System.out.println("year"+"\t******\t"+"Amount On Desposit\n");

         for(int n = 1; n<=year; n++){
                AmountDeposit = principal*Math.pow((1+rate),n);
                System.out.printf("%d"+"\t******\t"+"$"+AmountDeposit+"\n\n",n);
         }

         System.out.printf("Compound Instrest: "+"$"+(AmountDeposit-principal)+"\n");
        
        System.out.println("Thank YOU For Banking with us!!");
     }
}