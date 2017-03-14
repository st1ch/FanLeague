package com.fanleagueent.fanleague.data.entity.mappers.chat;

import com.fanleagueent.fanleague.data.entity.entities.chat.ChatUserEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.chat.ChatUser;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class ChatUserDataMapper implements Mapper<ChatUserEntity, ChatUser> {

  private MapperFactory mapperFactory;

  public ChatUserDataMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public ChatUser transform(ChatUserEntity obj) throws RuntimeException {
    ChatUser chatUser = new ChatUser();

    chatUser.setId(obj.getId());
    chatUser.setEmail(obj.getEmail());
    chatUser.setUsername(obj.getUsername());
    chatUser.setDisplayName(obj.getDisplayName());
    chatUser.setFullName(obj.getFullName());
    chatUser.setFriendship(mapperFactory.userMapperFactory()
        .getFriendshipMapper()
        .transform(obj.getFriendshipEntity()));
    chatUser.setAvatar(
        mapperFactory.userMapperFactory().getAvatarMapper().transform(obj.getAvatarEntity()));
    chatUser.setFacebookConnected(obj.isFacebookConnected());
    chatUser.setGoogleConnected(obj.isGoogleConnected());
    chatUser.setLevel(obj.getLevel());
    chatUser.setExpPercentage(obj.getExpPercentage());
    chatUser.setNationality(obj.getNationality());
    chatUser.setAverageWinningBets(obj.getAverageWinningBets());
    chatUser.setHasBetMedal(obj.isHasBetMedal());

    return chatUser;
  }
}
