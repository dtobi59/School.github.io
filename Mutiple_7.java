/*=========================================
These program prints the multiple of
7 from 1-150 and 5 number per line
===========================================*/
public class Mutiple_7{
     public static void main(String[] args){
         
    int sum = 0;
    int i;
    int k = 0;
    for(i=1;i<=150;i++){
         if(i%7==0){
            k = k+1;
            sum +=i;
           System.out.print(i+",");
           if(k%5==0){  
               System.out.print("\n");
           }//if
 
          }//if
    } //for
 System.out.print("\n");
 System.out.println("sum"+sum);
         
     } //main
} //class 
