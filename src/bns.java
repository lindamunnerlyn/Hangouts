// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;

final class bns extends boh
{

    final bnr a;

    bns(bnr bnr1)
    {
        a = bnr1;
        super();
    }

    public void a(bpd bpd)
    {
        if (bnr.b(a) != null)
        {
            bnr.b(a).dismiss();
            bnr.c(a);
        }
    }

    public void a(bpl bpl)
    {
        if (bnr.a(a).c() != 2)
        {
            return;
        }
        if (bpl == null)
        {
            gbh.b(bnr.b(a));
            bnr.b(a).dismiss();
            bnr.c(a);
            return;
        } else
        {
            gbh.a(bnr.b(a));
            bnr.a(a, bpl);
            bnr.d(a);
            return;
        }
    }
}
