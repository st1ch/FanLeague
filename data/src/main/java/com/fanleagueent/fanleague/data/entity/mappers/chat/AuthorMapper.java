package com.fanleagueent.fanleague.data.entity.mappers.chat;

import com.fanleagueent.fanleague.data.entity.entities.chat.AuthorEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.chat.Author;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class AuthorMapper implements Mapper<AuthorEntity, Author> {

  @Override public Author transform(AuthorEntity obj) {
    Author author = new Author();

    author.setName(obj.getName());
    author.setAvatar(obj.getAvatar());

    return author;
  }
}
