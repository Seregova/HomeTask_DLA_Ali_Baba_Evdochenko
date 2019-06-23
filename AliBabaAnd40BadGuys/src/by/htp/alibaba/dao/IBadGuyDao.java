package by.htp.alibaba.dao;

import by.htp.alibaba.entity.BadGuy;

import java.util.ArrayList;


public interface IBadGuyDao {

        ArrayList<BadGuy> getAllBadGuys();
        BadGuy getRandomBadGuy();
        BadGuy getMostTalentedBadGuy();
    }