// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.List;

public final class fdp
{

    public final Activity a;
    final emy b;

    public fdp(Activity activity)
    {
        this(activity, (new emz(activity)).a(fej.c).a());
    }

    private fdp(Activity activity, emy emy)
    {
        a = activity;
        b = emy;
    }

    public void a(Intent intent)
    {
        if (!intent.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intent.hasExtra("EXTRA_GOOGLE_HELP"))
        {
            throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        }
        int i = emo.a(a);
        if (i == 0)
        {
            fej.a(b, new fdq(this, intent));
            return;
        }
        intent = (GoogleHelp)intent.getParcelableExtra("EXTRA_GOOGLE_HELP");
        intent = (new Intent("android.intent.action.VIEW")).setData(intent.b());
        if (i != 7)
        {
            boolean flag;
            if (a.getPackageManager().queryIntentActivities(intent, 0).size() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                a.startActivity(intent);
                return;
            }
        }
        emo.a(i, a);
    }
}
