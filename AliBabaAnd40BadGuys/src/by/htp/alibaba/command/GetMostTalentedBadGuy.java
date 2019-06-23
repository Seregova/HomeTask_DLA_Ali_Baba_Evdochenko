package by.htp.alibaba.command;

import by.htp.alibaba.dao.BadGuyDao;
import by.htp.alibaba.entity.BadGuy;

public class GetMostTalentedBadGuy  extends Command {

        @Override
        public void execute(){
            BadGuy badguy = BadGuyDao.getInstance().getMostTalentedBadGuy();
            System.out.println("The most talented bad guy is:");
            System.out.println(badguy);
        }
    }
