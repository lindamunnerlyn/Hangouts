// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cru
{

    int a;
    iqu b;
    boolean c;
    String d;
    int e;
    boolean f;

    public cru()
    {
        a = -1;
        b = null;
        c = false;
        d = null;
        e = 0;
        f = true;
    }

    public cru a()
    {
        c = true;
        return this;
    }

    public cru a(int i)
    {
        a = i;
        return this;
    }

    public cru a(String s)
    {
        d = s;
        return this;
    }

    public crt b()
    {
        return new crt(this);
    }

    public cru b(int i)
    {
        e = i;
        return this;
    }
}
