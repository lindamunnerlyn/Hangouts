// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

final class gwg
{

    private int a;

    gwg()
    {
    }

    private static gwf a(Context context, int i, int j)
    {
        gwf gwf1 = (new gwf()).a(b(context, g.sF, i)).c(b(context, g.sI, j)).b(b(context, g.sE, j));
        i = context.getApplicationContext().getResources().getInteger(j);
        if (gwf1.b() > i)
        {
            gwf1.b(Math.round(((float)i / (float)gwf1.b()) * (float)gwf1.a()));
        }
        context = context.getApplicationContext().getResources();
        return gwf1.b(context.getInteger(g.sH)).a(context.getInteger(g.sG));
    }

    private static int b(Context context, int i, int j)
    {
        Resources resources = context.getApplicationContext().getResources();
        context = g.K(context);
        int k = ((DisplayMetrics) (context)).widthPixels;
        k = ((DisplayMetrics) (context)).heightPixels * k << 2;
        j = resources.getInteger(j);
        if (k == 0)
        {
            return j;
        } else
        {
            long l = resources.getInteger(i);
            return Math.min((int)(((long)k * l) / 100L), j);
        }
    }

    public gwe a(Context context)
    {
        a = g.M(context);
        if (a < 48)
        {
            context = context.getApplicationContext().getResources();
            context = (new gwf()).a(context.getInteger(g.sL)).c(context.getInteger(g.sJ)).b(context.getInteger(g.sK)).b(context.getInteger(g.sM)).a(context.getInteger(g.sM));
        } else
        if (a < 64)
        {
            context = a(context, g.sB, g.sA);
        } else
        {
            context = a(context, g.sD, g.sC);
        }
        return context.c().d();
    }
}
