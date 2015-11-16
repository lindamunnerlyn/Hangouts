// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class hdl
    implements hdo
{

    public static final hij a = new hij("debug.social.rpc.debug_log");

    private static boolean a(String s, int i)
    {
        boolean flag;
label0:
        {
            flag = false;
            if (!Log.isLoggable("HttpOperation", i))
            {
                String s1 = s;
                if (s != null)
                {
                    s1 = s;
                    if (s.length() > 23)
                    {
                        s1 = s.substring(0, 23);
                    }
                }
                if (!Log.isLoggable(s1, i))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public void a(String s, hdq hdq, int i, String s1)
    {
    }

    public boolean a(String s)
    {
        return a(s, 3);
    }

    public boolean b(String s)
    {
        return a(s, 2);
    }

    public void c(String s)
    {
        if (s != null)
        {
            g.b(3, "HttpOperation", s);
        }
    }

    public void d(String s)
    {
        if (s != null)
        {
            g.b(2, "HttpOperation", s);
        }
    }

}
