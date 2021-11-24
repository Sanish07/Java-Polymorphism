//To demonstate Polymorphism
package classes_4;

public class Button extends Elements{
    
    @Override
    public void render(){
        System.out.println("Render a Button.");
    }
    
    /*@Override
    public void message(){
    } */              //This will give compilation error since message() is final method in base class.
    
}
