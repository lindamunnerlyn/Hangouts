// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hcw
{

    hcy a;
    Object b;

    public hcw(hcy hcy, Object obj)
    {
        a = hcy;
        b = obj;
    }

    public boolean a(hcy hcy, Object obj)
    {
        if (a != hcy)
        {
            return false;
        }
        if (b == null)
        {
            return true;
        } else
        {
            return b.equals(null);
        }
    }
}
