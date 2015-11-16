// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;

final class boa extends boq
{

    final bnz a;

    boa(bnz bnz1)
    {
        a = bnz1;
        super();
    }

    public void a(bpm bpm)
    {
        if (a.c != null)
        {
            a.c.dismiss();
            a.c = null;
        }
    }

    public void a(bpu bpu)
    {
        if (a.a.c() != 2)
        {
            return;
        }
        if (bpu == null)
        {
            gdv.b("Expected non-null", a.c);
            a.c.dismiss();
            a.c = null;
            return;
        } else
        {
            gdv.a("Expected null", a.c);
            a.b = bpu;
            a.b();
            return;
        }
    }
}
