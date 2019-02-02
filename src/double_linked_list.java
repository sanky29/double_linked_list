//import the exception library for error handeling
import java.lang.IndexOutOfBoundsException;


//define list class to play operations on nodes
public class double_linked_list <Type> {
	
	  //the list is just location of head node and we can then achieve whole list
	  //so just define variable node
      private node<Type> head = new node<>();
      
      //one must have variable to store the length of list
      private int len = 0;
      
      //just define the tail node
      private node<Type> tail = new node<>();
      
      //define function for showing value at head
      public Type show_head() {
	      return(head.show_element());

      }
      
      //define function for showing value at tail
      public Type show_tail() {
    	  
    	  //just return element in tail
	      return(len != 1 ? tail.show_element(): null);
      }
      
      //define function to add node
      //we can add node at i_th position
      public void add_node(int pos, Type new_element) {
    	  
    	  //if pos_ is greater than len_ then show exception
    	  if (pos > len) {
    		  
    		  //then throw the exception
    		  throw new IndexOutOfBoundsException("your index has reached bounds");
    	  }
    	  
    	  //now we need to go at i_th position and change the node their
    	  //give i_th node to next element of new node and for i - 1 node give next as new node
    	  else {
    		  
    		  //just create new_node with new_element as initiator
			  //make new node
			  node<Type> new_node = new node<>(new_element);
    		  
    		  //if i = 1 will have to change head
    		  if(pos == 0) {
    			  
    			  //if len is zero need to do something
    			  if (len ==0) {
    				  
    				//just update the tail
    				  tail.change_element(new_element);
    				  
    				  
    				  //just keep tail to head
    				  head = new_node;
    				  
    				  //and keep tail as next of head
    				  head.change_next(tail);
    				  
    				  //change prev of tail to head
    				  tail.change_prev(head);
    						  
    			  }
    			  //if n = 1 the case is different
    			  else if (len ==1) {

      				  //and keep tail as next of head
      				  new_node.change_next(tail);
      				  
      				  //change prev of tail to head
      				  tail.change_prev(new_node);
      				  
      				  //change head to new_node
                      head = new_node;
      			  }
    			  
    			  //else
    			  else {
    			  
    			 //just need to change next node to head
    			 new_node.change_next(head);
    			 
    			 //need to change prev of head to new_node
    			 head.change_prev(new_node);
    			 
    			 //now change head to new_node
    			 head = new_node;

    			 }}
    		  
    		  //now if we have pos==len then
    		  else if(pos == len) { 
    			  
    			  //just change the tail
    			  tail.change_next(new_node);
    			  
    			  //change prev of new_node as
    			  new_node.change_prev(tail);
    			  
    			  //now change tail
    			  tail = new_node;
    			  
    		  }
    		  
    		//need to go at i_th position
    		else {
    			
    			//define curent_node as head
    			node<Type> current_node = head;
    			
    			
    			//now run for loop from i = 0 to i = i_th pos_
    			for (int i = 1 ; i <= pos; i++) {
    				
    				//now just change value of current node to its next element
    				current_node = current_node.show_next();
    			}
    			//for next of new_node add current node
    			new_node.change_next(current_node);
    			
    			//also change prev of current_node
    			current_node.change_prev(new_node);
    			
    			//now set the next of pre_node to be new node
    			current_node.show_prev().change_next(new_node);
    			
    			//change prev of new_node
    			new_node.change_prev(current_node.show_prev());
    		  }
    		//change the len_ by one
  			len++;
    	  }
      }
      //make function to get i_th value of list
      public Type show_ith_element(int pos) {
    	  
    	  //if pos_ > len_ then just throw error
    	  if (pos > len - 1) {
    		  
    		  //throw error
    		  throw new IndexOutOfBoundsException("your index has reached bounds"); 
    	  }
    	  //else run for loop for current node and return its value
    	  else {
    		  
    		  //if pos_ = 0 then call show head
    		  if (pos == 0 ) {
    			  
    			  //just call show_head
    			  return(head.show_element());
    		  }
    		  
    		  /*//also we can show last element easily
    		  else if(pos == len -1) {
    			  
    			  //just print tail element
    			  return(tail.show_element());*/
    		  //}
    		  //go for for loop and do things
    		  else {
    			  
    			  //define the current node
    			  node<Type> current_node = head;
    			  
    			  //run the for loop
    			  for (int i = 1; i <= pos ; i++) {
    				  
    				  //just change current node to current_node.next
    				  current_node= current_node.show_next();
    			  }
    			  //now return value in code
    			  return(current_node.show_element());
    		  }
    	  }
      }
      
