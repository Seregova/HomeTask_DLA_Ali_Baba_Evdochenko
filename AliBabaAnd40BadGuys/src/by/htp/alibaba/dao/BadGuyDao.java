package by.htp.alibaba.dao;

import by.htp.alibaba.entity.BadGuy;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BadGuyDao  implements IBadGuyDao {
        //Singleton
        private static BadGuyDao badGuyDao;
        private BadGuyDao(){
        }
        public static BadGuyDao getInstance(){
            if (badGuyDao==null){
                badGuyDao = new BadGuyDao();
            }
            return badGuyDao;
        }


        @Override
        public ArrayList<BadGuy> getAllBadGuys() {
            return readAllBadGuys();
        }

        @Override
        public BadGuy getRandomBadGuy() {
            ArrayList<BadGuy> list = readAllBadGuys();
            Random rand = new Random();
          //  System.out.println(rand.nextInt(list.size()));
            return list.get(rand.nextInt(list.size()));
        }

        @Override
        public BadGuy getMostTalentedBadGuy() {
            ArrayList<BadGuy> list = readAllBadGuys();
            BadGuy bg = null;
            int maxValue = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getValue() >= maxValue) {
                    bg = list.get(i);
                    maxValue = list.get(i).getValue();
                }
            }
            return bg;
        }

        private ArrayList<BadGuy> readAllBadGuys(){
            ArrayList<BadGuy> list = new ArrayList<BadGuy>();
            InputStream inputStream = BadGuyDao.class.getClassLoader().getResourceAsStream("40badguys.txt");
            try{
                BufferedReader br = null;
                br = new BufferedReader(new InputStreamReader(inputStream));
                String line = null;
                while ((line = br.readLine()) != null) {
                    //System.out.println("Line entered : " + line);
                    String[] splittedLine = line.split(",");
                    BadGuy bg = new BadGuy(splittedLine[0], Integer.parseInt(splittedLine[1]));
                    list.add(bg);
                }
            } catch (Exception exception) {
                System.out.println("Exception");
            }
            return list;
        }
}

