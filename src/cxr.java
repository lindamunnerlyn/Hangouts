// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.io.Serializable;

public class cxr
    implements Serializable
{

    static final boolean a = false;
    private static final czt g = new czt();
    private static final long serialVersionUID = 1L;
    public dmf b;
    public final czt c;
    public final long d;
    public final long e;
    public boolean f;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private byte m[];

    public cxr()
    {
        c = g;
        d = -1L;
        e = 0L;
    }

    public cxr(hxz hxz1)
    {
        long l2 = -1L;
        super();
        if (hxz1 != null)
        {
            c = new czt(hxz1);
            long l1 = l2;
            if (hxz1.b != null)
            {
                l1 = l2;
                if (hxz1.b.a != null)
                {
                    l1 = l2;
                    if (hxz1.b.a.length > 0)
                    {
                        l1 = l2;
                        if (hxz1.b.a[0].a != null)
                        {
                            l1 = g.a(hxz1.b.a[0].a, 0L);
                        }
                    }
                }
            }
            d = l1;
            if (hxz1.d != null && hxz1.d.a != null)
            {
                l1 = g.a(hxz1.d.a, 0);
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

    public cxr(jdl jdl1, long l1)
    {
        c = new czt(jdl1);
        d = l1;
        e = g.a(jdl1.f, 0L);
    }

    public cxr(jdl jdl1, iwr iwr1)
    {
        c = new czt(jdl1);
        d = -1L;
        e = g.a(jdl1.f, 0L);
        if (iwr1 != null && iwr1.c != null && iwr1.d != null)
        {
            k = g.a(iwr1.c, 0L);
            l = g.a(iwr1.d, 0L);
            return;
        } else
        {
            k = -1L;
            l = -1L;
            return;
        }
    }

    public static void a(aoa aoa1, czt czt1)
    {
        if (aoa1 != null && dcz.m(aoa1.h()) && czt1 != null)
        {
            if (czt1.e == czu.b)
            {
                String s = String.valueOf(eev.b(aoa1.a()));
                if (s.length() != 0)
                {
                    s = "Perform warm sync based on ClientSyncHint from the server for account ".concat(s);
                } else
                {
                    s = new String("Perform warm sync based on ClientSyncHint from the server for account ");
                }
                eev.e("Babel", s);
                RealTimeChatService.a(aoa1.h(), false, false, 3, false, czt1.f);
                g.a(aoa1, 2308);
                return;
            }
            if (czt1.e == czu.d)
            {
                czt1 = String.valueOf(eev.b(aoa1.a()));
                if (czt1.length() != 0)
                {
                    czt1 = "Clear all the local hash state based on the server request for account ".concat(czt1);
                } else
                {
                    czt1 = new String("Clear all the local hash state based on the server request for account ");
                }
                eev.e("Babel", czt1);
                (new dcf(g.nU)).c(aoa1.h());
                g.a(aoa1, 2311);
                return;
            }
        }
    }

    protected static void a(aoa aoa1, String s, dmo dmo1)
    {
        if (!TextUtils.isEmpty(s))
        {
            boolean flag = s.startsWith("from_background_polling:");
            boolean flag1 = s.startsWith("from_hash_sync:");
            if (flag1)
            {
                dmo1.b(1);
                g.a(aoa1, 2317);
            }
            if (!flag && !flag1)
            {
                dmo1.b(2);
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
            g.a(aoa1, c1);
            i1 = aoa1.h();
            l1 = SystemClock.elapsedRealtime();
            aoa1 = new cab();
            if (flag)
            {
                c1 = '\u01D7';
            } else
            {
                c1 = '\u01E1';
            }
            h.a(i1, l1, 10, aoa1.a(c1).c(dmo1.m).b(dmo1.l).a(dmo1.c));
        }
    }

    public static boolean a(hxz hxz1)
    {
        return hxz1 != null && hxz1.a != null;
    }

    public static boolean a(jdl jdl1)
    {
        int i1 = g.a(jdl1.a, 0);
        return i1 != 1 && i1 != 0 && i1 != 6;
    }

    static cfz[] a(iyx aiyx[], ixr aixr[])
    {
        int i1;
        int k1;
        boolean flag;
        flag = false;
        if (aiyx == null)
        {
            return null;
        }
        i1 = 0;
        k1 = 0;
_L14:
        if (i1 >= aiyx.length) goto _L2; else goto _L1
_L1:
        if (aiyx[i1].g == null) goto _L4; else goto _L3
_L3:
        int l2 = k1;
        if (g.a(aiyx[i1].g, false)) goto _L5; else goto _L4
_L4:
        if (aiyx[i1].a == null || g.a(aiyx[i1].a, 0) != 3) goto _L7; else goto _L6
_L6:
        l2 = k1;
        if (aixr != null)
        {
            int i2 = 0;
            do
            {
                l2 = k1;
                if (i2 >= aixr.length)
                {
                    break;
                }
                Object obj;
                if (aixr[i2] != null)
                {
                    obj = aixr[i2].c;
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    obj = ((ixg) (obj)).l;
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    for (l2 = 0; l2 < obj.length; l2++)
                    {
                        if (!TextUtils.equals(obj[l2].a.b, aiyx[i1].c.b) || obj[l2].e == null)
                        {
                            continue;
                        }
                        if (aiyx[i1].d == null)
                        {
                            aiyx[i1].d = new iyz();
                        }
                        aiyx[i1].d.g = new String[1];
                        aiyx[i1].d.g[0] = obj[l2].e.a;
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
        if (j2 >= aiyx.length) goto _L5; else goto _L8
_L8:
        if (j2 == i1 || aiyx[j2] == null) goto _L10; else goto _L9
_L9:
        if (aiyx[j2].a != null && g.a(aiyx[j2].a, 0) == 3)
        {
            l2 = 1;
        } else
        {
            l2 = 0;
        }
        if (l2 == 0 || !TextUtils.equals(aiyx[i1].c.b, aiyx[j2].c.b)) goto _L10; else goto _L11
_L11:
        aiyx[i1] = null;
        l2 = k1 + 1;
_L5:
        i1++;
        k1 = l2;
        continue; /* Loop/switch isn't completed */
_L10:
        j2++;
        if (true) goto _L12; else goto _L2
_L2:
        aixr = aiyx;
        if (k1 > 0)
        {
            aixr = new iyx[aiyx.length - k1];
            int j1 = 0;
            int k2;
            for (int l1 = ((flag) ? 1 : 0); j1 < aiyx.length; l1 = k2)
            {
                k2 = l1;
                if (aiyx[j1] != null)
                {
                    aixr[l1] = aiyx[j1];
                    k2 = l1 + 1;
                }
                j1++;
            }

        }
        return g.a(aixr, null);
        if (true) goto _L14; else goto _L13
_L13:
    }

    static bye j()
    {
        byf byf1 = (byf)hlp.b(g.nU, byf);
        if (byf1 != null)
        {
            return byf1.a(18);
        } else
        {
            return null;
        }
    }

    public czt a()
    {
        return c;
    }

    public void a(long l1)
    {
        h = l1;
    }

    public void a(aow aow1, dgk dgk)
    {
        f = true;
        if (aow1 != null)
        {
            aow1 = aow1.f();
        } else
        {
            aow1 = null;
        }
        a(((aoa) (aow1)), c);
    }

    public void a(dmf dmf1)
    {
        b = dmf1;
    }

    public int b()
    {
        return b.k();
    }

    public void b(long l1)
    {
        i = l1;
    }

    public dmf c()
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
            m = dmc.a(this);
        }
        return m;
    }

    protected long g()
    {
        return ((amo)hlp.a(g.nU, amo)).a("babel_yieldtime", 2000L);
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
        hnc hnc = eev.k;
    }
}
