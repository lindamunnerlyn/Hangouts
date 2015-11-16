// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

public final class btv extends Enum
{

    public static final btv a;
    public static final btv b;
    public static final btv c;
    public static final btv d;
    public static final btv e;
    private static final btv h[];
    private final int f;
    private final int g;

    private btv(String s, int i, int j)
    {
        this(s, i, j, j);
    }

    private btv(String s, int i, int j, int k)
    {
        super(s, i);
        f = j;
        g = k;
    }

    public static btv valueOf(String s)
    {
        return (btv)Enum.valueOf(btv, s);
    }

    public static btv[] values()
    {
        return (btv[])h.clone();
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
        a = new btv("INVITED_ONLY", 0, l.dM);
        b = new btv("DOMAIN_RESTRICTED", 1, l.cT, l.cU);
        c = new btv("DOMAIN_WITH_EXTERNAL", 2, l.cV, l.cW);
        d = new btv("KNOCKABLE", 3, l.dQ);
        e = new btv("OPEN", 4, l.eF);
        h = (new btv[] {
            a, b, c, d, e
        });
    }
}
