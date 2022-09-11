public class LinkedList {              // This is java class
   
    Node head;                        // Head of linkedList

    //declare static in java to use inside the same class as here we are using it inside Linkedlist class 
    static class Node{                // Node class which has  data, next , where next stores location of next node
         int data;
        Node next;
    

    Node(int d){                      // Constructor for code reusability and efficiency
        data=d;
        next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data){     //insert function to insert data in LinkedList
        Node newnode = new Node(data);   // initialize the node first
        if(list.head == null){           // check whether the head is null or not if it is null then we are inserting first node in the linkedList
            list.head = newnode;         // assign the newly created node to head if found null 
        }
        else{                         //when there are already some data present in LinkedList
            Node last = list.head;    // store the head in some variable 
            while(last.next!=null){   // traverse the linkedList check if head.next == null then stop the loop
                last = last.next;      // doing this to goto the next position each time last.head = nextNodeAddress ==>  nextNode.next= nextNode Address
            }
            last.next=newnode;     // at the end we insert the node to the end of LinkedList remember this code is same for head insertion and some later value insertion
        }
        return list;             // at the end return the list
    }

    public static void printList(LinkedList list){
        Node last = list.head;      // Same to print find the head node first we traverse from head to tail or start to endnode
        while(last!=null){          //check if head is null or not
            System.out.println(last.data);       //print the value of head
            last= last.next;                    // each time update the address of head this is something like below
                                                // doing this to goto the next position each time last.head = nextNodeAddress ==>  nextNode.next= nextNode Address
        }
    }

    public static void main(String args[]){
        LinkedList linkedList = new LinkedList();   // create Object for our LinkedList class

        linkedList = insert(linkedList, 10);       // insert the node in the list and return the same list so that insertion take place in the same list
        linkedList = insert(linkedList, 22);
        linkedList = insert(linkedList, 3);
        linkedList = insert(linkedList, 42);
        linkedList = insert(linkedList, 6);

        printList(linkedList);                       // call the printList Function to print the list
    }
    
}
