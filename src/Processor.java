import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Processor {


    public static void loadFromFile(String fileName) {
        //this would act like a reader...
        DoublyLinkedList dll = new DoublyLinkedList();
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = br.readLine())!=null){
                if(line.startsWith("#")){
                    String topic = line;
                    Vocab newVocab = new Vocab(topic);
                    dll.add(newVocab);
                    dll.displayList();
                }
                if(line.isEmpty()){
                    System.out.println("BLANK");
                }
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
