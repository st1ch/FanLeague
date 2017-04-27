package com.fanleagueent.fanleague.data.net.requests.user;

import com.google.gson.annotations.SerializedName;
import lombok.experimental.Builder;

/**
 * Created by st1ch on 16.12.16.
 */
@Builder public class UpdateUserRequest {

  @SerializedName("first_name") private String firstName;

  @SerializedName("last_name") private String lastName;

  @SerializedName("username") private String username;

  @SerializedName("email") private String email;

  @SerializedName("profession") private String profession;

  @SerializedName("nationality") private String nationality;

  @SerializedName("birthday") private String birthday;

  @SerializedName("sex") private String sex;

  @SerializedName("favourite_football_club_id") private String favouriteFootballClubId;

  @SerializedName("favourite_youth_club") private String favouriteYouthClub;

  @SerializedName("phone") private String phone;

  @SerializedName("address") private String address;

  @SerializedName("country") private String country;

  @SerializedName("city") private String city;

  @SerializedName("zip") private String zip;
}
