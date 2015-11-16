// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class kxy
{

    private static final byte l[] = new byte[768];
    int a;
    boolean b;
    boolean c;
    int d[];
    int e;
    int f;
    int g;
    private final byte h[];
    private final int i;
    private int j;
    private int k;

    public kxy(ByteBuffer bytebuffer)
    {
        byte abyte0[] = a(bytebuffer);
        int i1;
        if (bytebuffer.hasArray())
        {
            i1 = bytebuffer.arrayOffset();
        } else
        {
            i1 = 0;
        }
        this(abyte0, i1);
    }

    private kxy(byte abyte0[], int i1)
    {
        boolean flag;
        flag = false;
        super();
        d = new int[256];
        h = abyte0;
        i = i1;
        abyte0 = new kxz(this, abyte0);
        abyte0.skip(i1);
        if (abyte0.read() == 71)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        if (abyte0.read() != 73) goto _L2; else goto _L3
_L3:
        i1 = 1;
_L9:
        if (i1 == 0) goto _L5; else goto _L4
_L4:
        if (abyte0.read() != 70) goto _L5; else goto _L6
_L6:
        i1 = 1;
_L10:
        if (i1 != 0) goto _L8; else goto _L7
_L7:
        c = true;
_L11:
        a = abyte0.a();
_L12:
        IOException ioexception;
        try
        {
            abyte0.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return;
        }
_L2:
        i1 = 0;
          goto _L9
_L5:
        i1 = 0;
          goto _L10
_L8:
        abyte0.skip(3L);
        j = a(abyte0);
        k = a(abyte0);
        i1 = abyte0.read();
        if ((i1 & 0x80) != 0)
        {
            flag = true;
        }
        b = flag;
        e = 2 << (i1 & 7);
        g = abyte0.read();
        abyte0.skip(1L);
        if (b && !c)
        {
            a(abyte0, d, e);
            f = d[g];
        }
          goto _L11
        ioexception;
        c = true;
          goto _L12
    }

    private static int a(InputStream inputstream)
    {
        return inputstream.read() | inputstream.read() << 8;
    }

    private static boolean a(InputStream inputstream, int ai[], int i1)
    {
        int k1 = 0;
        byte abyte0[] = l;
        abyte0;
        JVM INSTR monitorenter ;
        int j1 = i1 * 3;
        if (inputstream.read(l, 0, j1) >= j1) goto _L2; else goto _L1
_L1:
        abyte0;
        JVM INSTR monitorexit ;
        return false;
_L4:
        if (j1 >= i1)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        inputstream = l;
        byte byte0;
        int i2;
        i2 = k1 + 1;
        byte0 = inputstream[k1];
        inputstream = l;
        int l1;
        l1 = i2 + 1;
        i2 = inputstream[i2];
        inputstream = l;
        k1 = l1 + 1;
        ai[j1] = (i2 & 0xff) << 8 | ((byte0 & 0xff) << 16 | 0xff000000) | inputstream[l1] & 0xff;
        j1++;
        continue; /* Loop/switch isn't completed */
        abyte0;
        JVM INSTR monitorexit ;
        return true;
        inputstream;
        abyte0;
        JVM INSTR monitorexit ;
        throw inputstream;
_L2:
        j1 = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static byte[] a(ByteBuffer bytebuffer)
    {
        int i1;
        if (bytebuffer.hasArray())
        {
            return bytebuffer.array();
        }
        i1 = bytebuffer.position();
        byte abyte0[];
        abyte0 = new byte[bytebuffer.capacity()];
        bytebuffer.get(abyte0);
        bytebuffer.position(i1);
        return abyte0;
        Exception exception;
        exception;
        bytebuffer.position(i1);
        throw exception;
    }

    public int a()
    {
        return h.length + (d.length << 2);
    }

}
