package notebook.resources.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class DateUtil {
   private final static String DATE_PATTERN = "dd-MM-yyyy";
   private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_PATTERN, Locale.ENGLISH);

   public static String format(LocalDate date) {
      if (date == null) {
         return null;
      }
      return DATE_FORMATTER.format(date);
   }

   public static LocalDate parse(String dateString) {
      try {
         return DATE_FORMATTER.parse(dateString, LocalDate::from);
      } catch (DateTimeParseException e) {
         return null;
      }
   }

   public static boolean validDate(String dateString) {
      return DateUtil.parse(dateString) != null;
   }
}