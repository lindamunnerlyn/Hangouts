// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class clu
    implements dwk
{

    final clt a;
    private final irz b;
    private final gtw c;
    private final hkt d;
    private final dwl e;
    private final iry f;
    private final irk g;
    private joj h;
    private joj i;
    private joj j;
    private joj k;
    private joj l;
    private joj m;
    private joj n;
    private joj o;
    private joj p;

    clu(clt clt1, irz irz)
    {
        a = clt1;
        super();
        if (irz == null)
        {
            throw new NullPointerException();
        } else
        {
            b = irz;
            c = new gtw();
            d = new hkt();
            e = new dwl();
            f = new iry();
            g = new irk();
            h = lfs.a(new isa(b));
            i = new dwm(h);
            j = new dwj(a.b.g.c, a.a, i, a.b.g.l);
            k = lft.a(new joj[] {
                a.b.a
            });
            l = lft.a(new joj[] {
                a.b.b
            });
            m = lfq.b().a("com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivity", a.b.e).a();
            n = lft.a(new joj[] {
                a.b.g.a, a.b.g.b
            });
            o = lft.a(new joj[] {
                a.b.g.e, a.b.g.f
            });
            p = lft.a(new joj[] {
                a.b.g.g, a.b.g.h, a.b.g.i, a.b.g.j
            });
            return;
        }
    }

    public dwe a()
    {
        return (dwe)j.a();
    }
}
