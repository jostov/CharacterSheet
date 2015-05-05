package com.cs211d.joverbeck.charactersheet;

/**
 * Name: Joseph Overbeck
 * Professor: Dr. Moghtanei
 * Class: CS211D
 * Assignment: 05
 * Fun Fact: Ants cannot be seriously injured from impact
 * with the ground after being dropped from any height,
 * because they simply don't have enough mass!
 */

public class Feat
{
    String name;
    String description;
    public Feat(String nam, String desc){

        name = nam;
        description = desc;

    }

    public Feat(String fromStr){
        fromStr.split("|");
    }

    public String toString(){
        return name + "|" + description;
    }


}
