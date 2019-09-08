import java.util.Arrays;
import java.util.Comparator;

public class AnagramComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return(sortChars(o1).compareTo(sortChars(o2)));
    }

    String sortChars(String input){

        if(input == null || input == "" )
            return null;

        char[] inputCharArray = input.toCharArray();
        Arrays.sort(inputCharArray);
        return new String(inputCharArray);
    }
}
