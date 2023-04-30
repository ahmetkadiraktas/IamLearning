public class TestP {
    public static void main(String[] args){
        Pet p=new Pet(3,true);
        System.out.println("Pet is male? : " + p.getIsMale());
        
        Dog d=new Dog(3,true,"white","");
        
        d.beAdopted("Peter", "Lessie");
        
        System.out.println("Name of the dog:  " + d.getName());
        
        System.out.println("Human age of the dog:  " + d.getHumanAge());
        
        d.speak();
           
    } 
 
}
