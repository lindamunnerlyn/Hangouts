// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

public final class cpy
    implements Serializable
{

    private static final boolean a = false;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private boolean g;

    public cpy(iwa iwa1)
    {
        g = false;
        b = iwa1.a.a;
        if (TextUtils.isEmpty(b))
        {
            ebw.g("Babel", "Phone number should not be empty");
        }
        c = g.a(iwa1.b, false);
        d = g.a(iwa1.f, false);
        boolean flag;
        if (iwa1.c != null && g.a(iwa1.c, 0) == 1)
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
            String s1 = String.valueOf(iwa1.e);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 29 + String.valueOf(s1).length())).append("Discoverability status for ").append(s).append(": ").append(s1).toString());
        }
        g.a(iwa1.e, 0);
        JVM INSTR tableswitch 1 3: default 192
    //                   1 266
    //                   2 192
    //                   3 279;
           goto _L1 _L2 _L1 _L3
_L1:
        f = 0;
_L5:
        iwa1 = (bwf)hgx.a(g.nS, bwf);
        if (e)
        {
            iwa1.a(-1, 1616).a(TimeUnit.DAYS);
        }
        if (g)
        {
            iwa1.a(-1, 1617).a(TimeUnit.DAYS);
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

    private cpy(String s, boolean flag, boolean flag1, int i, boolean flag2)
    {
        b = s;
        c = flag;
        e = flag1;
        f = i;
        d = flag2;
    }

    public static cpy a(String s)
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
            ebw.f("Babel", (new StringBuilder(String.valueOf(s1).length() + 26 + String.valueOf(s).length())).append(s1).append(i).append("; input was: [").append(s).append("]").toString());
            return null;
        } else
        {
            return new cpy(as[0], Boolean.parseBoolean(as[1]), Boolean.parseBoolean(as[2]), Integer.parseInt(as[3]), Boolean.parseBoolean(as[4]));
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
        hik hik = ebw.k;
    }
}
