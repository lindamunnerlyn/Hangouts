// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dnp extends dmw
{

    private static final long serialVersionUID = 2L;
    public final long a;
    public final boolean b;

    public dnp(jdr jdr1)
    {
        boolean flag;
        if (jdr1.c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = g.a(Boolean.valueOf(flag), false);
        if (b)
        {
            a = g.a(jdr1.c.b, 0L);
            return;
        } else
        {
            a = 0L;
            return;
        }
    }
}
