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

public class Item
{
    String description;
    String equippable;
    String weight;
    String value;
    public Item(String desc, String equ, String wei, String val){
        description = checkInput(desc);
        equippable = checkInput(equ);
        weight = checkInput(wei);
        value = checkInput(val);
    }
    public Item(String stringRep){
        String[] split = stringRep.split("|");
        description = split[0];
        equippable = split[1];
        weight = split[2];
        value = split[3];
    }

    public String toString(){
        String sep = "|";
        return description + sep +
               equippable + sep +
               weight + sep +
               value;
    }

    public String checkInput(String unsafe){
        String safe = "";
        for (int i = 0; i < unsafe.length(); i++){
            char s = unsafe.charAt(i);
            if (s == '|'){
                safe+="";
            }
            else {
                safe+= s;
            }
        };
        return safe;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getEquippable()
    {
        return equippable;
    }

    public void setEquippable(String equippable)
    {
        this.equippable = equippable;
    }

    public String getWeight()
    {
        return weight;
    }

    public void setWeight(String weight)
    {
        this.weight = weight;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }
}
