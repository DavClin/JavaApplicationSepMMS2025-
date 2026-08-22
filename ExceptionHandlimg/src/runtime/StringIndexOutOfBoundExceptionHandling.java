
package runtime;

public class StringIndexOutOfBoundExceptionHandling {
    public static void main(String[] args){
        
        
        String myName = "David Clin";
        try{
            
            System.out.println(myName.charAt(10));
        }
        catch(StringIndexOutOfBoundsException e) {
            
            System.out.println("Invalid string index");
        
        
        }
     
    
    
    }
    
}
