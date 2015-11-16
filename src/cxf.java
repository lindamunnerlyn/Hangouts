// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public class cxf extends cwm
{

    private static final long serialVersionUID = 1L;
    public final int a;
    public final boolean b;

    public String a()
    {
        return "ui_queue";
    }

    public kws a(String s, int i, int j)
    {
        jap jap1;
        if (cvv.e)
        {
            int k = a;
            Object obj;
            if (b)
            {
                obj = " in a call.";
            } else
            {
                obj = " NOT in a call.";
            }
            eev.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(obj).length() + 51)).append("SetInCallPresenceRequest build protobuf ").append(k).append(((String) (obj))).toString());
        }
        obj = new jel();
        jap1 = new jap();
        if (b)
        {
            boolean flag;
            if (a > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gdv.a("Expected condition to be true", flag);
            jap1.a = Integer.valueOf(100);
            jap1.b = Long.valueOf(a);
        } else
        {
            jap1.a = Integer.valueOf(0);
        }
        obj.e = jap1;
        obj.requestHeader = cvu.a(s, i, j, h);
        return ((kws) (obj));
    }

    public boolean a(cdl cdl)
    {
        gdv.a(getClass(), cdl.getClass());
        return true;
    }

    public boolean a(cdn cdn, dcx dcx)
    {
        return false;
    }

    public long b()
    {
        return TimeUnit.SECONDS.toMillis(a);
    }

    public String f()
    {
        return "presence/setpresence";
    }
}
