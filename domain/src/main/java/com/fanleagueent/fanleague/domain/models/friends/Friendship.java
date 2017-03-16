package com.fanleagueent.fanleague.domain.models.friends;

/**
 * Created by alexeyverbitskiy on 11/15/16.
 */

public class Friendship {
  private boolean isFriends;
  private boolean hasRequestPending;
  private boolean receivedRequestPending;
  private boolean isFriendsOnFacebook;
  private int mutualFriendsCount;

  public boolean isFriends() {
    return isFriends;
  }

  public void setFriends(boolean friends) {
    isFriends = friends;
  }

  public boolean isHasRequestPending() {
    return hasRequestPending;
  }

  public void setHasRequestPending(boolean hasRequestPending) {
    this.hasRequestPending = hasRequestPending;
  }

  public boolean isReceivedRequestPending() {
    return receivedRequestPending;
  }

  public void setReceivedRequestPending(boolean receivedRequestPending) {
    this.receivedRequestPending = receivedRequestPending;
  }

  public boolean isFriendsOnFacebook() {
    return isFriendsOnFacebook;
  }

  public void setFriendsOnFacebook(boolean friendsOnFacebook) {
    isFriendsOnFacebook = friendsOnFacebook;
  }

  public int getMutualFriendsCount() {
    return mutualFriendsCount;
  }

  public void setMutualFriendsCount(int mutualFriendsCount) {
    this.mutualFriendsCount = mutualFriendsCount;
  }

  @Override public String toString() {
    return "FriendshipEntity{"
        + "isFriends="
        + isFriends
        + ", hasRequestPending="
        + hasRequestPending
        + ", receivedRequestPending="
        + receivedRequestPending
        + ", isFriendsOnFacebook="
        + isFriendsOnFacebook
        + ", mutualFriendsCount="
        + mutualFriendsCount
        + '}';
  }
}
