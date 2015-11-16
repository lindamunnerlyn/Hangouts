// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hhn
{

    hhp a;
    Object b;

    public hhn(hhp hhp, Object obj)
    {
        a = hhp;
        b = obj;
    }

    public boolean a(hhp hhp, Object obj)
    {
        if (a != hhp)
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
