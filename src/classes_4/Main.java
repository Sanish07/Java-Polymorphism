
package classes_4;

public class Main {

    public static void main(String[] args) {
        
        //1st program below - Comparing objects
        System.out.println("First Program :-");
        var obj1 = new Compare(1,2);
        var obj2 = new Compare(1,2); 
        System.out.println(obj1.equals(obj2)); //Will return false if equals() method in Compare class is not redefined.
        System.out.println(obj1.equals(new Object()));  // Will return false since Object class object is not instance of Compare class.
        
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());  // Both the print statements will return different int values of hashCodes if hashCode() method in Compare class is not redefined.
        
        System.out.println("");
        
        //2nd program below - Polymorphism
        System.out.println("Second Program :-");
        
        Elements arrObjects[] = { new Button() , new ImageView() }; //We wont be able to instantiate the Elements class because its abstract
        
        for(var object : arrObjects){
            object.render(); //Different object will call different child class overrided methods of Elements parent class. 
        }
        
    }
    
}
