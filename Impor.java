package eg.edu.alexu.csd.datastructure.linkedList;
 class Impor implements ILinkedList {

	 public class LinkedListNode {

		 Object element ;
		 LinkedListNode Next ;
		
		LinkedListNode(Object value , LinkedListNode next){
			element = value ;
			Next = next ;
		}
		public LinkedListNode getNext() {
			return Next ;
		}
		public Object getvalue() {
			return element ;
		}
	 }
	 LinkedListNode head ;
		    int size;
	public void SingleLinkedList(){
		        head = null;
		        size=0;
		    }

	  
	 public void printList(){
			LinkedListNode tmp=head;
	        while (tmp!=null){
	            System.out.print(tmp.element+" ");
	            tmp = tmp.Next;
	        }
	        System.out.println();
	    }
	 public void add(int index, Object element) {
		 int c = 0 ;
		 LinkedListNode New = new LinkedListNode(element,null);
		 LinkedListNode P ;
		 New.element = element ; 
		 while (c<index-1) {
			 head= head.getNext();
			 c++;
		 }
		 P=head.getNext();New.Next = P ; 
		 head.Next = New ;
	 }
	 public void add (Object element) {
		 LinkedListNode New = new LinkedListNode(element,null);
		 LinkedListNode P ;
		 New.element=element;
		 while (head.getNext()!=null ) {
			 head = head .getNext() ;
		 }
		 head.Next=New ;
	 }
	 public Object get (int index ) {
		int counter =0 ;
		Object val = new Object();
		 while (counter<index) {
			 head = head.getNext();
			 counter++;
		 }
		 val = head.getvalue();
		 return val ;
	 }
	 public void set ( int index , Object element ) {
		int counter = 0;
		while (counter <index) {
			head = head .getNext();
			counter++;
		}head.element = element ; 
	 }
	 public void clear (){
		 head.Next = null;
	 }
	 public boolean isEmpty() {
		 if(head.element==null) {
			 return true ;
		 }else {return false ;}
	 }
	 public void remove(int index) {
		 int counter =0 ;
		 LinkedListNode P ;
		 while(counter<index-1) {
			 head=head.getNext();
			 counter ++ ; 
		 }P = head .getNext().getNext();
		 head.Next = P ;
	 }
	 public int size() {
		 int counter =1 ;
		 while (head.getNext()!=null) {
			 head=head.getNext();
			 counter++;
		 }return counter ;
	 }
	 public LinkedListNode sublist(int fromIndex, int toIndex) {
		 int counter =0 ;
		 LinkedListNode P  ;
		 while (counter<fromIndex) {
			 head = head.getNext();
			 counter++;
		 }P = head  ; 
		 while(counter<toIndex) {
			 counter++;
			 head=head.getNext();
		 }
		 head.Next = null ;
		 return P ;
	 }
	 public boolean contains(Object o) {
		while(head.getvalue()!= o) {
			head = head .getNext();
		}if(head.getvalue()==o) {return true ; }
		else {return false ; } 
	 }
}
