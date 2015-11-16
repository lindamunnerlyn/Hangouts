// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

final class axm
    implements asc
{

    final avv a;

    axm(avv avv1)
    {
        a = avv1;
        super();
    }

    public void a()
    {
        a.Q();
    }

    public void a(asa asa1)
    {
        avv.m(a).a(asa1);
        avv.bi(a).a(asa1);
        a.Q();
        if (asa1.a == null)
        {
            avv.a(a, asa1);
        }
        avv.y(a);
        a.getActivity().invalidateOptionsMenu();
        g.a(avv.h(a), 2262);
    }

    public void a(List list, asa asa1)
    {
        boolean flag1 = false;
        Object obj = String.valueOf(a);
        String s = String.valueOf(a.getLoaderManager());
        eev.e("Babel", (new StringBuilder(String.valueOf(obj).length() + 37 + String.valueOf(s).length())).append("Finished variant engine for ").append(((String) (obj))).append(" loader: ").append(s).toString());
        avv.m(a).a(asa1);
        avv.s(a);
        avv.t(a);
        avv.u(a);
        avv.bf(a);
        asa1 = (aqu)avv.bg(a);
        char c;
        boolean flag2;
        if (a.P() || avv.i(a))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        asa1.a(flag2);
        if (avv.bh(a) == null && list.size() > 1 && !g.a(cqo.a))
        {
            asa1 = list.iterator();
            boolean flag;
            do
            {
                flag = flag1;
                if (!asa1.hasNext())
                {
                    break;
                }
                obj = (asa)asa1.next();
                if (((asa) (obj)).h == null || TextUtils.isEmpty(((asa) (obj)).h.b()))
                {
                    continue;
                }
                flag = true;
                break;
            } while (true);
            if (flag)
            {
                asa1 = (ViewGroup)a.getView().findViewById(h.di);
                avv.b(a, LayoutInflater.from(a.getActivity()).inflate(g.ha, asa1).findViewById(h.gs));
                asa1 = (TextView)avv.bh(a).findViewById(h.gt);
                if (asa1 != null)
                {
                    asa1.setText(Html.fromHtml(a.getString(l.rU)));
                    asa1.setMovementMethod(LinkMovementMethod.getInstance());
                }
                avv.bh(a).setOnTouchListener(new axn(this));
            }
        }
        asa1 = a.getActivity();
        if (asa1 != null)
        {
            asa1.q_();
        }
        obj = avv.m(a).a();
        if (((asa) (obj)).a == null)
        {
            avv.a(a, ((asa) (obj)));
        }
        avv.bi(a).a(((asa) (obj)));
        if (!avv.bj(a))
        {
            avv.bk(a);
            avv.bl(a).a(new ayf(a));
            avv.bm(a).a(new ayd(a));
            avv.bo(a).a(avv.bn(a));
            ase ase1 = (ase)avv.bp(a).a(ase);
            hny hny1 = avv.bq(a);
            ase1.getClass();
            hny1.a(new asg(ase1, asa1, avv.h(a).h(), a.O()));
        }
        asa1 = avv.h(a);
        if (list.size() > 1)
        {
            c = '\u08D4';
        } else
        {
            c = '\u08D5';
        }
        g.a(asa1, c);
    }
}
