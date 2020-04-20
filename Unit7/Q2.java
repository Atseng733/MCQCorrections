package Unit7;

/*
 Consider the following statement, which is intended to create an ArrayList 
 named numbers that can be used to store Integer values.
 ArrayList<Integer> numbers = \/* missing code *\/;
 
 Which of the following can be used to replace \/* missing code *\/ so that the statement works as intended?

    I. new ArrayList()
    II. new ArrayList<Integer>
    III. new ArrayList<Integer>()
    */
public class Q2
{
    ArrayList<Integer> numbers = new ArrayList();
    ArrayList<Integer> numbers = new ArrayList<Integer>;
    ArrayList<Integer> numbers = new ArrayList<Integer>();
}
/*
 * The second option creates a compiler error so I and III are correct.
 */
