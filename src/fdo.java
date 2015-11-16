// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public abstract class fdo
{

    public volatile int p;

    public fdo()
    {
        p = -1;
    }

    public static final fdo a(fdo fdo1, byte abyte0[], int i)
    {
        try
        {
            abyte0 = new fdh(abyte0, 0, i);
            fdo1.a(((fdh) (abyte0)));
            abyte0.a(0);
        }
        // Misplaced declaration of an exception variable
        catch (fdo fdo1)
        {
            throw fdo1;
        }
        // Misplaced declaration of an exception variable
        catch (fdo fdo1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return fdo1;
    }

    public static final byte[] a(fdo fdo1)
    {
        byte abyte0[] = new byte[fdo1.g()];
        int i = abyte0.length;
        try
        {
            fdi fdi1 = fdi.a(abyte0, 0, i);
            fdo1.a(fdi1);
            fdi1.a();
        }
        // Misplaced declaration of an exception variable
        catch (fdo fdo1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", fdo1);
        }
        return abyte0;
    }

    protected int a()
    {
        return 0;
    }

    public abstract fdo a(fdh fdh1);

    public void a(fdi fdi1)
    {
    }

    public Object clone()
    {
        return e();
    }

    public fdo e()
    {
        return (fdo)super.clone();
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
