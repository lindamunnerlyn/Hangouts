// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class arb
{

    public arb()
    {
    }

    public cbt a(cbt cbt)
    {
        cbt cbt1 = cbt;
        if (cbt == null)
        {
            cbt1 = b();
        }
        return cbt1;
    }

    public abstract boolean a();

    protected abstract cbt b();
}
