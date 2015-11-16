// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ProgressDialog;
import android.os.Bundle;

public final class bgb
    implements bgd
{

    private bgc a;
    private ap b;

    public bgb(ap ap1)
    {
        b = ap1;
        a = new bgc();
    }

    public void a()
    {
        a.a();
    }

    public void a(android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        a.a(oncancellistener);
    }

    public void a(String s)
    {
        if (b != null)
        {
            Bundle bundle = new Bundle();
            bundle.putString("message", s);
            a.setArguments(bundle);
            s = b.a();
            a.a(s, null);
        }
    }

    public void b(String s)
    {
        ProgressDialog progressdialog = (ProgressDialog)a.c();
        if (progressdialog != null)
        {
            progressdialog.setMessage(s);
        }
    }
}
