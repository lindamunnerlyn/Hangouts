// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ktz
{

    private final Object a;
    private final int b;

    ktz(Object obj, int i)
    {
        a = obj;
        b = i;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ktz)
        {
            if (a == ((ktz) (obj = (ktz)obj)).a && b == ((ktz) (obj)).b)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return System.identityHashCode(a) * 65535 + b;
    }
}
