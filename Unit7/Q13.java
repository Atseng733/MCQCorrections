package Unit7;
import java.util.ArrayList;

/**
 * Write a description of class Q13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q13
{
    public static int sequentialSearch(ArrayList<Integer> elements, int target) {
        for (int j = 0; j < elements.size(); j++) {
            if (elements.get(j) == target)
            {
                return j;
            }
        }
        return -1;
    }
}
/*
 * Which of the following explains how replacing Line 3 with 
 * for (int j = (elements.size() - 1); j >= 0; j--) will affect the behavior 
 * of sequentialSearch?
 * 
 * Correct: The modified method will return the index of the last appearance 
 * of the target value in the list, or -1 if the target value does not appear 
 * in the list.
 * 
 * My choice: No effect
 * 
 * I didn't take into account that target could appear multiple times in the 
 * same array. Next time I should read all the answer choices so I can catch
 * mistakes like those.
 */
