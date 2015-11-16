// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class dnh extends dng
{

    private static final long serialVersionUID = 1L;
    public final int a;
    public final int b;
    public final List v;
    public final long w;
    public final String x;

    public dnh(iza iza, int i, long l, jal jal1)
    {
        super(iza, i, l);
        a = g.a(jal1.a, 0) - 1;
        b = g.a(jal1.g, 0);
        v = g.a(jal1.b, null);
        w = g.a(jal1.c, 0L);
        if (jal1.d != null && !TextUtils.isEmpty(jal1.d.a))
        {
            x = jal1.d.a;
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
