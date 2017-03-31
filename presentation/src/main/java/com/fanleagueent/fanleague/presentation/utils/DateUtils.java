package com.fanleagueent.fanleague.presentation.utils;

import android.content.Context;

/**
 * Created by alexeyverbitskiy on 11/30/16.
 */

public class DateUtils {

  private Context context;
  //private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("", Locale.ENGLISH);
  //
  //private static final String GAMEWEEK_DAY_FORMAT = "MMMM dd"; // January 17
  //private static final String GAMEWEEK_TIME_COUNTDOWN_FORMAT = "hh:mm:ss"; // 15:00:35
  ////private static final String MESSAGE_TIME_FORMAT = "hh:mm a"; // 03:00 am
  //
  //private static final String TIME_FORMAT = "HH:mm"; // 15:00
  //private static final String DEFAULT_SHORT_DATE_FORMAT = "dd MMM y"; // 10 Jan 2017
  //private static final String DEFAULT_SHORT_DATE_WITHOUT_YEAR_FORMAT = "dd MMM"; // 10 Jan
  //private static final String DEFAULT_DATE_FORMAT = "dd MMMM y"; // 10 January 2017
  //private static final String BIRTHDAY_DATE_FORMAT = "yyyy-MM-dd"; // 2017-01-12
  //private static final String SIMPLE_DATE_FORMAT = "yyyy-MM-dd"; // 2017-01-12

  public DateUtils(Context context) {
    this.context = context;
  }

