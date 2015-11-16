// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public class cvm extends cvf
{

    private static final long serialVersionUID = 1L;
    private final byte a[];

    public cvm(byte abyte0[])
    {
        a = abyte0;
    }

    public kws a(String s, int i, int j)
    {
        jkr jkr1 = new jkr();
        String s1;
        byte byte0;
        byte byte1;
        int k;
        long l;
        long l1;
        long l2;
        try
        {
            jkp jkp1 = (jkp)kws.mergeFrom(new jkp(), a);
            l = g.a(jkp1.a, 0L);
            s1 = jkp1.b;
            k = g.a(jkp1.g, 0);
            l1 = g.a(jkp1.h.a, 0L);
            l2 = g.a(jkp1.h.b, 0L);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            eev.e("Babel", "Parse failed", s);
            return null;
        }
        byte1 = 0;
        byte0 = 0;
        k;
        JVM INSTR tableswitch 0 4: default 263
    //                   0 228
    //                   1 240
    //                   2 246
    //                   3 234
    //                   4 221;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        jkr1.requestHeader = cvu.a(s, i, j, h);
        s = new jkq();
        s.a = Long.valueOf(l);
        s.b = s1;
        s.c = Long.valueOf(l1);
        s.d = Long.valueOf(l2);
        if (byte1 <= 0)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        s.f = Integer.valueOf(byte1);
        if (byte0 <= 0)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        s.e = Integer.valueOf(byte0);
        jkr1.a = s;
        return jkr1;
_L6:
        byte0 = 6;
        continue; /* Loop/switch isn't completed */
_L2:
        byte0 = 0;
        continue; /* Loop/switch isn't completed */
_L5:
        byte0 = 5;
        continue; /* Loop/switch isn't completed */
_L3:
        byte1 = 1;
        continue; /* Loop/switch isn't completed */
_L4:
        byte1 = 2;
        if (true) goto _L1; else goto _L7
_L7:
    }

    public long b()
    {
        return TimeUnit.DAYS.toMillis(2L);
    }

    public String f()
    {
        return "hangout_invitations/ack";
    }
}