      //define function to delete the ith element in the list
      public void delete_ith_element (int pos) {
    	  
    	  //check if the pos is less than maximum possible value
    	  if (pos > len) {
    		  
    		  //throw exception for index of bounds
    		  throw new IndexOutOfBoundsException("your index has reached bounds");
    	  }
    	  
    	  //now must run loop
    	  else {
    		  
    	  //if pos is 0 then just change head
    	  if (pos == 0) {
    		  
    		  //just change pointer of head next element
    		  head = head.show_next();
    		  
    		  
    		  //change prev to null
    		  head.change_prev(null);
    		  }
    	  
    	  //if pos = len - 1 then just change tail
    	  //if we want to delete last 
    	  else if (pos == len -1) {
			  
			  //just change the last node 
			  tail = tail.show_prev();
			  
			  //change next of tail to null
			  tail.change_next(null);
		  }
          
    	  //else run for loop to reach node
    	  else {
    		  
    		  //define the current node as head
    		  node<Type> current_node = new node<>();
    		  
    		  //place current node to head
    		  current_node = head;
    		  
    		  //now run the for loop
    		  for(int i = 1 ; i <= pos; i++ ) {
    			  
    			  //just update current node
    			  current_node = current_node.show_next();
    		  }
    		  //now just delete the node
              //now just set current_node's next element to next next element of current
    		  System.out.println("we are here");
    		
    		  current_node.show_next().change_prev(current_node.show_prev());
    		  
    		  //now also change next node of before node
    		  current_node.show_prev().change_next(current_node.show_next());
    		  
    	  	}
    	  //decrese length by one
		  len--;
    	  }
      }
      
      //define function to print the list
      public void print_list() {
    	  
    	//define current node as
    	  node<Type> current_node = new node<>();
    	  
    	  //now keep for loop and print the answer
    	  current_node = head;
    	  
    	  //print first element
    	  System.out.println(current_node.show_element());
    	  
    	  //now run for loop
    	  for (int i = 1 ; i <= len - 1 ; i ++) {
    		  
    		  //change current node
    		  current_node = current_node.show_next();
    		  
    		  //just print the answer
    		  System.out.println(current_node.show_element());
    	  }
      }
      
      //define function to check length of node
      public int length() {
    	  
    	  //return the length
    	  return(len);
      }
      
      
      public static void main(String args[]) {
    	double_linked_list<Integer> list = new double_linked_list<>();
    	Integer c = new Integer(4);
    	Integer a = new Integer(3);
    	Integer b = new Integer(2);
    	list.add_node(0,c);
    	 System.out.println("now the last element " + list.show_tail());
    	list.add_node(0,a);
    	 System.out.println("now the last element " + list.show_tail());
    	 System.out.println("now the second last element " + list.tail.show_prev().show_element());
    	list.add_node(0, b);
    	Integer d = new Integer(7);
    	list.add_node(3,d);
    	 System.out.println("now the last element " + list.show_tail());
    	 list.print_list();
    	 System.out.println("now the 1 element " + list.show_ith_element(0));
    	 System.out.println("now the 2 element " + list.show_ith_element(1));
    	 System.out.println("now the 3 element " + list.show_ith_element(2));
    	 System.out.println("now the 4 element " + list.show_ith_element(3));}
}
