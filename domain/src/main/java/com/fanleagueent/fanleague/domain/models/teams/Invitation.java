package com.fanleagueent.fanleague.domain.models.teams;

/**
 * Created by st1ch on 01.12.16.
 */

public class Invitation {

  private String id;
  private String userId;
  private String invitedUserId;
  private String teamId;
  private String type;
  private String email;
  private String acceptToken;
  private String denyToken;
  private String updatedAt;
  private String createdAt;

  public String getId() {
    return id;
  }

  public String getUserId() {
    return userId;
  }

  public String getInvitedUserId() {
    return invitedUserId;
  }

  public String getTeamId() {
    return teamId;
  }

  public String getType() {
    return type;
  }

  public String getEmail() {
    return email;
  }

  public String getAcceptToken() {
    return acceptToken;
  }

  public String getDenyToken() {
    return denyToken;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public void setInvitedUserId(String invitedUserId) {
    this.invitedUserId = invitedUserId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setAcceptToken(String acceptToken) {
    this.acceptToken = acceptToken;
  }

  public void setDenyToken(String denyToken) {
    this.denyToken = denyToken;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
}
