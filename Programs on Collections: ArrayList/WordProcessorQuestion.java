package arraylist;
import java.io.*;
import java.util.*;
class MyException extends Exception{
    public MyException(String s) {
        System.out.println(s);
    }
}class WordProcessor{
    String textfile;
    ArrayList<String> wordList = new ArrayList<String>();
    WordProcessor(String textfile){
        this.textfile = textfile;
    }public boolean fileexist() throws Exception{
        File f = new File(this.textfile);
        if (f.exists())
            return true;
        else
           throw new MyException("File does not exist!");        
    }public void readFromFile() throws FileNotFoundException, IOException{
        File f = new File(textfile);
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line = "";
        while((line = br.readLine()) != null){
            for(String word : line.split(" ")) {
                wordList.add(word);
            }
        }
    }public ArrayList EvenWords(){
        ArrayList<String> EvenLength = new ArrayList<String>();
        for (int i = 0; i < wordList.size(); i++) {
            String word = (String) wordList.get(i);
            int l = word.length();
            if(l%2 == 0){
                EvenLength.add(word);
            }
        }return EvenLength;
    }
}class length implements Comparator<String>{
    public int compare(String b1, String b2){
        if (b1.length()>b2.length())
            return 1;
        else if (b1.length()<b2.length())
            return -1;
        else
            return 0;
    }
}
public class ArrayList2 {
   public static void main(String[] args) throws Exception {
       WordProcessor wp = new WordProcessor("Arraylist.txt");
       if (wp.fileexist()){
           wp.readFromFile();
           System.out.println("The words in WordList are: ");
           for(Object word:wp.wordList)
               System.out.println(word);
       }ArrayList<String> EvenLength = wp.EvenWords();
       System.out.println("\nWords with even length: ");
       for(Object word:EvenLength)
           System.out.println(word);
       Collections.sort(EvenLength, new length());
       System.out.println("\nSorting words with even length based on lengths: ");
       for(Object word:EvenLength)
           System.out.println(word);
   }
}

