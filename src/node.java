//define the node class which stores value and reference to next node
//it is using any type as we have defined <T> in it
public class node<Type> implements dnode_interface<Type>{
	
	  //define private object which stores the value of node and we can set it to null
      private Type element ;
      
      //define the private node which refer to next node
      private node<Type> next;
      
      //define next node
      private node<Type> prev;
      
      //define function to change element in node
      //as our element is private so we need change it from function
      public void change_element (Type new_element) {
    	  
    	  //assign value of y to exisiting node
    	  element = new_element;
      }
      
      //similary make function to change node
      //as our node is also private
      public void change_next(node<Type> new_node_n) {
    	  
    	  //now just assign the value of new_node to existing node
    	  next = new_node_n;
      }
      
      //now write function to change prev_ node
      public void change_prev(node<Type> new_node_p) {
    	  
    	  //just change value of prev_node
    	  prev = new_node_p ;
      }
      //make function to show element value
      public Type show_element() {
    	  
    	  //just return the elemment
    	  return(element);
      }
      
      //make function to show next value
      public node<Type> show_next() {
    	  
    	  //just return the elemment
    	  return(next);
      }
      
    //make function to show prev_ value
      public node<Type> show_prev() {
    	  
    	  //just return the elemment
    	  return(prev);
      }
      
      //just create the constructor for new node
      public node (Type new_intiator) {
    	  
    	  //just assign value of initiator to element 
    	  element = new_intiator;
    	  
    	  //and assign value of null to node
    	  next = null;
    	  
    	  //also just change prev to null
    	  prev = null;
      }
      //just create the constructor for new node
      //this one is without initiator
      public node() {
    	  
    	  //just assign value of initiator to element 
    	  element = null;
    	  
    	  //and assign value of null to node
    	  next = null;
    	  
    	  //also just change prev to null
    	  prev = null;
    	  }
    }

