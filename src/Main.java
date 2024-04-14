public class Main {

    public static void main(String[] args) {
       DoublyLinkedList dll = new DoublyLinkedList();
       SinglyLinkedList wordsList = new SinglyLinkedList();

        // Add words to the list
        wordsList.add("Red");
        wordsList.add("Green");
        wordsList.add("Blue");

        // Create a new Vocab object with the topic "Colours" and the words list
        Vocab coloursVocab = new Vocab("Colours", wordsList);

        Processor.loadFromFile("A3_input_file.txt", dll);
        //dll.displayList();
        //System.out.print(dll.findNode("#Colours").getTopic());
        //System.out.println(dll.findNode("#Education").getWords());
       // System.out.println(dll.findNode("#Colours").getWords());

        Vocab words = dll.findVocab("#Colours");
        dll.addBefore("#Colours", coloursVocab);

        coloursVocab.getWords().printList();
        SinglyLinkedList words2 = coloursVocab.getWords();
        //words2.change("Green", "GRAAAY");
        System.out.println(dll.searchWord("Red"));
        coloursVocab.getWords().printList();

        //dll.displayList();
        //words.printList();


    }
}
