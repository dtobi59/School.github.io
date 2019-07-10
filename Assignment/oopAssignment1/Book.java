public class Book{
    private String name;
    private String authorName;
    private double price;
    private int quantity;

    public  Book(String name, String authorName, double price){
         this.name = name;
         this.authorName =authorName;
         this.price = price;
     }
   /*========================
                                 Accessors
  =========================*/
   public String getName(){
         return this.name;
   }
   public String getAuthorName(){
         return this.authorName;
   }
   public double getPrice(){
         return this.price;
   }
   public int getQuantity(){
         return this.quantity;
   }
/*========================
                                 Mutators
  =========================*/
   public void setPrice(double price){
         this.price = price;
   }
   public void setQuantity(int quantity){
         this.quantity = quantity;
   }
/*========================
                                   class method
  =========================*/
  public double amount(){
        return this.price*this.quantity;
  }
  public String displayDetails(){
        String output = "Book Title:"+this.name+"\n";
        output += "Book Author:"+this.authorName+"\n";
        output += "Price:"+"$"+this.price+"\n";
        output += "Quantity:"+this.quantity+"\n";
        return output;
  }
    
}