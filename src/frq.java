// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.data.DataHolder;

public final class frq
{

    public final DataHolder a;
    private final int b;
    private int c;

    public frq(DataHolder dataholder)
    {
        c = -1;
        a = dataholder;
        b = dataholder.d();
    }

    public int a()
    {
        return b;
    }

    public String a(String s)
    {
        return a.b(s, c, a.a(c));
    }

    public void a(int i)
    {
        c = i;
    }

    public int b()
    {
        return c;
    }

    public boolean c()
    {
        c = c + 1;
        return c >= 0 && c < b;
    }

    public boolean d()
    {
        return c >= b;
    }
}
