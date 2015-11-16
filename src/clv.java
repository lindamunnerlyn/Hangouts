// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class clv
{

    gwv a;
    isx b;
    itm c;
    iru d;
    iqm e;
    cst f;

    public clv()
    {
    }

    public clv a(iru iru1)
    {
        d = iru1;
        return this;
    }

    public cqx a()
    {
        if (a == null)
        {
            a = new gwv();
        }
        if (b == null)
        {
            b = new isx();
        }
        if (c == null)
        {
            c = new itm();
        }
        if (d == null)
        {
            throw new IllegalStateException(String.valueOf(iru.getCanonicalName()).concat(" must be set"));
        }
        if (e == null)
        {
            e = new iqm();
        }
        if (f == null)
        {
            f = new cst();
        }
        return new clr(this);
    }
}
