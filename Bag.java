@SuppressWarnings("unchecked")
public class Bag<T>
{
   private T[] bag = (T[])(new Object[100]);
   private int numElements = 0;
   
   public void add(T x)
   { // put x in bag
      bag[numElements] = x;
      numElements++;
   }
   
   public int count(T x)
   {
      int count = 0;
      for (int i=0; i<numElements; i++)
         if (bag[i].equals(x)) // .equals because T a class 
            count++;
      return count;
   }
   public void remove(T y)
   {
      T [] nbag = (T[])(new Object [1000]);
      int numElementsn = 0;
      for(int i =0; i < this.numElements; i++)
      {
         if(y.equals(bag[i]))
         {
            y = (T)"";
         }
         else
         {
            nbag[numElementsn] = bag[i];
            numElementsn ++;
         }
      }
      this.bag = nbag;
      this.numElements = numElementsn;
   }

   public int length()
   {
      return numElements;
   }
}