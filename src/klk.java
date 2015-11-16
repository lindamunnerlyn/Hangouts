// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class klk
    implements knb
{

    public int a;
    private boolean b;

    public klk()
    {
        b = true;
        a = -1;
    }

    knq I_()
    {
        return new knq();
    }

    public knb b()
    {
        throw new UnsupportedOperationException("clone() should be implemented by subclasses.");
    }

    public Object clone()
    {
        return b();
    }
}
