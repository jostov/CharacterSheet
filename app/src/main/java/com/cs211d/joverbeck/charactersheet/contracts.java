package com.cs211d.joverbeck.charactersheet;

import android.provider.BaseColumns;

/**
 * Created by jostov on 5/5/15.
 */
public final class contracts {

    public contracts(){
    }

    public static abstract class SkillTable implements BaseColumns {
        public static final String TABLE_NAME = "skills";
        public static final String COLNAME_SKILL = "skillTitle";
        public static final String COLNAME_DESCRIPTION = "skillDescription";

    }
    public static abstract class FeatTable implements BaseColumns {
        public static final String TABLE_NAME = "feats";
        public static final String COLNAME_FEAT = "featTitle";
        public static final String COLNAME_DESCRIPTION = "featDescription";

    }
    public static abstract class SpellTable implements BaseColumns{
        public static final String TABLE_NAME = "spells";
        public static final String COLNAME_SPELL = "spellTitle";
        public static final String COLNAME_LEVEL = "level";
        public static final String COLNAME_TIME = "time";
        public static final String COLNAME_RANGE = "range";
        public static final String COLNAME_DURATION = "duration";
        public static final String COLNAME_RMAG = "rangeMagnitude";
        public static final String COLNAME_TMAG = "timeMagnitude";
        public static final String COLNAME_DMAG = "durationMagnitude";
        public static final String COLNAME_COMPONENTS = "components";
        public static final String COLNAME_DESCRIPTION = "description";
    }
    public static abstract class ItemTable implements BaseColumns{
        public static final String TABLE_NAME = "items";
        public static final String COLNAME_ITEM = "itemName";
        public static final String COLNAME_DESCRIPTION = "description";
        public static final String COLNAME_WEIGHT = "weight";
        public static final String COLNAME_VALUE = "value";
        public static final String COLNAME_EQUIPPABLE = "equippable";
    }


}
