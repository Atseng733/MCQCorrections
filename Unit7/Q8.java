package Unit7;
import java.util.ArrayList;

/**
 * Write a description of class Q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q8
{
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("mat");
        words.add("new");
        words.add("open");
        words.add("pet");
        int i = 0;
        while (i < words.size()) {
            words.remove(i);
            i++;
        }
        System.out.println(words.toString());
    }
}
/*
 * Prints [new, pet]
 * I wasn't thinking about the fact the when words are removed, words.size()
 * also decreases in value.
 */
