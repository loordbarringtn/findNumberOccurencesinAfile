import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class readAndFind {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Integer> result = new ArrayList<>();
        int counter = 0;

        try (Scanner s = new Scanner(new FileReader("src/main/resources/dataset_91022.txt"))) {
            while (s.hasNext()) {
                result.add(s.nextInt());
            }
        }

        for (int i = 0; i< result.size(); i++){
            if (result.get(i)>=9999){
                counter++;
            }
        }

        System.out.println("Total occurrences: " + counter);
    }
}
