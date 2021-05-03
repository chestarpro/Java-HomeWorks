package com.company.A;

import java.util.Arrays;

public class Keyboard {
    private String[]arrayLayouts;
    private boolean light;
    private boolean numPad;

    public Keyboard() {}

    public Keyboard(String[] arrayLayouts, boolean light, boolean numPad) {
        this.arrayLayouts = arrayLayouts;
        this.light = light;
        this.numPad = numPad;
    }

    public String[] getArrayLayouts() {
        return arrayLayouts;
    }

    public void setArrayLayouts(String[] arrayLayouts) {
        this.arrayLayouts = arrayLayouts;
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    public boolean isNumPad() {
        return numPad;
    }

    public void setNumPad(boolean numPad) {
        this.numPad = numPad;
    }

    public String printBoolean(boolean b) {
        if (!b) return "No";
         else return "Yes";
    }

    @Override
    public String toString() {
        String strLayouts = Arrays.toString(this.arrayLayouts);
        return String.format("layout (%s), backlight (%s), numpad (%s)",
                strLayouts.substring(1, strLayouts.length() - 1),
                printBoolean(this.light), printBoolean(this.numPad));
    }
}
