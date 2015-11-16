// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.Arrays;

public abstract class kop
{

    public volatile int cachedSize;

    public kop()
    {
        cachedSize = -1;
    }

    public static final kop mergeFrom(kop kop1, byte abyte0[])
    {
        return mergeFrom(kop1, abyte0, 0, abyte0.length);
    }

    public static final kop mergeFrom(kop kop1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = kog.a(abyte0, i, j);
            kop1.mergeFrom(((kog) (abyte0)));
            abyte0.a(0);
        }
        // Misplaced declaration of an exception variable
        catch (kop kop1)
        {
            throw kop1;
        }
        // Misplaced declaration of an exception variable
        catch (kop kop1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return kop1;
    }

    public static final boolean messageNanoEquals(kop kop1, kop kop2)
    {
        boolean flag1 = false;
        boolean flag;
        if (kop1 == kop2)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (kop1 != null)
            {
                flag = flag1;
                if (kop2 != null)
                {
                    flag = flag1;
                    if (kop1.getClass() == kop2.getClass())
                    {
                        int i = kop1.getSerializedSize();
                        flag = flag1;
                        if (kop2.getSerializedSize() == i)
                        {
                            byte abyte0[] = new byte[i];
                            byte abyte1[] = new byte[i];
                            toByteArray(kop1, abyte0, 0, i);
                            toByteArray(kop2, abyte1, 0, i);
                            return Arrays.equals(abyte0, abyte1);
                        }
                    }
                }
            }
        }
        return flag;
    }

    public static final void toByteArray(kop kop1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = koh.a(abyte0, i, j);
            kop1.writeTo(abyte0);
            abyte0.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (kop kop1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", kop1);
        }
    }

    public static final byte[] toByteArray(kop kop1)
    {
        byte abyte0[] = new byte[kop1.getSerializedSize()];
        toByteArray(kop1, abyte0, 0, abyte0.length);
        return abyte0;
    }

    public volatile Object clone()
    {
        return clone();
    }

    public kop clone()
    {
        return (kop)super.clone();
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

    public abstract kop mergeFrom(kog kog1);

    public String toString()
    {
        return g.a(this);
    }

    public void writeTo(koh koh1)
    {
    }
}
