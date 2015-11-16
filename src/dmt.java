// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class dmt
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

    public dmt(int i, String s, int j, String s1)
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

    private dmt(lcv lcv1)
    {
        a = g.a(lcv1.a, 0);
        String s;
        int i;
        if (lcv1.b != null)
        {
            s = lcv1.b;
        } else
        {
            s = "";
        }
        b = s;
        if (lcv1.c != null)
        {
            int j;
            if (g.a(lcv1.c.a, false))
            {
                j = 1;
            } else
            {
                j = 0;
            }
            i = j;
            if (g.a(lcv1.c.b, false))
            {
                i = j | 2;
            }
            j = i;
            if (g.a(lcv1.c.c, false))
            {
                j = i | 4;
            }
            i = j;
            if (g.a(lcv1.c.d, false))
            {
                i = j | 8;
            }
        } else
        {
            i = 0;
        }
        c = i;
        if (lcv1.d != null)
        {
            d = lcv1.d.a;
        } else
        {
            d = null;
        }
        if (lcv1.e != null)
        {
            e = Long.valueOf(g.a(lcv1.e.a, 0L));
            f = lcv1.e.b;
            g = lcv1.e.c;
        } else
        {
            e = null;
            f = null;
            g = null;
        }
        if (lcv1.f != null)
        {
            h = lcv1.f.a;
            return;
        } else
        {
            h = null;
            return;
        }
    }

    public static List a(lcv alcv[])
    {
        ArrayList arraylist = new ArrayList();
        int j = alcv.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new dmt(alcv[i]));
        }

        return arraylist;
    }
}
