import java.util.ArrayList;
import java.util.Arrays;

public class Exceptions {
    public static void ExceptionsTest() {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            } catch (ClassCastException e) {
                System.err.println("Something went wrong in this index: " + i + " The value of the error is: "+myList.get(i));
            }
        }
    }
    public static void main(String[] args){
        ExceptionsTest();
    }
}
