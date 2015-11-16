// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hbn
{

    boolean a;
    long b;
    boolean c;

    public hbn()
    {
        c = true;
    }

    public hbn a()
    {
        b = 0L;
        return this;
    }

    public hbn a(boolean flag)
    {
        a = flag;
        return this;
    }

    public hbn b()
    {
        c = false;
        return this;
    }

    public hbm c()
    {
        return new hbm(this);
    }
}
