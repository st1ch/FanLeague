package com.fanleagueent.fanleague.data.entity.mappers;

public interface Mapper<A, B> {
  B transform(A obj);
}
