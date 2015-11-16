// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dmv
    implements Runnable
{

    final dnc a;
    final byte b[];
    final dms c;
    final dmt d;

    dmv(dmt dmt1, dnc dnc1, byte abyte0[], dms dms1)
    {
        d = dmt1;
        a = dnc1;
        b = abyte0;
        c = dms1;
        super();
    }

    public void run()
    {
        ecd.a("MediaLoader saveMedia");
        if (!dmt.c()) goto _L2; else goto _L1
_L1:
        String s;
        dmt dmt1;
        dmt1 = d;
        s = String.valueOf(a.toString());
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        s = "saving media from ".concat(s);
_L3:
        dmt.a(dmt1, s);
_L2:
        dmt.a(d, b, c.b(), a, true);
        ecd.a();
        return;
        s = new String("saving media from ");
          goto _L3
        Exception exception;
        exception;
        ecd.a();
        throw exception;
    }
}
