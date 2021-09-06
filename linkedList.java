public class Main {
    public static void main(String args[]) {
        
        LinkledList link = new LinkledList();
        // link.insertAtFront(6);
        // link.insertAtFront(2);
        // link.insertAtFront(4);
        // link.insertAtFront(56);
       
        // link.insertAtFront(91);

        // link.insertInMiddle(105,3);
        link.insertAtTail(250);
        link.print();       
    }    
}

class LinkledList{

    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

     public void insertAtFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void print(){
        Node temp = head;
         while(temp != null){
            System.out.print(temp.data + " ---> ");
            temp = temp.next;
        }
    }

    public void insertAtTail(int data){

        if(head == null){
            insertAtFront(data);
            // Node newNode = new Node(data);
            // newNode.next = head;
            // head = newNode; 
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            Node newNode = new Node(data);
            temp.next = newNode;
        }
    }

    public void insertInMiddle(int data, int position){
        
        Node tt = head;        

        if(head == null && position == 0){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }else{

        Node newNode = new Node(data);
        for(int i = 0; i<position;i++){
            tt = tt.next;
        }
       
        newNode.next = tt.next;
        tt.next = newNode;


        }
    }

}