package fileio;
import java.io.*;
class land_info implements Serializable{
    String district_name;
    String Area_type;
    String taluk;
    int survey_number;
    int block_number;
    int otp;
    public land_info(String district_name, String Area_type, String taluk, int survey_number, int block_number) {
        this.district_name = district_name;
        this.Area_type = Area_type;
        this.taluk = taluk;
        this.survey_number = survey_number;
        this.block_number = block_number;
        this.otp = (int) (Math.random()*(9999-1000+1)+1000);    
    }
    public void print_details(){
        System.out.println("District Name: " + this.district_name);
        System.out.println("Area Type: " + this.Area_type);
        System.out.println("Taluk: " + this.taluk);
        System.out.println("Survey Number: " + this.survey_number);
        System.out.println("Block Number: " + this.block_number);
        System.out.println("OTP: " + this.otp);
    }
}
public class LandInfoQues {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        land_info[] land = new land_info[10];
        land[0] = new land_info("Panvel", "rural", "pomi", 234, 9); 
        land[1] = new land_info("Belapur", "rural", "palan", 123, 4);
        land[2] = new land_info("Vellore", "urban", "kaili", 234, 5); 
        land[3] = new land_info("Vellore", "rural", "toni", 345, 6); 
        land[4] = new land_info("Panvel", "urban", "lana", 234, 7); 
        land[5] = new land_info("Vellore", "urban", "tal", 234, 8); 
        land[6] = new land_info("Panvel", "urban", "sagh", 234, 1); 
        land[7] = new land_info("Vellore", "rural", "lan", 234, 3); 
        land[8] = new land_info("Belapur", "rural", "pand", 234, 2); 
        land[9] = new land_info("Panvel", "urban", "yali", 234, 10); 
        int c = 0;
        for (int i=0; i<10; i++){
            if ("Vellore".equals(land[i].district_name)){
                c++;                
            }
        }
        File f = new File("landinfo1.txt");
        FileOutputStream fo = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fo);
        for (int i=0; i<10; i++){
            oos.writeObject(land[i]);
        }
        oos.flush();
        oos.close();
        FileInputStream fi = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fi);
        System.out.println("The following employees have their district name as Vellore: ");
        land_info[] vellore = new land_info[c];
        int x = 0;
        for (int i=0; i<10; i++){
            land_info a = (land_info) ois.readObject();
            if ("Vellore".equals(a.district_name)){
                a.print_details();
                System.out.println("");
                vellore[x] = new land_info(a.district_name, a.Area_type, a.taluk, a.survey_number, a.block_number);
                vellore[x].otp = a.otp;
                x++;                
            }
        }
        File f2 = new File("landinfo2.txt");
        FileOutputStream fo2 = new FileOutputStream(f2);
        ObjectOutputStream oos2 = new ObjectOutputStream(fo2);
        for (int i=0; i<c; i++){
            oos2.writeObject(vellore[i]);
        }
        oos2.flush();
        oos2.close();
        System.out.println("These objects have been stored again.");
    }  
}
