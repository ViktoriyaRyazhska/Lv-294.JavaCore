package notebook.resources.util;

import notebook.objects.Lang;

import java.util.Locale;

public class LocaleManager {
   public static final Locale UA_LOCALE = new Locale("uk");
   public static final Locale EN_LOCALE = new Locale("en");

   private static Lang currentLang;

   public static Lang getCurrentLang() {
      return currentLang;
   }

   public static void setCurrentLang(Lang currentLang) {
      LocaleManager.currentLang = currentLang;
   }
}
