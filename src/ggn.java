// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.libraries.hangouts.video.CallService;

final class ggn
{

    final Context a;

    ggn(Context context)
    {
        a = context;
    }

    protected gjl a(String s, ixb ixb, iwy iwy)
    {
        gir gir1 = new gir(a, CallService.b(a));
        gir1.a(s, System.currentTimeMillis());
        return new gjl(gir1, ixb, iwy);
    }

    void a(String s, jjt jjt)
    {
        gdy.a(new ggo(this, ((gjj)hlp.b(a).a(gjj)).a(s), jjt));
    }
}
