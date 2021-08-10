package exceptionhandlingproblems;
import java.util.Arrays;
public class MGR{
    int train_no;
    String src;
    String dest;
    double time;
    double traveltime;
    int platform_num;
    String traveltype;
    MGR(int train_no, String src, String dest, double time, double traveltime, int platform_num, String traveltype){
        this.train_no = train_no;
        this.src = src;
        this.dest = dest;
        this.time = time;
        this.traveltime = traveltime;
        this.platform_num = platform_num;
        this.traveltype = traveltype;     
    }
    public void show_traindetails(){
        System.out.println("Train No: " + this.train_no);
        System.out.println("Source: " + this.src);
        System.out.println("Destination: " + this.dest);
        System.out.println("Departure Time: " + this.time);
        System.out.println("Travel Time: " + this.traveltime);
        System.out.println("Platform No: " + this.platform_num);
        System.out.println("Travel Type: " + this.traveltype);
    }
    public static boolean searchfunc(int train_no, MGR[] arr){
        for(int i=0; i<arr.length; i++){
            if(train_no == arr[i].train_no){
                arr[i].show_traindetails();
                return true;
            }
        }
        throw new ArrayIndexOutOfBoundsException("Train not found. Exception is thrown");
    }
    public static void sortfunc(MGR[] arr, String type){
        if(type == "time-based"){
            float time_arr[] = new float[arr.length];
            for(int i=0; i<arr.length; i++){
                time_arr[i] = (float) arr[i].time;
            }
            Arrays.sort(time_arr);
            System.out.println(time_arr);
        }
        if(type =="number-based"){
            int time_arr[] = new int[arr.length];
            for(int i=0; i<arr.length; i++){
                time_arr[i] = arr[i].train_no;
            }
            Arrays.sort(time_arr);
            System.out.println(time_arr);
        }
        else{
            throw new ArithmeticException("Please enter time-based or number-based");
        }
        
    }
}
class Main {
   public static void main(String[] args) {
       MGR[] array = new MGR[3];
       array[0] = new MGR(1, "Mumbai", "Chennai", 3.05, 12.30, 3, "A");
       array[1] = new MGR(2, "Banglore", "Chennai", 4.05, 3.30, 4, "D");
       array[1] = new MGR(3, "Kolkata", "Mumbai", 9.50, 18.30, 9, "A");
       try{
           MGR.searchfunc(4, array);
       } catch(Exception e){
           System.out.println("Exception Handled: " + e);
       }
       try{
           MGR.sortfunc(array, "nada-based");
       } catch(Exception e){
           System.out.println("Exception Handles: " + e);
       }
   }  
}
