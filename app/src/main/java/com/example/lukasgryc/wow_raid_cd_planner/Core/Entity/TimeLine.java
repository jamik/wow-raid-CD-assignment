package com.example.lukasgryc.wow_raid_cd_planner.Core.Entity;

import com.example.lukasgryc.wow_raid_cd_planner.Core.Entity.Spell.Spell;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lukas.gryc on 14.10.2017.
 */

public class TimeLine {

    private Map<Integer, Event> events = new HashMap<>();

    public TimeLine(){

    }

    public Map<Integer, Event> getEvents() {
        return events;
    }

    public void addEvent(Integer timeDiff, Event event){
        events.put(timeDiff, event);
    }

    public void removeEvent(Integer timeDiff){

    }
}
