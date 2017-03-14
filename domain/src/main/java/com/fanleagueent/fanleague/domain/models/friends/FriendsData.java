package com.fanleagueent.fanleague.domain.models.friends;

import java.util.List;

/**
 * Created by alexeyverbitskiy on 11/15/16.
 */

public class FriendsData {

  private int friendsCount;
  private List<Friend> friendList;

  public int getFriendsCount() {
    return friendsCount;
  }

  public List<Friend> getFriendList() {
    return friendList;
  }

  public void setFriendsCount(int friendsCount) {
    this.friendsCount = friendsCount;
  }

  public void setFriendList(List<Friend> friendList) {
    this.friendList = friendList;
  }

  @Override public String toString() {
    return "FriendsData{" + "friendsCount=" + friendsCount + ", friendList=" + friendList + '}';
  }
}
