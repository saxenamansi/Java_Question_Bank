package objectorientedproblems;
class Participants{
    String name;
    String phoneno;
    String branch;
    String university;
    String TestResult_Classification;
    Participants(String name, String phoneno, String branch, String university, String TestResult_Classification){
        this.name = name;
        this.phoneno = phoneno;
        this.branch = branch;
        this.university = university;
        this.TestResult_Classification = TestResult_Classification;
    }
    static void test_result(String TestResult_Classification){
        switch(TestResult_Classification){
            case "L1":
                System.out.println("Congratulations! You have been selected for "
                        + "both Full time intership "
                        + "as well as Full time job ");
                break;
            case "L2": 
            case "L3":
                System.out.println("You have been selected for Full time "
                        + "intership and Job may be offered based on "
                        + "intership Performance");
                break;
            case "L4": 
            case "L5":
                System.out.println("You have been selected for Part time "
                        + "intership of 21 days. ");
                break;                
        }
    }
    
}
public class objects2 {
   public static void main(String[] args){
       Participants[] partobj = new Participants[3];
       partobj[0] = new Participants("Simran Vudathu", "7977991374", "CSE", "VIT", "L1");
       partobj[1] = new Participants("Shubhangi Sahai", "9987065439", "ECE", "VIT", "L3");
       partobj[2] = new Participants("Sakski Jagtap", "9930022910", "Mech", "VIT", "L5");
       partobj[0].test_result(partobj[0].TestResult_Classification);
       partobj[1].test_result(partobj[1].TestResult_Classification);
       partobj[2].test_result(partobj[2].TestResult_Classification); 
   }
}
