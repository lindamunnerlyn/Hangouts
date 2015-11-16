// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class ktn
    implements kve
{

    public int a;
    private boolean b;

    public ktn()
    {
        b = true;
        a = -1;
    }

    kvt J_()
    {
        return new kvt();
    }

    public kve b()
    {
        throw new UnsupportedOperationException("clone() should be implemented by subclasses.");
    }

    public Object clone()
    {
        return b();
    }
}
