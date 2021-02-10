package com;

public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FontsOverride.setDefaultFont(this, "DEFAULT");
    }
}
