package string_problems;

public class DuplicateWord {

    /** INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */
    //main method
    public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        //Separating all the spaces using split() method from string class.
        String[] splitline = st.split(" ");
        // storing value of leangth in to integer variable wordscount
        int wordscount = splitline.length;
        //replaceing all the spaces with without space and storing in withoutSpaces variable
        String withoutSpaces = st.replace(" ", "");
        //storing the without spaces value using .length() method in integer numOfCHar variable
        int numOfChar = withoutSpaces.length();
        // printing out the average length of the sentence by dividing number of char to words in the sentence
        System.out.println("Average length of all the words are: " + numOfChar / wordscount);

    }

}
