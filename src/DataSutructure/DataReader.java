package DataSutructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

        public static void main(String[] args) {

            // use bufferreader class, init bufferreader and filereader
            // along with required variables

            // given textile
            String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
            FileReader filereader = null;
            BufferedReader bufferreader = null;
            String line;
            String store = "";
            try {
                // read file as specified in question using FileReader
                filereader = new FileReader(textFile);
            } catch (FileNotFoundException e) {
                // handle file not found
                e.printStackTrace();
            }

            try {
                // using buffer reader api
                bufferreader = new BufferedReader(filereader);
                while ((line = bufferreader.readLine()) != null) {
                    // extract each line
                    store += line;

                }
            } catch (Exception e) {
                // handle exception
                System.out.println("Error unable to read");
            }

            // store each word from complete text in storeArray
            String[] storeArray = store.split(" ");

            // empty stack and list
            Stack<String> stack = new Stack<String>();
            LinkedList<String> list = new LinkedList<String>();

            // store each word to stack and list
            for (String element : storeArray) {
                // as specified in question stack add, push to add element
                list.add(element);
                stack.push(element);
            }

            // retrieve FIFO order form linked list
            System.out.println("LinkedList FIFO : ");

            System.out.print (list.remove() + " ");
            while (!list.isEmpty())
                System.out.print (list.remove() + " ");
            System.out.println();

            // since stack if LIFO
            System.out.println("Stack FILO : ");

            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + "  ");
            }
            // formatted output
            System.out.println();
        }

    }

