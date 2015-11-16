// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ghm
    implements fyb
{

    private final boolean a;
    private final gho b;

    public ghm(boolean flag, gho gho)
    {
        boolean flag1;
        if (flag || gho == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        gbh.a(flag1);
        a = flag;
        b = gho;
    }

    public boolean b()
    {
        return a;
    }

    public boolean c()
    {
        return b != null;
    }

    public gho d()
    {
        return b;
    }
}
