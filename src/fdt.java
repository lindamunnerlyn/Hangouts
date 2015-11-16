// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

final class fdt extends fdw
{

    final Intent a;
    final Bitmap b;
    final Activity i;
    final fds j;

    fdt(fds fds1, emy emy, Intent intent, Bitmap bitmap, Activity activity)
    {
        j = fds1;
        a = intent;
        b = bitmap;
        i = activity;
        super(emy);
    }

    protected void a(fec fec1)
    {
        try
        {
            fec1.a((GoogleHelp)a.getParcelableExtra("EXTRA_GOOGLE_HELP"), b, new fdu(this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (fec fec1)
        {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", fec1);
        }
        c(fds.a());
    }
}
