package practise;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SherlockValidString {

public static void main(String[] args) {

        String text="dashbord";
        char c[]=text.toCharArray();

      int size=c.length;
     int i=0;

      TreeMap<Character,Integer> hmap=new TreeMap<Character,Integer>();

         while(i!=size) {
         if(!hmap.containsKey(c[i]))
          {
        hmap.put(c[i], 1);  

      }else {

        int oldval=hmap.get(c[i]);
        int newval=oldval+1;
        hmap.put(c[i],newval);


        }
          i++;

         }

         int flag=0,flag1=0;
          outer:for(Integer entry1 :hmap.values()) {
         

       inner: for(Integer entry2 :hmap.values()) {

          if(entry1.equals(entry2)) {
                 System.out.println(entry1);
                 System.out.println(entry2);
          flag++;
         }else if(entry2==3 && flag1<=0){
        	 System.out.println(entry2);
        	 flag1++;
         }else {

        System.out.println("string is not valid");
        break outer;
           }

         }
       if(flag!=0 || flag1==1){
         System.out.println("string is  valid");
          break;

          }

       }
     }
 }


