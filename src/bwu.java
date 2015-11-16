// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class bwu extends guy
{

    final Activity a;
    final int b;
    final String c;
    final Uri d;
    private bwj g[];

    bwu(Context context, String s, Activity activity, int i, String s1, Uri uri)
    {
        a = activity;
        b = i;
        c = s1;
        d = uri;
        super(context, s);
    }

    protected gvv a(Context context)
    {
        context = new ArrayList();
        for (Iterator iterator = hlp.c(a, bwk).iterator(); iterator.hasNext(); Collections.addAll(context, ((bwk)iterator.next()).b(a, b))) { }
        if (!context.isEmpty())
        {
            g = (bwj[])context.toArray(new bwj[context.size()]);
        }
        return new gvv(true);
    }

    protected void g_()
    {
        bwt.a(a, c, d, g);
    }
}
