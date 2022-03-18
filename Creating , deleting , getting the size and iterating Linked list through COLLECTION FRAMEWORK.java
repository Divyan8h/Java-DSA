package session1;
import java.util.*;

public class LLCF {
public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<Integer>();
	list.addFirst(1);
	list.addFirst(5);
	list.addFirst(7);
	System.out.println(list);
	list.addLast(3);
	list.addLast(2);
	list.addLast(8);
	list.addLast(3);
	System.out.println(list);
	System.out.println(list.size());
	list.removeFirst();
	System.out.println(list);
	list.removeLast();
	System.out.println(list);
	list.remove(4);
	System.out.println();
	
}
}
