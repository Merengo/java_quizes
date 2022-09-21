public class StringCount
{   
    static String myString = "This is sample string";
    static int count = 0;
    public static void main(String args[])
    { 
       

        for (int i=0;i<myString.length();i++)
        {
             count++;
        
        }
         System.out.println("number of characters is "+ count);

    }

}




