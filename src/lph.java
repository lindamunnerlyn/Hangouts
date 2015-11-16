// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public abstract class lph extends lnr
    implements Serializable
{

    private static final long serialVersionUID = 0xdc8d7f9b8cda387eL;
    final lns d;

    public lph(lns lns1)
    {
        if (lns1 == null)
        {
            throw new IllegalArgumentException("The type must not be null");
        } else
        {
            d = lns1;
            return;
        }
    }

    public int a(lnr lnr1)
    {
        long l = lnr1.d();
        long l1 = d();
        if (l1 == l)
        {
            return 0;
        }
        return l1 >= l ? 1 : -1;
    }

    public final lns a()
    {
        return d;
    }

    public final boolean b()
    {
        return true;
    }

    public int compareTo(Object obj)
    {
        return a((lnr)obj);
    }

    public String toString()
    {
        String s = String.valueOf(d.m());
        return (new StringBuilder(String.valueOf(s).length() + 15)).append("DurationField[").append(s).append("]").toString();
    }
}
