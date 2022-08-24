//Class Stack ---------------------------------------

//This is a simple stack file for using the charaters in the file and pushing them through a push and pop type function. This is like a bluepriont class for the stack so it can later be used for different files for the code. 
public class Stack<E>
{
   // pointer to first node in stack
   private Node<E> top;
   
   // constructor
   public Stack()
   {
      top = null;
   }
   
   public boolean isEmpty()
   {
      return top == null;
   }
   
   public void push(E data)
   {   
      if (data == null) 
         return;
      // build a node and place it on the stack
      Node<E> newNode = new Node<E>(data);
      newNode.next = top;
      top = newNode;
   }  
   
   public E pop()
   {
      Node<E> temp;
      
      temp = top;
      if (isEmpty())
         return null;

      top = top.next; 
      return temp.getData();     
   }

   // console display
   public String toString()
   {
      Node p;
      
      String showAll = "";
      // Display all the nodes in the stack
      for( p = top; p != null; p = p.next )
         showAll += p.toString() + "\n";
      return showAll;  
   }
}
