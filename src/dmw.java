// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dmw
    implements Runnable
{

    final dnc a;
    final byte b[];
    final dmt c;

    dmw(dmt dmt1, dnc dnc1, byte abyte0[])
    {
        c = dmt1;
        a = dnc1;
        b = abyte0;
        super();
    }

    public void run()
    {
        ecd.a("MediaLoader decode");
        if (!dmt.c()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        obj1 = c;
        obj = String.valueOf(a.toString());
        if (((String) (obj)).length() == 0) goto _L4; else goto _L3
_L3:
        obj = "decodingBytes start ".concat(((String) (obj)));
_L7:
        dmt.a(((dmt) (obj1)), ((String) (obj)));
_L2:
        obj1 = a.a(b);
        if (!dmt.c()) goto _L6; else goto _L5
_L5:
        dmt dmt1;
        dmt1 = c;
        obj = String.valueOf(a.toString());
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        obj = "decodingBytes finish ".concat(((String) (obj)));
_L8:
        dmt.a(dmt1, ((String) (obj)));
_L6:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        c.a(a, ((dnb) (obj1)));
        ecd.a();
        return;
_L4:
        obj = new String("decodingBytes start ");
          goto _L7
        obj;
        ecd.a();
        throw obj;
        obj = new String("decodingBytes finish ");
          goto _L8
    }
}