  //public String getGameDate(Date date) {
  //  simpleDateFormat.applyPattern(DEFAULT_DATE_FORMAT);
  //  return simpleDateFormat.format(date);
  //}
  //
  //public String getWeekDay(Date date) {
  //  simpleDateFormat.applyPattern(GAMEWEEK_DAY_FORMAT);
  //  return simpleDateFormat.format(date);
  //}
  //
  //public String getTime(Date date) {
  //  simpleDateFormat.applyPattern(TIME_FORMAT);
  //  return simpleDateFormat.format(date);
  //}
  //
  //public String getCountdownTime(Date date) {
  //  simpleDateFormat.applyPattern(GAMEWEEK_TIME_COUNTDOWN_FORMAT);
  //  return simpleDateFormat.format(date);
  //}
  //
  //public String getPunditPublishDate(Date date) {
  //  simpleDateFormat.applyPattern(DEFAULT_DATE_FORMAT);
  //  return simpleDateFormat.format(date);
  //}
  //
  //public String getDefaultDate(Date date) {
  //  simpleDateFormat.applyPattern(DEFAULT_DATE_FORMAT);
  //  return simpleDateFormat.format(date);
  //}
  //
  //public String getShortDefaultDate(Date date) {
  //  simpleDateFormat.applyPattern(DEFAULT_SHORT_DATE_FORMAT);
  //  return simpleDateFormat.format(date);
  //}
  //
  //public String getShortDefaultDateWithoutYear(Date date) {
  //  simpleDateFormat.applyPattern(DEFAULT_SHORT_DATE_WITHOUT_YEAR_FORMAT);
  //  return simpleDateFormat.format(date);
  //}
  //
  //public String getTimeFormat(Date date) {
  //  simpleDateFormat.applyPattern(TIME_FORMAT);
  //  return simpleDateFormat.format(date);
  //}
  //
  //public String getTimeGMT(Date date) {
  //  SimpleDateFormat dateFormat = new SimpleDateFormat(TIME_FORMAT, Locale.ENGLISH);
  //  dateFormat.applyPattern(TIME_FORMAT);
  //  dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
  //  return dateFormat.format(date);
  //}
  //
  //public String getTimeGMTFormat(Date date) {
  //  SimpleDateFormat dateFormat = new SimpleDateFormat(TIME_FORMAT, Locale.ENGLISH);
  //  dateFormat.applyPattern(TIME_FORMAT);
  //  dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
  //  return context.getString(R.string.gmt_time, dateFormat.format(date));
  //}
  //
  //public String getGameStartDateFormat(Date date) {
  //  // 10 Jan 2017 at 15:00 GMT
  //  SimpleDateFormat dateFormat = new SimpleDateFormat(DEFAULT_SHORT_DATE_WITHOUT_YEAR_FORMAT, Locale.ENGLISH);
  //  dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
  //  simpleDateFormat.applyPattern(TIME_FORMAT);
  //  simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
  //  return context.getString(R.string.format_game_start_date, dateFormat.format(date),
  //      simpleDateFormat.format(date));
  //}
  //
  //public String getMessageTime(long timestamp) {
  //  Calendar date = Calendar.getInstance(Locale.ENGLISH);
  //  date.setTimeInMillis(timestamp * 1000);
  //  simpleDateFormat.applyPattern(TIME_FORMAT);
  //
  //  return simpleDateFormat.format(date.getTime());
  //}
  //
  //public String getMessageTimeFormat(long timestamp) {
  //  Calendar now = Calendar.getInstance(Locale.ENGLISH);
  //  now.setTimeInMillis(System.currentTimeMillis());
  //
  //  Calendar messageDate = Calendar.getInstance(Locale.ENGLISH);
  //  messageDate.setTimeInMillis(timestamp * 1000);
  //
  //  int daysDifference = now.get(Calendar.DAY_OF_YEAR) - messageDate.get(Calendar.DAY_OF_YEAR);
  //
  //  if (now.get(Calendar.YEAR) > messageDate.get(Calendar.YEAR) || daysDifference > 10) {
  //    return getShortDefaultDate(messageDate.getTime());
  //  }
  //
  //  if (now.get(Calendar.DAY_OF_YEAR) != messageDate.get(Calendar.DAY_OF_YEAR)) {
  //    return context.getResources()
  //        .getQuantityString(R.plurals.make_days_ago, daysDifference, daysDifference);
  //  }
  //
  //  int hourDifference = now.get(Calendar.HOUR_OF_DAY) - messageDate.get(Calendar.HOUR_OF_DAY);
  //
  //  if (hourDifference > 0) {
  //    return context.getResources()
  //        .getQuantityString(R.plurals.make_hours_ago, hourDifference, hourDifference);
  //  }
  //
  //  int minuteDifference = now.get(Calendar.MINUTE) - messageDate.get(Calendar.MINUTE);
  //
  //  return minuteDifference == 0 ? context.getString(R.string.just_now) : context.getResources()
  //      .getQuantityString(R.plurals.make_minutes_ago, minuteDifference, minuteDifference);
  //}
  //
  //public String getConversationTimeFormat(long timestamp) {
  //  Calendar now = Calendar.getInstance(Locale.ENGLISH);
  //  now.setTimeInMillis(System.currentTimeMillis());
  //
  //  Calendar messageDate = Calendar.getInstance(Locale.ENGLISH);
  //  messageDate.setTimeInMillis(timestamp * 1000);
  //
  //  int yearNow = now.get(Calendar.YEAR);
  //  int yearMessage = messageDate.get(Calendar.YEAR);
  //
  //  if (yearNow == yearMessage) {
  //    return getShortDefaultDateWithoutYear(messageDate.getTime());
  //  }
  //
  //  return getShortDefaultDate(messageDate.getTime());
  //}
  //
  //public String getBirthdayDateFormat(Date date) {
  //  simpleDateFormat.applyPattern(DEFAULT_DATE_FORMAT);
  //  return simpleDateFormat.format(date);
  //}
  //
  //public String getBirthdayDateFormat(int year, int month, int dayOfMonth) {
  //  simpleDateFormat.applyPattern(DEFAULT_DATE_FORMAT);
  //  return simpleDateFormat.format(new GregorianCalendar(year, month, dayOfMonth).getTime());
  //}
  //
  //public String convertToBirthdayFormat(String birthday) {
  //  simpleDateFormat.applyPattern(DEFAULT_DATE_FORMAT);
  //  try {
  //    Date birthdayDate = simpleDateFormat.parse(birthday);
  //    simpleDateFormat.applyPattern(BIRTHDAY_DATE_FORMAT);
  //    return simpleDateFormat.format(birthdayDate);
  //  } catch (ParseException e) {
  //    e.printStackTrace();
  //  }
  //
  //  return "";
  //}
  //
  //public long convertDateToLongFormat(long dateTimestamp) {
  //  simpleDateFormat.applyPattern(SIMPLE_DATE_FORMAT);
  //  try {
  //    Calendar dateOne = Calendar.getInstance(Locale.ENGLISH);
  //    dateOne.setTimeInMillis(dateTimestamp * 1000);
  //    String date = simpleDateFormat.format(dateOne.getTime());
  //    return simpleDateFormat.parse(date).getTime();
  //  } catch (ParseException e) {
  //    e.printStackTrace();
  //  }
  //
  //  return -1l;
  //}
  //
  //public long differenceDay(long timestamp, long timestamp1) {
  //  Calendar dateOne = Calendar.getInstance(Locale.ENGLISH);
  //  dateOne.setTimeInMillis(timestamp * 1000);
  //
  //  Calendar dateTwo = Calendar.getInstance(Locale.ENGLISH);
  //  dateTwo.setTimeInMillis(timestamp1 * 1000);
  //
  //  long diffTime = dateOne.getTime().getTime() - dateTwo.getTime().getTime();
  //
  //  return TimeUnit.MILLISECONDS.toDays(diffTime);
  //}
  //
  //public String getActivityyHistoryTimeFormat(Date timestamp) {
  //  Calendar now = Calendar.getInstance(Locale.ENGLISH);
  //  now.setTimeInMillis(System.currentTimeMillis());
  //
  //  Calendar messageDate = Calendar.getInstance(Locale.ENGLISH);
  //  messageDate.setTime(timestamp);
  //
  //  int daysDifference = now.get(Calendar.DAY_OF_YEAR) - messageDate.get(Calendar.DAY_OF_YEAR);
  //
  //  if (now.get(Calendar.YEAR) > messageDate.get(Calendar.YEAR) || daysDifference > 10) {
  //    return getShortDefaultDate(messageDate.getTime());
  //  }
  //
  //  if (now.get(Calendar.DAY_OF_YEAR) != messageDate.get(Calendar.DAY_OF_YEAR)) {
  //    return context.getResources()
  //        .getQuantityString(R.plurals.make_days_ago, daysDifference, daysDifference);
  //  }
  //
  //  int hourDifference = now.get(Calendar.HOUR_OF_DAY) - messageDate.get(Calendar.HOUR_OF_DAY);
  //
  //  if (hourDifference > 0) {
  //    return context.getResources()
  //        .getQuantityString(R.plurals.make_hours_ago, hourDifference, hourDifference);
  //  }
  //
  //  int minuteDifference = now.get(Calendar.MINUTE) - messageDate.get(Calendar.MINUTE);
  //
  //  return minuteDifference == 0 ? context.getString(R.string.just_now) : context.getResources()
  //      .getQuantityString(R.plurals.make_minutes_ago, minuteDifference, minuteDifference);
  //}
}
