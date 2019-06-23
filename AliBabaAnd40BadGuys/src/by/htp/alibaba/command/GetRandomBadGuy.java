package by.htp.alibaba.command;

import by.htp.alibaba.dao.BadGuyDao;
import by.htp.alibaba.entity.BadGuy;

public class GetRandomBadGuy  extends Command {

    @Override
    public void execute(){
        BadGuy badguy = BadGuyDao.getInstance().getRandomBadGuy();
        System.out.println("Random Bad guy:");
        System.out.println(badguy);
    }
}