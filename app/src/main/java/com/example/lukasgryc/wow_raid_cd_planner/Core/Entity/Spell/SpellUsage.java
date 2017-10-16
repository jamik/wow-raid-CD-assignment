package com.example.lukasgryc.wow_raid_cd_planner.Core.Entity.Spell;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukas.gryc on 14.10.2017.
 */

public class SpellUsage {

    private List<Integer> timeStampList = new ArrayList<>();

    public SpellUsage(){}

    public void addSpellUsed(int timeDiff, int cd){
        if(checkTimeStamp(timeDiff, cd))
            timeStampList.add(timeDiff, cd);
    }

    public void removeSpellUsed(int timeDiff){
        for(int ts : timeStampList)
            timeStampList.remove(ts);
    }

    public boolean isOnCD(int timeDiff, int cd){
        for(int ts : timeStampList){
            if(timeDiff - ts < cd)
                return false;
        }

        return true;
    }

    private boolean checkTimeStamp(int timeDiff, int cd){
        for(int ts : timeStampList){
            if(timeDiff >= (ts + cd))
                return true;
        }
        return false;
    }

}


