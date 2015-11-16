// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;

final class gtz
{

    private final gtp a;

    gtz(gtp gtp)
    {
        a = gtp;
    }

    protected gtq a(InputStream inputstream)
    {
        gtq gtq1;
        int i;
        inputstream = gtv.a(inputstream, a);
        gtq1 = new gtq(inputstream.j());
        i = inputstream.a();
_L8:
        if (i == 5)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        i;
        JVM INSTR tableswitch 0 4: default 68
    //                   0 77
    //                   1 95
    //                   2 131
    //                   3 166
    //                   4 191;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_191;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L9:
        i = inputstream.a();
        if (true) goto _L8; else goto _L7
_L7:
        gtq1.a(new gub(inputstream.d()));
          goto _L9
_L3:
        gua gua1 = inputstream.c();
        if (!gua1.f())
        {
            inputstream.a(gua1);
        } else
        {
            gtq1.b(gua1.a()).a(gua1);
        }
          goto _L9
_L4:
        gua gua2 = inputstream.c();
        if (gua2.c() == 7)
        {
            inputstream.b(gua2);
        }
        gtq1.b(gua2.a()).a(gua2);
          goto _L9
_L5:
        byte abyte0[] = new byte[inputstream.g()];
        if (abyte0.length == inputstream.a(abyte0))
        {
            gtq1.a(abyte0);
        }
          goto _L9
        byte abyte1[] = new byte[inputstream.f()];
        if (abyte1.length == inputstream.a(abyte1))
        {
            gtq1.a(inputstream.e(), abyte1);
        }
          goto _L9
        return gtq1;
    }
}
