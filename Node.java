//Class Node  ----------------------------------

//after each charater the node chnages, pointing toiwards the next charater in the file 
public class Node<E>
{
   protected Node<E> next;
   //this will chnage from one charater to the next, and will be pushing into the stack one by one 
   private E data;
    
   // constructor
   public Node()
   {
      //starts out as a null pointer
      next = null;
   }
   public Node(E data)
   {
      setData(data);
   }
  
   public boolean setData(E data)
   {
      if (data == null)
         return false;
      this.data = data;
      return true;
   }
   
   public E getData()
   {
      return data;
   }
   
   // console display
   public String toString()
   {
      return data.toString();
   }
}
