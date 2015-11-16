// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.List;

public final class aik
    implements Serializable
{

    private List a;
    private List b;

    aik(ail ail1)
    {
        a = ail1.a;
        b = ail1.b;
    }

    public static ail newBuilder()
    {
        return new ail();
    }

    public static ail newBuilder(aik aik1)
    {
        return newBuilder().a(aik1);
    }

    public ais a(int i)
    {
        if (i < 0 || i >= a.size())
        {
            return null;
        } else
        {
            return (ais)a.get(i);
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

    public aim b(int i)
    {
        if (i < 0 || i >= b.size())
        {
            return null;
        } else
        {
            return (aim)b.get(i);
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
