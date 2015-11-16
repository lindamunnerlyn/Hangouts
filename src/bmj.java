// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class bmj
{

    private Context a;
    private ani b;
    private String c[];
    private String d;
    private int e;
    private String f;
    private List g;

    bmj(Context context, ani ani, String as[])
    {
        d = "_id";
        e = -1;
        f = null;
        g = new ArrayList();
        a = context;
        b = ani;
        c = as;
    }

    public bmj a()
    {
        e = 3;
        return this;
    }

    public bmj b()
    {
        g.clear();
        g.add(Integer.valueOf(0));
        return this;
    }

    public bmi c()
    {
        return new bmi(a, b, c, d, e, f, (Integer[])g.toArray(new Integer[g.size()]));
    }
}
