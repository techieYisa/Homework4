package com.company;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        Stack<String> history = new Stack<>();
        Stack<String> deleteHistory = new Stack<>();
        while (scanner.hasNext()) {
            System.out.println("Enter a number: ");
            String input = scanner.next();
            if (history.size() == 10) {
                System.exit(0);
            }

            else if(input.equals("copy")){
                if (history.empty()) {
                    continue;
                }
                String copy = history.peek();
                history.push(copy);
            }
            else if(input.equals("delete")){
                String delete = history.pop();
                deleteHistory.push(delete);
            }
            else if(input.equals("quit")){
                System.exit(0);
            }
            else if (input.equals("undo")){
                if(deleteHistory.empty()) {
                    continue;
                }
                    String capture = deleteHistory.pop();
                history.push(capture);
            }
            else {
                history.push(input);
            }
            System.out.println(history);
            System.out.println(deleteHistory);

        }
    }


}
