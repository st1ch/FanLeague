package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.WalletEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.user.Wallet;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class WalletMapper implements Mapper<WalletEntity, Wallet> {

  private UserMapperFactory userMapperFactory;

  public WalletMapper(UserMapperFactory userMapperFactory) {
    this.userMapperFactory = userMapperFactory;
  }

  @Override public Wallet transform(WalletEntity obj) {
    Wallet wallet = new Wallet();
    wallet.setId(obj.getId());
    wallet.setUserId(obj.getUserId());
    wallet.setCreditBalance(obj.getCreditBalance());
    wallet.setMoneyBalance(obj.getMoneyBalance());
    wallet.setCreditInMoneyEquivalent(obj.getCreditInMoneyEquivalent());

    return wallet;
  }
}
