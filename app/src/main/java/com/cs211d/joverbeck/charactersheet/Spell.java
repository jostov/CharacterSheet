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

public class Spell
{
    int level;
    int time;
    int range;
    int duration;
    String durationMagnitude;
    String rangeMagnitude;
    String timeMagnitude;
    String components;
    String description;

    public Spell(int lvl, int tme, int rnge, int dura, String duraMag, String rngMag, String tmeMag, String comps, String dscr){
        level = lvl;
        time = tme;
        range = rnge;
        duration = dura;
        durationMagnitude = checkInput(duraMag);
        rangeMagnitude = checkInput(rngMag);
        timeMagnitude = checkInput(tmeMag);
        components = checkInput(comps);
        description = checkInput(dscr);
    }
    public Spell(String stringRep){
        String[] safe = stringRep.split("|");
        level = Integer.parseInt(safe[0]);
        time = Integer.parseInt(safe[1]);
        range = Integer.parseInt(safe[2]);
        duration = Integer.parseInt(safe[3]);
        durationMagnitude = safe[4];
        rangeMagnitude = safe[5];
        timeMagnitude = safe[6];
        components = safe[7];
        description = safe[8];
}
    //inputSanity
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

    public String toString(){
        String retString;
        String semiSep = "|";
        retString = level + semiSep
                + time + semiSep
                + range + semiSep
                + duration + semiSep
                + durationMagnitude + semiSep
                + rangeMagnitude + semiSep
                + timeMagnitude + semiSep
                + components + semiSep
                + description + semiSep;
        return retString;
    }

    //Getters and Setters
    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public int getTime()
    {
        return time;
    }

    public void setTime(int time)
    {
        this.time = time;
    }

    public int getRange()
    {
        return range;
    }

    public void setRange(int range)
    {
        this.range = range;
    }

    public int getDuration()
    {
        return duration;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    public String getDurationMagnitude()
    {
        return durationMagnitude;
    }

    public void setDurationMagnitude(String durationMagnitude)
    {
        this.durationMagnitude = durationMagnitude;
    }

    public String getRangeMagnitude()
    {
        return rangeMagnitude;
    }

    public void setRangeMagnitude(String rangeMagnitude)
    {
        this.rangeMagnitude = rangeMagnitude;
    }

    public String getTimeMagnitude()
    {
        return timeMagnitude;
    }

    public void setTimeMagnitude(String timeMagnitude)
    {
        this.timeMagnitude = timeMagnitude;
    }

    public String getComponents()
    {
        return components;
    }

    public void setComponents(String components)
    {
        this.components = components;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
