package JamesKo;

/**
 *
 * Key Concepts: Looping through ArrayLists
 * Problem: We have to create a class that has a list that can be manipulated by the user
 *
 */
public class Runner {

    public static void main(String[] args) {
        /**
         * Creates the WordList animals, and adds some animals
         */
        WordList animals = new WordList();
        animals.addWords("cat");
        animals.addWords("mouse");
        animals.addWords("frog");
        animals.addWords("dog");
        animals.addWords("dog");
        animals.addWords("giraffe");
        animals.addWords("lion");
        animals.addWords("fish");
        animals.addWords("dolphin");

        /**
         * Prints the number of animals whose String is the same length as 4, 3, and 2
         */
        System.out.println(animals.numWordsOfLength(7));
        System.out.println(animals.numWordsOfLength(6));
        System.out.println(animals.numWordsOfLength(5));
        System.out.println(animals.numWordsOfLength(4));
        System.out.println(animals.numWordsOfLength(3));
        System.out.println(animals.numWordsOfLength(2));

        /**
         * Removes the words of length 4, 3, and 2
         * Print it after each time
         */
        animals.removeWordsOfLength(7);
        System.out.println(animals.toString());
        animals.removeWordsOfLength(6);
        System.out.println(animals.toString());
        animals.removeWordsOfLength(5);
        System.out.println(animals.toString());
        animals.removeWordsOfLength(4);
        System.out.println(animals.toString());
        animals.removeWordsOfLength(3);
        System.out.println(animals.toString());
        animals.removeWordsOfLength(2);
        System.out.println(animals.toString());
    }
}