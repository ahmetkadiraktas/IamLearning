public class TestProduct {
    public static void main(String args[]) {
        Product p1 = new Product("Iphone 13", 10, 500);
        Product p2 = new Product();
               
        
        System.out.println("Product1 id : " + p1.getProductId()); 
        System.out.println("Product2 id : " + p2.getProductId()); 
        
        
        System.out.println("Name: " + p1.getName()); 
        System.out.println("Quantity: " + p1.getQuantity()); 
        System.out.println("Price:" + p1.getPrice()); 
        
        System.out.println("Item Value:" + p1.getItemValue() ); 
              
        
        p2.setName("Samsung a51");
        p2.setQuantity(15);
        p2.setPrice(450);
       
        System.out.println("Second product information: " + p2.toString());   
    }

}
