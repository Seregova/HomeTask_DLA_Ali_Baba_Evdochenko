package by.htp.alibaba.command;

public class EmptyCommand extends Command {

    @Override
    public void execute(){
        System.out.println("Wrong command.Please try again");
    }
}
