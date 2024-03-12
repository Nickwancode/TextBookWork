package phraseomatic;

public class Main {
    public static void main(String[] args) {
        // make three sets of words to choose from. Add your own!
        String [] wordListOne = {"Blue","Black"
                ,"Yellow","Green"};
        String[] wordListTwo = {"2021", "2022",
                "2023", "2024"};
        String [] wordListThree = {"Honda", "Chrysler",
                "Ford", "BMW"};
// find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
// generate three random numbers
        int rand1 = (int) (Math.random () * oneLength);
        int rand2 = (int) (Math. random () * twoLength);
        int rand3 = (int) (Math. random () * threeLength);
// now build a phrase
        String phrase = wordListOne [rand1] + " " + wordListTwo[rand2]
                + " " + wordListThree [rand3];
// print out the phrase
        System.out.println ("My Future girlfreinds first car was a " + phrase);
    }
}


