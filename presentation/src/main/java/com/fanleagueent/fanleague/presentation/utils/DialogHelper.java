package com.fanleagueent.fanleague.presentation.utils;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;

public class DialogHelper {

  private AppCompatActivity context;
  private Dialog dialog;
  private DateUtils dateUtils;
  private FanUtils fanUtils;
  private ImageLoaderHelper imageLoaderHelper;

  public DialogHelper(AppCompatActivity context, DateUtils dateUtils, FanUtils fanUtils,
      ImageLoaderHelper imageLoaderHelper) {
    this.context = context;
    this.dateUtils = dateUtils;
    this.fanUtils = fanUtils;
    this.imageLoaderHelper = imageLoaderHelper;
  }

  //public void showErrorDialog(String title, String message) {
  //  dismissDialog();
  //
  //  View view = LayoutInflater.from(context).inflate(R.layout.dialog_view, null);
  //  if (view != null) {
  //    ((TextView) view.findViewById(R.id.tv_title)).setText(title);
  //    ((TextView) view.findViewById(R.id.tv_message)).setText(message);
  //    view.findViewById(R.id.tv_okay).setOnClickListener(v -> dismissDialog());
  //  }
  //
  //  dialog = new Dialog(context);
  //  dialog.setCanceledOnTouchOutside(false);
  //  dialog.setContentView(view);
  //  dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
  //  dialog.getWindow()
  //      .setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
  //  dialog.show();
  //}
  //
  //public void showConfirmDialog(String title, String message,
  //    final TaskCompleteListener taskCompleteListener) {
  //  dismissDialog();
  //
  //  View view = LayoutInflater.from(context).inflate(R.layout.confirm_dialog_view, null);
  //  if (view != null) {
  //    ((TextView) view.findViewById(R.id.tv_title)).setText(title);
  //    ((TextView) view.findViewById(R.id.tv_message)).setText(message);
  //    view.findViewById(R.id.tv_confirm).setOnClickListener(v -> {
  //      dismissDialog();
  //      taskCompleteListener.onTaskCompleted();
  //    });
  //    view.findViewById(R.id.tv_cancel).setOnClickListener(v -> {
  //      dismissDialog();
  //      taskCompleteListener.onTaskCanceled();
  //    });
  //  }
  //
  //  dialog = new Dialog(context);
  //  dialog.setCanceledOnTouchOutside(false);
  //  dialog.setCancelable(false);
  //  dialog.setContentView(view);
  //  dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
  //  dialog.getWindow()
  //      .setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
  //
  //  dialog.show();
  //}
  //
  //public void showCancelBetPlayDialog(String title, String message,
  //    final TaskCompleteListener taskCompleteListener) {
  //  dismissDialog();
  //
  //  View view = LayoutInflater.from(context).inflate(R.layout.cancel_bet_play_dialog_view, null);
  //  if (view != null) {
  //    ((TextView) view.findViewById(R.id.tv_title)).setText(title);
  //    ((TextView) view.findViewById(R.id.tv_message)).setText(message);
  //    view.findViewById(R.id.tv_confirm).setOnClickListener(v -> {
  //      dismissDialog();
  //      taskCompleteListener.onTaskCompleted();
  //    });
  //    view.findViewById(R.id.tv_cancel).setOnClickListener(v -> {
  //      dismissDialog();
  //      taskCompleteListener.onTaskCanceled();
  //    });
  //  }
  //
  //  dialog = new Dialog(context);
  //  dialog.setCanceledOnTouchOutside(false);
  //  dialog.setCancelable(false);
  //  dialog.setContentView(view);
  //  dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
  //  dialog.getWindow()
  //      .setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
  //
  //  dialog.show();
  //}
  //
  //public void showProgressDialog() {
  //  dismissDialog();
  //
  //
  //  View view = LayoutInflater.from(context).inflate(R.layout.progress_dialog_view, null);
  //
  //  dialog = new Dialog(context);
  //  dialog.setContentView(view);
  //  dialog.setCanceledOnTouchOutside(false);
  //  dialog.setCancelable(false);
  //  dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
  //  dialog.getWindow()
  //      .setLayout(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
  //
  //  dialog.show();
  //}
  //
  //public void showListDialog(BaseAdapter adapter, ListDialogFragment.ClickListener clickListener) {
  //  dismissDialog();
  //
  //  ListDialogFragment listDialogFragment = ListDialogFragment.newInstance();
  //  listDialogFragment.setAdapter(adapter);
  //  listDialogFragment.setClickListener(clickListener);
  //  listDialogFragment.show(context.getFragmentManager().beginTransaction(),
  //      ListDialogFragment.SETTINGS_ADD_ITEM_FRAGMENT_TAG);
  //}
  //
  //public void showTakePhotoDialog(final ChangePhotoDialogListener changePhotoDialogListener) {
  //  dismissDialog();
  //
  //  AlertDialog.Builder builder = new AlertDialog.Builder(context);
  //  builder.setTitle(context.getString(R.string.title_change_photo));
  //  builder.setItems(R.array.photo_actions, (dialogInterface, position) -> {
  //    if (position == 0) {
  //      try {
  //        changePhotoDialogListener.onTakePhotoClick();
  //      } catch (IOException e) {
  //        e.printStackTrace();
  //      }
  //    } else if (position == 1) {
  //      changePhotoDialogListener.onChoosePhotoClick();
  //    } else if (position == 2) {
  //      changePhotoDialogListener.onRemovePhotoClick();
  //    }
  //  });
  //
  //  dialog = builder.create();
  //  dialog.show();
  //}
  //
  //public void showDatePickerDialog(TextView tvBirthday) {
  //  dismissDialog();
  //
  //  Calendar calendar = Calendar.getInstance();
  //  DatePickerDialog birthDatePicker =
  //      new DatePickerDialog(context, (view, year, month, dayOfMonth) -> {
  //        tvBirthday.setText(dateUtils.getBirthdayDateFormat(year, month, dayOfMonth));
  //      }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
  //          calendar.get(Calendar.DAY_OF_MONTH));
  //  birthDatePicker.show();
  //}
  //
  //public void showTrophyDetailDialog(int trophyType, Trophy trophy,
  //    final TrophyDetailClickListener trophyDetailClickListener) {
  //  dismissDialog();
  //
  //  View view = LayoutInflater.from(context).inflate(R.layout.trophy_detail_dialog_view, null);
  //  if (view != null) {
  //    ((ImageView) view.findViewById(R.id.iv_trophy_icon)).setImageResource(
  //        fanUtils.getTrophyTypeImage(trophyType, trophy.getLevel()));
  //    ((TextView) view.findViewById(R.id.tv_title)).setText(
  //        fanUtils.getTrophyTypeTitle(trophyType));
  //    ((TextView) view.findViewById(R.id.tv_progress)).setText(
  //        context.getString(R.string.format_progress_points, trophy.getValue(),
  //            trophy.getNextValue()));
  //    ((TextView) view.findViewById(R.id.tv_next_level_bonus)).setText(
  //        context.getString(R.string.format_progress_bonus_points,
  //            fanUtils.getIntFormattedAmountComa(trophy.getNextLevelPoints())));
  //    ((TextView) view.findViewById(R.id.tv_next_level)).setText(
  //        context.getString(R.string.format_trophy_to_level,
  //            fanUtils.getNextLevelLowerTitle(trophy.getNextLevel())));
  //    ((TextView) view.findViewById(R.id.tv_description)).setText(trophy.getDescription());
  //
  //    view.findViewById(R.id.iv_close).setOnClickListener(v -> {
  //      dismissDialog();
  //    });
  //
  //    view.findViewById(R.id.tv_google).setOnClickListener(v -> {
  //      dismissDialog();
  //      trophyDetailClickListener.onGoogleClick();
  //    });
  //
  //    view.findViewById(R.id.tv_facebook).setOnClickListener(v -> {
  //      dismissDialog();
  //      trophyDetailClickListener.onFacebookClick();
  //    });
  //  }
  //
  //  dialog = new Dialog(context);
  //  dialog.setCanceledOnTouchOutside(false);
  //  dialog.setCancelable(false);
  //  dialog.setContentView(view);
  //  dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
  //  dialog.getWindow()
  //      .setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
  //
  //  dialog.show();
  //}
  //
  //public void showLockerInviteDialog(TeamsLeaguesListData teamsLeaguesListData, String name,
  //    final InviteListener inviteListener) {
  //  dismissDialog();
  //
  //  View rootView = LayoutInflater.from(context).inflate(R.layout.locker_invite_dialog, null);
  //
  //  if (rootView != null) {
  //    ((TextView) rootView.findViewById(R.id.tv_title)).setText(
  //        context.getString(R.string.invite_xxx_to, name));
  //
  //    SelectGroupSpinnerAdapter selectGroupSpinnerAdapter = new SelectGroupSpinnerAdapter(context);
  //
  //    ((android.support.v7.widget.AppCompatSpinner) rootView.findViewById(
  //        R.id.sp_group_type)).setAdapter(new SelectGroupTypeSpinnerAdapter(context));
  //    ((android.support.v7.widget.AppCompatSpinner) rootView.findViewById(
  //        R.id.sp_group_type)).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
  //      @Override
  //      public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
  //        switch ((int) id) {
  //          case SelectGroupTypeSpinnerAdapter.TYPE_TEAMS:
  //            selectGroupSpinnerAdapter.setGroupItems(teamsLeaguesListData.getTeamsList(),
  //                SelectGroupSpinnerAdapter.TYPE_TEAMS);
  //            break;
  //          case SelectGroupTypeSpinnerAdapter.TYPE_LEAGUES:
  //            selectGroupSpinnerAdapter.setGroupItems(teamsLeaguesListData.getLeaguesList(),
  //                SelectGroupSpinnerAdapter.TYPE_LEAGUES);
  //            break;
  //          default:
  //            break;
  //        }
  //      }
  //
  //      @Override public void onNothingSelected(AdapterView<?> parent) {
  //
  //      }
  //    });
  //
  //    ((AppCompatSpinner) rootView.findViewById(R.id.sp_group_name)).setAdapter(
  //        selectGroupSpinnerAdapter);
  //
  //    ((AppCompatSpinner) rootView.findViewById(R.id.sp_group_name)).setOnItemSelectedListener(
  //        new AdapterView.OnItemSelectedListener() {
  //          @Override
  //          public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
  //            Avatar avatar = selectGroupSpinnerAdapter.getItem(position).getAvatar();
  //            if (avatar != null && !TextUtils.isEmpty(avatar.getMediumImage())) {
  //              imageLoaderHelper.loadUrlAvatarSize(avatar.getMediumImage(), false,
  //                  (int) fanUtils.convertDpToPx(20),
  //                  ((ImageView) rootView.findViewById(R.id.iv_group_avatar)));
  //            }
  //          }
  //
  //          @Override public void onNothingSelected(AdapterView<?> parent) {
  //
  //          }
  //        });
  //
  //    rootView.findViewById(R.id.iv_close).setOnClickListener(v -> dismissDialog());
  //
  //    rootView.findViewById(R.id.tv_cancel).setOnClickListener(v -> dismissDialog());
  //
  //    rootView.findViewById(R.id.tv_send_invite).setOnClickListener(v -> {
  //      dismissDialog();
  //      inviteListener.inviteTo(selectGroupSpinnerAdapter.getCurrentType(),
  //          selectGroupSpinnerAdapter.getItem(((AppCompatSpinner) rootView.findViewById(
  //              R.id.sp_group_name)).getSelectedItemPosition()));
  //    });
  //  }
  //
  //  dialog = new Dialog(context);
  //  dialog.setCanceledOnTouchOutside(true);
  //  dialog.setCancelable(true);
  //  dialog.setContentView(rootView);
  //  dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
  //  dialog.getWindow()
  //      .setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
  //
  //  dialog.show();
  //}
  //
  //public void showPunditChangeBetDialog(String expertName, String betAmount,
  //    TaskCompleteListener taskCompleteListener) {
  //  dismissDialog();
  //
  //  View view = LayoutInflater.from(context).inflate(R.layout.pundit_change_bet_dialog_view, null);
  //
  //  if (view != null) {
  //    ((TextView) view.findViewById(R.id.tv_description)).setText(
  //        context.getString(R.string.pundit_change_bet_description, expertName, betAmount));
  //
  //    view.findViewById(R.id.tv_cancel).setOnClickListener(v -> {
  //      dismissDialog();
  //      taskCompleteListener.onTaskCanceled();
  //    });
  //
  //    view.findViewById(R.id.iv_close).setOnClickListener(v -> {
  //      dismissDialog();
  //      taskCompleteListener.onTaskCanceled();
  //    });
  //
  //    view.findViewById(R.id.tv_place_bet).setOnClickListener(v -> {
  //      dismissDialog();
  //      taskCompleteListener.onTaskCompleted();
  //    });
  //  }
  //
  //  dialog = new Dialog(context);
  //  dialog.setContentView(view);
  //  dialog.setCanceledOnTouchOutside(false);
  //  dialog.setCancelable(false);
  //  dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
  //  dialog.getWindow()
  //      .setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
  //
  //  dialog.show();
  //}
  //
  //public void showSystemMessage(String message, TaskCompleteListener taskCompleteListener) {
  //  dismissDialog();
  //
  //  View view = LayoutInflater.from(context).inflate(R.layout.system_message_dialog_view, null);
  //
  //  dialog = new Dialog(context);
  //  dialog.setContentView(view);
  //  dialog.setCanceledOnTouchOutside(false);
  //  dialog.setCancelable(false);
  //  dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
  //  dialog.getWindow()
  //      .setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
  //
  //  // TODO ((TextView)view.findViewById(R.id.tv_message)).setText(message);
  //
  //  view.findViewById(R.id.tv_acknowledge).setOnClickListener(v -> {
  //    dismissDialog();
  //    taskCompleteListener.onTaskCompleted();
  //  });
  //
  //  dialog.show();
  //}
  //
  //public void shareRecruitMore(String inviteCode){
  //  Intent intent = new Intent(Intent.ACTION_SEND);
  //  intent.setType("text/plain");
  //  intent.putExtra(Intent.EXTRA_SUBJECT, "Subject/Title");
  //  intent.putExtra(Intent.EXTRA_TEXT, context.getString(R.string.recruit_players_text, inviteCode));
  //  context.startActivity(Intent.createChooser(intent, "Choose sharing method"));
  //}
  //
  //public void dismissDialog() {
  //  if (dialog != null) {
  //    dialog.dismiss();
  //    dialog = null;
  //  }
  //}
}
