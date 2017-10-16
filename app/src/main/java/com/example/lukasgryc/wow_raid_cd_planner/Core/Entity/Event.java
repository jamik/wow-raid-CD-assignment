package com.example.lukasgryc.wow_raid_cd_planner.Core.Entity;

import com.example.lukasgryc.wow_raid_cd_planner.Core.Entity.Spell.Spell;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukas.gryc on 14.10.2017.
 */

public class Event {

    // TODO: IDs of events /spell ID?
    private int timeDiff;
    private List<Spell> raidCDs = new ArrayList<>();

    public Event(int timeDiff){
        this.timeDiff = timeDiff;
    }

    public List<Spell> getRaidCDs() {
        return raidCDs;
    }

    public boolean addRaidCD(Spell raidCD, int timeDiff) {
        if(!raidCD.isReady(timeDiff))
            return false;

        raidCD.addSpellUsage(timeDiff, raidCD.getSpellInfo().getSpellCd().getTimeInSec());
        raidCDs.add(raidCD);
        return true;
    }

    public void removeRaidCD(Spell raidCD){
        raidCD.removeUsage(timeDiff);
        raidCDs.remove(raidCD);
    }

    public void removeAllCDs(){
        for(Spell raidCD : raidCDs)
            raidCD.removeUsage(timeDiff);

        raidCDs.clear();
    }
}
