// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class crr
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final Long e;
    public final String f;
    public final String g;
    public final String h;

    public crr(int i, String s, int j, String s1)
    {
        a = i;
        b = s;
        c = j;
        d = s1;
        e = null;
        f = null;
        g = null;
        h = null;
    }

    private crr(kur kur1)
    {
        a = g.a(kur1.a, 0);
        String s;
        int i;
        if (kur1.b != null)
        {
            s = kur1.b;
        } else
        {
            s = "";
        }
        b = s;
        if (kur1.c != null)
        {
            int j;
            if (g.a(kur1.c.a, false))
            {
                j = 1;
            } else
            {
                j = 0;
            }
            i = j;
            if (g.a(kur1.c.b, false))
            {
                i = j | 2;
            }
            j = i;
            if (g.a(kur1.c.c, false))
            {
                j = i | 4;
            }
            i = j;
            if (g.a(kur1.c.d, false))
            {
                i = j | 8;
            }
        } else
        {
            i = 0;
        }
        c = i;
        if (kur1.d != null)
        {
            d = kur1.d.a;
        } else
        {
            d = null;
        }
        if (kur1.e != null)
        {
            e = Long.valueOf(g.a(kur1.e.a, 0L));
            f = kur1.e.b;
            g = kur1.e.c;
        } else
        {
            e = null;
            f = null;
            g = null;
        }
        if (kur1.f != null)
        {
            h = kur1.f.a;
            return;
        } else
        {
            h = null;
            return;
        }
    }

    public static List a(kur akur[])
    {
        ArrayList arraylist = new ArrayList();
        int j = akur.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new crr(akur[i]));
        }

        return arraylist;
    }
}
