
public interface interface_double_linked_list<Type> {

     
  
  //define function to add node at nth position
  //then assign next node of head to head
  //then set value of input to head value
	public void add_node(int pos, Type new_element);
  
  //define function for getting value at head
  public Type show_head();
  
  //show ith element
  public Type show_ith_element(int pos);
  
  //delete the ith element
  public void delete_ith_element(int pos);
  
  //print the list
  public void print_list();
  
  //define function to return the length of list
  public int length ();
  }
