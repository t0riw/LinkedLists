
/**
 * Stupidass driver for the List class. Also tests Node and Iterator.
 */
public class FuckingListDriver
{
    public static void main(String[] args){
     List shit = new List();
     List.ListIterator i = shit.iterator();
     shit.addToStart("kittens");
     shit.addToStart("puppies");
     shit.addToStart("weed");
     
     System.out.println("List contains:");
     i.restart();
     while(i.hasNext()){
         System.out.println(i.next());
        }
     shit.insert(new Node("goldfish", 2));
     i.restart();
      while(i.hasNext()){
         System.out.println(i.next());
        }
    }
}