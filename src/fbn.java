// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import com.google.android.gms.common.ConnectionResult;

final class fbn extends AsyncTask
{

    final ejx a;
    final fbp b;

    fbn(ejx ejx1, fbp fbp1)
    {
        a = ejx1;
        b = fbp1;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        if (a.c().b())
        {
            b.a().a(new fbo(this));
        } else
        {
            a.d();
        }
        return null;
    }
}
