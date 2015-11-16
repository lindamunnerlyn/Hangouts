// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class ggn
    implements gfx
{

    private static final int a[] = {
        100, 103, 106, 109, 112
    };
    private static final int b[] = {
        101, 104, 107, 110, 113
    };
    private static final int c[] = {
        102, 105, 108, 111, 114
    };
    private final gfx d;
    private final gbl e;
    private final ahg f;
    private final long g;
    private boolean h;
    private boolean i;
    private final Map j;
    private final long k[];
    private final long l[];
    private final long m[];

    public ggn(Context context, gfx gfx1, String s, boolean flag)
    {
        this(gfx1, ((gbl) (new ggp(context, s))), new ahg(), flag);
    }

    private ggn(gfx gfx1, gbl gbl1, ahg ahg1, boolean flag)
    {
        d = gfx1;
        e = gbl1;
        f = ahg1;
        g = 40000L;
        h = false;
        i = false;
        j = new HashMap();
        k = new long[5];
        Arrays.fill(k, -1L);
        l = new long[5];
        Arrays.fill(l, -1L);
        m = new long[5];
        if (flag)
        {
            m[1] = 1L;
            m[4] = 1L;
            return;
        } else
        {
            m[1] = 1L;
            m[0] = 1L;
            m[2] = 1L;
            m[3] = 1L;
            return;
        }
    }

    private void a(long l1, boolean flag)
    {
        Integer integer;
        boolean flag1;
        flag1 = false;
        integer = (Integer)j.remove(Long.valueOf(l1));
        break MISSING_BLOCK_LABEL_21;
_L2:
        int i1;
        if (i1 != 0)
        {
            a();
            return;
        }
        do
        {
            do
            {
                return;
            } while (integer == null || m[integer.intValue()] <= 0L);
            l[integer.intValue()] = SystemClock.elapsedRealtime();
        } while (!flag);
        al = m;
        i1 = integer.intValue();
        al[i1] = al[i1] - 1L;
        i1 = 0;
        do
        {
label0:
            {
                if (i1 >= m.length)
                {
                    break label0;
                }
                if (m[i1] > 0L)
                {
                    i1 = ((flag1) ? 1 : 0);
                    continue; /* Loop/switch isn't completed */
                }
                i1++;
            }
        } while (true);
        i1 = 1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    void a()
    {
        if (i)
        {
            gkc.a("vclib", "Reporting already done!");
            return;
        }
        gkc.a("vclib", "Reporting mesi marks");
        int i1 = 0;
        while (i1 < 5) 
        {
            if (k[i1] != -1L)
            {
                e.a(a[i1], k[i1]);
                if (m[i1] == 0L)
                {
                    e.a(b[i1], l[i1]);
                } else
                {
                    long l1;
                    if (l[i1] == -1L)
                    {
                        l1 = SystemClock.elapsedRealtime();
                    } else
                    {
                        l1 = l[i1];
                    }
                    e.a(c[i1], l1);
                }
            }
            i1++;
        }
        e.b();
        i = true;
    }

    public void a(long l1)
    {
        if (gkc.b())
        {
            gkc.a("vclib", (new StringBuilder(36)).append("Request failed: ").append(l1).toString());
        }
        a(l1, false);
        d.a(l1);
    }

    public void a(long l1, String s)
    {
        if (gkc.b())
        {
            gkc.a("vclib", (new StringBuilder(String.valueOf(s).length() + 51)).append("Request starting: ").append(s).append(", requestId: ").append(l1).toString());
        }
        int i1;
        if (s.startsWith("hangout_participants/add"))
        {
            i1 = 0;
        } else
        if (s.startsWith("media_sessions/add"))
        {
            i1 = 1;
        } else
        if (s.startsWith("media_sources/add"))
        {
            i1 = 2;
        } else
        if (s.startsWith("media_streams/add"))
        {
            i1 = 3;
        } else
        if (s.startsWith("hangouts/bulk"))
        {
            i1 = 4;
        } else
        {
            i1 = -1;
        }
        if (i1 != -1)
        {
            j.put(Long.valueOf(l1), Integer.valueOf(i1));
            if (k[i1] == -1L)
            {
                k[i1] = SystemClock.elapsedRealtime();
            }
            if (g > 0L && !h)
            {
                gkc.a("vclib", "Scheduling fallback reporting");
                g.a(new ggo(this), g);
                h = true;
            }
        }
        d.a(l1, s);
    }

    public void a(long l1, byte abyte0[])
    {
        if (gkc.b())
        {
            gkc.a("vclib", (new StringBuilder(39)).append("Request completed: ").append(l1).toString());
        }
        a(l1, true);
        d.a(l1, abyte0);
    }

}
