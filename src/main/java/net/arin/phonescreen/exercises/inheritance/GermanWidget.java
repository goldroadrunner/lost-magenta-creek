package net.arin.phonescreen.exercises.inheritance;

import net.arin.phonescreen.doNotModify.inheritance.AbstractWidget;
import net.arin.phonescreen.doNotModify.inheritance.CountryOfOrigin;
import net.arin.phonescreen.doNotModify.inheritance.Widget;

public class GermanWidget extends AbstractWidget implements Widget {
    @Override
    public CountryOfOrigin getCountryOfOrigin() {
        return CountryOfOrigin.GERMANY;
    }
}
