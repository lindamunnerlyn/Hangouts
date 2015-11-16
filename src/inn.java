// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class inn
{

    private final imy a;

    private inn(imy imy)
    {
        a = imy;
    }

    public static inn a()
    {
        return new inn(ino.b());
    }

    public static Runnable a(inn inn1, Runnable runnable)
    {
        if (inn1 == null)
        {
            return runnable;
        } else
        {
            return inl.a(inn1.a, runnable);
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
