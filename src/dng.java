// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public class dng extends dmy
{

    private static final long serialVersionUID = 2L;
    public int f;
    public final int g;
    public final int h;
    public final long i;
    public final int j;
    public final String k;
    public final String l;
    public final String m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final int r;
    public final String s;
    public final int t;
    public final byte u[];

    public dng(iza iza1, int i1, long l1)
    {
        super(iza1.a.a, g.a(iza1.b, null), g.a(iza1.c, 0L));
        h = i1;
        i = l1;
        j = g.a(iza1.f, 0);
        m = iza1.d;
        boolean flag;
        if (g.a(iza1.n, 0L) == 0L)
        {
            l1 = -1L;
        } else
        {
            l1 = g.a(iza1.n, 0L);
        }
        n = l1;
        o = g.a(iza1.o, false);
        q = g.a(iza1.q, true);
        if (!q || g.a(iza1.p, 0) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p = flag;
        t = g.a(iza1.x, 0);
        if (iza1.e != null)
        {
            izb izb1 = iza1.e;
            k = izb1.a.b;
            l = aow.a(g.a(izb1.b, 0L));
            g = g.a(izb1.c, 0);
            int j1;
            if (i1 == 2)
            {
                eev.c("Babel", ">>> Other client is active, downgrade notification");
                i1 = 10;
            } else
            {
                i1 = g.a(izb1.c, 0);
            }
            j1 = i1;
            if (!o)
            {
                j1 = i1;
                if (i1 != 10)
                {
                    String s1 = String.valueOf(getClass().getSimpleName());
                    String s2 = String.valueOf(iza1.o);
                    String s3 = String.valueOf(iza1.a.a);
                    String s4 = String.valueOf(iza1.c);
                    eev.f("Babel", (new StringBuilder(String.valueOf(s1).length() + 132 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s1).append(" event received hasAdvancesSortTimestamp = ").append(s2).append(" advanceSortTimestamp = false, but notificationLevel = ").append(i1).append(" convId = ").append(s3).append(" timestamp = ").append(s4).toString());
                    j1 = 10;
                }
            }
            f = j1;
            if (izb1.d != null)
            {
                u = kws.toByteArray(izb1.d);
            } else
            {
                u = null;
            }
            iza1 = iza1.r;
            if (iza1 != null)
            {
                r = g.a(((iyf) (iza1)).a, 1);
                if (((iyf) (iza1)).b != null)
                {
                    s = ((iyf) (iza1)).b.a;
                    return;
                } else
                {
                    s = null;
                    return;
                }
            } else
            {
                r = 1;
                s = null;
                return;
            }
        } else
        {
            k = null;
            l = null;
            f = 10;
            g = 10;
            u = null;
            r = 1;
            s = null;
            return;
        }
    }

    protected dng(String s1, cgd cgd, long l1, String s2)
    {
        super(s1, cgd, l1);
        j = 1;
        m = s2;
        n = -1L;
        k = null;
        l = null;
        f = 10;
        g = 10;
        h = 0;
        i = 0L;
        o = false;
        p = false;
        q = true;
        u = null;
        r = 1;
        s = null;
        t = 2;
    }

    public static dng a(iza iza1, int i1, long l1, boolean flag, int j1)
    {
        if (iza1.g != null)
        {
            if (j1 != -1 && dcz.m(j1))
            {
                aoa aoa1 = dcn.e(j1);
                if (aoa1 != null && iza1.v != null && iza1.v.b != null && iza1.v.d != null && iza1.v.a != null)
                {
                    String s1 = iza1.v.a;
                    long l2 = g.a(iza1.v.d, 0L);
                    dcf dcf1 = new dcf(g.nU);
                    if (!dcf1.a(j1, s1) && l2 > dcf1.b(j1))
                    {
                        dcf1.a(j1, g.a(iza1.v.b, 0L));
                        dcf1.b(j1, s1);
                    }
                    if (iza1.v.c != null && dcz.n(j1))
                    {
                        long l3 = g.a(iza1.v.c, 0L);
                        if (l3 != dcf1.a(j1))
                        {
                            String s2 = String.valueOf(eev.b(aoa1.a()));
                            if (s2.length() != 0)
                            {
                                s2 = "Perform warm sync due to mismatched hash values for account ".concat(s2);
                            } else
                            {
                                s2 = new String("Perform warm sync due to mismatched hash values for account ");
                            }
                            eev.e("Babel", s2);
                            RealTimeChatService.a(aoa1.h(), false, false, 3, false, l3);
                            g.a(aoa1, 2309);
                        }
                    }
                }
            }
            return new dmo(iza1, i1, l1, iza1.g, flag);
        }
        if (iza1.h != null)
        {
            return new dnk(iza1, i1, l1, iza1.h);
        }
        if (iza1.i != null)
        {
            return new dnd(iza1, i1, l1, iza1.i);
        }
        if (iza1.j != null)
        {
            return new dnh(iza1, i1, l1, iza1.j);
        }
        if (iza1.k != null)
        {
            return new dnm(iza1, i1, l1, iza1.k);
        } else
        {
            eev.f("Babel", "Received Empty Event. Probably not implemented by server yet.");
            return null;
        }
    }

    public static List a(iza aiza[], boolean flag, long l1)
    {
        ArrayList arraylist = new ArrayList();
        int j1 = aiza.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            Object obj = aiza[i1];
            byte byte0;
            if (flag)
            {
                byte0 = 2;
            } else
            {
                byte0 = 0;
            }
            obj = a(((iza) (obj)), byte0, l1, false, -1);
            if (obj != null)
            {
                arraylist.add(obj);
            }
            i1++;
        }
        return arraylist;
    }

    public List a()
    {
        return null;
    }
}
