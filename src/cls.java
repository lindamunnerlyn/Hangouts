// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cls
    implements irn
{

    private joj A;
    private joj B;
    joj a;
    joj b;
    joj c;
    joj d;
    joj e;
    joj f;
    final clr g;
    private final irs h;
    private final gto i;
    private final gwp j;
    private final dvz k;
    private final dwc l;
    private final isc m;
    private final ise n;
    private final iri o;
    private final iqj p;
    private joj q;
    private joj r;
    private joj s;
    private joj t;
    private joj u;
    private joj v;
    private joj w;
    private joj x;
    private joj y;
    private joj z;

    cls(clr clr1, irs irs)
    {
        g = clr1;
        super();
        if (irs == null)
        {
            throw new NullPointerException();
        } else
        {
            h = irs;
            i = new gto();
            j = new gwp();
            k = new dvz();
            l = new dwc();
            m = new isc();
            n = new ise();
            o = new iri();
            p = new iqj();
            q = lfs.a(new irt(h));
            a = lfs.a(isd.b());
            r = lft.a(new joj[] {
                a
            });
            s = new isk(q, r);
            t = new dwd(q);
            u = new dvy(t);
            v = lfs.a(new isf(q));
            b = isg.b();
            w = lft.a(new joj[] {
                b
            });
            x = new ish(v, w);
            c = lfs.a(new gtq(x));
            d = lfs.a(new gtp(q, x));
            e = dwa.b();
            y = lfq.b().a("com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivity", e).a();
            f = lfs.a(new iqk(q, x, y, g.k, g.d));
            z = lft.a(new joj[] {
                g.a, g.b
            });
            A = lft.a(new joj[] {
                g.e, g.f
            });
            B = lft.a(new joj[] {
                g.g, g.h, g.i, g.j
            });
            return;
        }
    }

    public isj a()
    {
        return (isj)s.a();
    }

    public dvx b()
    {
        return (dvx)u.a();
    }

    public Object c()
    {
        return new clt(this);
    }
}
