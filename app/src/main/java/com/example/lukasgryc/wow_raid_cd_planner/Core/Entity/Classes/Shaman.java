package com.example.lukasgryc.wow_raid_cd_planner.Core.Entity.Classes;

import com.example.lukasgryc.wow_raid_cd_planner.Core.Entity.Spell.SpellInfo;

/**
 * Created by lukas.gryc on 15.9.2017.
 */

public class Shaman extends CharacterClass {

    public Shaman(String name, Specialization specialization){
        super(name, specialization);
        initCooldowns();
    }

    private void initCooldowns(){
        cooldowns.add(new SpellInfo(SpellInfo.SpellEffectType.HEALING, null, null, 100000, 0, 0, SpellInfo.SpellCooldown.CD_3_MIN, 10));
    }
}
