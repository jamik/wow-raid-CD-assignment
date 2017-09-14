package com.example.lukasgryc.wow_raid_cd_planner.Core.Entity.Classes;

import com.example.lukasgryc.wow_raid_cd_planner.Core.Entity.Spell;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukas.gryc on 14.9.2017.
 */

public class CharacterClass {

    public enum Specialization{

        ELEMENTAL,
        ENHANCEMENT,
        RESTORATION,

        HAVOC,
        VENGENCE,

        PROTECTION,
        ARMS,
        FURY,

        SHADOW,
        HOLY,
        DISCO,

        RETRI,

        BLOOD,
        FROST,
        UNHOLY,

        MARKSMAN,
        BEASTMASTER,
        SURVIVAL,

        BALANCE,
        FERAL,
        GUARDIAN,

        BREWMASTER,
        WINDWALKER,

        ASSASIN,
        SUBTLETY,
        OUTLAW,

        FIRE,
        ACRANE,

        DEMONOLOGY,
        AFFLICTION,
        DESTRUCTION
    };

    private String name;
    private Specialization specialization;
    private List<Spell> cooldowns = new ArrayList<Spell>();

    public CharacterClass(String name, Specialization specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public List<Spell> getCooldowns() {
        return cooldowns;
    }
    
}
