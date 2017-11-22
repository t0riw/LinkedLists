import java.util.Iterator;
/**
 * This class 
 * 
 * Class Invariants:
 *
 * @author Tori Walen
 * @version CSS 143 HW8
 */
public class List
{
    /**
     * Class Node
     * This class
     * Class invariants:
     */
    private class Node{
        private String item;
        private Node link;

        /**
         * No argument constructor of Node sets link and item to null.
         */
        public Node(){
            link = null;
            item = null;

        }

        /**
         * Node Constructor
         */
        public Node(String newItem, Node linkValue){
            item = newItem;
            link = linkValue;
        }

        public Node(Node n){
            item = n.item;
            link = n.link;
        }

    } //End of Node inner class.
    public class ListIterator{
        private Node position;
        private Node previous;

        public ListIterator(){
            position = head;
            previous = null;
        }

        public void restart(){
            position = head;
            previous = null;
        }

        public String next(){
            if(!hasNext()){
                //Throw exception;
            }
            String toReturn = position.item;
            previous = position;
            position = position.link;
            return toReturn;
        }

        public boolean hasNext(){
            return(position != null);
        }

        public ListIterator iterator(){
            return new ListIterator();
        }

        public void addHere(String data){
            if(position == null && previous != null){
                previous.link = new Node(data, null); //Add to end of list
            }
            else if(position == null || previous == null){
                List.this.addToStart(data);
        }
    }
}// End of ListIterator inner class.
    private Node head;
    public List(){
        head = null;   
    }

    /**
     * Method insert
     * Preconditions: next is a Node object and not null. 
     * Can insert an object at any index.
     */
    public void insert(Object next, int index){
        ListIterator it = new ListIterator();
        if(next instanceof Node && next != null){
            Node temp = (Node)next;
            if(head == null){
                head = new Node(temp.item, head);

            }
            else if(size() == 1){
                if(index == 0){
                    head = new Node(temp.item, head);
                }
                else{
                    head.link = new Node(temp.item, null);
                }
            }
            else{
                if(index == 0){
                    head = new Node(temp.item, head);
                }
                else{
                    
                        for(int i = 0; i < index; i++){
                            it.next();   
                        }
                    
                    it.addHere(temp.item);
                }
            }
        }
        else{
            //Throw new exception
        }
    }

    /**
     * Method remove
     */
    public Object remove(int index){
        Object toReturn =null;
        if(index == 0){
            toReturn = head;
            head = head.link;

        }
        else{
        }
            return toReturn;
    
    }

    /**
     * Method size
     */
    public int size(){
        int count = 0;
        Node position = head;
        while(position != null){
            count++;
            position = position.link;
        }
        return count;
    }
    /**
     * Method addToStart
     */
    public void addToStart(String item){
     head = new Node(item, head);   
    }
    
    /**
     * Method toString
     */
    /**
     * Method isEmpty
     */
    /**
     * Method indexOf
     */
    /**
     * Method append
     */
}
