// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

public abstract class afu
    implements Comparable
{

    Integer a;
    boolean b;
    public agc c;
    private final agh d;
    private final int e;
    private final String f;
    private final int g;
    private final afz h;
    private afx i;
    private boolean j;
    private boolean k;
    private long l;
    private afj m;

    public afu(String s, afz afz1)
    {
        this(s, afz1, (byte)0);
    }

    private afu(String s, afz afz1, byte byte0)
    {
        agh agh1;
        if (agh.a)
        {
            agh1 = new agh();
        } else
        {
            agh1 = null;
        }
        d = agh1;
        b = true;
        j = false;
        k = false;
        l = 0L;
        m = null;
        e = -1;
        f = s;
        h = afz1;
        a(new agc());
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = Uri.parse(s);
        if (s == null) goto _L2; else goto _L3
_L3:
        s = s.getHost();
        if (s == null) goto _L2; else goto _L4
_L4:
        byte0 = s.hashCode();
_L6:
        g = byte0;
        return;
_L2:
        byte0 = 0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static agh b(afu afu1)
    {
        return afu1.d;
    }

    public int a()
    {
        return e;
    }

    public int a(afu afu1)
    {
        afw afw1 = l();
        afw afw2 = afu1.l();
        if (afw1 == afw2)
        {
            return a.intValue() - afu1.a.intValue();
        } else
        {
            return afw2.ordinal() - afw1.ordinal();
        }
    }

    public afu a(afj afj)
    {
        m = afj;
        return this;
    }

    public afu a(afx afx1)
    {
        i = afx1;
        return this;
    }

    public afu a(agc agc1)
    {
        c = agc1;
        return this;
    }

    public abstract afy a(afr afr);

    protected agf a(agf agf)
    {
        return agf;
    }

    public abstract void a(Object obj);

    public void a(String s)
    {
        if (agh.a)
        {
            d.a(s, Thread.currentThread().getId());
        } else
        if (l == 0L)
        {
            l = SystemClock.elapsedRealtime();
            return;
        }
    }

    public int b()
    {
        return g;
    }

    public void b(agf agf)
    {
        if (h != null)
        {
            h.a(agf);
        }
    }

    void b(String s)
    {
        if (i != null)
        {
            i.b(this);
        }
        if (!agh.a) goto _L2; else goto _L1
_L1:
        long l1 = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) goto _L4; else goto _L3
_L3:
        (new Handler(Looper.getMainLooper())).post(new afv(this, s, l1));
_L6:
        return;
_L4:
        d.a(s, l1);
        d.a(toString());
        return;
_L2:
        long l2 = SystemClock.elapsedRealtime() - l;
        if (l2 >= 3000L)
        {
            agg.b("%d ms: %s", new Object[] {
                Long.valueOf(l2), toString()
            });
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public String c()
    {
        return f;
    }

    public int compareTo(Object obj)
    {
        return a((afu)obj);
    }

    public String d()
    {
        return c();
    }

    public afj e()
    {
        return m;
    }

    public boolean f()
    {
        return j;
    }

    public Map g()
    {
        return Collections.emptyMap();
    }

    public String h()
    {
        return k();
    }

    public byte[] i()
    {
        return null;
    }

    protected String j()
    {
        return "UTF-8";
    }

    public String k()
    {
        return (new StringBuilder("application/x-www-form-urlencoded; charset=")).append(j()).toString();
    }

    public afw l()
    {
        return afw.b;
    }

    public agc m()
    {
        return c;
    }

    public void n()
    {
        k = true;
    }

    public boolean o()
    {
        return k;
    }

    public String toString()
    {
        String s1 = (new StringBuilder("0x")).append(Integer.toHexString(b())).toString();
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (j)
        {
            s = "[X] ";
        } else
        {
            s = "[ ] ";
        }
        return stringbuilder.append(s).append(c()).append(" ").append(s1).append(" ").append(l()).append(" ").append(a).toString();
    }
}
