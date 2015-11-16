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

final class awy
    implements arm
{

    final ave a;

    awy(ave ave1)
    {
        a = ave1;
        super();
    }

    public void a()
    {
        a.Q();
    }

    public void a(ark ark1)
    {
        ave.o(a).a(ark1);
        ave.bm(a).a(ark1);
        a.Q();
        if (ark1.a == null)
        {
            ave.a(a, ark1);
        }
        ave.z(a);
        a.getActivity().invalidateOptionsMenu();
        g.a(ave.h(a), 2262);
    }

    public void a(List list, ark ark1)
    {
        boolean flag1 = false;
        Object obj = String.valueOf(a);
        String s = String.valueOf(a.getLoaderManager());
        ebw.e("Babel", (new StringBuilder(String.valueOf(obj).length() + 37 + String.valueOf(s).length())).append("Finished variant engine for ").append(((String) (obj))).append(" loader: ").append(s).toString());
        if (ave.bh(a) != null)
        {
            ave.bh(a).a("cve done");
            ave.bi(a);
        }
        ave.o(a).a(ark1);
        ave.t(a);
        ave.u(a);
        ave.v(a);
        ave.bj(a);
        ark1 = (aqd)ave.bk(a);
        char c;
        boolean flag2;
        if (a.P() || ave.i(a))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ark1.a(flag2);
        if (ave.bl(a) == null && list.size() > 1 && !g.a(coy.a))
        {
            ark1 = list.iterator();
            boolean flag;
            do
            {
                flag = flag1;
                if (!ark1.hasNext())
                {
                    break;
                }
                obj = (ark)ark1.next();
                if (((ark) (obj)).h == null || TextUtils.isEmpty(((ark) (obj)).h.b()))
                {
                    continue;
                }
                flag = true;
                break;
            } while (true);
            if (flag)
            {
                ark1 = (ViewGroup)a.getView().findViewById(h.du);
                ave.b(a, LayoutInflater.from(a.getActivity()).inflate(g.hi, ark1).findViewById(h.gK));
                ark1 = (TextView)ave.bl(a).findViewById(h.gL);
                if (ark1 != null)
                {
                    ark1.setText(Html.fromHtml(a.getString(l.sB)));
                    ark1.setMovementMethod(LinkMovementMethod.getInstance());
                }
                ave.bl(a).setOnTouchListener(new awz(this));
            }
        }
        ark1 = a.getActivity();
        if (ark1 != null)
        {
            ark1.p_();
        }
        obj = ave.o(a).a();
        if (((ark) (obj)).a == null)
        {
            ave.a(a, ((ark) (obj)));
        }
        ave.bm(a).a(((ark) (obj)));
        if (!ave.bn(a))
        {
            ave.bo(a);
            ave.bp(a).a(new axr(a));
            ave.bq(a).a(new axp(a));
            ave.bs(a).a(ave.br(a));
            aro aro1 = (aro)ave.bt(a).a(aro);
            hjg hjg1 = ave.bu(a);
            aro1.getClass();
            hjg1.a(new arq(aro1, ark1, ave.h(a).h(), a.O()));
        }
        ark1 = ave.h(a);
        if (list.size() > 1)
        {
            c = '\u08D4';
        } else
        {
            c = '\u08D5';
        }
        g.a(ark1, c);
    }
}
