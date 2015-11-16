// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import java.util.List;

final class bjq extends bjo
{

    final bjp a;
    private final List b;
    private final int c;

    public bjq(bjp bjp1, Resources resources, List list, int i)
    {
        a = bjp1;
        super(resources, bjp.a(bjp1));
        b = list;
        c = i;
    }

    public int getCount()
    {
        int i = c;
        int j = bjp.c(a);
        return Math.min(bjp.c(a), b.size() - i * j);
    }

    public long getItemId(int i)
    {
        int j = c;
        int k = bjp.c(a);
        return (long)g.a((Integer)b.get(j * k + i), 0);
    }
}
