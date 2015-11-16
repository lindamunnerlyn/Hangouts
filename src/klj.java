// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public abstract class klj
    implements kmz
{

    public klj()
    {
    }

    public abstract klj a();

    public klj a(klr klr1)
    {
        return a(klr1, klv.a());
    }

    public abstract klj a(klr klr1, klv klv1);

    public klj a(byte abyte0[])
    {
        return a(abyte0, abyte0.length);
    }

    public klj a(byte abyte0[], int i)
    {
        try
        {
            abyte0 = klr.a(abyte0, 0, i);
            a(((klr) (abyte0)));
            abyte0.a(0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", abyte0);
        }
        return this;
    }

    public kmz b(klr klr1, klv klv1)
    {
        return a(klr1, klv1);
    }

    public kmz b(byte abyte0[])
    {
        return a(abyte0);
    }

    public Object clone()
    {
        return a();
    }
}
