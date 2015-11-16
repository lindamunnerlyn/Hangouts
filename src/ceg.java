// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ceg extends cef
{

    final ced b;

    ceg(ced ced1)
    {
        b = ced1;
        super(ced1);
    }

    public void a(ebh ebh1, eab eab, boolean flag, apw apw, boolean flag1)
    {
        gbh.a(eab);
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj = ebh1.d();
_L4:
        b.t.a(((android.graphics.Bitmap) (obj)));
        super.a(ebh1, eab, flag, apw, flag1);
        return;
_L2:
        if (!b.q())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = amv.b;
_L5:
        obj = anv.a(((amv) (obj)));
        if (true) goto _L4; else goto _L3
_L3:
        if (b.r())
        {
            obj = amv.c;
        } else
        {
            obj = amv.a;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }
}
