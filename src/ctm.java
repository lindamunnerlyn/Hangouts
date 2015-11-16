// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public class ctm extends ctc
{

    private static final long serialVersionUID = 1L;
    public final String a;
    private final byte b[];

    public ctm(String s, jdh jdh1)
    {
        a = s;
        jcn jcn1 = new jcn();
        jcn1.b = jdh1;
        if (s == null && jdh1 != null)
        {
            ebw.f("Babel", "Empty session id, clearing call perf");
            jcn1.b.f = null;
        }
        b = jcn.toByteArray(jcn1);
    }

    public kop a(String s, int i, int j)
    {
        jcn jcn1;
        try
        {
            jcn1 = (jcn)kop.mergeFrom(new jcn(), b);
            jcn1.requestHeader = ctq.a(s, i, j, h);
            jcn1.a = a;
            jcn1.b.u = Long.valueOf(System.currentTimeMillis());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        g.b(2015);
        return jcn1;
    }

    public long b()
    {
        return TimeUnit.DAYS.toMillis(2L);
    }

    public String g()
    {
        return "media_sessions/log";
    }
}
