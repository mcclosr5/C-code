
public class Point
{
   private double x, y;

   public Point(double newX, double newY)
   {
      x = newX;
      y = newY;
   }


   public boolean lessThan(Order other)
   {
      Point otherPoint = (Point) other;
      if((x + y) < (otherPoint.x + otherPoint.y))
      {
         return true;
      }
      return false;
   }

   public String toString()
   {
      return "(" + x + ", " + y + ")";
   }
}