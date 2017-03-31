package com.fanleagueent.fanleague.presentation.utils;

import android.content.Context;

/**
 * Created by alexeyverbitskiy on 10/20/16.
 */

public class FanUtils {

  private Context context;

  public FanUtils(Context context) {
    this.context = context;
  }

  //public boolean isNetworkConnected() {
  //  ConnectivityManager connectivityManager =
  //      (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
  //  NetworkInfo activeNetInfo = connectivityManager.getActiveNetworkInfo();
  //  return activeNetInfo != null && activeNetInfo.isConnected();
  //}
  //
  //public boolean checkPlayServices() {
  //  GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
  //  int resultCode = googleApiAvailability.isGooglePlayServicesAvailable(context);
  //  return resultCode == ConnectionResult.SUCCESS;
  //}
  //
  //public boolean isValidEmail(CharSequence target) {
  //  //TODO email pattern validator
  //  return !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target)
  //      .matches();
  //}
  //
  //public boolean isValidPassword(String target) {
  //  return !TextUtils.isEmpty(target) && new PasswordValidator().validate(target);
  //}
  //
  //public String getVersionOS(){
  //  return Build.VERSION.RELEASE;
  //}
  //
  //public String getDeviceUniqueId() {
  //  return Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
  //}
  //
  //public String getDeviceName() {
  //  String manufacturer = Build.MANUFACTURER;
  //  String model = Build.MODEL;
  //  if (model.startsWith(manufacturer)) {
  //    return capitalize(model);
  //  }
  //  return capitalize(manufacturer) + " " + model;
  //}
  //
  //private String capitalize(String str) {
  //  if (TextUtils.isEmpty(str)) {
  //    return str;
  //  }
  //  char[] arr = str.toCharArray();
  //  boolean capitalizeNext = true;
  //
  //  StringBuilder phrase = new StringBuilder();
  //  for (char c : arr) {
  //    if (capitalizeNext && Character.isLetter(c)) {
  //      phrase.append(Character.toUpperCase(c));
  //      capitalizeNext = false;
  //      continue;
  //    } else if (Character.isWhitespace(c)) {
  //      capitalizeNext = true;
  //    }
  //    phrase.append(c);
  //  }
  //
  //  return phrase.toString();
  //}
  //
  //public String getFormattedAmountComa(double amount) {
  //  DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
  //  symbols.setGroupingSeparator(',');
  //  DecimalFormat formatter = new DecimalFormat("###,###,###,###.##", symbols);
  //  return formatter.format(amount);
  //}
  //
  //public String getIntFormattedAmountComa(int amount) {
  //  DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
  //  symbols.setGroupingSeparator(',');
  //  DecimalFormat formatter = new DecimalFormat("###,###,###,###", symbols);
  //  return formatter.format(amount);
  //}
  //
  //public String getDoubleZero() {
  //  return "0.00";
  //}
  //
  //public String getFormattedAmountSpace(double amount) {
  //  DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
  //  symbols.setGroupingSeparator(' ');
  //  DecimalFormat formatter = new DecimalFormat("###,###,###,###.##", symbols);
  //  return formatter.format(amount);
  //}
  //
  //public String getFormattedAmountDot(int amount) {
  //  DecimalFormat formatter = new DecimalFormat("#.###.###.###");
  //  return formatter.format(amount);
  //}
  //
  //public double countBetAmount(int fullGuard, int halfGuard) {
  //  return MIN_BET_AMOUNT * Math.pow(HALFGUARD_BET_MULTIPLIER, halfGuard) * Math.pow(
  //      FULLGUARD_BET_MULTIPLIER, fullGuard);
  //}
  //
  //public void showRatingDifference(float difference, TextView textView) {
  //  if (difference < 0) {
  //    textView.setTextColor(ContextCompat.getColor(context, R.color.color_red));
  //    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_arrow_down_red, 0, 0, 0);
  //  } else {
  //    textView.setTextColor(ContextCompat.getColor(context, R.color.color_green));
  //    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_arrow_green_up, 0, 0, 0);
  //  }
  //  textView.setText(String.valueOf(Math.abs(difference)));
  //}
  //
  //public void showDecimalRatingDifference(int difference, TextView textView) {
  //  if (difference < 0) {
  //    textView.setTextColor(context.getResources().getColor(R.color.color_red));
  //    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_arrow_down_red, 0, 0, 0);
  //  } else {
  //    textView.setTextColor(context.getResources().getColor(R.color.color_green));
  //    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_arrow_green_up, 0, 0, 0);
  //  }
  //  textView.setText(getIntFormattedAmountComa(Math.abs(difference)));
  //}
  //
  //public int getProgressTypeImage(int progressType, int currentLevel) {
  //  switch (progressType) {
  //    case PROGRESS_TYPE_SCORE:
  //      switch (currentLevel) {
  //        case LEVEL_ROOKIE:
  //          return R.drawable.ic_score_rookie;
  //        case LEVEL_BRONZE:
  //          return R.drawable.ic_score_bronze;
  //        case LEVEL_SILVER:
  //          return R.drawable.ic_score_silver;
  //        case LEVEL_GOLD:
  //          return R.drawable.ic_score_gold;
  //        case LEVEL_PLATINUM:
  //          return R.drawable.ic_score_platinum;
  //      }
  //      break;
  //    case PROGRESS_TYPE_RECRUITING:
  //      switch (currentLevel) {
  //        case LEVEL_ROOKIE:
  //          return R.drawable.ic_recruting_rookie;
  //        case LEVEL_BRONZE:
  //          return R.drawable.ic_recruting_bronze;
  //        case LEVEL_SILVER:
  //          return R.drawable.ic_recruting_silver;
  //        case LEVEL_GOLD:
  //          return R.drawable.ic_recruting_gold;
  //        case LEVEL_PLATINUM:
  //          return R.drawable.ic_recruting_platinum;
  //      }
  //      break;
  //    case PROGRESS_TYPE_TREE:
  //      switch (currentLevel) {
  //        case LEVEL_ROOKIE:
  //          return R.drawable.ic_tree_rookie;
  //        case LEVEL_BRONZE:
  //          return R.drawable.ic_tree_bronze;
  //        case LEVEL_SILVER:
  //          return R.drawable.ic_tree_silver;
  //        case LEVEL_GOLD:
  //          return R.drawable.ic_tree_gold;
  //        case LEVEL_PLATINUM:
  //          return R.drawable.ic_tree_platinum;
  //      }
  //      break;
  //    case PROGRESS_TYPE_LOYALTY:
  //      switch (currentLevel) {
  //        case LEVEL_ROOKIE:
  //          return R.drawable.ic_loyalty_rookie;
  //        case LEVEL_BRONZE:
  //          return R.drawable.ic_loyalty_bronze;
  //        case LEVEL_SILVER:
  //          return R.drawable.ic_loyalty_silver;
  //        case LEVEL_GOLD:
  //          return R.drawable.ic_loyalty_gold;
  //        case LEVEL_PLATINUM:
  //          return R.drawable.ic_loyalty_platinum;
  //      }
  //      break;
  //    case PROGRESS_TYPE_CONSISTENCY:
  //      switch (currentLevel) {
  //        case LEVEL_ROOKIE:
  //          return R.drawable.ic_consistency_rookie;
  //        case LEVEL_BRONZE:
  //          return R.drawable.ic_consistency_bronze;
  //        case LEVEL_SILVER:
  //          return R.drawable.ic_consistency_silver;
  //        case LEVEL_GOLD:
  //          return R.drawable.ic_consistency_gold;
  //        case LEVEL_PLATINUM:
  //          return R.drawable.ic_consistency_platinum;
  //      }
  //      break;
  //  }
  //  return 0;
  //}
  //
  //public int getTrophyTypeImage(int progressType, int currentLevel) {
  //  switch (progressType) {
  //    case PROGRESS_TYPE_SCORE:
  //      switch (currentLevel) {
  //        case LEVEL_ROOKIE:
  //          return R.drawable.ic_trophy_score_rookie;
  //        case LEVEL_BRONZE:
  //          return R.drawable.ic_trophy_score_bronze;
  //        case LEVEL_SILVER:
  //          return R.drawable.ic_trophy_score_silver;
  //        case LEVEL_GOLD:
  //          return R.drawable.ic_trophy_score_gold;
  //        case LEVEL_PLATINUM:
  //          return R.drawable.ic_trophy_score_platinum;
  //      }
  //      break;
  //    case PROGRESS_TYPE_RECRUITING:
  //      switch (currentLevel) {
  //        case LEVEL_ROOKIE:
  //          return R.drawable.ic_trophy_recruiting_rookie;
  //        case LEVEL_BRONZE:
  //          return R.drawable.ic_trophy_recruiting_bronze;
  //        case LEVEL_SILVER:
  //          return R.drawable.ic_trophy_recruiting_silver;
  //        case LEVEL_GOLD:
  //          return R.drawable.ic_trophy_recruiting_gold;
  //        case LEVEL_PLATINUM:
  //          return R.drawable.ic_trophy_recruiting_platinum;
  //      }
  //      break;
  //    case PROGRESS_TYPE_TREE:
  //      switch (currentLevel) {
  //        case LEVEL_ROOKIE:
  //          return R.drawable.ic_trophy_tree_rookie;
  //        case LEVEL_BRONZE:
  //          return R.drawable.ic_trophy_tree_bronze;
  //        case LEVEL_SILVER:
  //          return R.drawable.ic_trophy_tree_silver;
  //        case LEVEL_GOLD:
  //          return R.drawable.ic_trophy_tree_gold;
  //        case LEVEL_PLATINUM:
  //          return R.drawable.ic_trophy_tree_platinum;
  //      }
  //      break;
  //    case PROGRESS_TYPE_LOYALTY:
  //      switch (currentLevel) {
  //        case LEVEL_ROOKIE:
  //          return R.drawable.ic_trophy_loyalty_rookie;
  //        case LEVEL_BRONZE:
  //          return R.drawable.ic_trophy_loyalty_bronze;
  //        case LEVEL_SILVER:
  //          return R.drawable.ic_trophy_loyalty_silver;
  //        case LEVEL_GOLD:
  //          return R.drawable.ic_trophy_loyalty_gold;
  //        case LEVEL_PLATINUM:
  //          return R.drawable.ic_trophy_loyalty_platinum;
  //      }
  //      break;
  //    case PROGRESS_TYPE_CONSISTENCY:
  //      switch (currentLevel) {
  //        case LEVEL_ROOKIE:
  //          return R.drawable.ic_trophy_consistency_rookie;
  //        case LEVEL_BRONZE:
  //          return R.drawable.ic_trophy_consistency_bronze;
  //        case LEVEL_SILVER:
  //          return R.drawable.ic_trophy_consistency_silver;
  //        case LEVEL_GOLD:
  //          return R.drawable.ic_trophy_consistency_gold;
  //        case LEVEL_PLATINUM:
  //          return R.drawable.ic_trophy_consistency_platinum;
  //      }
  //      break;
  //  }
  //  return 0;
  //}
  //
  //public String getTrophyTypeTitle(int trophyType) {
  //  switch (trophyType) {
  //    case PROGRESS_TYPE_SCORE:
  //      return context.getString(R.string.score);
  //    case PROGRESS_TYPE_RECRUITING:
  //      return context.getString(R.string.recruiting);
  //    case PROGRESS_TYPE_TREE:
  //      return context.getString(R.string.tree);
  //    case PROGRESS_TYPE_LOYALTY:
  //      return context.getString(R.string.loyalty);
  //    case PROGRESS_TYPE_CONSISTENCY:
  //      return context.getString(R.string.consistency);
  //  }
  //  return "";
  //}
  //
  //public int getCurrentLevelImage(int currentLevel) {
  //  switch (currentLevel) {
  //    case LEVEL_ROOKIE:
  //      return R.drawable.ic_level_rookie;
  //    case LEVEL_BRONZE:
  //      return R.drawable.ic_level_bronze;
  //    case LEVEL_SILVER:
  //      return R.drawable.ic_level_silver;
  //    case LEVEL_GOLD:
  //      return R.drawable.ic_level_gold;
  //    case LEVEL_PLATINUM:
  //      return R.drawable.ic_level_platinum;
  //  }
  //  return 0;
  //}
  //
  //public int getNextLevelImage(int currentLevel) {
  //  switch (currentLevel) {
  //    case LEVEL_ROOKIE:
  //      return R.drawable.ic_level_bronze;
  //    case LEVEL_BRONZE:
  //      return R.drawable.ic_level_silver;
  //    case LEVEL_SILVER:
  //      return R.drawable.ic_level_gold;
  //    case LEVEL_GOLD:
  //      return R.drawable.ic_level_platinum;
  //    case LEVEL_PLATINUM:
  //      return R.drawable.ic_level_platinum;
  //  }
  //  return 0;
  //}
  //
  //public String getNextLevelLowerTitle(int nextLevel) {
  //  switch (nextLevel) {
  //    case LEVEL_BRONZE:
  //      return context.getString(R.string.bronze).toLowerCase();
  //    case LEVEL_SILVER:
  //      return context.getString(R.string.silver).toLowerCase();
  //    case LEVEL_GOLD:
  //      return context.getString(R.string.gold).toLowerCase();
  //    case LEVEL_PLATINUM:
  //      return context.getString(R.string.platinum).toLowerCase();
  //  }
  //  return "";
  //}
  //
  //public Bitmap getFlagImage(String nationality) {
  //  if (nationality == null) {
  //    return null;
  //  }
  //  try {
  //    InputStream is = context.getAssets().open("flags/" + nationality.toLowerCase() + ".png");
  //
  //    return BitmapFactory.decodeStream(is);
  //  } catch (IOException e) {
  //    e.printStackTrace();
  //  }
  //
  //  return null;
  //}
  //
  //public float convertDpToPx(int dpSize) {
  //  return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpSize,
  //      context.getResources().getDisplayMetrics());
  //}
  //
  //public String countGameCombination(Map<String, MatchBet> bets) {
  //  int fullGuards = 0;
  //  int halfGuards = 0;
  //  int simpleBets = 0;
  //  for (MatchBet matchBet : bets.values()) {
  //    int betSum = convertBoolToInt(matchBet.getRateOne())
  //        + convertBoolToInt(matchBet.getDraw())
  //        + convertBoolToInt(matchBet.getRateTwo());
  //    if (betSum == 3) {
  //      fullGuards++;
  //    } else if (betSum == 2) {
  //      halfGuards++;
  //    } else if (betSum == 1) {
  //      simpleBets++;
  //    }
  //  }
  //
  //  return context.getString(R.string.format_game_system,
  //      context.getString(R.string.format_game_pundits_system, fullGuards, halfGuards, simpleBets));
  //}
  //
  //private int convertBoolToInt(boolean bool) {
  //  return bool ? 1 : 0;
  //}
}
