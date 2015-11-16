// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class acb
{

    private static byte a[];

    public static byte[] a(byte abyte0[])
    {
        byte abyte3[];
        boolean flag1;
        flag1 = false;
        byte abyte1[] = new byte[abyte0.length];
        int i = 0;
        int k = 0;
        while (i < abyte0.length) 
        {
            int j1 = abyte0[i];
            boolean flag;
            if (j1 != 61 && a[j1] == -1)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            j1 = k;
            if (flag)
            {
                abyte1[k] = abyte0[i];
                j1 = k + 1;
            }
            i++;
            k = j1;
        }
        abyte3 = new byte[k];
        System.arraycopy(abyte1, 0, abyte3, 0, k);
        if (abyte3.length != 0) goto _L2; else goto _L1
_L1:
        abyte0 = new byte[0];
_L4:
        return abyte0;
_L2:
        int k1 = abyte3.length / 4;
        int j;
        for (j = abyte3.length; abyte3[j - 1] == 61;)
        {
            int l = j - 1;
            j = l;
            if (l == 0)
            {
                return new byte[0];
            }
        }

        byte abyte2[] = new byte[j - k1];
        int i1 = 0;
        j = ((flag1) ? 1 : 0);
        do
        {
            abyte0 = abyte2;
            if (j >= k1)
            {
                continue;
            }
            int l1 = j << 2;
            byte byte3 = abyte3[l1 + 2];
            byte byte1 = abyte3[l1 + 3];
            byte byte0 = a[abyte3[l1]];
            l1 = a[abyte3[l1 + 1]];
            if (byte3 != 61 && byte1 != 61)
            {
                byte3 = a[byte3];
                byte1 = a[byte1];
                abyte2[i1] = (byte)(byte0 << 2 | l1 >> 4);
                abyte2[i1 + 1] = (byte)((l1 & 0xf) << 4 | byte3 >> 2 & 0xf);
                abyte2[i1 + 2] = (byte)(byte3 << 6 | byte1);
            } else
            if (byte3 == 61)
            {
                abyte2[i1] = (byte)(l1 >> 4 | byte0 << 2);
            } else
            if (byte1 == 61)
            {
                byte byte2 = a[byte3];
                abyte2[i1] = (byte)(byte0 << 2 | l1 >> 4);
                abyte2[i1 + 1] = (byte)((l1 & 0xf) << 4 | byte2 >> 2 & 0xf);
            }
            i1 += 3;
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        a = new byte[255];
        for (int i = 0; i < 255; i++)
        {
            a[i] = -1;
        }

        for (int j = 90; j >= 65; j--)
        {
            a[j] = (byte)(j - 65);
        }

        for (int k = 122; k >= 97; k--)
        {
            a[k] = (byte)((k - 97) + 26);
        }

        for (int l = 57; l >= 48; l--)
        {
            a[l] = (byte)((l - 48) + 52);
        }

        a[43] = 62;
        a[47] = 63;
    }
}
