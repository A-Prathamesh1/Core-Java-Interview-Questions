import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ListOfOddIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

//        for(int i = 0; i < 10; i++){
//            list.add(i);
//        }
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        boolean flag = false;
        for(int i: list){
            if(i % 2 == 0){
                flag = true;
            }
        }
        if(flag){
            System.out.println("list does not contain odd numbers");
        }else{
            System.out.println("List contains odd numbers");
        }
    }
}
