// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import java.util.List;

final class bkc extends bka
{

    final bkb a;
    private final List b;
    private final int c;

    public bkc(bkb bkb1, Resources resources, List list, int i)
    {
        a = bkb1;
        super(resources, bkb.a(bkb1));
        b = list;
        c = i;
    }

    public int getCount()
    {
        int i = c;
        int j = bkb.c(a);
        return Math.min(bkb.c(a), b.size() - i * j);
    }

    public long getItemId(int i)
    {
        int j = c;
        int k = bkb.c(a);
        return (long)g.a((Integer)b.get(j * k + i), 0);
    }
}
