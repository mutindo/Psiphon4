package com.psiphon4;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import wei.mark.standout.StandOutWindow;
import wei.mark.standout.constants.StandOutFlags;
import wei.mark.standout.ui.Window;

public class WindowProperties extends StandOutWindow {
    @Override
    public String getAppName() {
        return "Psiphon 4";
    }

    @Override
    public int getAppIcon() {
        return R.drawable.icon;
    }

    @Override
    public String getTitle(int id) {
        return getAppName();
    }

    @Override
    public void createAndAttachView(int id, FrameLayout frame) {
    }

    @Override
    public StandOutLayoutParams getParams(int id, Window window) {
        return new StandOutLayoutParams(id, 450, 600,
                StandOutLayoutParams.AUTO_POSITION,
                StandOutLayoutParams.AUTO_POSITION, 100, 100);
    }

    @Override
    public int getFlags(int id) {
        return (((((StandOutFlags.FLAG_DECORATION_SYSTEM
                | StandOutFlags.FLAG_BODY_MOVE_ENABLE)
                | StandOutFlags.FLAG_WINDOW_HIDE_ENABLE)
                | StandOutFlags.FLAG_WINDOW_BRING_TO_FRONT_ON_TAP)
                | StandOutFlags.FLAG_WINDOW_EDGE_LIMITS_ENABLE)
                | StandOutFlags.FLAG_DECORATION_RESIZE_DISABLE)
                | StandOutFlags.FLAG_DECORATION_MAXIMIZE_DISABLE;
    }


    @Override
    public String getPersistentNotificationTitle(int id) {
        return getAppName() + " Running";
    }

    @Override
    public String getPersistentNotificationMessage(int id) {
        return "Psiphon Running" ;
    }

    // return an Intent that creates a new MultiWindow
    @Override
    public Intent getPersistentNotificationIntent(int id) {
        return StandOutWindow.getShowIntent(this, getClass(), id);
    }

    @Override
    public int getHiddenIcon() {
        return R.drawable.icon;
    }

    @Override
    public String getHiddenNotificationTitle(int id) {
        return getAppName() + " Hidden";
    }

    @Override
    public String getHiddenNotificationMessage(int id) {
        return "Click to restore" ;
    }

    // return an Intent that restores the MultiWindow
    @Override
    public Intent getHiddenNotificationIntent(int id) {
        return StandOutWindow.getShowIntent(this, getClass(), id);
    }

    @Override
    public Animation getShowAnimation(int id) {
        if (isExistingId(id)) {
            // restore
            return AnimationUtils.loadAnimation(this,
                    android.R.anim.slide_in_left);
        } else {
            // show
            return super.getShowAnimation(id);
        }
    }

    @Override
    public Animation getHideAnimation(int id) {
        return AnimationUtils.loadAnimation(this,
                android.R.anim.slide_out_right);
    }


    @Override
    public List<DropDownListItem> getDropDownItems(int id) {
        List<DropDownListItem> items = new ArrayList<DropDownListItem>();
        items.add(new DropDownListItem(android.R.drawable.ic_menu_help,
                "About", new Runnable() {

            @Override
            public void run() {
                Toast.makeText(
                        WindowProperties.this,
                        getAppName()
                                + " is a demonstration of StandOut.",
                        Toast.LENGTH_SHORT).show();
            }
        }));
        items.add(new DropDownListItem(android.R.drawable.ic_menu_preferences,
                "Settings", new Runnable() {

            @Override
            public void run() {
                Toast.makeText(WindowProperties.this,
                        "There are no settings.", Toast.LENGTH_SHORT)
                        .show();
            }
        }));
        return items;
    }

    @Override
    public void onReceiveData(int id, int requestCode, Bundle data,
                              Class<? extends StandOutWindow> fromCls, int fromId) {
        // receive data from WidgetsWindow's button press
        // to show off the data sending framework
    }

}
