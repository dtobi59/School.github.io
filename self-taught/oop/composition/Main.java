public class Main{
    public static void main(String[] args){
         Book book1,book2,book3,book4;
        
      
         book1 = new Book("Real Analysis",new Author("David","dtobi59@gmail.com",'m'),3400);
         System.out.println("============================");
         System.out.println("Book 1");
         System.out.println("============================");
         book1.setQuantity(5); 
         System.out.println(book1.displayDetails());
       //  System.out.println("Author Name: "+ );
         System.out.println("Total Amount:"+book1.amount());
         System.out.println(book1.getAuthorName().getName());

         
    }

}