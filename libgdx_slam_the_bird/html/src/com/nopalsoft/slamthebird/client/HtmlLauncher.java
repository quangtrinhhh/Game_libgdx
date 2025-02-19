package com.nopalsoft.slamthebird.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.nopalsoft.slamthebird.MainSlamBird;
import com.nopalsoft.slamthebird.handlers.GameServicesHandler;
import com.nopalsoft.slamthebird.handlers.RequestHandler;

public class HtmlLauncher extends GwtApplication implements RequestHandler, GameServicesHandler {

    @Override
    public GwtApplicationConfiguration getConfig() {
        // 480 x 800 = 3:5 aspect ratio.
        // width = 3 / 5 * height; <<-- To calculate the width and keep aspect ratio given height
        int height = com.google.gwt.user.client.Window.getClientHeight();
        int width = (int) (0.6 * height);

        return new GwtApplicationConfiguration(width, height);
    }

    @Override
    public ApplicationListener createApplicationListener() {
        return new MainSlamBird(this, this);
    }

    @Override
    public void submitScore(long score) {

    }

    @Override
    public void unlockAchievement(String achievementId) {

    }

    @Override
    public void getLeaderboard() {

    }

    @Override
    public void getAchievements() {

    }

    @Override
    public boolean isSignedIn() {
        return false;
    }

    @Override
    public void signIn() {

    }

    @Override
    public void signOut() {

    }

    @Override
    public void showRater() {

    }

    @Override
    public void showInterstitial() {

    }

    @Override
    public void showFacebook() {

    }

    @Override
    public void showMoreGames() {

    }

    @Override
    public void shareOnFacebook(String mensaje) {

    }

    @Override
    public void shareOnTwitter(String mensaje) {

    }

    @Override
    public void removeAds() {

    }

    @Override
    public void showAdBanner() {

    }

    @Override
    public void hideAdBanner() {

    }

    @Override
    public void buy5milCoins() {

    }

    @Override
    public void buy15milCoins() {

    }

    @Override
    public void buy30milCoins() {

    }

    @Override
    public void buy50milCoins() {

    }
}