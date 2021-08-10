package exceptionhandlingproblems;
import java.util.concurrent.ThreadLocalRandom;
class SameColorPenException extends Exception{
    public SameColorPenException() {
        super();
    }
    public SameColorPenException(String s) {
        System.out.println(s);
        System.out.println("Trying again...");
    }
}
class pens{
    int red = 0;    //let red pens be denoted by 0
    int orange = 0;     //let orange pens be denoted by 1
    int white = 0;      //let white pens be denoted by 2
    int black = 0;      //let black pens be denoted by 3
    int randPick;
    int[] pens = new int[10];
    void pick_pens() throws SameColorPenException{
        for(int i=0; i<10; i++){
            if(i==0 || i==1){
                randPick = ThreadLocalRandom.current().nextInt(0, 4);
                pens[i] = randPick;
            }
            else if (randPick == 0){
                if(pens[i-1] == 0 || pens[i-2] == 0){
                    try{
                        throw new SameColorPenException("Red pens are picked up thrice!");
                    }
                    catch (SameColorPenException e) {
                        do{  
                            randPick = ThreadLocalRandom.current().nextInt(0, 4);
                        }while(randPick == 0);
                        pens[i] = randPick;
                    }
                }                
            }
            else if (randPick == 1){
                if(pens[i-1] == 1 || pens[i-2] == 1){
                    try{
                        throw new SameColorPenException("Orange pens are picked up thrice!");
                    }
                    catch (SameColorPenException e) {
                        do{  
                            randPick = ThreadLocalRandom.current().nextInt(0, 4);
                        }while(randPick == 1);
                        pens[i] = randPick;
                    }
                }                
            }
            else if (randPick == 2){
                if(pens[i-1] == 2 || pens[i-2] == 2){
                    try{
                        throw new SameColorPenException("White pens are picked up thrice!");
                    }
                    catch (SameColorPenException e) {
                        do{  
                            randPick = ThreadLocalRandom.current().nextInt(0, 4);
                        }while(randPick == 2);
                        pens[i] = randPick;
                    }
                }                
            }
            else if (randPick == 3){
                if(pens[i-1] == 3 || pens[i-2] == 3){
                    try{
                        throw new SameColorPenException("Black pens are picked up thrice!");
                    }
                    catch (SameColorPenException e) {
                        do{  
                            randPick = ThreadLocalRandom.current().nextInt(0, 4);
                        }while(randPick == 3);
                        pens[i] = randPick;
                    }
                }                
            }
        }             
    }
    void count_pens(){
        System.out.println("\nFinal order of picking pens:");
        for(int i=0; i<10; i++){            
            switch(pens[i]) {
                case 0:
                    red++;
                    System.out.print("Red ");
                    break;
                case 1:
                    orange++;
                    System.out.print("Orange ");
                    break;
                case 2:
                    white++;
                    System.out.print("White ");
                    break;
                case 3: 
                    black++;
                    System.out.print("Black ");
                    break;
            }
        }
        System.out.println("\n");
    }
    void get_pens(){
        System.out.println("The number of pens in each colour type are:");
        System.out.println("Red: " + this.red);
        System.out.println("Orange: " + this.orange);
        System.out.println("White: " + this.white);
        System.out.println("Black: " + this.black);        
    }
}
public class JavaMidTerm {
    public static void main(String[] args) throws SameColorPenException {
        pens p = new pens();
        p.pick_pens();
        p.count_pens();
        p.get_pens();        
    }   
}
