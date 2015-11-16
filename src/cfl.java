// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cfl extends cfk
{

    final cfi b;

    cfl(cfi cfi1)
    {
        b = cfi1;
        super(cfi1);
    }

    public void a(eef eef1, edf edf, boolean flag, aqn aqn, boolean flag1)
    {
        gdv.a("Expected null", edf);
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj = eef1.d();
_L4:
        b.t.a(((android.graphics.Bitmap) (obj)));
        super.a(eef1, edf, flag, aqn, flag1);
        return;
_L2:
        if (!b.q())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ann.b;
_L5:
        obj = aon.a(((ann) (obj)));
        if (true) goto _L4; else goto _L3
_L3:
        if (b.r())
        {
            obj = ann.c;
        } else
        {
            obj = ann.a;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }
}
