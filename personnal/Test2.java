import java.util.Scanner;

public class Test2{
     //Create a function called matrixAverage
     public static void matrixAverage(int element[][]){
          int sum = 0;
          for(int i=0; i<element[0].length; i++){
              for(int j=0; j<element[0].length; j++){
                   if(i==j){
                       sum += element[i][j];
                   } //if
              } //for
          } //for
          System.out.println(sum);
          System.out.println(sum/element[0].length);
     } // matrixAverage

     //create the main method
     public static void main(String[] args){
          Scanner input = new Scanner(System.in);
        /*=============================================
                              Question 2 implementation(Matrix)
        ===============================================*/
/*
          int elements[][] = new int[3][3];
           for(int i=0; i<elements[0].length; i++){
              for(int j=0; j<elements[0].length; j++){
                   System.out.println("enter for matrix:"+i+"_"+j);
                  elements[i][j] =  input.nextInt();
              } //for
          } //for
          
         System.out.print("\n\n");
         for(int i=0; i<elements[0].length; i++){
              for(int j=0; j<elements[0].length; j++){
                   System.out.print(elements[i][j]+"\t");
              } //for
               System.out.print("\n");
          } //for
        System.out.print("\n\n");
        matrixAverage(elements);
*/
    /*=============================================
                              Question 3 implementation(Matrix)
        ===============================================*/
 
      int dice1 = (int) (Math.random() * 6 ) + 1; 
      int dice2 = (int)  (Math.random() * 6 ) + 1; 
      //TODO implement using conditional statement
   
     }
}