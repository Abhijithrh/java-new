
public class doublelist {
	class Node{    
        String data;    
        Node prev;    
        Node next;    
  
        public Node(String data) {    
            this.data = data;    
        }    
    }    
  
   
    Node head = null;  
    Node tail = null;    
 
    public void addNewNode(String data) {    
  



        Node newNode = new Node(data);    
  
   
        if(head == null) {  
         
            head = newNode;  
            tail = newNode;  
           
            head.prev = null;    
            
            tail.next = null;    
        }  
       
        else {    
  
            
            tail.next = newNode;    
                
            newNode.prev = tail;    
           
            tail = newNode;    
           
        }    
    }    
  
   
    public void showData() {  
          
        Node current = head;    
       
        if(head == null) {  
           
            System.out.println("List is empty");    
            return;    
        }  
       
        System.out.println("Nodes of doubly linked list: ");    
         
        while(current != null) {    
           
            System.out.print(current.data + "\n");    
            current = current.next;    
        }    
    }    

	public static void main(String[] args) {
		doublelist  obj = new doublelist ();    
	      
         
         obj.addNewNode("Rohit sharma ");    
         obj.addNewNode("dhavan");    
         obj.addNewNode("kohli");    
         obj.addNewNode("yuvaraj");    
         obj.addNewNode("dhoni");    
   
        
         obj.showData();    
     }    
  


		

	}


