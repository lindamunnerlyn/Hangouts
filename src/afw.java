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

public abstract class afw
    implements Comparable
{

    final agj a;
    Integer b;
    boolean c;
    public age d;
    private final int e;
    private final String f;
    private final int g;
    private final agb h;
    private afz i;
    private boolean j;
    private boolean k;
    private long l;
    private afl m;

    public afw(String s, agb agb1)
    {
        this(s, agb1, (byte)0);
    }

    private afw(String s, agb agb1, byte byte0)
    {
        agj agj1;
        if (agj.a)
        {
            agj1 = new agj();
        } else
        {
            agj1 = null;
        }
        a = agj1;
        c = true;
        j = false;
        k = false;
        l = 0L;
        m = null;
        e = -1;
        f = s;
        h = agb1;
        a(new age());
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

    public int a()
    {
        return e;
    }

    public int a(afw afw1)
    {
        afy afy1 = l();
        afy afy2 = afw1.l();
        if (afy1 == afy2)
        {
            return b.intValue() - afw1.b.intValue();
        } else
        {
            return afy2.ordinal() - afy1.ordinal();
        }
    }

    public afw a(afl afl)
    {
        m = afl;
        return this;
    }

    public afw a(afz afz1)
    {
        i = afz1;
        return this;
    }

    public afw a(age age1)
    {
        d = age1;
        return this;
    }

    public abstract aga a(aft aft);

    protected agh a(agh agh)
    {
        return agh;
    }

    public abstract void a(Object obj);

    public void a(String s)
    {
        if (agj.a)
        {
            a.a(s, Thread.currentThread().getId());
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

    public void b(agh agh)
    {
        if (h != null)
        {
            h.a(agh);
        }
    }

    void b(String s)
    {
        if (i != null)
        {
            i.b(this);
        }
        if (!agj.a) goto _L2; else goto _L1
_L1:
        long l1 = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) goto _L4; else goto _L3
_L3:
        (new Handler(Looper.getMainLooper())).post(new afx(this, s, l1));
_L6:
        return;
_L4:
        a.a(s, l1);
        a.a(toString());
        return;
_L2:
        long l2 = SystemClock.elapsedRealtime() - l;
        if (l2 >= 3000L)
        {
            agi.d("%d ms: %s", new Object[] {
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
        return a((afw)obj);
    }

    public String d()
    {
        return c();
    }

    public afl e()
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

    public afy l()
    {
        return afy.b;
    }

    public age m()
    {
        return d;
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
        return stringbuilder.append(s).append(c()).append(" ").append(s1).append(" ").append(l()).append(" ").append(b).toString();
    }
}
