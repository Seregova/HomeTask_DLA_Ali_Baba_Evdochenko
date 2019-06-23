package by.htp.alibaba.command;

import by.htp.alibaba.dao.BadGuyDao;
import by.htp.alibaba.entity.BadGuy;

import java.util.ArrayList;

public class GetAllBadGuys extends Command {
    @Override
    public void execute(){
        ArrayList<BadGuy> badguys = BadGuyDao.getInstance().getAllBadGuys();

        System.out.println("All the bad guys");
        System.out.println(badguys);
    }
}