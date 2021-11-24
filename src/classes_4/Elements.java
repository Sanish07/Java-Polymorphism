
package classes_4;

public abstract class Elements {  //We don't actually need to create instance of Elements so we declare it abstract.
    
    public abstract void render(); //Making this method abstract will lead to its mandatory implementation in sub classes, unless the class is not abstract itself
    
    public final void message(){
        System.out.println("This method cannot be overrided.");
    }
            
}
