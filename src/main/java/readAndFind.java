import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class readAndFind {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Integer> numbersFromFileOne = new ArrayList<>();
        ArrayList<Integer> numbersFromFileTwo = new ArrayList<>();
        int counter = 0;
        int max = Integer.MIN_VALUE;

        try (Scanner s = new Scanner(new FileReader("src/main/resources/dataset_91022.txt"))) {
            while (s.hasNext()) {
                numbersFromFileOne.add(s.nextInt());
            }
        }

        for (int i = 0; i< numbersFromFileOne.size(); i++){
            if (numbersFromFileOne.get(i)>=9999){
                counter++;
            }
        }

        System.out.println("Total occurrences: " + counter);

        try (Scanner s = new Scanner(new FileReader("src/main/resources/dataset_91007.txt"))) {
            while (s.hasNext()) {
                numbersFromFileTwo.add(s.nextInt());
            }
        }

        for (int i = 0; i< numbersFromFileTwo.size(); i++){
            if (numbersFromFileTwo.get(i) > max) {
                max = numbersFromFileTwo.get(i);
            }
        }

        System.out.println("Largest number:" + max);

    }
}
