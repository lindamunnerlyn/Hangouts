// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import java.io.StringWriter;

final class gvh extends AsyncTask
{

    final gvc a;

    gvh(gvc gvc1)
    {
        a = gvc1;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        aobj = new gvi(this, new StringWriter());
        a.b(((java.io.PrintWriter) (aobj)));
        g.a(4, "ImageResourceManager", ((Object) (aobj)).toString());
        return null;
    }
}
