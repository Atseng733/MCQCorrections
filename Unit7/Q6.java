package Unit7;

import java.util.ArrayList;
/**
 * Write a description of class Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q6
{
    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList<Integer>();
        vals.add(vals.size(), vals.size());
        vals.add(vals.size() - 1, vals.size() + 1);
        vals.add(vals.size() - 2, vals.size() + 2);
        System.out.println(vals.toString());
    }
}
/*
 * Here I was just confused about vals.size() because it wasn't stated anywhere
 * but now it makes sense that it'd just be zero and from that I'd get the rest.
 */