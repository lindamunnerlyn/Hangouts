// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;
import java.util.concurrent.TimeUnit;

final class dwi extends bgs
{

    final dwe d;
    private final Context e;
    private final String f;

    public dwi(dwe dwe1, Context context, String s)
    {
        d = dwe1;
        super();
        e = context;
        f = s;
    }

    private void k()
    {
        Intent intent = new Intent(e, com/google/android/apps/hangouts/requestwriter/RequestWriter);
        intent.putExtra("cancel_class", e().getName());
        intent.putExtra("cancel_request", f);
        e.startService(intent);
    }

    public String a()
    {
        return e.getString(l.sA);
    }

    public int b()
    {
        return RealTimeChatService.e(d.c, f);
    }

    public void c()
    {
        k();
        Toast.makeText(e, l.kl, 0).show();
    }

    public void d()
    {
        d.d.a(d.c.h(), d.c.b().a, cvc.c, f);
        dwe.a(d);
    }

    public Class e()
    {
        return cxh;
    }

    public Class f()
    {
        return dak;
    }

    public void h()
    {
        k();
        super.h();
    }

    protected int i()
    {
        return (int)TimeUnit.SECONDS.toMillis(3L);
    }
}
