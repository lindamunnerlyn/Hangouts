// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

final class cca
{

    public int a;
    public String b;
    public String c;
    public long d;
    public long e;
    public long f;
    public Map g;

    cca()
    {
    }

    public cca(String s, afj afj1)
    {
        b = s;
        a = afj1.a.length;
        c = afj1.b;
        d = afj1.c;
        e = afj1.e;
        f = afj1.f;
        g = afj1.g;
    }

    public afj a(byte abyte0[])
    {
        afj afj1 = new afj();
        afj1.a = abyte0;
        afj1.b = c;
        afj1.c = d;
        afj1.e = e;
        afj1.f = f;
        afj1.g = g;
        return afj1;
    }

    public boolean a(OutputStream outputstream)
    {
        cbz.a(outputstream, 0x20140131);
        cbz.a(outputstream, a);
        cbz.a(outputstream, b);
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        String s = "";
_L1:
        try
        {
            cbz.a(outputstream, s);
            cbz.a(outputstream, d);
            cbz.a(outputstream, e);
            cbz.a(outputstream, f);
            cbz.a(g, outputstream);
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
