public class DoublyLinkedList {
    private Node head = null;
    private Node tail = null;

    private class Node {
        Node next;
        Node prev;
        Vocab vocab;

        Node(Vocab vocab) {
            this.vocab = vocab;
            this.prev = null;
            this.next = null;
        }
    }

    public DoublyLinkedList() {
    }

    public void add(Vocab vocab) {
        Node vocabNode = new Node(vocab);
        if (this.head == null) {
            this.head = vocabNode;
        } else {
            this.tail.next = vocabNode;
            vocabNode.prev = this.tail;
        }

        this.tail = vocabNode;
    }

    public Node findNode(Vocab vocab){
                Node current = head;

                while(current != null){
                    if(current.vocab.equals(vocab)){
                        return current;
                    }
                    current = current.next;
        }
        return null;
    }

    public void addToStart(Vocab vocab) {
        Node vocabNode = new Node(vocab);
        if (this.head != null) {
            this.head.prev = vocabNode;
        } else {
            this.tail = vocabNode;
        }

        this.head = vocabNode;
    }

    public void addAfter(Node prevNode, Vocab vocab) {
        if (prevNode == null) {
            System.out.println("There is no topic.");
        } else {
            Node vocabNode = new Node(vocab);
            vocabNode.next = prevNode.next;
            prevNode.next = vocabNode;
            if (vocabNode.next == null) {
                this.tail = vocabNode;
            } else {
                vocabNode.next.prev = vocabNode;
            }
        }

    }

    public void addBefore(Node nextNode, Vocab vocab) {
        if (nextNode == null) {
            System.out.println("There is no topic.");
        } else {
            Node vocabNode = new Node(vocab);
            vocabNode.prev = nextNode.prev;
            nextNode.prev = vocabNode;
            vocabNode.next = nextNode;
            if (vocabNode.prev == null) {
                this.head = vocabNode;
            } else {
                vocabNode.prev.next = vocabNode;
            }
        }

    }

    public void displayList() {
        for(Node temp = this.head; temp != null; temp = temp.next) {
            System.out.println("Topic: " + temp.vocab.getTopic());
        }

    }

    public void removeNode(Node currentNode){
        if(currentNode == null){
            System.out.println("There is no topic!");
        }
        else{
            currentNode.next.prev = currentNode.prev;
            currentNode.prev.next = currentNode.next;
        }
    }

    /*
    2 (done)
    3 (done)
    4 (done)
    5 ....
    6 ....
    7 ....
    8 ....
    9 ....
     */

}

