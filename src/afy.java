// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class afy
{

    public final Object a;
    public final afj b;
    public final agf c;
    public boolean d;

    private afy(agf agf)
    {
        d = false;
        a = null;
        b = null;
        c = agf;
    }

    public afy(Object obj, afj afj)
    {
        d = false;
        a = obj;
        b = afj;
        c = null;
    }

    public static afy a(agf agf)
    {
        return new afy(agf);
    }

    public boolean a()
    {
        return c == null;
    }
}
