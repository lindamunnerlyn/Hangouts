// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gxd
{

    boolean a;
    long b;
    boolean c;

    public gxd()
    {
        c = true;
    }

    public gxd a()
    {
        b = 0L;
        return this;
    }

    public gxd a(boolean flag)
    {
        a = flag;
        return this;
    }

    public gxd b()
    {
        c = false;
        return this;
    }

    public gxc c()
    {
        return new gxc(this);
    }
}
