// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

final class haq
{

    private int a;

    haq()
    {
    }

    private static hap a(Context context, int i, int j)
    {
        hap hap1 = (new hap()).a(b(context, g.tg, i)).c(b(context, g.tj, j)).b(b(context, g.tf, j));
        i = context.getApplicationContext().getResources().getInteger(j);
        if (hap1.b() > i)
        {
            hap1.b(Math.round(((float)i / (float)hap1.b()) * (float)hap1.a()));
        }
        context = context.getApplicationContext().getResources();
        return hap1.b(context.getInteger(g.ti)).a(context.getInteger(g.th));
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

    public hao a(Context context)
    {
        a = g.M(context);
        if (a < 48)
        {
            context = context.getApplicationContext().getResources();
            context = (new hap()).a(context.getInteger(g.tm)).c(context.getInteger(g.tk)).b(context.getInteger(g.tl)).b(context.getInteger(g.tn)).a(context.getInteger(g.tn));
        } else
        if (a < 64)
        {
            context = a(context, g.tc, g.tb);
        } else
        {
            context = a(context, g.te, g.td);
        }
        return context.c().d();
    }
}
