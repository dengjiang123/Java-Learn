import java.util.Locale;

import static java.lang.Character.*;

public class demo2{
    public static void main(String[] args){
        String name="abc     defghi jklm no\npq rstuv wxyz";
        for(String i:name.split("\\s+")){
            System.out.println(i+"  #");
        }
    }

    public static String Bin(int n){
        String last="";
        for(int i=0;i<32;i++){
            last+=(((1<<(31-i)&n)==0)?0:1);
        }
        return last;
    }
}
