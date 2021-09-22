package lessonone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author seths
 * This project contains code examples of the first lesson
 * it covers recursion (maybe sorting) and complexity analysis
 */
public class LessonOne {

    public LessonOne() throws FileNotFoundException {
        //System.out.println(factorial(5));


        //findFiles("C:\\Users\\seths\\Documents\\tutoring\\java\\filepractice");

        System.out.println(fibonacci(100));

    }

    public int fibonacci(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     *
     * @param n int --> some number which we wish to calculate the factorial of
     * @return n!
     * returns -1 to show error on numbers which cannot have the factorial operation applied to them
     */
    public int factorial(int n){
        if (n <= 1) { //base case, we need this to stop the recursion or it will run forever!
            return 1; //since 1! or 0! is 1, this is where we stop the recursive calls and return a concrete value
        }

        //n! = f(n) = n * (n-1)!
        // its very intuitive to make this recursive call as its already defined in terms of itself
        return n  * factorial(n - 1);
    }

    /**
     * recursively check through the filesystem of some directory looking for .txt files and all the contents to a new .txt file
     * this is also an introduction to depth-first search
     * @param folder
     */
    public void findFiles(String folder) throws FileNotFoundException {
        /*
        look for .txt files in the folder, if they exist add them
        look for folders
        for each folder, findFiles(folder)
         */

        File directory = new File(folder);
        String[] contents = directory.list();

        if(contents.length == 0) {
            System.out.println("The folder " + folder + " is empty.");
        }else {
            for(String s: contents) {
                if(s.contains(".txt")) {
                    readFile(directory.getAbsolutePath() + "\\" + s);
                }else {
                    //recursive call
                    findFiles(directory.getAbsolutePath() + "\\" + s);
                }
            }
        }
    }

    public void readFile(String name) throws FileNotFoundException {
        File f = new File(name);
        Scanner fileReader = new Scanner(f);
        while (fileReader.hasNextLine()) {
            System.out.println(fileReader.nextLine());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        LessonOne l = new LessonOne();


    }
}
