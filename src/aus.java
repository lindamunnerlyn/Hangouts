// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;

final class aus extends AsyncTask
{

    final Runnable a;

    aus(Runnable runnable)
    {
        a = runnable;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        a.run();
        return null;
    }
}
