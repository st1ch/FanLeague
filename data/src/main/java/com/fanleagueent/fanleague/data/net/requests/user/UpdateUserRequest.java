package com.fanleagueent.fanleague.data.net.requests.user;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 16.12.16.
 */

public class UpdateUserRequest {

    @SerializedName("first_name")
    private String firstName;

    @SerializedName("last_name")
    private String lastName;

    @SerializedName("username")
    private String username;

    @SerializedName("email")
    private String email;

    @SerializedName("profession")
    private String profession;

    @SerializedName("nationality")
    private String nationality;

    @SerializedName("birthday")
    private String birthday;

    @SerializedName("sex")
    private String sex;

    @SerializedName("favourite_football_club_id")
    private String favouriteFootballClubId;

    @SerializedName("favourite_youth_club")
    private String favouriteYouthClub;

    @SerializedName("yearly_earnings")
    private int yearlyEarnings;

    @SerializedName("deposit_limit")
    private int weeklyDepositLimit;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getProfession() {
        return profession;
    }

    public String getNationality() {
        return nationality;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getSex() {
        return sex;
    }

    public String getFavouriteFootballClubId() {
        return favouriteFootballClubId;
    }

    public String getFavouriteYouthClub() {
        return favouriteYouthClub;
    }

    public int getYearlyEarnings() {
        return yearlyEarnings;
    }

    public int getWeeklyDepositLimit() {
        return weeklyDepositLimit;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setFavouriteFootballClubId(String favouriteFootballClubId) {
        this.favouriteFootballClubId = favouriteFootballClubId;
    }

    public void setFavouriteYouthClub(String favouriteYouthClub) {
        this.favouriteYouthClub = favouriteYouthClub;
    }

    public void setYearlyEarnings(int yearlyEarnings) {
        this.yearlyEarnings = yearlyEarnings;
    }

    public void setWeeklyDepositLimit(int weeklyDepositLimit) {
        this.weeklyDepositLimit = weeklyDepositLimit;
    }
}
