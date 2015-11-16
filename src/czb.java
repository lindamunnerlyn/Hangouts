// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class czb extends cza
{

    private static final long serialVersionUID = 1L;
    public final int a;
    public final int b;
    public final List v;
    public final long w;
    public final String x;

    public czb(isv isv, int i, long l, iug iug1)
    {
        super(isv, i, l);
        a = g.a(iug1.a, 0) - 1;
        b = g.a(iug1.g, 0);
        v = g.a(iug1.b, null);
        w = g.a(iug1.c, 0L);
        if (iug1.d != null && !TextUtils.isEmpty(iug1.d.a))
        {
            x = iug1.d.a;
            return;
        } else
        {
            x = null;
            return;
        }
    }

    public List a()
    {
        ArrayList arraylist = new ArrayList(v);
        if (a != 1)
        {
            arraylist.add(d);
        }
        return arraylist;
    }
}
