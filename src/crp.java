// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

public final class crp
    implements Serializable
{

    private static final boolean a = false;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private boolean g;

    private crp(String s, boolean flag, boolean flag1, int i, boolean flag2)
    {
        b = s;
        c = flag;
        e = flag1;
        f = i;
        d = flag2;
    }

    public crp(jcf jcf1)
    {
        g = false;
        b = jcf1.a.a;
        if (TextUtils.isEmpty(b))
        {
            eev.g("Babel", "Phone number should not be empty");
        }
        c = g.a(jcf1.b, false);
        d = g.a(jcf1.f, false);
        boolean flag;
        if (jcf1.c != null && g.a(jcf1.c, 0) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        if (a)
        {
            String s = b;
            String s1 = String.valueOf(jcf1.e);
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 29 + String.valueOf(s1).length())).append("Discoverability status for ").append(s).append(": ").append(s1).toString());
        }
        g.a(jcf1.e, 0);
        JVM INSTR tableswitch 1 3: default 192
    //                   1 276
    //                   2 192
    //                   3 289;
           goto _L1 _L2 _L1 _L3
_L1:
        f = 0;
_L5:
        jcf1 = (gdd)hlp.a(g.nU, gdd);
        if (e)
        {
            jcf1.a(-1).a(1616).a(TimeUnit.DAYS);
        }
        if (g)
        {
            jcf1.a(-1).a(1617).a(TimeUnit.DAYS);
        }
        return;
_L2:
        f = 1;
        g = true;
        continue; /* Loop/switch isn't completed */
_L3:
        f = 2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static crp a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        String as[] = s.split(",");
        if (as.length != 5)
        {
            String s1 = String.valueOf("Phone verification state is ignored due to changed format. Expected 5 parts, but got ");
            int i = as.length;
            eev.f("Babel", (new StringBuilder(String.valueOf(s1).length() + 26 + String.valueOf(s).length())).append(s1).append(i).append("; input was: [").append(s).append("]").toString());
            return null;
        } else
        {
            return new crp(as[0], Boolean.parseBoolean(as[1]), Boolean.parseBoolean(as[2]), Integer.parseInt(as[3]), Boolean.parseBoolean(as[4]));
        }
    }

    public String a()
    {
        return b;
    }

    public boolean b()
    {
        return e;
    }

    public boolean c()
    {
        return e && f == 1;
    }

    public boolean d()
    {
        return c;
    }

    public boolean e()
    {
        return d;
    }

    public String toString()
    {
        return (new StringBuilder()).append(b).append(",").append(String.valueOf(c)).append(",").append(String.valueOf(e)).append(",").append(String.valueOf(f)).append(",").append(String.valueOf(d)).toString();
    }

    static 
    {
        hnc hnc = eev.k;
    }
}
