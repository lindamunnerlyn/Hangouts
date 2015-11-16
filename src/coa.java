// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;

final class coa extends AsyncTask
{

    final cnz a;

    coa(cnz cnz1)
    {
        a = cnz1;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        long l = System.currentTimeMillis();
        (new aow(a.a.a, a.a.c)).e(l * 1000L - 0xc92a69c000L);
        return null;
    }
}
