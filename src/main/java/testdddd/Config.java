package testdddd;

import java.util.HashMap;

public class Config {
    public static void main(String[] args) {
        ///*Integer*/map.put("1", 1);//向map中添加值(返回这个key以前的值,如果没有返回null)
        HashMap<String, Integer> map=new HashMap<>();
//        map.put("1", 1);
        System.out.println(map.put("1", 1));//null
        System.out.println(map.put("1", 2));//1
        System.out.println(map.put("1", 4));
    }
}
