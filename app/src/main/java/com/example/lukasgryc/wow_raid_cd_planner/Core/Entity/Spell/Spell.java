package com.example.lukasgryc.wow_raid_cd_planner.Core.Entity.Spell;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukas.gryc on 25.9.2017.
 */

public class Spell {

    private SpellInfo       spellInfo;
    private int             timeStarted;
    SpellUsage              useHistory;


    public Spell(SpellInfo spellInfo)
    {
        this.spellInfo = spellInfo;
        timeStarted = 0;
    }

    public SpellInfo getSpellInfo() {
        return spellInfo;
    }

    public void setSpellInfo(SpellInfo spellInfo) {
        this.spellInfo = spellInfo;
    }

    public boolean isReady(int timeDiff) {
        if(useHistory.isOnCD(timeDiff, spellInfo.getSpellCd().getTimeInSec()))
            return false;

        return true;
    }

    public int getTimeStarted() {
        return timeStarted;
    }

    public void setTimeStarted(int timeStarted) {
        this.timeStarted = timeStarted;
    }

    public void addSpellUsage(int timeDiff, int cd){
        useHistory.addSpellUsed(timeDiff, cd);
    }

    public void removeUsage(int timeDiff){
        useHistory.removeSpellUsed(timeDiff);
    }
}
