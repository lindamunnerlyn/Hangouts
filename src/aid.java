// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.List;

public final class aid
    implements Serializable
{

    private List a;
    private List b;

    aid(aie aie1)
    {
        a = aie1.a;
        b = aie1.b;
    }

    public static aie newBuilder()
    {
        return new aie();
    }

    public static aie newBuilder(aid aid1)
    {
        return newBuilder().a(aid1);
    }

    public ail a(int i)
    {
        if (i < 0 || i >= a.size())
        {
            return null;
        } else
        {
            return (ail)a.get(i);
        }
    }

    public List a()
    {
        return a;
    }

    public int b()
    {
        return a.size();
    }

    public aif b(int i)
    {
        if (i < 0 || i >= b.size())
        {
            return null;
        } else
        {
            return (aif)b.get(i);
        }
    }

    public List c()
    {
        return b;
    }

    public int d()
    {
        return b.size();
    }
}
