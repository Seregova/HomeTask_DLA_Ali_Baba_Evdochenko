package by.htp.alibaba.controller;

import by.htp.alibaba.command.*;

public class BadGuyController  {

        public void doExecute(String input){
            String operation = input;
            Command command = null;

            if (operation.equals("GetAllBadGuys")) {
                command = new GetAllBadGuys();
            }else if (operation.equals("GetMostTalentedBadGuy")) {
                command = new GetMostTalentedBadGuy();
            }else if (operation.equals("GetRandomBadGuy")) {
                command = new GetRandomBadGuy();
            }else {
                command = new EmptyCommand();
            }

            command.execute();
        }
}
