// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class itr
{

    private final itc a;

    private itr(itc itc)
    {
        a = itc;
    }

    public static itr a()
    {
        return new itr(its.b());
    }

    public static Runnable a(itr itr1, Runnable runnable)
    {
        if (itr1 == null)
        {
            return runnable;
        } else
        {
            return itp.a(itr1.a, runnable);
        }
    }

    public String toString()
    {
        if (a == null)
        {
            return "null ref";
        } else
        {
            return a.toString();
        }
    }
}
