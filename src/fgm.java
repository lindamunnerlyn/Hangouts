// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public abstract class fgm
{

    public volatile int p;

    public fgm()
    {
        p = -1;
    }

    public static final fgm a(fgm fgm1, byte abyte0[], int i)
    {
        try
        {
            abyte0 = new fgf(abyte0, 0, i);
            fgm1.a(((fgf) (abyte0)));
            abyte0.a(0);
        }
        // Misplaced declaration of an exception variable
        catch (fgm fgm1)
        {
            throw fgm1;
        }
        // Misplaced declaration of an exception variable
        catch (fgm fgm1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return fgm1;
    }

    public static final byte[] a(fgm fgm1)
    {
        byte abyte0[] = new byte[fgm1.g()];
        int i = abyte0.length;
        try
        {
            fgg fgg1 = fgg.a(abyte0, 0, i);
            fgm1.a(fgg1);
            fgg1.a();
        }
        // Misplaced declaration of an exception variable
        catch (fgm fgm1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", fgm1);
        }
        return abyte0;
    }

    protected int a()
    {
        return 0;
    }

    public abstract fgm a(fgf fgf1);

    public void a(fgg fgg1)
    {
    }

    public Object clone()
    {
        return e();
    }

    public fgm e()
    {
        return (fgm)super.clone();
    }

    public int f()
    {
        if (p < 0)
        {
            g();
        }
        return p;
    }

    public int g()
    {
        int i = a();
        p = i;
        return i;
    }

    public String toString()
    {
        return g.a(this);
    }
}
