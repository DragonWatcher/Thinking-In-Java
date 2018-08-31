package chapter_17_9_散列与散列码;

import java.lang.reflect.*;
import java.util.*;
/**
 * <br>类名：SpringDetector<br>
 * 作者： mht<br>
 * 日期： 2018年4月22日-下午4:55:08<br>
 */
public class SpringDetector extends Object{

    // Users a Groundhog or class derived from Groundhog;
    public static <T extends Groundhog> void detectSpring(Class<T> type) throws Exception{
        Constructor<T> ghog = type.getConstructor(int.class);
        Map<Groundhog, Prediction> map = new HashMap<>();
        
        for (int i = 0; i < 10; i++) {
            map.put(ghog.newInstance(i), new Prediction());
        }
        
        System.out.println("map = " + map);
        Groundhog gh = ghog.newInstance(3);
        System.out.println("Looking up prediction for " + gh); 
        if(map.containsKey(gh))
            System.out.println(map.get(gh));
        else
            System.out.println("Key not found: " + gh);
    }
    
    public static void main(String[] args) throws Exception {
        detectSpring(Groundhog.class);
    }
}
