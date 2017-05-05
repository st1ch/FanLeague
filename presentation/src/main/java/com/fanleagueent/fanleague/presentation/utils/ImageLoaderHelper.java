package com.fanleagueent.fanleague.presentation.utils;

import android.content.Context;
import com.fanleagueent.fanleague.domain.schedulers.ObserveOn;
import com.squareup.picasso.Picasso;

public class ImageLoaderHelper {
  private Picasso picasso;
  private Context context;
  private ObserveOn observeOn;

  public ImageLoaderHelper(Context context, ObserveOn observeOn) {
    this.context = context;
    picasso = Picasso.with(context);
    this.observeOn = observeOn;
  }

  //public void loadFileAvatar(File imageFile, boolean withBorder, ImageView targetImageView) {
  //  picasso.load(imageFile)
  //      .fit()
  //      .centerCrop()
  //      .transform(withBorder ? CropCircleBorderTransformation.getInstance(context)
  //          : CropCircleTransformation.getInstance())
  //      .into(targetImageView);
  //}
  //
  //public void loadFileAvatarClearCache(File imageFile, boolean withBorder,
  //    ImageView targetImageView) {
  //  picasso.invalidate(imageFile);
  //  picasso.load(imageFile)
  //      .fit()
  //      .centerCrop()
  //      .transform(withBorder ? CropCircleBorderTransformation.getInstance(context)
  //          : CropCircleTransformation.getInstance())
  //      .into(targetImageView);
  //}
  //
  //public void loadUrlAvatarSize(String imageUrl, boolean withBorder, int sizePx, ImageView targetImageView) {
  //  picasso.load(imageUrl)
  //      .centerCrop()
  //      .resize(sizePx, sizePx)
  //      .transform(withBorder ? CropCircleBorderTransformation.getInstance(context)
  //          : CropCircleTransformation.getInstance())
  //      .into(targetImageView);
  //}
  //
  //public void loadUrlAvatar(String imageUrl, boolean withBorder, ImageView targetImageView) {
  //  picasso.load(imageUrl)
  //      .fit()
  //      .centerCrop()
  //      .transform(withBorder ? CropCircleBorderTransformation.getInstance(context)
  //          : CropCircleTransformation.getInstance())
  //      .into(targetImageView);
  //}
  //
  //public void loadUrlImage(String imageUrl, boolean withBorder, ImageView targetImageView) {
  //  picasso.load(imageUrl)
  //      .fit()
  //      .centerCrop()
  //      .into(targetImageView);
  //}
  //
  //public Observable<Bitmap> loadBitmap(String imageUrl) {
  //
  //  return Observable.create(new Observable.OnSubscribe<Bitmap>() {
  //    @Override public void call(rx.Subscriber<? super Bitmap> subscriber) {
  //
  //    }
  //
  //    @Override public void call(Subscriber<? super Bitmap> subscriber) {
  //      Target target = new Target() {
  //        @Override public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
  //          subscriber.onNext(bitmap);
  //          subscriber.onComplete();
  //        }
  //
  //        @Override public void onBitmapFailed(Drawable errorDrawable) {
  //          subscriber.onError(new Exception("failed to load " + imageUrl));
  //        }
  //
  //        @Override public void onPrepareLoad(Drawable placeHolderDrawable) {
  //        }
  //      };
  //      subscriber.add(new Subscription() {
  //        @Override public void request(long n) {
  //
  //        }
  //
  //        @Override public void cancel() {
  //
  //        }
  //
  //        private boolean unSubscribed;
  //
  //        @Override public void unsubscribe() {
  //          picasso.cancelRequest(target);
  //          unSubscribed = true;
  //        }
  //
  //        @Override public boolean isUnsubscribed() {
  //          return unSubscribed;
  //        }
  //      });
  //      Observable.create(subscriber1 -> {
  //        picasso.load(imageUrl).into(target);
  //      }).subscribeOn(observeOn.getScheduler()).subscribe(o -> {
  //      }, throwable -> {
  //      });
  //    }
  //  });
  //}
}
