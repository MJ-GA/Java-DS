/**
 * This class will allow us to create a node , and display its data 
 *
 * @author Mohamed Jouini 040994664
 *
 */

class Node {
        /**
         *  data item
         */
        public int mData; 
        /**
         * next node in list
         */
        public Node next; 
        /**
         * previous node in list
         */
        public Node previous; // 
        
       /**
        *  Node constructor 
        * @param d
        */
        public Node(int d) // constructor
        {
                mData = d;
        }

       
        /**
         *  display this node data
         */
        
        public void displayNode() {
                System.out.print(mData + " ");
        }
        // -------------------------------------------------------------
}

