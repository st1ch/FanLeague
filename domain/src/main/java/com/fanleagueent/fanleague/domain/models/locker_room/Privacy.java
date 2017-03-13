package com.fanleagueent.fanleague.domain.models.locker_room;

/**
 * Created by st1ch on 23.01.17.
 */

public class Privacy {

  private boolean memberSince;
  private boolean favouriteClub;
  private boolean favouriteYouthClub;
  private boolean profession;
  private boolean averageWinningBets;
  private boolean bestScore;
  private boolean age;
  private boolean sex;
  private boolean nationality;
  private boolean recruitTreeSize;

  private Privacy(Builder builder) {
    setMemberSince(builder.memberSince);
    setFavouriteClub(builder.favouriteClub);
    setFavouriteYouthClub(builder.favouriteYouthClub);
    setProfession(builder.profession);
    setAverageWinningBets(builder.averageWinningBets);
    setBestScore(builder.bestScore);
    setAge(builder.age);
    setSex(builder.sex);
    setNationality(builder.nationality);
    setRecruitTreeSize(builder.recruitTreeSize);
  }

  public boolean isMemberSinceVisible() {
    return memberSince;
  }

  public void setMemberSince(boolean memberSince) {
    this.memberSince = memberSince;
  }

  public boolean isFavouriteClubVisible() {
    return favouriteClub;
  }

  public void setFavouriteClub(boolean favouriteClub) {
    this.favouriteClub = favouriteClub;
  }

  public boolean isFavouriteYouthClubVisible() {
    return favouriteYouthClub;
  }

  public void setFavouriteYouthClub(boolean favouriteYouthClub) {
    this.favouriteYouthClub = favouriteYouthClub;
  }

  public boolean isProfessionVisible() {
    return profession;
  }

  public void setProfession(boolean profession) {
    this.profession = profession;
  }

  public boolean isAverageWinningBetsVisible() {
    return averageWinningBets;
  }

  public void setAverageWinningBets(boolean averageWinningBets) {
    this.averageWinningBets = averageWinningBets;
  }

  public boolean isBestScoreVisible() {
    return bestScore;
  }

  public void setBestScore(boolean bestScore) {
    this.bestScore = bestScore;
  }

  public boolean isAgeVisible() {
    return age;
  }

  public void setAge(boolean age) {
    this.age = age;
  }

  public boolean isSexVisible() {
    return sex;
  }

  public void setSex(boolean sex) {
    this.sex = sex;
  }

  public boolean isNationalityVisible() {
    return nationality;
  }

  public void setNationality(boolean nationality) {
    this.nationality = nationality;
  }

  public boolean isRecruitTreeSizeVisible() {
    return recruitTreeSize;
  }

  public void setRecruitTreeSize(boolean recruitTreeSize) {
    this.recruitTreeSize = recruitTreeSize;
  }

  @Override public String toString() {
    return "PrivacyEntity{" +
        "recruitTreeSize=" + recruitTreeSize +
        ", memberSince=" + memberSince +
        ", favouriteClub=" + favouriteClub +
        ", favouriteYouthClub=" + favouriteYouthClub +
        ", profession=" + profession +
        ", averageWinningBets=" + averageWinningBets +
        ", bestScore=" + bestScore +
        ", age=" + age +
        ", sex=" + sex +
        ", nationality=" + nationality +
        '}';
  }

  public static final class Builder {
    private boolean memberSince;
    private boolean favouriteClub;
    private boolean favouriteYouthClub;
    private boolean profession;
    private boolean averageWinningBets;
    private boolean bestScore;
    private boolean age;
    private boolean sex;
    private boolean nationality;
    private boolean recruitTreeSize;

    public Builder() {
    }

    public Builder memberSince(boolean val) {
      memberSince = val;
      return this;
    }

    public Builder favouriteClub(boolean val) {
      favouriteClub = val;
      return this;
    }

    public Builder favouriteYouthClub(boolean val) {
      favouriteYouthClub = val;
      return this;
    }

    public Builder profession(boolean val) {
      profession = val;
      return this;
    }

    public Builder averageWinningBets(boolean val) {
      averageWinningBets = val;
      return this;
    }

    public Builder bestScore(boolean val) {
      bestScore = val;
      return this;
    }

    public Builder age(boolean val) {
      age = val;
      return this;
    }

    public Builder sex(boolean val) {
      sex = val;
      return this;
    }

    public Builder nationality(boolean val) {
      nationality = val;
      return this;
    }

    public Builder recruitTreeSize(boolean val) {
      recruitTreeSize = val;
      return this;
    }

    public Privacy build() {
      return new Privacy(this);
    }
  }
}
