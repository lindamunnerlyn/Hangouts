// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dpp
    implements Runnable
{

    final dpw a;
    final byte b[];
    final dpm c;
    final dpn d;

    dpp(dpn dpn1, dpw dpw1, byte abyte0[], dpm dpm1)
    {
        d = dpn1;
        a = dpw1;
        b = abyte0;
        c = dpm1;
        super();
    }

    public void run()
    {
        dpn.c().b("saveMedia");
        if (!dpn.d()) goto _L2; else goto _L1
_L1:
        String s;
        dpn dpn1;
        dpn1 = d;
        s = String.valueOf(a.toString());
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        s = "saving media from ".concat(s);
_L3:
        dpn.a(dpn1, s);
_L2:
        dpn.a(d, b, c.b(), a, true);
        dpn.c().c("saveMedia");
        return;
        s = new String("saving media from ");
          goto _L3
        Exception exception;
        exception;
        dpn.c().c("saveMedia");
        throw exception;
    }
}
