// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

final class bnr
    implements eni
{

    final bnk a;

    bnr(bnk bnk1)
    {
        a = bnk1;
        super();
    }

    public void a(enh enh)
    {
        enh = (fes)enh;
        if (enh != null && enh.D_().b())
        {
            a.i = enh.b();
            enh = String.valueOf(a.i);
            eev.c("Babel_calls", (new StringBuilder(String.valueOf(enh).length() + 27)).append("Predicted network quality: ").append(enh).toString());
        } else
        {
            enh = String.valueOf(enh);
            eev.c("Babel_calls", (new StringBuilder(String.valueOf(enh).length() + 50)).append("Getting predicted network quality failed, result: ").append(enh).toString());
        }
        a.e.d();
    }
}
