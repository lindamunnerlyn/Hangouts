// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class acz extends acg
{

    public acz()
    {
        Object obj;
        a(128);
        b(18);
        byte abyte0[] = "application/vnd.wap.multipart.related".getBytes();
        a.a(abyte0, 132);
        a(new ace("insert-address-token".getBytes()));
        obj = String.valueOf(Long.toHexString(System.currentTimeMillis()));
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        obj = "T".concat(((String) (obj)));
_L1:
        obj = ((String) (obj)).getBytes();
        a.a(((byte []) (obj)), 152);
        return;
        try
        {
            obj = new String("T");
        }
        catch (aby aby1)
        {
            Log.e("SendReq", "Unexpected InvalidHeaderValueException.", aby1);
            throw new RuntimeException(aby1);
        }
          goto _L1
    }

    acz(acp acp1, acj acj)
    {
        super(acp1, acj);
    }

    public void a(byte abyte0[])
    {
        a.a(abyte0, 138);
    }

    public void a(ace aace[])
    {
        a.a(aace);
    }

    public void b(long l)
    {
        a.a(0x93a80L, 136);
    }

    public void c(long l)
    {
        a.a(l, 142);
    }

    public void d(int i)
    {
        a.a(129, 134);
    }

    public void e(int i)
    {
        a.a(129, 144);
    }

    public long f()
    {
        return a.e(142);
    }
}
