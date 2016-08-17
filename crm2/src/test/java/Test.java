import java.util.List;

/**
 * Created by D on 2016/8/17.
 */
public class Test {
    public static void  main(String[] args){
        String str = "A.B.C.D";
        String[] strs = str.split("\\.");
        String str2 = strs[3]+"."+strs[2]+"."+strs[1]+"."+strs[0];
        System.out.println(str2);
    }

}
