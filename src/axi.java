// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ListAdapter;
import android.widget.ListView;

final class axi
    implements Runnable
{

    final aoa a;
    final asa b;
    final String c;
    final String d;
    final String e;
    final String f;
    final String g;
    final boolean h;
    final fik i;
    final avv j;

    axi(avv avv1, aoa aoa, asa asa1, String s, String s1, String s2, String s3, 
            String s4, boolean flag, fik fik)
    {
        j = avv1;
        a = aoa;
        b = asa1;
        c = s;
        d = s1;
        e = s2;
        f = s3;
        g = s4;
        h = flag;
        i = fik;
        super();
    }

    public void run()
    {
        if (g.a(avv.aZ(j), "babel_extra_log_scrolling", false))
        {
            boolean flag = avv.aA(j);
            eev.e("Babel_Scroll", (new StringBuilder(41)).append("sendMessage postDelay autoScrolling:").append(flag).toString());
        }
        if (avv.aA(j) && g.a(avv.ba(j), "babel_disable_events_on_auto_scroll", true))
        {
            eev.f("Babel_Scroll", "force selection was required.");
            avv.aB(j);
            ((ListView)avv.bc(j)).setSelection(((ListView)avv.bb(j)).getAdapter().getCount() - 1);
        }
        avv.aB(j);
        String s = ((dml)avv.bd(j).a(dml)).a(a, b.a, c, d, 0, e, 0, 0, f, g, h, i, 0);
        avv.be(j).a(b.a, s);
    }
}
