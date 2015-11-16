// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

final class fav extends fay
{

    final Intent a;
    final Bitmap b;
    final Activity i;
    final fau j;

    fav(fau fau1, ejx ejx, Intent intent, Bitmap bitmap, Activity activity)
    {
        j = fau1;
        a = intent;
        b = bitmap;
        i = activity;
        super(ejx);
    }

    protected void a(fbe fbe1)
    {
        try
        {
            fbe1.a((GoogleHelp)a.getParcelableExtra("EXTRA_GOOGLE_HELP"), b, new faw(this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (fbe fbe1)
        {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", fbe1);
        }
        c(fau.a());
    }
}
