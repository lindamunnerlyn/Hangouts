// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dhn extends dfa
{

    public static final boolean a = false;
    private final String d;
    private final byte e[];
    private final long f;
    private final boolean g;

    public dhn(ani ani1, String s, byte abyte0[], long l, boolean flag)
    {
        super(ani1);
        d = s;
        e = abyte0;
        f = l;
        g = flag;
    }

    public void a()
    {
        aoe aoe1 = new aoe(g.nS, b.h());
        if (!g && f > 0L)
        {
            aos aos1 = aoe1.b(f);
            if (aos1 != null && aos1.f == dqb.c)
            {
                if (a)
                {
                    ebw.b("Babel", "RetrieveMmsOperation: ignore repeated download");
                }
                return;
            }
            aoe1.b(f, dqb.c, System.currentTimeMillis());
            any.b(aoe1, f);
        }
        c.a(new dho(d, e, f, g));
    }

    static 
    {
        hik hik = ebw.n;
    }
}
