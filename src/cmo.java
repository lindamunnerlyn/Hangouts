// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;

final class cmo extends AsyncTask
{

    final cmn a;

    cmo(cmn cmn1)
    {
        a = cmn1;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        aobj = dit.a(a.a.b);
        if (aobj != null)
        {
            ((dit) (aobj)).a();
        }
        return null;
    }
}
