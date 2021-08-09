package stringproblems;
public class string6 {
   public static void main(String[] args){
       String[][] strings = {
           {"Tom", "Jerry"},
           {"Shinu", "Ram"},
           {"Tintu", "Chintu"},
       }; 
       System.out.println("Printing the strings in reverse: ");
       for (int i=0; i<3; i++){
           for (int j=0; j<2; j++){
               System.out.print(strings[i][j] + "\t --> \t");
               char[] chararray = strings[i][j].toCharArray();
               for(int c=chararray.length-1; c>=0; c--){
                   System.out.print(chararray[c]);
               }
               System.out.println("");
           }
       }
       System.out.println("");
       for (int i=0; i<3; i++){
               String longest = (strings[i][0].length() > strings[i][1].length()) ? strings[i][0]:strings[i][1];
               System.out.println("The longest string in row number " + i+1 + " is: " + longest);
               
           
       }
   }
}
