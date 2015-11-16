// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.Arrays;

public abstract class kws
{

    public volatile int cachedSize;

    public kws()
    {
        cachedSize = -1;
    }

    public static final kws mergeFrom(kws kws1, byte abyte0[])
    {
        return mergeFrom(kws1, abyte0, 0, abyte0.length);
    }

    public static final kws mergeFrom(kws kws1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = kwj.a(abyte0, i, j);
            kws1.mergeFrom(((kwj) (abyte0)));
            abyte0.a(0);
        }
        // Misplaced declaration of an exception variable
        catch (kws kws1)
        {
            throw kws1;
        }
        // Misplaced declaration of an exception variable
        catch (kws kws1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return kws1;
    }

    public static final boolean messageNanoEquals(kws kws1, kws kws2)
    {
        boolean flag1 = false;
        boolean flag;
        if (kws1 == kws2)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (kws1 != null)
            {
                flag = flag1;
                if (kws2 != null)
                {
                    flag = flag1;
                    if (kws1.getClass() == kws2.getClass())
                    {
                        int i = kws1.getSerializedSize();
                        flag = flag1;
                        if (kws2.getSerializedSize() == i)
                        {
                            byte abyte0[] = new byte[i];
                            byte abyte1[] = new byte[i];
                            toByteArray(kws1, abyte0, 0, i);
                            toByteArray(kws2, abyte1, 0, i);
                            return Arrays.equals(abyte0, abyte1);
                        }
                    }
                }
            }
        }
        return flag;
    }

    public static final void toByteArray(kws kws1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = kwk.a(abyte0, i, j);
            kws1.writeTo(abyte0);
            abyte0.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (kws kws1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", kws1);
        }
    }

    public static final byte[] toByteArray(kws kws1)
    {
        byte abyte0[] = new byte[kws1.getSerializedSize()];
        toByteArray(kws1, abyte0, 0, abyte0.length);
        return abyte0;
    }

    public volatile Object clone()
    {
        return clone();
    }

    public kws clone()
    {
        return (kws)super.clone();
    }

    public int computeSerializedSize()
    {
        return 0;
    }

    public int getCachedSize()
    {
        if (cachedSize < 0)
        {
            getSerializedSize();
        }
        return cachedSize;
    }

    public int getSerializedSize()
    {
        int i = computeSerializedSize();
        cachedSize = i;
        return i;
    }

    public abstract kws mergeFrom(kwj kwj1);

    public String toString()
    {
        return g.a(this);
    }

    public void writeTo(kwk kwk1)
    {
    }
}
