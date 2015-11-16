// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

final class dmb
    implements fmm
{

    final dma a;

    dmb(dma dma1)
    {
        a = dma1;
        super();
    }

    public void a(String s, String s1, int i)
    {
        if (ebw.a("Babel", 3))
        {
            String s2 = String.valueOf(ebw.b(s));
            ebw.c("Babel", (new StringBuilder(String.valueOf(s2).length() + 52 + String.valueOf(s1).length())).append("Data changed. Account: ").append(s2).append(" gaiaId: ").append(s1).append(" scopes: ").append(i).toString());
        }
        if (TextUtils.equals(s, a.a.a()))
        {
            a.c();
        } else
        if (TextUtils.equals(s, a.a.a()) && TextUtils.equals(s1, a.a.ae()))
        {
            a.c();
            return;
        }
    }
}
