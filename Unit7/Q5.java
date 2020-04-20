package Unit7;

import java.util.ArrayList;
public class Q5
{
    public static void main(String[] args) {
        ArrayList<String> syllables = new ArrayList<String>();
        syllables.add("LA");
        syllables.add(0, "DI");
        syllables.set(1, "TU");
        syllables.add("DA");
        syllables.add(2, syllables.get(0));
        syllables.remove(1);
        System.out.println(syllables.toString());
    }
}
/*
 * Prints [DI, DI, DA]
 * I think I just lost track of all the different methods being used so next 
 * time I should pay more attention and double check
 */