// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.libraries.hangouts.video.CallService;

final class gdz
{

    final Context a;

    gdz(Context context)
    {
        a = context;
    }

    protected ggl a(String s, iqw iqw, iqt iqt)
    {
        gfr gfr1 = new gfr(a, CallService.b(a));
        gfr1.a(s, System.currentTimeMillis());
        return new ggl(gfr1, iqw, iqt);
    }

    void a(String s, String s1, jdh jdh)
    {
        gbk.a(new gea(this, ((ggj)hgx.b(a).a(ggj)).a(s), s1, jdh));
    }
}
