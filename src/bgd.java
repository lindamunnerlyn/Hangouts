// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class bgd
    implements dvn
{

    final bgc a;

    bgd(bgc bgc1)
    {
        a = bgc1;
        super();
    }

    public void a()
    {
    }

    public void onClick(View view)
    {
        view = ((bge)a.c).q();
        RealTimeChatService.a(((bge)a.c).a(), ((cfz) (view)).b.a, ((cfz) (view)).b.b, ((cfz) (view)).e, false, true);
        view = a.b.getContext().getString(l.iS, new Object[] {
            ((cfz) (view)).e
        });
        Toast.makeText(a.b.getContext(), view, 0).show();
        ((bge)a.c).r();
        ((bge)a.c).a(((bge)a.c).f() - 1);
        g.a(dcn.e(((gqu)hlp.a(a.b.getContext(), gqu)).a()), 1816);
    }
}
