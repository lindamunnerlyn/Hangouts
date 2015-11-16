// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ConcurrentHashMap;

public final class dke extends dfy
{

    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private long e;

    private dke(int j, long l, long l1)
    {
        super(dcn.e(j), l, l1);
        e = -1L;
    }

    public static dke b(int j)
    {
        dke dke2 = (dke)a.get(Integer.valueOf(j));
        dke dke1 = dke2;
        if (dke2 == null)
        {
            dke1 = new dke(j, g.a(g.nU, "babel_suggested_contact_lowmark_seconds", 0x11940) * 1000, g.a(g.nU, "babel_suggested_contact_highmark_seconds", 0x15180) * 1000);
            a.putIfAbsent(Integer.valueOf(j), dke1);
            dke1 = (dke)a.get(Integer.valueOf(j));
        }
        return dke1;
    }

    public static dke c(int j)
    {
        return (dke)a.remove(Integer.valueOf(j));
    }

    public void a()
    {
        k();
        int j = g.a(g.nU, "babel_sc_max_pinned", 500);
        int k = g.a(g.nU, "babel_sc_max_favorites", 15);
        int l = g.a(g.nU, "babel_sc_max_you_hangout_with", 500);
        int i1 = g.a(g.nU, "babel_sc_max_other_contacts_on_hangouts", 500);
        int j1 = g.a(g.nU, "babel_sc_max_dismissed", 500);
        android.content.Context context = g.nU;
        int k1 = super.b.a;
        a(((dmf) (new cwl(j, k, l, i1, j1, aoc.c(context, k1, "hash_pinned"), aoc.c(context, k1, "hash_favorites"), aoc.c(context, k1, "hash_people_you_hangout_with"), aoc.c(context, k1, "hash_other_people_on_hangout"), aoc.c(context, k1, "hash_dismissed_contacts")))));
    }

    protected void a(long l)
    {
        e = l;
        aoc.b(g.nU, super.b.a, "last_suggested_contacts_time", e);
    }

    protected long i()
    {
        if (e == -1L)
        {
            e = aoc.a(g.nU, super.b.a, "last_suggested_contacts_time", 0L);
        }
        return e;
    }

}
