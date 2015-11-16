// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class diw extends dgj
{

    public static final boolean a = false;
    private final String e;
    private final byte f[];
    private final long g;
    private final boolean h;

    public diw(aoa aoa, String s, byte abyte0[], long l, boolean flag)
    {
        super(aoa);
        e = s;
        f = abyte0;
        g = l;
        h = flag;
    }

    public void a()
    {
        aow aow1 = new aow(g.nU, super.b.a);
        if (!h && g > 0L)
        {
            apk apk1 = aow1.b(g);
            if (apk1 != null && apk1.f == dsu.c)
            {
                if (a)
                {
                    eev.b("Babel", "RetrieveMmsOperation: ignore repeated download");
                }
                return;
            }
            aow1.b(g, dsu.c, System.currentTimeMillis());
            aoq.b(aow1, g);
        }
        a(((dmf) (new dix(e, f, g, h))));
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
