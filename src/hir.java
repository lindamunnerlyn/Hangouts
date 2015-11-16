// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class hir
{

    public static final String a = hie.getName();
    public static final String b = hif.getName();
    public static final String c = hmy.getName();
    private static hiq d;

    public static void a(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new hiq();
        }
        hlp1.a(hie, new hib(context));
    }

    public static void a(hlp hlp1)
    {
        if (d == null)
        {
            d = new hiq();
        }
        hnb hnb = hmy.a;
        hlp1.a(hmy, new hmy[0]);
    }

    public static void b(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new hiq();
        }
        ArrayList arraylist = new ArrayList(2);
        hnb hnb = hic.a;
        context = (hge)hlp.b(context, hge);
        if (context != null)
        {
            arraylist.add(new him(context));
        }
        hlp1.a(hif, (hif[])arraylist.toArray(new hif[arraylist.size()]));
    }

}
