// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import com.google.android.gms.common.ConnectionResult;

final class fel extends AsyncTask
{

    final emy a;
    final fen b;

    fel(emy emy1, fen fen1)
    {
        a = emy1;
        b = fen1;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        if (a.c().b())
        {
            b.a().a(new fem(this));
        } else
        {
            a.d();
        }
        return null;
    }
}
