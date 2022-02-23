package linkedlist;

public class LinkedList {
	Node head;
void insert(LinkedList list, int data) {
		
	}

	 static LinkedList add(LinkedList list, int data)
	{
		Node new_node = new Node(data);
		new_node.next = null;
		
		if (list.head == null)
		{
			list.head = new_node;
			}
		else {
			Node last = list.head;
			while (last.next!=null) {
				last = last.next;
			}
			last.next=new_node;
		}
		return list;
	}
	
	 static void  printList(LinkedList list ) {
	Node currNode= list.head;
	while(currNode.next!=null) {
		System.out.println(currNode.data+" ");
		currNode = currNode.next;
	}
		
	}
public static void main(String[] args) 
{ 
    /* Start with the empty list. */
    LinkedList list = new LinkedList(); 

    // 
    // ******INSERTION****** 
    // 

    // Insert the values 
    list = add(list, 1); 
    list = add(list, 2); 
    list = add(list, 3); 
    list = add(list, 4); 
    list = add(list, 5); 
    list = add(list, 6); 
    list = add(list, 7); 
    list = add(list, 8); 

    // Print the LinkedList 
    printList(list); 
} 
} 

