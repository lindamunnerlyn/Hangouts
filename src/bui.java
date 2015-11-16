// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

public final class bui extends Enum
{

    public static final bui a;
    public static final bui b;
    public static final bui c;
    public static final bui d;
    public static final bui e;
    private static final bui h[];
    private final int f;
    private final int g;

    private bui(String s, int i, int j)
    {
        this(s, i, j, j);
    }

    private bui(String s, int i, int j, int k)
    {
        super(s, i);
        f = j;
        g = k;
    }

    public static bui valueOf(String s)
    {
        return (bui)Enum.valueOf(bui, s);
    }

    public static bui[] values()
    {
        return (bui[])h.clone();
    }

    public String a(Context context, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return context.getResources().getString(g);
        } else
        {
            return context.getResources().getString(f, new Object[] {
                s
            });
        }
    }

    static 
    {
        a = new bui("INVITED_ONLY", 0, l.dv);
        b = new bui("DOMAIN_RESTRICTED", 1, l.cC, l.cD);
        c = new bui("DOMAIN_WITH_EXTERNAL", 2, l.cE, l.cF);
        d = new bui("KNOCKABLE", 3, l.dz);
        e = new bui("OPEN", 4, l.eo);
        h = (new bui[] {
            a, b, c, d, e
        });
    }
}
