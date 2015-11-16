// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class brn extends bnk
{

    final brk a;

    protected brn(brk brk1)
    {
        a = brk1;
        super();
    }

    public void c(gjr gjr1)
    {
        if (a.a.equals(gjr1))
        {
            a.a = gjr1;
            a.i();
        }
    }
}
