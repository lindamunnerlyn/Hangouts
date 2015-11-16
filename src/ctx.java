// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ctx
{

    int a;
    iwz b;
    boolean c;
    String d;
    int e;
    boolean f;

    public ctx()
    {
        a = -1;
        b = null;
        c = false;
        d = null;
        e = 0;
        f = true;
    }

    public ctx a()
    {
        c = true;
        return this;
    }

    public ctx a(int i)
    {
        a = i;
        return this;
    }

    public ctx a(iwz iwz)
    {
        b = iwz;
        return this;
    }

    public ctx a(String s)
    {
        d = s;
        return this;
    }

    public ctw b()
    {
        return new ctw(this);
    }

    public ctx b(int i)
    {
        e = i;
        return this;
    }
}
