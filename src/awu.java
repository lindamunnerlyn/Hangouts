// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ListAdapter;
import android.widget.ListView;

final class awu
    implements Runnable
{

    final ani a;
    final ark b;
    final String c;
    final String d;
    final int e;
    final String f;
    final int g;
    final int h;
    final String i;
    final String j;
    final boolean k;
    final ffo l;
    final ave m;

    awu(ave ave1, ani ani, ark ark1, String s, String s1, int i1, String s2, 
            int j1, int k1, String s3, String s4, boolean flag, ffo ffo)
    {
        m = ave1;
        a = ani;
        b = ark1;
        c = s;
        d = s1;
        e = i1;
        f = s2;
        g = j1;
        h = k1;
        i = s3;
        j = s4;
        k = flag;
        l = ffo;
        super();
    }

    public void run()
    {
        if (g.a(ave.bc(m), "babel_extra_log_scrolling", false))
        {
            boolean flag = ave.az(m);
            ebw.e("Babel_Scroll", (new StringBuilder(41)).append("sendMessage postDelay autoScrolling:").append(flag).toString());
        }
        if (ave.az(m) && g.a(ave.bd(m), "babel_disable_events_on_auto_scroll", true))
        {
            ebw.f("Babel_Scroll", "force selection was required.");
            ave.aA(m);
            ((ListView)ave.bf(m)).setSelection(((ListView)ave.be(m)).getAdapter().getCount() - 1);
        }
        ave.aA(m);
        ((dkt)ave.bg(m).a(dkt)).a(a, b.a, c, d, e, f, g, h, i, j, k, l, 0);
    }
}
