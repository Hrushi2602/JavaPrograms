package Array;

import java.util.Enumeration;
import java.util.*;

public class AddListObj {
    public static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(12, "sanajay");
        hm.put(13,"hrushhi");

//        li.add("hrushikesh");
//        li.add("sanjay");
//        li.add("mahalle");
//
//
      Iterator<Integer> en =hm.keySet().iterator();
      while (en.hasNext()){
         en.next();
          System.out.println(en);
      }




        System.out.println(hm);

        }
    }

