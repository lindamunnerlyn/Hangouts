// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class drc
    implements hjv
{

    final drb a;

    drc(drb drb1)
    {
        a = drb1;
        super();
    }

    public boolean a(hjr hjr, Object obj)
    {
        boolean flag = g.a((Boolean)obj, false);
        if (!flag)
        {
            g.a(drb.a(a).a(), 0, 0);
        }
        hjr = drb.a(a);
        char c;
        if (flag)
        {
            c = '\u059D';
        } else
        {
            c = '\u059B';
        }
        g.a(hjr, c);
        return true;
    }
}
