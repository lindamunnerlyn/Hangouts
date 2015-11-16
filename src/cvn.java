// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.io.Serializable;

public class cvn
    implements Serializable
{

    static final boolean a = false;
    private static final cxp g = new cxp();
    private static final long serialVersionUID = 1L;
    public dko b;
    public final cxp c;
    public final long d;
    public final long e;
    public boolean f;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private byte m[];

    public cvn()
    {
        c = g;
        d = -1L;
        e = 0L;
    }

    public cvn(hsv hsv1)
    {
        long l2 = -1L;
        super();
        if (hsv1 != null)
        {
            c = new cxp(hsv1);
            long l1 = l2;
            if (hsv1.b != null)
            {
                l1 = l2;
                if (hsv1.b.a != null)
                {
                    l1 = l2;
                    if (hsv1.b.a.length > 0)
                    {
                        l1 = l2;
                        if (hsv1.b.a[0].a != null)
                        {
                            l1 = g.a(hsv1.b.a[0].a, 0L);
                        }
                    }
                }
            }
            d = l1;
            if (hsv1.d != null && hsv1.d.a != null)
            {
                l1 = g.a(hsv1.d.a, 0);
            } else
            {
                l1 = 0L;
            }
            e = l1;
            return;
        } else
        {
            c = g;
            d = -1L;
            e = 0L;
            return;
        }
    }

    public cvn(ixg ixg1, long l1)
    {
        c = new cxp(ixg1);
        d = l1;
        e = g.a(ixg1.f, 0L);
    }

    public cvn(ixg ixg1, iqm iqm1)
    {
        c = new cxp(ixg1);
        d = -1L;
        e = g.a(ixg1.f, 0L);
        if (iqm1 != null && iqm1.c != null && iqm1.d != null)
        {
            k = g.a(iqm1.c, 0L);
            l = g.a(iqm1.d, 0L);
            return;
        } else
        {
            k = -1L;
            l = -1L;
            return;
        }
    }

    public static void a(ani ani1, cxp cxp1)
    {
        if (ani1 != null && dbq.j(ani1.h()) && cxp1 != null)
        {
            if (cxp1.e == cxq.b)
            {
                String s = String.valueOf(ebw.b(ani1.a()));
                if (s.length() != 0)
                {
                    s = "Perform warm sync based on ClientSyncHint from the server for account ".concat(s);
                } else
                {
                    s = new String("Perform warm sync based on ClientSyncHint from the server for account ");
                }
                ebw.e("Babel", s);
                RealTimeChatService.a(ani1.h(), false, false, 3, false, cxp1.f);
                g.a(ani1, 2308);
                return;
            }
            if (cxp1.e == cxq.d)
            {
                cxp1 = String.valueOf(ebw.b(ani1.a()));
                if (cxp1.length() != 0)
                {
                    cxp1 = "Clear all the local hash state based on the server request for account ".concat(cxp1);
                } else
                {
                    cxp1 = new String("Clear all the local hash state based on the server request for account ");
                }
                ebw.e("Babel", cxp1);
                (new daz(g.nS)).c(ani1.h());
                g.a(ani1, 2311);
                return;
            }
        }
    }

    protected static void a(ani ani1, String s, crm crm1)
    {
        if (!TextUtils.isEmpty(s))
        {
            boolean flag = s.startsWith("from_background_polling:");
            if (s.startsWith("from_hash_sync:"))
            {
                g.a(ani1, 2317);
            }
            char c1;
            int i1;
            long l1;
            if (flag)
            {
                c1 = '\u0715';
            } else
            {
                c1 = '\u0714';
            }
            g.a(ani1, c1);
            i1 = ani1.h();
            l1 = SystemClock.elapsedRealtime();
            ani1 = new byy();
            if (flag)
            {
                c1 = '\u01D7';
            } else
            {
                c1 = '\u01E1';
            }
            h.a(i1, l1, 10, ani1.a(c1).c(crm1.m).b(crm1.l).a(crm1.c));
        }
    }

    public static boolean a(hsv hsv1)
    {
        return hsv1 != null && hsv1.a != null;
    }

    public static boolean a(ixg ixg1)
    {
        int i1 = g.a(ixg1.a, 0);
        return i1 != 1 && i1 != 0 && i1 != 6;
    }

    static ceu[] a(iss aiss[], irm airm[])
    {
        int i1;
        int k1;
        boolean flag;
        flag = false;
        if (aiss == null)
        {
            return null;
        }
        i1 = 0;
        k1 = 0;
_L14:
        if (i1 >= aiss.length) goto _L2; else goto _L1
_L1:
        if (aiss[i1].g == null) goto _L4; else goto _L3
_L3:
        int l2 = k1;
        if (g.a(aiss[i1].g, false)) goto _L5; else goto _L4
_L4:
        if (aiss[i1].a == null || g.a(aiss[i1].a, 0) != 3) goto _L7; else goto _L6
_L6:
        l2 = k1;
        if (airm != null)
        {
            int i2 = 0;
            do
            {
                l2 = k1;
                if (i2 >= airm.length)
                {
                    break;
                }
                Object obj;
                if (airm[i2] != null)
                {
                    obj = airm[i2].c;
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    obj = ((irb) (obj)).l;
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    for (l2 = 0; l2 < obj.length; l2++)
                    {
                        if (!TextUtils.equals(obj[l2].a.b, aiss[i1].c.b) || obj[l2].e == null)
                        {
                            continue;
                        }
                        if (aiss[i1].d == null)
                        {
                            aiss[i1].d = new isu();
                        }
                        aiss[i1].d.g = new String[1];
                        aiss[i1].d.g[0] = obj[l2].e.a;
                    }

                }
                i2++;
            } while (true);
        }
          goto _L5
_L7:
        int j2 = 0;
_L12:
        l2 = k1;
        if (j2 >= aiss.length) goto _L5; else goto _L8
_L8:
        if (j2 == i1 || aiss[j2] == null) goto _L10; else goto _L9
_L9:
        if (aiss[j2].a != null && g.a(aiss[j2].a, 0) == 3)
        {
            l2 = 1;
        } else
        {
            l2 = 0;
        }
        if (l2 == 0 || !TextUtils.equals(aiss[i1].c.b, aiss[j2].c.b)) goto _L10; else goto _L11
_L11:
        aiss[i1] = null;
        l2 = k1 + 1;
_L5:
        i1++;
        k1 = l2;
        continue; /* Loop/switch isn't completed */
_L10:
        j2++;
        if (true) goto _L12; else goto _L2
_L2:
        airm = aiss;
        if (k1 > 0)
        {
            airm = new iss[aiss.length - k1];
            int j1 = 0;
            int k2;
            for (int l1 = ((flag) ? 1 : 0); j1 < aiss.length; l1 = k2)
            {
                k2 = l1;
                if (aiss[j1] != null)
                {
                    airm[l1] = aiss[j1];
                    k2 = l1 + 1;
                }
                j1++;
            }

        }
        return g.a(airm, null);
        if (true) goto _L14; else goto _L13
_L13:
    }

    static bxi j()
    {
        bxj bxj1 = (bxj)hgx.b(g.nS, bxj);
        if (bxj1 != null)
        {
            return bxj1.a(18);
        } else
        {
            return null;
        }
    }

    public cxp a()
    {
        return c;
    }

    public void a(long l1)
    {
        h = l1;
    }

    public void a(aoe aoe1, dfb dfb)
    {
        f = true;
        if (aoe1 != null)
        {
            aoe1 = aoe1.f();
        } else
        {
            aoe1 = null;
        }
        a(((ani) (aoe1)), c);
    }

    public void a(dko dko1)
    {
        b = dko1;
    }

    public int b()
    {
        return b.l();
    }

    public void b(long l1)
    {
        i = l1;
    }

    public dko c()
    {
        return b;
    }

    public void c(long l1)
    {
        j = l1;
    }

    public long d()
    {
        return k;
    }

    public long e()
    {
        return l;
    }

    public byte[] f()
    {
        if (m == null)
        {
            m = dkl.a(this);
        }
        return m;
    }

    protected long g()
    {
        return ((alw)hgx.a(g.nS, alw)).a("babel_yieldtime", 2000L);
    }

    public long h()
    {
        return i;
    }

    public long i()
    {
        return j;
    }

    static 
    {
        hik hik = ebw.k;
    }
}
