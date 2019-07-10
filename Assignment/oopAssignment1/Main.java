public class Main{
    public static void main(String[] args){
         Book book1,book2,book3,book4;
         System.out.println("\n============================");
         System.out.println("Name: DE.2016/5397");
         System.out.println("Production Date: 07/06/2018");
         System.out.println("Assignment no: 3");
         System.out.println("============================\n\n");

         book1 = new Book("Real Analysis","Mr. weli",3400);
         System.out.println("============================");
         System.out.println("Book 1");
         System.out.println("============================");
         book1.setQuantity(5); 
         System.out.println(book1.displayDetails());
         System.out.println("Total Amount:"+book1.amount());

         book2 = new Book("Introduction to programming","Dr. Taylor",1300);
         System.out.println("============================");
         System.out.println("Book 2");
         System.out.println("============================");
         book2.setQuantity(3); 
         System.out.println(book2.displayDetails());
         System.out.println("Total Amount:"+book2.amount());

         book3 = new Book("Abstract Algebra","Prof. Ehuk",3300);
         System.out.println("============================");
         System.out.println("Book 3");
         System.out.println("============================");
         book3.setQuantity(3); 
         System.out.println(book3.displayDetails());
         System.out.println("Total Amount:"+book3.amount());

         book4 = new Book("The Emotional Programmer","Ola dave",300);
         System.out.println("============================");
         System.out.println("Book 4");
         System.out.println("============================");
         book4.setQuantity(6); 
         System.out.println(book4.displayDetails());
         System.out.println("Total Amount:"+book4.amount());
    }

}