// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.InputStream;

final class gyl
{

    private final gyb a;

    gyl(gyb gyb)
    {
        a = gyb;
    }

    protected gyc a(InputStream inputstream)
    {
        gyc gyc1;
        int i;
        inputstream = gyh.a(inputstream, a);
        gyc1 = new gyc(inputstream.k());
        i = inputstream.a();
_L9:
        if (i == 6)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        i;
        JVM INSTR tableswitch 0 5: default 76
    //                   0 85
    //                   1 103
    //                   2 139
    //                   3 174
    //                   4 211
    //                   5 252;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_252;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L10:
        i = inputstream.a();
        if (true) goto _L9; else goto _L8
_L8:
        gyc1.a(new gyn(inputstream.d()));
          goto _L10
_L3:
        gym gym1 = inputstream.c();
        if (!gym1.f())
        {
            inputstream.a(gym1);
        } else
        {
            gyc1.b(gym1.a()).a(gym1);
        }
          goto _L10
_L4:
        gym gym2 = inputstream.c();
        if (gym2.c() == 7)
        {
            inputstream.b(gym2);
        }
        gyc1.b(gym2.a()).a(gym2);
          goto _L10
_L5:
        byte abyte0[] = new byte[inputstream.g()];
        if (abyte0.length == inputstream.a(abyte0))
        {
            gyc1.b(abyte0);
        } else
        if (!Log.isLoggable("ExifReader", 5));
          goto _L10
_L6:
        byte abyte1[] = new byte[inputstream.f()];
        if (abyte1.length == inputstream.a(abyte1))
        {
            gyc1.a(inputstream.e(), abyte1);
        } else
        if (!Log.isLoggable("ExifReader", 5));
          goto _L10
        gyc1.a(inputstream.h());
          goto _L10
        return gyc1;
    }
}
