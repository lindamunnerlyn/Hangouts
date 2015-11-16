// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dpq
    implements Runnable
{

    final dpw a;
    final byte b[];
    final dpn c;

    dpq(dpn dpn1, dpw dpw1, byte abyte0[])
    {
        c = dpn1;
        a = dpw1;
        b = abyte0;
        super();
    }

    public void run()
    {
        dpn.c().b("decodeMedia");
        if (!dpn.d()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        obj1 = c;
        obj = String.valueOf(a.toString());
        if (((String) (obj)).length() == 0) goto _L4; else goto _L3
_L3:
        obj = "decodingBytes start ".concat(((String) (obj)));
_L7:
        dpn.a(((dpn) (obj1)), ((String) (obj)));
_L2:
        obj1 = a.a(b);
        if (!dpn.d()) goto _L6; else goto _L5
_L5:
        dpn dpn1;
        dpn1 = c;
        obj = String.valueOf(a.toString());
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        obj = "decodingBytes finish ".concat(((String) (obj)));
_L8:
        dpn.a(dpn1, ((String) (obj)));
_L6:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        c.a(a, ((dpv) (obj1)));
        dpn.c().c("decodeMedia");
        return;
_L4:
        obj = new String("decodingBytes start ");
          goto _L7
        obj;
        dpn.c().c("decodeMedia");
        throw obj;
        obj = new String("decodingBytes finish ");
          goto _L8
    }
}
