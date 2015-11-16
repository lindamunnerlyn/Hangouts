// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import java.io.IOException;

final class bko extends AsyncTask
{

    final String a;
    final bkm b;

    bko(bkm bkm1, String s)
    {
        b = bkm1;
        a = s;
        super();
    }

    private transient Void a()
    {
        try
        {
            ((hbk)b.q.a(hbk)).a(a, (new hbn()).c());
        }
        catch (IOException ioexception)
        {
            eev.d("Babel", "Unable to refresh account", ioexception);
        }
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a();
    }
}
