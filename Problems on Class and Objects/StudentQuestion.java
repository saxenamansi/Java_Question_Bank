package objectorientedproblems;
import java.util.Scanner;
class Student{
    String regno;
    String name;
    static String univ = "VIT";
    static int counter;
    void GetMethod(String regno, String name){
        this.regno = regno;
        this.name = name;        
    }void PrintMethod(){
        System.out.println("Registration number: " + regno);
        System.out.println("Name: " + name);
        System.out.println("University: " + univ);
        System.out.println("Counter: " + counter);
    }Student(){
        regno = "18BCE0307";
        name = "Mansi Saxena";
        counter++;
    }Student(String regno, String name){
        this.regno = regno;
        this.name = name;    
        counter++;
    }
}class Course{
    String coursecode;
    String name;
    String slot;
    String venue;
    void Get_Course(String coursecode, String name, String slot, String venue){
        this.coursecode = coursecode;
        this.name = name; 
        this.slot = slot; 
        this.venue = venue;     
    }void Print_Course(){
        System.out.println("Course Code: " + coursecode);
        System.out.println("Name: " + name);
        System.out.println("Slot: " + slot);
        System.out.println("Venue: " + venue);
    }Course(){
        coursecode = "CSE1007";
        name = "Java Programming";
        slot = "A1";
        venue = "SJT101";      
    }Course(String coursecode, String name, String slot, String venue){
        this.coursecode = coursecode;
        this.name = name; 
        this.slot = slot; 
        this.venue = venue;  
    }   
}class Registration{
   public static void main(String[] args){
       Course[] c = new Course[4];
       c[0] = new Course();
       c[1] = new Course("CSE4020", "Machine Learning", "A1", "SJT102");
       c[2] = new Course("CSE3502", "Information Management", "B1", "SJT103");
       c[3] = new Course("CSE3999", "Data Visualisation", "B1", "SJT104");
       Student[] s = new Student[2];
       s[0] = new Student();
       s[1] = new Student("18BCE0373", "Raksha Kannu");
       System.out.println("Displaying details of all courses: \nAll students "
               + "must choose two subjects. \n");
       for(int i=0; i<4; i++){
           c[i].Print_Course();
           System.out.println("");
       }Scanner sobj = new Scanner(System.in);
       String[][] s_c = new String[2][2];
       for(int i=1; i<=2; i++){
           System.out.println("Student "+i+": ");
           System.out.print("\tEnter first course code: ");
           s_c[i-1][0] = sobj.nextLine();
           System.out.print("\tEnter second course code: ");
           s_c[i-1][1] = sobj.nextLine();
       }Course[][] selection = new Course[2][2];
       for(int i=0; i<2; i++){
           for(int j=0; j<2; j++){
               for(int k=0; k<4; k++){
                   if((s_c[i][j]).equals(c[k].coursecode)){
                       s_c[i][j] = c[k].slot;
                       selection[i][j] = c[k];
                   }
               }
           }
       }boolean[] clash = new boolean[2];
       for(int i=1; i<=2; i++){
           if(s_c[i-1][0] == s_c[i-1][1]){
               System.out.println("Student "+i+" - You selected courses are clashing!");
               clash[i-1] = true;
           }else{
               clash[i-1] = false;
           }
       }if(!clash[0]){
           System.out.println("Name\t\tRegistration Number\tCourse Name\t\tCourse "
                   + "Code\tSlot\tVenue");
           for(int i=0; i<2; i++){
               if(!clash[i]){
                   System.out.println(s[i].name+"\t"+s[i].regno+"\t\t"+
                           selection[i][0].name+"\t"+
                           selection[i][0].coursecode+"\t\t"+selection[i][0].slot+
                           "\t"+selection[i][0].venue);
                   System.out.println(s[i].name+"\t"+s[i].regno+"\t\t"+
                           selection[i][1].name+"\t"+
                           selection[i][1].coursecode+"\t\t"+selection[i][1].slot+
                           "\t"+selection[i][1].venue);
               }
           }
       }       
   }
}
