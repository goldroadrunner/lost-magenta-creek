package net.arin.phonescreen.exercises.inheritance;

import net.arin.phonescreen.doNotModify.inheritance.AbstractWidget;
import net.arin.phonescreen.doNotModify.inheritance.CompositeWidget;
import net.arin.phonescreen.doNotModify.inheritance.CountryOfOrigin;
import net.arin.phonescreen.doNotModify.inheritance.Widget;

import java.util.List;

public class WidgetFactory {
   private WidgetFactory(){}

   public static CompositeWidget getNorthAmericanAndEuropeanWidget(){
      final CompositeWidget compositeWidget = new NorthAmericanAndEuropeanWidget();
      compositeWidget.getComponents().add(new CanadianWidget());
      compositeWidget.getComponents().add(new GermanWidget());
      return compositeWidget;
   }

   public static CompositeWidget getAsianAndNorthAmericanWidget(){
      final CompositeWidget compositeWidget = new AsianAndNorthAmericanWidget();
      compositeWidget.getComponents().add(new JapaneseWidget());
      compositeWidget.getComponents().add(new CanadianWidget());
      return compositeWidget;
   }
}
