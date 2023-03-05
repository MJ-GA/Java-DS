/**
 * This class will define the structure of the doubly linked list we're going to use.
 * @author Mohamed Jouini 040994664
 * 
 */
class DoublyLinkedList {
	/**
	 * First node
	 */
        private Node first;
        /**
         * Last node
         */
        private Node last;

        /**
         * DoublyLinkedList Constructor
         */
        public DoublyLinkedList() {
                first = null;
                last = null;
        }

       /**
        * checks if list is empty
        * @return TRUE if NULL else FALSE
        */
        public boolean isEmpty() {
                return first == null;
        }

        /**
         * Insert an element at the beginning of the list
         * @param num
         */
        public void insertFirst(int num) {
                Node newNode = new Node(num);

                if (isEmpty())
                        last = newNode;
                else
                        first.previous = newNode;
                newNode.next = first;
                first = newNode;
        }

       /**
        * Insert an element at the end of the list
        * @param num
        */
        public void insertLast(int num) {
                Node newNode = new Node(num);
                if (isEmpty())
                        first = newNode;
                else {
                        last.next = newNode;
                        newNode.previous = last;
                }
                last = newNode;
        }

        /**
         *  Inserts newNumber just after numToFind
         * @param numToFind target
         * @param newNumber new element to insert
         * @return
         */
        public boolean insertAfter(int numToFind, int newNumber) { 
                Node current = first;
                while (current.mData != numToFind) {
                        current = current.next;
                        if (current == null)
                                return false;
                }
                Node newNode = new Node(newNumber);

                if (current == last) {
                        newNode.next = null;
                        last = newNode;
                } else {
                        newNode.next = current.next;

                        current.next.previous = newNode;
                }
                newNode.previous = current;
                current.next = newNode;
                return true;
        }

       /**
        * Deletes first node
        * @return the next node after the deleted one
        */
        public Node deleteFirstNode() {
                
                
                // Store the first in temp to return
                Node temp = first;
                
                first = first.next;
               
                if(first != null) {
                        first.previous = null;
                }
                else {
                        last = null;
                }
                
                // Return the deleted node
                return temp;
        }

        
        /**
         * Deletes last node
         * @return the previous node 
         */
        public Node deleteLastNode() {
                // assumes a non-empty list
                
                // Store the last in temp to return
                Node temp = last;
                
                last = last.previous;
                // if only one node and is deleted
                if(last != null) {
                        last.next = null;
                }
                else {
                        first = null;
                }

                // Return the deleted node
                return temp;            
        }

        // -------------------------------------------------------------

        /**
         * finds, deletes and returns the node that contains the given int value
         * @param number number to be found and deleted
         * @return 
         */
        public Node searchAndDelete(int number) {
                // first find the node with the number
                Node current = first;
                while (current.mData != number) {
                        current = current.next;
                        // reached last node and did not find the number
                        if (current == null)
                                return null;
                }
                
                // if deleting last node
                if (current == last) {
                        return deleteLastNode();
                } 
                //  if deleting first node
                else if(current == first) {
                        return deleteFirstNode();
                }
                else {
                        // if deleting node from middle
                        current.previous.next = current.next;
                        current.next.previous = current.previous;
                        return current;
                }
        }

        /**
         * Displays data from first node to last node
         */
       
        public void printForwards() {
                // Loop from first
                Node current = first;
                while (current != null) {
                        current.displayNode();
                        current = current.next;
                }
                System.out.println();
        }

        /**
         *  display data from last node to first node
         */
        public void printBackwards() {
                // Loop from last
                Node current = last;
                while (current != null) {
                        current.displayNode();
                        current = current.previous;
                }
                System.out.println();

        }
        // -------------------------------------------------------------
}