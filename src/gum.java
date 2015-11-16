// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public final class gum
{

    private static final Set a = Collections.newSetFromMap(new WeakHashMap());

    public static void a()
    {
        g.w();
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            a(80);
        }
    }

    public static void a(int i)
    {
        g.w();
        (new StringBuilder(28)).append("Trimming memory: ").append(i);
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gul)iterator.next()).a(i)) { }
    }

    static void a(gul gul1)
    {
        if (g.v())
        {
            a.add(gul1);
            return;
        } else
        {
            g.a(new gun(gul1));
            return;
        }
    }

    static Set b()
    {
        return a;
    }

}
