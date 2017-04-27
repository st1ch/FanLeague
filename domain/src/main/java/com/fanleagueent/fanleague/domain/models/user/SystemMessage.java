package com.fanleagueent.fanleague.domain.models.user;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

/**
 * Created by alexeyverbitskiy on 3/21/17.
 */

@AllArgsConstructor
@EqualsAndHashCode(exclude={"id"})
@Getter
@ToString
public class SystemMessage {
  private @NonNull String id;
  private @NonNull String text;
  private @NonNull String updatedAt;
}
