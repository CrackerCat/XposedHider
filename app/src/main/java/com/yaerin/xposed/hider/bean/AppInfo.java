package com.yaerin.xposed.hider.bean;

import android.graphics.drawable.Drawable;

public class AppInfo {

    private String packageName;
    private String label;
    private int flags;
    private Drawable icon;
    private boolean disabled;

    public AppInfo() {
    }

    public AppInfo(String packageName, String label, int flags, Drawable icon, boolean disabled) {
        this.packageName = packageName;
        this.label = label;
        this.flags = flags;
        this.icon = icon;
        this.disabled = disabled;
    }

    public AppInfo(AppInfo from) {
        this.packageName = from.packageName;
        this.label = from.label;
        this.icon = from.icon;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }
}
