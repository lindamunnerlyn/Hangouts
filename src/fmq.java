// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fmq
{

    int a;

    public fmq()
    {
        a = -1;
    }

    public fmp a()
    {
        boolean flag;
        if (a >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.b(flag, "Must provide valid client application ID!");
        return new fmp(this);
    }

    public fmq a(int i)
    {
        a = i;
        return this;
    }
}
