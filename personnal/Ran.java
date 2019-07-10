public class Ran{
     public static void main(String[] args){
        int a = 0 , b = 0, c = 0, d = 0, e = 0, f = 0;
         for(int i = 1; i<=10000000; i++){
            int rand = (int)  (Math.random() * 6  + 1);
            //System.out.println("Number");
            //System.out.println(rand); 
            switch(rand){
                case 1: 
                  ++a;
                  break;
                case 2: 
                  ++b;
                  break;
                case 3: 
                   ++c;
                   break;
               case 4: 
                  ++d;
                  break;
               case 5: 
                  ++e;
                  break;
               case 6: 
                  ++f;
                  break;
            }   
          }
         System.out.println("Number \t Count");
         // System.out.printf("%i",3);
          System.out.printf(" 1 \t %d \n 2 \t %d \n 3 \t %d \n 4 \t %d \n 5 \t %d \n 6 \t %d \n",a,b,c,d,e,f);
          System.out.println("\n\n");
         System.out.println(a+b+c+d+e+f);
     }
}