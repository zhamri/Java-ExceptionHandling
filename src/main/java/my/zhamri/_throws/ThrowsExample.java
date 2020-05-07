package my.zhamri._throws;

import java.io.FileNotFoundException;
import java.io.FileReader;

class ThrowsExample {

    public void readTextFile() throws FileNotFoundException {
        FileReader file = new FileReader("File1.txt");
    }

    public void readFile() throws FileNotFoundException {
        readTextFile();
    }

    public static void main(String[] args) {
        ThrowsExample throwsExample = new ThrowsExample();
        try {
            throwsExample.readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }
    }
}
