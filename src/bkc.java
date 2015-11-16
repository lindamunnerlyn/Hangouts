// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import java.io.IOException;

final class bkc extends AsyncTask
{

    final String a;
    final bka b;

    bkc(bka bka1, String s)
    {
        b = bka1;
        a = s;
        super();
    }

    private transient Void a()
    {
        try
        {
            ((gxa)bka.a(b).a(gxa)).a(a, (new gxd()).c());
        }
        catch (IOException ioexception)
        {
            ebw.d("Babel", "Unable to refresh account", ioexception);
        }
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a();
    }
}
