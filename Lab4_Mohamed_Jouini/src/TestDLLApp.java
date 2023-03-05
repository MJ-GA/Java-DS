/**
 * This is the class which contains our main method .
 * @author Mohamed Jouini 040994664
 * 
 */
class TestDLLApp {
	/**
	 * This is our main method which will serve to instantiate the doubly linked list and perform the necessary operations .
	 * @param args
	 */
   public static void main(String[] args) {

           //make a new linked list called newLL
           DoublyLinkedList dll = new DoublyLinkedList();

           //insert 20, 42, 63, 93 at the front of linked list:                 
           dll.insertFirst(20);
           dll.insertFirst(42);
           dll.insertFirst(63);
           dll.insertFirst(93);

           // insert 9, 34, 51 at the rear of linked list:                          
           dll.insertLast(9);
           dll.insertLast(34);
           dll.insertLast(51);

           //display data elements in the linked list from first to last
           System.out.print("Linked List: [From first_to_last]: ");
           dll.printForwards();

           //display data elements in the linked list from last to first
           System.out.print("Linked List: [From last_to_first]: ");
           dll.printBackwards();

           //delete first item                                                              
           dll.deleteFirstNode();

           //delete last item
           dll.deleteLastNode();

           //delete item with number 9
           dll.searchAndDelete(9);

           //display data elements in the linked list from first to last
           System.out.print("Linked List: [From first_to_last]: ");
           dll.printForwards();

           //insert 69 after 20
           dll.insertAfter(20, 69);

           //insert 77 after 34
           dll.insertAfter(34, 77);

           //display data elements in the linked list from first to last
           System.out.print("Linked List: [From first_to_last]: ");
           dll.printForwards();

   }
}