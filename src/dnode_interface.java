
public interface dnode_interface<Type> {

	       
		//the function that set value of node element to the input
		//for node NODE, with element value ELEMENT, ELEMENT = new_element 
		public void change_element(Type new_element);
		
		//set the value of next_node to new_node
		public void change_next(node<Type> new_node);
		
		//show's the value of element in node
		public Type show_element();
		
		//show's the value of next node in node
		public node<Type> show_next();
		
		//also add functions for showing prev_ node
		public node<Type> show_prev();
		
		//also add function to change the prev_ node
		public void change_prev(node<Type> new_prev_node);
        
	}
