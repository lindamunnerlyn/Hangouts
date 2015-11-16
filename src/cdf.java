// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

final class cdf
{

    public int a;
    public String b;
    public String c;
    public long d;
    public long e;
    public long f;
    public Map g;

    cdf()
    {
    }

    public cdf(String s, afl afl1)
    {
        b = s;
        a = afl1.a.length;
        c = afl1.b;
        d = afl1.c;
        e = afl1.e;
        f = afl1.f;
        g = afl1.g;
    }

    public afl a(byte abyte0[])
    {
        afl afl1 = new afl();
        afl1.a = abyte0;
        afl1.b = c;
        afl1.c = d;
        afl1.e = e;
        afl1.f = f;
        afl1.g = g;
        return afl1;
    }

    public boolean a(OutputStream outputstream)
    {
        cde.a(outputstream, 0x20140131);
        cde.a(outputstream, a);
        cde.a(outputstream, b);
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        String s = "";
_L1:
        try
        {
            cde.a(outputstream, s);
            cde.a(outputstream, d);
            cde.a(outputstream, e);
            cde.a(outputstream, f);
            cde.a(g, outputstream);
            outputstream.flush();
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            return false;
        }
        return true;
        s = c;
          goto _L1
    }
}
