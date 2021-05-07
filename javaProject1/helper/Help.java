package helper;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class Help {

    private final static String ROOT = "database";
    public final static String EMPLOYEE_PATH = Help.ROOT + "/employees.txt";
    public final static String CUSTOMER_PATH = Help.ROOT + "/customers.txt";
    public final static String ACCOUNT_PATH = Help.ROOT + "/accounts.txt";
    
    public static void echo(String str) {
        System.out.print(str);
    }
    
    public static void echo(int str) {
        System.out.print(str);
    }
    
    public static void echo(double str) {
        System.out.print(str);
    }
    
    public static void echoLn(String str) {
        System.out.println(str);
    }
    
    public static void echoLn(int str) {
        System.out.println(str);
    }
    
    public static void echoLn(double str) {
        System.out.println(str);
    }

    public static void generateOptionsList(String options[]) {
        for (int i = 0; i < options.length; i++) {
            Help.echoLn((i + 1) + ". " + options[i]);
        }

        Help.echo("Enter an Option number: ");
    }

    // public static void clearScreen() {
    //     System.out.print("\033[H\033[2J");
    //     System.out.flush();
    // }

    public static String readString() {

        try {
            String line = null;
            Scanner input = new Scanner(System.in);
            if (input.hasNextLine()) {
                line = input.nextLine();
                // Help.echoLn("\n\nString ==> " + line + " DONE!!");
            } else if (!input.hasNextLine()) {
                input.close();
                line = Help.readString();
            } else {
                input.close();
                throw new IOException();
            }
            return line;
        } catch (InputMismatchException err) {
            Help.echoLn("\nError: InputMismatchException\nTry to input a UTF-8 format String\n");
            // err.printStackTrace();
        } catch (IOException err) {
            Help.echoLn("\nError: IOException!!\n");
            err.printStackTrace();
        } catch (Exception err) {
            Help.echoLn("\nError: Exception!!\n");
            err.printStackTrace();
        }

        return null;
    }

    public static int readInteger() {
        try {
            int line = -1;
            Scanner input = new Scanner(System.in);
            if (input.hasNextLine()) {
                line = input.nextInt();
                // Help.echoLn("\n\nString ==> " + line + " DONE!!");
            } else if (!input.hasNextLine()) {
                input.close();
                line = Help.readInteger();
            } else {
                input.close();
                throw new IOException();
            }
            return line;
        } catch (InputMismatchException err) {
            Help.echoLn("\nError: InputMismatchException\nTry to input a One digit Integer Number\n");
            // err.printStackTrace();
        } catch (IOException err) {
            Help.echoLn("\nError: IOException!!\n");
            err.printStackTrace();
        } catch (Exception err) {
            Help.echoLn("\nError: Exception!!\n");
            err.printStackTrace();
        }

        return -1;
    }

    public static double readDouble() {
        try {
            double line = -1.0;
            Scanner input = new Scanner(System.in);
            if (input.hasNextLine()) {
                line = input.nextDouble();
                // Help.echoLn("\n\nString ==> " + line + " DONE!!");
            } else if (!input.hasNextLine()) {
                input.close();
                line = Help.readDouble();
            } else {
                input.close();
                throw new IOException();
            }
            return line;
        } catch (InputMismatchException err) {
            Help.echoLn("\nError: InputMismatchException\nTry to input a One digit Float Number\n");
            // err.printStackTrace();
        } catch (IOException err) {
            Help.echoLn("\nError: IOException!!\n");
            err.printStackTrace();
        } catch (Exception err) {
            Help.echoLn("\nError: Exception!!\n");
            err.printStackTrace();
        }
        return -1.0;
    }

    public static void createFile() {

    }

    public static void writeFile() {
        
    }

    public static ArrayList<String> readFile(String path) {
        try {
            ArrayList<String> line = new ArrayList<String>();
            Scanner file = new Scanner(new File(path));
            while(file.hasNextLine()){
                line.add(file.nextLine());
            }

            return line;
        } catch (FileNotFoundException err) {
            Help.echoLn("\nError: FileNotFoundException\n");
            // err.printStackTrace();
        } catch (Exception err) {
            Help.echoLn("\nError: Exception!!\n");
            err.printStackTrace();
        }
         

        return null;
    }
}