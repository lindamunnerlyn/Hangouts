// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public class cza extends cys
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
    public final long t;
    public final byte u[];

    public cza(isv isv1, int i1, long l1)
    {
        super(isv1.a.a, g.a(isv1.b, null), g.a(isv1.c, 0L));
        h = i1;
        i = l1;
        j = g.a(isv1.f, 0);
        m = isv1.d;
        boolean flag;
        if (g.a(isv1.n, 0L) == 0L)
        {
            l1 = -1L;
        } else
        {
            l1 = g.a(isv1.n, 0L);
        }
        n = l1;
        o = g.a(isv1.o, false);
        q = g.a(isv1.q, true);
        if (!q || g.a(isv1.p, 0) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p = flag;
        t = g.a(isv1.w, 0L);
        if (isv1.e != null)
        {
            isw isw1 = isv1.e;
            k = isw1.a.b;
            l = aoe.a(g.a(isw1.b, 0L));
            g = g.a(isw1.c, 0);
            int j1;
            if (i1 == 2)
            {
                ebw.c("Babel", ">>> Other client is active, downgrade notification");
                i1 = 10;
            } else
            {
                i1 = g.a(isw1.c, 0);
            }
            j1 = i1;
            if (!o)
            {
                j1 = i1;
                if (i1 != 10)
                {
                    String s1 = String.valueOf(getClass().getSimpleName());
                    String s2 = String.valueOf(isv1.o);
                    String s3 = String.valueOf(isv1.a.a);
                    String s4 = String.valueOf(isv1.c);
                    ebw.f("Babel", (new StringBuilder(String.valueOf(s1).length() + 132 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s1).append(" event received hasAdvancesSortTimestamp = ").append(s2).append(" advanceSortTimestamp = false, but notificationLevel = ").append(i1).append(" convId = ").append(s3).append(" timestamp = ").append(s4).toString());
                    j1 = 10;
                }
            }
            f = j1;
            if (isw1.d != null)
            {
                u = kop.toByteArray(isw1.d);
            } else
            {
                u = null;
            }
            isv1 = isv1.r;
            if (isv1 != null)
            {
                r = g.a(((isa) (isv1)).a, 1);
                if (((isa) (isv1)).b != null)
                {
                    s = ((isa) (isv1)).b.a;
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

    protected cza(String s1, cey cey, long l1, String s2)
    {
        super(s1, cey, l1);
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
        t = 0L;
    }

    public static cza a(isv isv1, int i1, long l1, boolean flag, int j1)
    {
        if (isv1.g != null)
        {
            if (j1 != -1 && dbq.j(j1))
            {
                ani ani1 = dbf.e(j1);
                if (ani1 != null && isv1.v != null && isv1.v.b != null && isv1.v.d != null && isv1.v.a != null)
                {
                    String s1 = isv1.v.a;
                    long l2 = g.a(isv1.v.d, 0L);
                    daz daz1 = new daz(g.nS);
                    if (!daz1.a(j1, s1) && l2 > daz1.b(j1))
                    {
                        daz1.a(j1, g.a(isv1.v.b, 0L));
                        daz1.b(j1, s1);
                    }
                    if (isv1.v.c != null && dbq.k(j1))
                    {
                        long l3 = g.a(isv1.v.c, 0L);
                        if (l3 != daz1.a(j1))
                        {
                            String s2 = String.valueOf(ebw.b(ani1.a()));
                            if (s2.length() != 0)
                            {
                                s2 = "Perform warm sync due to mismatched hash values for account ".concat(s2);
                            } else
                            {
                                s2 = new String("Perform warm sync due to mismatched hash values for account ");
                            }
                            ebw.e("Babel", s2);
                            RealTimeChatService.a(ani1.h(), false, false, 3, false, l3);
                            g.a(ani1, 2309);
                        }
                    }
                }
            }
            return new crm(isv1, i1, l1, isv1.g, flag);
        }
        if (isv1.h != null)
        {
            return new cze(isv1, i1, l1, isv1.h);
        }
        if (isv1.i != null)
        {
            return new cyx(isv1, i1, l1, isv1.i);
        }
        if (isv1.j != null)
        {
            return new czb(isv1, i1, l1, isv1.j);
        }
        if (isv1.k != null)
        {
            return new czg(isv1, i1, l1, isv1.k);
        } else
        {
            ebw.f("Babel", "Received Empty Event. Probably not implemented by server yet.");
            return null;
        }
    }

    public static List a(isv aisv[], boolean flag, long l1)
    {
        ArrayList arraylist = new ArrayList();
        int j1 = aisv.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            Object obj = aisv[i1];
            byte byte0;
            if (flag)
            {
                byte0 = 2;
            } else
            {
                byte0 = 0;
            }
            obj = a(((isv) (obj)), byte0, l1, false, -1);
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
