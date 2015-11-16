// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dpo
    implements Runnable
{

    final dpw a;
    final byte b[];
    final dpm c;
    final dpn d;

    dpo(dpn dpn1, dpw dpw1, byte abyte0[], dpm dpm1)
    {
        d = dpn1;
        a = dpw1;
        b = abyte0;
        c = dpm1;
        super();
    }

    public void run()
    {
        dpn.c().b("saveMediaAndDecode");
        if (!dpn.d()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        obj1 = d;
        obj = String.valueOf(a.toString());
        if (((String) (obj)).length() == 0) goto _L4; else goto _L3
_L3:
        obj = "saving media from ".concat(((String) (obj)));
_L11:
        dpn.a(((dpn) (obj1)), ((String) (obj)));
_L2:
        dpn.a(d, b, c.b(), a, false);
        if (!dpn.d()) goto _L6; else goto _L5
_L5:
        obj1 = d;
        obj = String.valueOf(a.toString());
        if (((String) (obj)).length() == 0) goto _L8; else goto _L7
_L7:
        obj = "decodingBytes start ".concat(((String) (obj)));
_L12:
        dpn.a(((dpn) (obj1)), ((String) (obj)));
_L6:
        obj1 = a.a(b);
        if (!dpn.d()) goto _L10; else goto _L9
_L9:
        dpn dpn1;
        dpn1 = d;
        obj = String.valueOf(a.toString());
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        obj = "decodingBytes finish ".concat(((String) (obj)));
_L13:
        dpn.a(dpn1, ((String) (obj)));
_L10:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        d.a(a, ((dpv) (obj1)));
        dpn.c().c("saveMediaAndDecode");
        return;
_L4:
        obj = new String("saving media from ");
          goto _L11
        obj;
        dpn.c().c("saveMediaAndDecode");
        throw obj;
_L8:
        obj = new String("decodingBytes start ");
          goto _L12
        obj = new String("decodingBytes finish ");
          goto _L13
    }
}
