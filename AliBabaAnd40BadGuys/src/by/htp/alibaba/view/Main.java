package by.htp.alibaba.view;

import by.htp.alibaba.controller.BadGuyController;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            BadGuyController controller = new BadGuyController();

            while (true){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter command");
                String input = sc.next();

//                System.out.println(input);

                controller.doExecute(input);
            }
        }
}




