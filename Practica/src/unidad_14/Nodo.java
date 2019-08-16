package unidad_14;

class Node {
    int cargo;
    Node next;

    // default constructor
    public Node () {
	cargo = 0;
	next = null;
    }

    // other constructor
    public Node (int cargo, Node next) {
	this.cargo = cargo;
	this.next = next;
    }

    public String toString () {
	return cargo + "";
    }

    public static void printBackward (Node list) {
        if (list == null) return;

        Node head = list;
        Node tail = list.next;

        printBackward (tail);
        System.out.print (head + ", ");
    }    
}