class Test   
{  
    Test(){
        int i =5;
        char x = 'y';
    }   
}  
public class Main   
{  
    public static void main (String args[])   
    {  
        Test test = new Test();
        for (Field field : test.getClass().getDeclaredFields()) {
        field.setAccessible(true);
        String name = field.getName();
        Object value = field.get(test);
        System.out.printf("%s: %s%n", name, value);
}   
        // System.out.println(test);  
    }  
}