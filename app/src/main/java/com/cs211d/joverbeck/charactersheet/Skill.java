package com.cs211d.joverbeck.charactersheet;

/**
 * Created by jostov on 5/5/15.
 */
public class Skill {
    Long skillId;
    int bonus;
    SkillGeneric skillData;

    public Skill(long id, int bon){
        skillId = id;
        bonus = bon;
        //create skillgeneric from database or create error.
    }



    public int getBonus() {
        return bonus;
    }

    public Long getSkillId() {
        return skillId;
    }

    public class SkillGeneric{
        String skill;
        String description;
        public SkillGeneric(String name, String desc){
            skill = name;
            description = desc;
        }
        public SkillGeneric(String fromStr){
            this(fromStr.split("|")[0], fromStr.split("|")[1]);
        }

        public String toString(){
            return skill + "|" + description;
        }
    }


}
