// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class clt
    implements dwb, gts, irr
{

    joj a;
    final cls b;
    private final iqp c = new iqp();
    private final iqo d = new iqo();
    private joj e;
    private joj f;
    private joj g;
    private joj h;
    private joj i;
    private joj j;

    clt(cls cls1)
    {
        b = cls1;
        super();
        a = lfs.a(new iqq(c, b.f));
        e = lft.a(new joj[] {
            b.a
        });
        f = lft.a(new joj[] {
            b.b
        });
        g = lfq.b().a("com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivity", b.e).a();
        h = lft.a(new joj[] {
            b.g.a, b.g.b
        });
        i = lft.a(new joj[] {
            b.g.e, b.g.f
        });
        j = lft.a(new joj[] {
            b.g.g, b.g.h, b.g.i, b.g.j
        });
    }

    public guh a()
    {
        return (guh)b.c.a();
    }

    public Object a(irz irz)
    {
        return new clu(this, irz);
    }

    public gtl b()
    {
        return (gtl)b.d.a();
    }
}
