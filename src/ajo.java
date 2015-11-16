// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ajo
{

    public static boolean b;
    public final int a = 0;
    public final akx c;
    public final String d;
    public long e;

    public ajo(long l, iqq iqq1)
    {
        b = g.a(iqq1.d, false);
        d = iqq1.a.a;
        if (iqq1.b != null) goto _L2; else goto _L1
_L1:
_L6:
        Integer integer;
        if (iqq1.c != null)
        {
            iqq1 = new akx(this, l, d, iqq1.c);
        } else
        {
            iqq1 = null;
        }
        c = iqq1;
        return;
_L2:
        g.a(iqq1.b, 0);
        JVM INSTR tableswitch 0 1: default 100
    //                   0 116
    //                   1 125;
           goto _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_125;
_L3:
        integer = null;
_L7:
        a = g.a(integer, 0);
          goto _L6
_L4:
        integer = Integer.valueOf(1);
          goto _L7
        integer = Integer.valueOf(2);
          goto _L7
    }

    private boolean e()
    {
        return c != null && c.b != null && c.a > 0L && a == 0;
    }

    private long f()
    {
        if (e())
        {
            return c.a;
        } else
        {
            throw new IllegalStateException("Tokens expired or invalid have no expiration time");
        }
    }

    public void a(long l)
    {
        e = l;
    }

    public boolean a()
    {
        return e() && f() - ajv.a > System.currentTimeMillis();
    }

    public long b()
    {
        return e;
    }

    public String c()
    {
        return d;
    }

    public byte[] d()
    {
        if (e())
        {
            return c.b;
        } else
        {
            throw new IllegalStateException("Tokens expired or invalid have no signature data");
        }
    }
}
