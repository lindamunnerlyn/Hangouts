// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public class cvp extends cvf
{

    private static final long serialVersionUID = 1L;
    public final String a;
    private final byte b[];

    public cvp(String s, jjt jjt1)
    {
        a = s;
        s = new jix();
        s.b = jjt1;
        b = jix.toByteArray(s);
    }

    public kws a(String s, int i, int j)
    {
        jix jix1;
        try
        {
            jix1 = (jix)kws.mergeFrom(new jix(), b);
            jix1.requestHeader = cvu.a(s, i, j, h);
            jix1.a = a;
            jix1.b.u = Long.valueOf(System.currentTimeMillis());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        g.b(2015);
        return jix1;
    }

    public long b()
    {
        return TimeUnit.DAYS.toMillis(2L);
    }

    public String f()
    {
        return "media_sessions/log";
    }
}
