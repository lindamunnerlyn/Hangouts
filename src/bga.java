// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ProgressDialog;
import android.content.Context;

public final class bga
    implements bgd
{

    private ProgressDialog a;

    public bga(Context context)
    {
        a = new ProgressDialog(context);
        a.setProgressStyle(0);
    }

    public void a()
    {
        if (a != null)
        {
            if (a.isShowing())
            {
                a.dismiss();
            }
            a = null;
        }
    }

    public void a(android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        a.setOnCancelListener(oncancellistener);
    }

    public void a(String s)
    {
        a.setMessage(s);
        a.show();
    }

    public void b(String s)
    {
        a.setMessage(s);
    }
}
