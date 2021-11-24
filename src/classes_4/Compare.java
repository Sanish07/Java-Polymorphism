//To demonstate object comparison and override the base class methods.
package classes_4;
import java.util.Objects;

public class Compare extends Object {
    
    private int x,y;
    
    public Compare(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public boolean equals(Object obj){
        
        if(!(obj instanceof Compare)){  //Immediately return false if current object is not instance of Compare class. 
          return false;
        }
        
        var passedObj = (Compare) obj;  //Downcast the passed object to compare it with this class fields.
        return (passedObj.x == x) && (passedObj.y == y);
        
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(x,y);
    }
    
}
