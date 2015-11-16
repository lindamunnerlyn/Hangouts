// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import java.io.IOException;

public final class dcw extends AsyncTask
{

    public dcw()
    {
    }

    private static transient Void a()
    {
        try
        {
            String s = fap.a(g.nS).a(new String[] {
                "366187734148"
            });
            dcx.c().a(s);
        }
        catch (IOException ioexception)
        {
            ebw.d("Babel", "Error registering for GCM", ioexception);
        }
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a();
    }
}
