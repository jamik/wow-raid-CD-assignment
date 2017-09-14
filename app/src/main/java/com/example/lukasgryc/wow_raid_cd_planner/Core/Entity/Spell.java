package com.example.lukasgryc.wow_raid_cd_planner.Core.Entity;

/**
 * Created by lukas.gryc on 12.9.2017.
 */

public class Spell {

    public enum SpellEffectType {
        HEALING,
        REDUCTION,
        ABSORB,
        MANA,
        HP_BOOST
    };

    public enum SpellCooldown {
        CD_2_MIN(120),
        CD_3_MIN(180),
        CD_5_MIN(300);

        private int timeInSec;

        SpellCooldown(int val){
            timeInSec = val;
        }

        public int getTimeInSec(){
            return timeInSec;
        }
    };

    private SpellEffectType effect1;
    private SpellEffectType effect2;
    private SpellEffectType effect3;
    private int             effect1Val;
    private int             effect2Val;
    private int             effect3Val;
    private SpellCooldown   spellCd;
    private int             spellLasting;
    private boolean         isOnCd;
    private int             timeStarted;

    public Spell(SpellEffectType effect1, SpellEffectType effect2, SpellEffectType effect3,
                 int effect1Val, int effect2Val, int effect3Val, SpellCooldown spellCd, int spellLasting) {
        this.effect1 = effect1;
        this.effect2 = effect2;
        this.effect3 = effect3;
        this.effect1Val = effect1Val;
        this.effect2Val = effect2Val;
        this.effect3Val = effect3Val;
        this.spellCd = spellCd;
        this.spellLasting = spellLasting;
    }

    public SpellEffectType getEffect1() {
        return effect1;
    }

    public SpellEffectType getEffect2() {
        return effect2;
    }

    public SpellEffectType getEffect3() {
        return effect3;
    }

    public int getEffect1Val() {
        return effect1Val;
    }

    public int getEffect2Val() {
        return effect2Val;
    }

    public int getEffect3Val() {
        return effect3Val;
    }

    public SpellCooldown getSpellCd() {
        return spellCd;
    }

    public int getSpellLasting() {
        return spellLasting;
    }
}
