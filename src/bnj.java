// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

final class bnj
    implements ekh
{

    final bnd a;

    bnj(bnd bnd1)
    {
        a = bnd1;
        super();
    }

    public void a(ekg ekg)
    {
        ekg = (fbu)ekg;
        if (ekg != null && ekg.B_().e())
        {
            a.i = ekg.b();
            ekg = String.valueOf(a.i);
            ebw.c("Babel_calls", (new StringBuilder(String.valueOf(ekg).length() + 27)).append("Predicted network quality: ").append(ekg).toString());
        } else
        {
            ekg = String.valueOf(ekg);
            ebw.c("Babel_calls", (new StringBuilder(String.valueOf(ekg).length() + 50)).append("Getting predicted network quality failed, result: ").append(ekg).toString());
        }
        a.e.d();
    }
}
