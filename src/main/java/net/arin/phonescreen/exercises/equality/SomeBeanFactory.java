package net.arin.phonescreen.exercises.equality;

import net.arin.phonescreen.doNotModify.equality.Pair;
import net.arin.phonescreen.doNotModify.equality.SomeBean;

public class SomeBeanFactory {
   private SomeBeanFactory(){}

   public static Pair<SomeBean, SomeBean> getBeansForEqualityShenanigans(){
      final SomeBean firstBean = new SomeBean();
      firstBean.setPropertyA(new String(""));
      firstBean.setPropertyB(127);
      final SomeBean secondBean = new SomeBean();
      secondBean.setPropertyA(new String(""));
      secondBean.setPropertyB(127);
      return new Pair<SomeBean, SomeBean>(firstBean, secondBean);
   }
}
