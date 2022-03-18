package session1;

import java.util.LinkedList;

public class LL1 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addFirst(7);
		list.addFirst(5);
		list.addFirst(1);
		System.out.println(list);
		list.addLast(3);
		list.addLast(2);
		list.addLast(8);
		list.addLast(3);
		System.out.println(list);
		

		//now finding the number 7 and looking for its index
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i) == 7)
			{
				System.out.println("7 is present at index: " + i);
			}
		}
}
}
