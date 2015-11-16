// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class bfr
    implements dsu
{

    final bfq a;

    bfr(bfq bfq1)
    {
        a = bfq1;
        super();
    }

    public void a()
    {
    }

    public void onClick(View view)
    {
        view = ((bfs)a.c).q();
        RealTimeChatService.a(((bfs)a.c).a(), ((ceu) (view)).b.a, ((ceu) (view)).b.b, ((ceu) (view)).e, false, true);
        view = a.b.getContext().getString(l.jz, new Object[] {
            ((ceu) (view)).e
        });
        Toast.makeText(a.b.getContext(), view, 0).show();
        ((bfs)a.c).r();
        ((bfs)a.c).a(((bfs)a.c).f() - 1);
        g.a(dbf.e(((gmo)hgx.a(a.b.getContext(), gmo)).a()), 1816);
    }
}
