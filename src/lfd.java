// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class lfd extends ldh
    implements Serializable
{

    public static final ldh a = new lfd();
    private static final long serialVersionUID = 0x24de85b89b81f517L;

    private lfd()
    {
    }

    private Object readResolve()
    {
        return a;
    }

    public long a(long l, int i)
    {
        return h.a(l, i);
    }

    public long a(long l, long l1)
    {
        return h.a(l, l1);
    }

    public ldi a()
    {
        return ldi.a();
    }

    public boolean b()
    {
        return true;
    }

    public final boolean c()
    {
        return true;
    }

    public int compareTo(Object obj)
    {
        long l = ((ldh)obj).d();
        if (1L == l)
        {
            return 0;
        }
        return 1L >= l ? 1 : -1;
    }

    public final long d()
    {
        return 1L;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof lfd)
        {
            flag = flag1;
            if (1L == 1L)
            {
                flag = true;
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return 1;
    }

    public String toString()
    {
        return "DurationField[millis]";
    }

}
