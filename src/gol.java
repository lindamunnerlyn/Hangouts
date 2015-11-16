// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.Context;

public final class gol
{

    public static final String a = gob.getName();
    public static final String b = goo.getName();
    private static gok c;

    public static void a(Context context, hlp hlp1)
    {
        if (c == null)
        {
            c = new gok();
        }
        gog gog1 = (gog)hlp.b(context, gog);
        goh goh1 = (goh)hlp.b(context, goh);
        gof gof1 = goe.newBuilder();
        if (gog1 != null)
        {
            gof1.a(gog1);
        }
        if (goh1 != null)
        {
            gof1.a(goh1);
        }
        hlp1.a(gob, gob.a((gon)hlp.a(context, goo), (Application)context.getApplicationContext(), gof1.a()));
    }

    public static void b(Context context, hlp hlp1)
    {
        if (c == null)
        {
            c = new gok();
        }
        String s = hlp.a(context, "com.google.android.libraries.performance.primes.modules.clearcutlogsource");
        g.e(s);
        hlp1.a(goo, new goo((gad)hlp.a(context, gad), s));
    }

}
