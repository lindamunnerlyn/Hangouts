// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class dir extends dep
{

    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private long d;

    private dir(int j, long l, long l1)
    {
        super(dbf.e(j), l, l1);
        d = -1L;
    }

    public static dir b(int j)
    {
        dir dir2 = (dir)a.get(Integer.valueOf(j));
        dir dir1 = dir2;
        if (dir2 == null)
        {
            dir1 = new dir(j, g.a(g.nS, "babel_suggested_contact_lowmark_seconds", 0x11940) * 1000, g.a(g.nS, "babel_suggested_contact_highmark_seconds", 0x15180) * 1000);
            a.putIfAbsent(Integer.valueOf(j), dir1);
            dir1 = (dir)a.get(Integer.valueOf(j));
        }
        return dir1;
    }

    public static dir c(int j)
    {
        return (dir)a.remove(Integer.valueOf(j));
    }

    public void a()
    {
        c.c().clear();
        int j = g.a(g.nS, "babel_sc_max_pinned", 500);
        int k = g.a(g.nS, "babel_sc_max_favorites", 15);
        int l = g.a(g.nS, "babel_sc_max_you_hangout_with", 500);
        int i1 = g.a(g.nS, "babel_sc_max_other_contacts_on_hangouts", 500);
        int j1 = g.a(g.nS, "babel_sc_max_dismissed", 500);
        android.content.Context context = g.nS;
        int k1 = b.h();
        byte abyte0[] = ank.c(context, k1, "hash_pinned");
        byte abyte1[] = ank.c(context, k1, "hash_favorites");
        byte abyte2[] = ank.c(context, k1, "hash_people_you_hangout_with");
        byte abyte3[] = ank.c(context, k1, "hash_other_people_on_hangout");
        byte abyte4[] = ank.c(context, k1, "hash_dismissed_contacts");
        c.a(new cuh(j, k, l, i1, j1, abyte0, abyte1, abyte2, abyte3, abyte4));
    }

    protected void a(long l)
    {
        aoe aoe1;
        d = l;
        aoe1 = new aoe(g.nS, b.h());
        aoe1.a();
        aoe1.g("last_suggested_contacts_time", d);
        aoe1.b();
        aoe1.c();
        return;
        Exception exception;
        exception;
        aoe1.c();
        throw exception;
    }

    protected long i()
    {
        aoe aoe1;
        if (d != -1L)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        aoe1 = new aoe(g.nS, b.h());
        aoe1.a();
        d = aoe1.O("last_suggested_contacts_time");
        aoe1.b();
        aoe1.c();
        return d;
        Exception exception;
        exception;
        aoe1.c();
        throw exception;
    }

}
