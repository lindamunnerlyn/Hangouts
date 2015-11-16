// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import java.io.PrintWriter;
import java.io.StringWriter;

final class gzs extends AsyncTask
{

    final gzn a;

    gzs(gzn gzn1)
    {
        a = gzn1;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        aobj = new StringWriter();
        a.b(new PrintWriter(((java.io.Writer) (aobj))));
        g.a(4, "ImageResourceManager", ((StringWriter) (aobj)).toString());
        return null;
    }
}
