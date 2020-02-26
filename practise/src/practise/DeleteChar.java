package practise;


import java.util.ArrayList;
import java.util.List;

public class DeleteChar {

public static void main(String[] args) {
//abab

String name="ABBAAAABBBB";
     char c[]=name.toCharArray();
int min_deletion=0;
int flag=0;
List<Character> li=new ArrayList<Character>();
for(int i=0;i<c.length-1;i++) {




if(c[i]==c[i+1])
{

min_deletion++;


}

if(c[i]!=c[i+1])
{

	flag++;


}  

if(flag==1) {
	
	li.add(c[i]);
	
}



if(!li.contains(c[i+1]) || c[i]!=c[i+1])
{

li.add(c[i+1]);    


}




}
     


System.out.println(min_deletion);

for(int k=0;k<li.size();k++) {

System.out.println(li.get(k));


}

}

}