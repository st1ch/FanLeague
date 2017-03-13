package com.fanleagueent.fanleague.data.cache;

import android.content.SharedPreferences;
import com.fanleagueent.fanleague.data.constants.Preferences;

public class PreferenceHelper {

    private SharedPreferences sharedPreferences;

    public PreferenceHelper(SharedPreferences sharedPreferences){
        this.sharedPreferences = sharedPreferences;
    }

    public String getAccessToken() {
        return sharedPreferences.getString(Preferences.APP_TOKEN, "");
    }

    public void setAccessToken(String accessToken) {
        sharedPreferences.edit().putString(Preferences.APP_TOKEN, accessToken).apply();
    }

    public String getUserId() {
        return sharedPreferences.getString(Preferences.USER_ID, "");
    }

    public void setUserId(String userId) {
        sharedPreferences.edit().putString(Preferences.USER_ID, userId).apply();
    }

    public boolean isLoginFb() {
        return sharedPreferences.getBoolean(Preferences.IS_LOGIN_FB, false);
    }

    public void setIsLoginFb(boolean isLogin) {
        sharedPreferences.edit().putBoolean(Preferences.IS_LOGIN_FB, isLogin).apply();
    }

    public String getFacebookToken(){
        return sharedPreferences.getString(Preferences.FB_TOKEN, "");
    }

    public void saveFacebookToken(String token){
        sharedPreferences.edit().putString(Preferences.FB_TOKEN, token).apply();
    }

    public void clearFacebookToken(){
        sharedPreferences.edit().remove(Preferences.FB_TOKEN).apply();
    }

    public void clearInfo() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(Preferences.APP_TOKEN);
        editor.remove(Preferences.USER_ID);
        editor.remove(Preferences.IS_LOGIN_GOOGLE);
        editor.remove(Preferences.IS_LOGIN_FB);
        editor.remove(Preferences.FB_TOKEN);
        editor.remove(Preferences.GOOGLE_TOKEN);
        editor.apply();
    }
}
