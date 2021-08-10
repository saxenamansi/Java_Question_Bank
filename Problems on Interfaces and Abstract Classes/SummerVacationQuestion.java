package inheritanceproblems;
class Vacation{
    String place;
    String date;
    String[] activities = new String[3];
    float[] cost = new float[3];
    public void GetMethod(){
        this.place = "Paris";
        this.date = "10 June 2020";
        this.activities[0] = "Swimming";
        this.activities[1] = "Horse Riding";
        this.activities[2] = "Para-Sailing";
        this.cost[0] = 10000.0f;  
        this.cost[1] = 20000.0f;
        this.cost[2] = 30000.0f;
    }
    public void PrintMethod(){
        System.out.println("Place: " + place);
        System.out.println("Date: " + date);
        System.out.println("Activities and Cost: ");
        for(int i=0; i<3; i++){
            System.out.println(activities[i] + " " + cost[i]);
        }
        System.out.println("\n");
    }
}
class SummerVacation extends Vacation{
    String course_title;
    String OnlinePlatform;
    int Duration;   //in weeks
    public void GetMethod(){
        this.place = "Paris";
        this.date = "10 June 2020";
        this.activities[0] = "Swimming";
        this.activities[1] = "Horse Riding";
        this.activities[2] = "Para-Sailing";
        this.cost[0] = 10000.0f;  
        this.cost[1] = 20000.0f;
        this.cost[2] = 30000.0f;  
        this.course_title = "Machine Learning";
        this.OnlinePlatform = "Coursera";
        this.Duration = 11;
    }
    public void PrintMethod(){
        System.out.println("Place: " + place);
        System.out.println("Date: " + date);
        System.out.println("Activities and Cost: ");
        for(int i=0; i<3; i++){
            System.out.println(activities[i] + " " + cost[i]);
        }
        System.out.println("Course Title: " + course_title);
        System.out.println("Online Platform: " + OnlinePlatform);
        System.out.println("Duration: " + Duration);
    }
}
public class inheritance1 {
   public static void main(String[] args){
       Vacation vobj = new Vacation();
       vobj.GetMethod();
       vobj.PrintMethod();
       SummerVacation sobj = new SummerVacation();
       sobj.GetMethod();
       sobj.PrintMethod();
   }
}
