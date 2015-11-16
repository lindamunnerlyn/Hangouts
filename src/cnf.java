// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;

public final class cnf extends AsyncTask
{

    final Context a;

    public cnf(Context context)
    {
        a = context;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        aobj = a;
        dns.a(((Context) (aobj)));
        aobj = ((Context) (aobj)).getCacheDir();
        (new File(((File) (aobj)), "telephony_brief_call_log")).delete();
        (new File(((File) (aobj)), "telephony_brief_call_log_v2")).delete();
        return null;
    }
}
