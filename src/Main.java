public class Main {

    public static void main(String[] args) {
       DoublyLinkedList dll = new DoublyLinkedList();

       Vocab v1 = new Vocab("apple");
       Vocab v2 = new Vocab("orange");
       Vocab v3 = new Vocab("mango");
       Vocab v4 = new Vocab("peach");



       dll.add(v1);
       dll.add(v2);
       dll.add(v3);

        dll.addAfter(dll.findNode(v3), v4);

        dll.displayList();



    }
}
