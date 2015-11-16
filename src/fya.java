// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


class fya extends fwi
{

    private enn a;

    public fya(enn enn1)
    {
        a = enn1;
    }

    public void a(Object obj)
    {
        enn enn1 = a;
        if (enn1 != null)
        {
            enn1.a(obj);
            a = null;
        }
    }
}
