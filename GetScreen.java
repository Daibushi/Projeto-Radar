import java.awt.GraphicsEnvironment; 
class GetScreen {
  public static void main(String [] args){
 
 
System.out.println(GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getWidth());  
System.out.println(GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getHeight());  
 
 
  }  
}
