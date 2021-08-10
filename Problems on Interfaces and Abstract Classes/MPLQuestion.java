package objectorientedproblems;
import java.util.Scanner;
class mpl{
     //Standard, number of students, marks[]
    int std;
    int num_studs;
    int[] marks = new int[num_studs];
    int first_mark;
    mpl (int std, int num_studs){
        Scanner s = new Scanner(System.in);
        this.std = std;
        this.num_studs = num_studs;
        System.out.println("Enter marks of students: ");
        this.first_mark = 0;
        for(int i=0; i<num_studs; i++){
            System.out.println(i);
            this.marks[i] = s.nextInt();
        }
        for(int i=0; i<num_studs; i++){
            if (marks[i]>this.first_mark){
                this.first_mark = marks[i];
            }
        }
    }      
}
public class sampleprob2 {
   public static void main(String[] args){
       mpl[] stud_array = new mpl[4];
       stud_array[0] = new mpl(10, 5);
       stud_array[1] = new mpl(9, 5);
       stud_array[2] = new mpl(8, 4);
       stud_array[3] = new mpl(7, 6);
       findBestClass(stud_array);
   }
    static void findBestClass(mpl[] stud_array){
        int best = 0;
        int std = 0;
        for(int i=0; i<4; i++){
            if(stud_array[i].first_mark>best){
                best = stud_array[i].first_mark;
                std = stud_array[i].std;
            }
        }
        System.out.println("The highest first mark is " + best + " from class " + std);
    }
    static void findBestClass(mpl[] stud_array, int x){
        int best = 0;
        int std = 0;
        for(int i=0; i<4; i++){
            int sum = 0;
            for(int j=0; j<stud_array[i].num_studs; j++){   
                sum+= stud_array[i].marks[j];
            }
            if(sum/stud_array[i].num_studs > best){
                best = sum/stud_array[i].num_studs;
                std = stud_array[i].std;
            }
        }
        System.out.println("The highest average mark is " + best + " from class " + std);
    }
}
