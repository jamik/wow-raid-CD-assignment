package com.example.lukasgryc.wow_raid_cd_planner.Core.Entity.Spell;

/**
 * Created by lukas.gryc on 25.9.2017.
 */

public class Spell {

    private SpellInfo       spellInfo;
    private boolean         isOnCd;
    private int             timeStarted;

    public Spell(SpellInfo spellInfo)
    {
        this.spellInfo = spellInfo;
        isOnCd = false;
        timeStarted = 0;
    }

    public SpellInfo getSpellInfo() {
        return spellInfo;
    }

    public void setSpellInfo(SpellInfo spellInfo) {
        this.spellInfo = spellInfo;
    }

    public boolean isOnCd() {
        return isOnCd;
    }

    public void setOnCd(boolean onCd) {
        isOnCd = onCd;
    }

    public int getTimeStarted() {
        return timeStarted;
    }

    public void setTimeStarted(int timeStarted) {
        this.timeStarted = timeStarted;
    }
}
