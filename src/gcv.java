// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

public final class gcv extends gct
    implements gcq
{

    private Intent a;

    public gcv()
    {
        a = new Intent();
        a.setPackage("com.google.android.gms");
        a.setAction("com.google.android.gms.people.smart_profile.ACTION_SHOW_PROFILE");
    }

    public gcq a()
    {
        a.putExtra("com.google.android.gms.people.smart_profile.APPLICATION_ID", 407);
        return this;
    }

    public gcq a(int i)
    {
        a.putExtra("com.google.android.gms.people.smart_profile.THEME_COLOR_INT", i);
        return this;
    }

    public gcq a(String s)
    {
        a.putExtra("com.google.android.gms.people.smart_profile.VIEWER_ACCOUNT_NAME", s);
        return this;
    }

    public gcq b()
    {
        int i = Math.min(Math.max(100, 0), 100);
        a.putExtra("com.google.android.gms.people.smart_profile.SLIDE_IN_PERCENTAGE", i);
        return this;
    }

    public gcq b(int i)
    {
        a.putExtra("com.google.android.gms.people.smart_profile.STATUS_BAR_COLOR", i);
        return this;
    }

    public gcq b(String s)
    {
        a.putExtra("com.google.android.gms.people.smart_profile.QUALIFIED_ID", s);
        return this;
    }

    public Intent c()
    {
        return a;
    }

    public gcq c(String s)
    {
        a.putExtra("com.google.android.gms.people.smart_profile.DISPLAY_NAME", s);
        return this;
    }

    public gcq d(String s)
    {
        a.putExtra("com.google.android.gms.people.smart_profile.AVATAR_URL", s);
        return this;
    }
}
