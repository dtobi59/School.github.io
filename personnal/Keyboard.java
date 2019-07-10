import java.io.*;

public class Keyboard{
     public static void main(String[] args){
        DataInputStream keyboard = new DataInputStream(System.in);
        try{
             System.out.println("You pressed: " + keyboard.readLine());

         }catch(Exception e){
              System.out.println("Error occur");
         }
     }
}