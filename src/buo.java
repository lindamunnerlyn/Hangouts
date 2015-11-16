// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;

final class buo
    implements android.widget.AdapterView.OnItemClickListener
{

    final bun a;

    buo(bun bun1)
    {
        a = bun1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (gme)((gmf)bun.a(a)).getItem(i);
        if (!(adapterview instanceof gmh))
        {
            return;
        }
        adapterview = (gmh)adapterview;
        adapterview.c();
        JVM INSTR tableswitch 0 2: default 60
    //                   0 68
    //                   1 132
    //                   2 196;
           goto _L1 _L2 _L3 _L4
_L1:
        a.a();
        return;
_L2:
        ebw.e("Babel", "Disabling knocking per user request.");
        g.b(2241);
        bun.b(a).a(false);
        bun.a(a, adapterview, (gmh)bun.c(a).getItem(1), btv.c);
        bun.c(a).notifyDataSetChanged();
        continue; /* Loop/switch isn't completed */
_L3:
        ebw.e("Babel", "Enabling knocking per user request.");
        g.b(1501);
        bun.b(a).a(true);
        bun.a(a, (gmh)bun.c(a).getItem(0), adapterview, btv.d);
        bun.c(a).notifyDataSetChanged();
        continue; /* Loop/switch isn't completed */
_L4:
        g.b(2242);
        bun.d(a);
        if (true) goto _L1; else goto _L5
_L5:
    }
}
