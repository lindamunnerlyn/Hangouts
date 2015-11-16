// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class dja extends dfa
{

    private byte a[];
    private Map d;
    private boolean e;

    public dja(ani ani, byte abyte0[], String s, boolean flag)
    {
        super(ani);
        a = abyte0;
        d = new HashMap();
        abyte0 = d;
        if (flag)
        {
            ani = null;
        } else
        {
            ani = Integer.valueOf(0);
        }
        abyte0.put(s, ani);
        e = flag;
    }

    public void a()
    {
        cvj cvj1 = new cvj(a, d, e);
        c.a(cvj1);
    }
}
