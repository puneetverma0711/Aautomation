package practise;

public class Test   
{  
    Test(byte  a, byte b)  
    {  
        System.out.println("a = "+a+" b = "+b);  
    }  
    Test(int a, float b)  
    {  
        System.out.println("a = "+a+" b = "+b);  
    }  
    public static void main (String args[])  
    {  
        int a = 10;   
        int b = 15;  
        Test test = new Test(a,b);  
    }  
}  
