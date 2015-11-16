// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gko
    implements gap
{

    private final boolean a;
    private final gkq b;

    public gko(boolean flag, gkq gkq)
    {
        boolean flag1;
        if (flag || gkq == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        gdv.a("Expected condition to be true", flag1);
        a = flag;
        b = gkq;
    }

    public boolean b()
    {
        return a;
    }

    public boolean c()
    {
        return b != null;
    }

    public gkq d()
    {
        return b;
    }
}
