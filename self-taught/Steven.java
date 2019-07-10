
public class Steven{
     
   public static void main(String[] args){
       int a[][] = {
                         {35,63,37,63},
                         {65,26,272},
                         {3,63},
                         {356,603,37,631}
        };
       //System.out.println(a[2][2]);
       int i = 0;
       while(a.length > i){
           int j = 0;
           while(a[i].length > j){
               System.out.println(a[i][j]-5);
               j++;
            }
        i++;
       }
   }


}