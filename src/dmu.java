// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dmu
    implements Runnable
{

    final dnc a;
    final byte b[];
    final dms c;
    final dmt d;

    dmu(dmt dmt1, dnc dnc1, byte abyte0[], dms dms1)
    {
        d = dmt1;
        a = dnc1;
        b = abyte0;
        c = dms1;
        super();
    }

    public void run()
    {
        ecd.a("MediaLoader saveMedia and decode");
        if (!dmt.c()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        obj1 = d;
        obj = String.valueOf(a.toString());
        if (((String) (obj)).length() == 0) goto _L4; else goto _L3
_L3:
        obj = "saving media from ".concat(((String) (obj)));
_L11:
        dmt.a(((dmt) (obj1)), ((String) (obj)));
_L2:
        dmt.a(d, b, c.b(), a, false);
        if (!dmt.c()) goto _L6; else goto _L5
_L5:
        obj1 = d;
        obj = String.valueOf(a.toString());
        if (((String) (obj)).length() == 0) goto _L8; else goto _L7
_L7:
        obj = "decodingBytes start ".concat(((String) (obj)));
_L12:
        dmt.a(((dmt) (obj1)), ((String) (obj)));
_L6:
        obj1 = a.a(b);
        if (!dmt.c()) goto _L10; else goto _L9
_L9:
        dmt dmt1;
        dmt1 = d;
        obj = String.valueOf(a.toString());
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        obj = "decodingBytes finish ".concat(((String) (obj)));
_L13:
        dmt.a(dmt1, ((String) (obj)));
_L10:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        d.a(a, ((dnb) (obj1)));
        ecd.a();
        return;
_L4:
        obj = new String("saving media from ");
          goto _L11
        obj;
        ecd.a();
        throw obj;
_L8:
        obj = new String("decodingBytes start ");
          goto _L12
        obj = new String("decodingBytes finish ");
          goto _L13
    }
}
