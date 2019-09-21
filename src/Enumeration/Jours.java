package Enumeration;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public enum Jours {
    LUNDI(false, "Pleure"),
    MARDI(false, "Rigole"),
    MERCREDI(false, "Rigole"),
    JEUDI(false, "Triste"),
    VENDREDI(false, "Triste"),
    SAMEDI(true, "Sourit"),
    DIMANCHE(true, "Sourit");

    private final boolean isWeekEnd;
    private final String smiley;

    Jours(boolean isWeekEnd, String smiley) {
        this.isWeekEnd = isWeekEnd;
        this.smiley = smiley;
    }

    @Override
    public String toString() {
        return "Jours{" +
                "Jour " + name() +
                ", isWeekEnd= " + isWeekEnd +
                ", smiley='" + smiley + '\'' +
                '}';
    }

    public boolean isWeekEnd() {
        return isWeekEnd;
    }

    public String getSmiley() {
        return smiley;
    }
}