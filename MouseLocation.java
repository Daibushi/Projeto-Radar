import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
public class MouseLocation {
  public static void main(String[] args)
  {
    while (true)
    {
      PointerInfo info = MouseInfo.getPointerInfo();
      Point p = info.getLocation();
      System.out.format("LOC %d, %d\n", p.x, p.y);
     
      sleep();
    
      int x = p.x;
int y = p.y ;
          }
  }
   
  private static void sleep()
  {
    try
    {
      Thread.sleep(500);
    }
    catch (InterruptedException e)
    {
    }
  }
    
}

    

