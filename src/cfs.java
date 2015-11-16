// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class cfs extends bjc
{

    private gmo a;
    private dgp aj;
    private arx ak;
    private ObjectAnimator al;
    private ObjectAnimator am;
    private atd an;
    private String ao;
    private cnd ap;
    private int aq;
    private int ar;
    private final ary as = new cft(this);
    private final eep at = new cfu(this);
    private bjd b;
    private aip c;
    private cgw d;
    private ViewGroup e;
    private ViewGroup f;
    private ImageView g;
    private air h;
    private android.view.View.OnClickListener i;

    public cfs()
    {
        h = new cfw(this);
        i = new cfy(this);
        aj = new cfx(this);
    }

    public static bjc a(atd atd1, String s, cnd cnd1, aik aik1)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("EditParticipantsFragmentImpl.conversation_type", atd1);
        bundle.putString("EditParticipantsFragmentImpl.conversation_id", s);
        bundle.putSerializable("EditParticipantsFragmentImpl.mode", cnd1);
        bundle.putSerializable("EditParticipantsFragmentImpl.audience", aik1);
        atd1 = new cfs();
        atd1.setArguments(bundle);
        return atd1;
    }

    private boolean a()
    {
        return (int)f.getTranslationX() == 0;
    }

    static boolean a(cfs cfs1)
    {
        return cfs1.b();
    }

    static aip b(cfs cfs1)
    {
        return cfs1.c;
    }

    private boolean b()
    {
        while (ap == cnd.h || an == atd.b && !c()) 
        {
            return false;
        }
        return true;
    }

    static void c(cfs cfs1)
    {
        boolean flag1 = false;
        switch (cfv.b[cfs1.ap.ordinal()])
        {
        default:
            cfs1 = String.valueOf(cfs1.ap);
            ebw.g("Babel", (new StringBuilder(String.valueOf(cfs1).length() + 14)).append("Audience mode ").append(cfs1).toString());
            gbh.a("Unknown audience mode");
            return;

        case 1: // '\001'
        case 2: // '\002'
            ArrayList arraylist = new ArrayList(cfs1.c.e());
            for (Iterator iterator = cfs1.c.c().iterator(); iterator.hasNext(); arraylist.add(((ais)iterator.next()).h())) { }
            List list = Collections.emptyList();
            bnd.a().b(arraylist, list);
            cfs1.b.a();
            return;

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            ebw.a("Babel", "createConversation");
            aob aob1;
            boolean flag;
            if (cfs1.an == atd.d || cfs1.an == atd.c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (cfs1.ap == cnd.b || flag)
            {
                flag1 = true;
            }
            if (flag1)
            {
                aob1 = aob.a;
            } else
            {
                aob1 = aob.c;
            }
            cfs1.ak.a(aob1, 1635);
            return;

        case 7: // '\007'
            String s = cfs1.ao;
            ani ani1 = dbf.e(cfs1.a.a());
            RealTimeChatService.a(cfs1.aj);
            cfs1.aq = RealTimeChatService.a(ani1, cfs1.c.a(), s);
            return;

        case 8: // '\b'
            RealTimeChatService.a(dbf.e(cfs1.a.a()), cfs1.ao, cfs1.c.a());
            cfs1.b.a();
            return;
        }
    }

    private boolean c()
    {
        ani ani1 = dbf.e(a.a());
        drw drw1 = (drw)hgx.a(context, drw);
        return !g.g(ani1.T()) && drw1.n() || !g.d(ani1.T()) && dbq.C(ani1.h());
    }

    static atd d(cfs cfs1)
    {
        return cfs1.an;
    }

    static bjd e(cfs cfs1)
    {
        return cfs1.b;
    }

    static arx f(cfs cfs1)
    {
        return cfs1.ak;
    }

    static gmo g(cfs cfs1)
    {
        return cfs1.a;
    }

    static hgx h(cfs cfs1)
    {
        return cfs1.binder;
    }

    static void i(cfs cfs1)
    {
        boolean flag2 = true;
        boolean flag;
        if (TextUtils.isEmpty(cfs1.c.g()) && cfs1.c.b() > 0 && cfs1.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !cfs1.a())
        {
            if (cfs1.al.isRunning())
            {
                cfs1.al.cancel();
            }
            if (!cfs1.am.isRunning())
            {
                cfs1.am.start();
            }
        } else
        if (!flag)
        {
            boolean flag1;
            if ((int)cfs1.f.getTranslationX() == cfs1.ar)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            if (!flag1)
            {
                if (cfs1.am.isRunning())
                {
                    cfs1.am.cancel();
                }
                if (!cfs1.al.isRunning())
                {
                    cfs1.al.start();
                    return;
                }
            }
        }
    }

    static boolean j(cfs cfs1)
    {
        return cfs1.a();
    }

    static int k(cfs cfs1)
    {
        return cfs1.aq;
    }

    static cnd l(cfs cfs1)
    {
        return cfs1.ap;
    }

    static dgp m(cfs cfs1)
    {
        return cfs1.aj;
    }

    public void a(bjd bjd1)
    {
        b = bjd1;
        if (d != null)
        {
            d.a(c);
            d.a(b());
        }
    }

    protected boolean isEmpty()
    {
        return false;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        setHasOptionsMenu(true);
        binder.a(eep, at);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            activity.getWindow().setStatusBarColor(getResources().getColor(g.no));
        }
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        binder.a(ary, as);
        a = (gmo)binder.a(gmo);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        an = (atd)bundle.getSerializable("EditParticipantsFragmentImpl.conversation_type");
        ao = bundle.getString("EditParticipantsFragmentImpl.conversation_id");
        ap = (cnd)bundle.getSerializable("EditParticipantsFragmentImpl.mode");
        bundle = (aik)bundle.getSerializable("EditParticipantsFragmentImpl.audience");
        boolean flag;
        if (ap == cnd.c || ap == cnd.d || ap == cnd.e || ap == cnd.f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = new aip(bundle, flag);
        c.a(h);
        ak = ((asa)binder.a(asa)).a(context, lifecycle, 0, this, c, an);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(g.nz, viewgroup, false);
        bundle = ((bmk)getActivity()).l();
        bundle.b("");
        bundle.setPadding(bundle.getPaddingLeft(), 0, bundle.getPaddingRight(), 0);
        ai ai1 = getActivity();
        bundle.setBackgroundColor(ai1.getResources().getColor(g.np));
        EditParticipantsView editparticipantsview = (EditParticipantsView)layoutinflater.inflate(g.nA, bundle, false);
        editparticipantsview.a(c);
        editparticipantsview.a(b());
        editparticipantsview.a(dbf.e(a.a()));
        bundle.addView(editparticipantsview);
        f = (ViewGroup)ai1.findViewById(h.eL);
        int i1;
        if (an != atd.b || c())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            f.setVisibility(0);
            f.bringToFront();
        }
        e = (ViewGroup)ai1.findViewById(h.eK);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            e.setTranslationZ(e.getResources().getDimensionPixelSize(g.nu));
            e.setStateListAnimator(AnimatorInflater.loadStateListAnimator(e.getContext(), g.nl));
        }
        e.setBackgroundDrawable(e.getResources().getDrawable(n.d));
        layoutinflater.inflate(g.nJ, e, true);
        g = (ImageView)e.findViewById(l.uA);
        e.setOnClickListener(i);
        d = (cgw)getChildFragmentManager().a(cgw.getName());
        if (d == null)
        {
            d = new cgw();
            if (b != null)
            {
                d.a(c);
                d.a(b());
            }
            getChildFragmentManager().a().a(l.uy, d, cgw.getName()).b();
        }
        ar = getActivity().getResources().getDimensionPixelSize(g.nv);
        if (android.os.Build.VERSION.SDK_INT >= 17 && getActivity().getResources().getConfiguration().getLayoutDirection() == 1)
        {
            ar = -ar;
        }
        if (c.b() <= 0)
        {
            f.setTranslationX(ar);
        }
        if (ap == cnd.d)
        {
            layoutinflater = (new dso(context)).a(getString(h.iE)).a(TimeUnit.SECONDS.toMillis(10L)).a();
            ((dsp)binder.a(dsp)).a(layoutinflater);
        }
        i1 = getActivity().getResources().getInteger(g.nx);
        am = ObjectAnimator.ofFloat(f, View.TRANSLATION_X, new float[] {
            0.0F
        });
        am.setInterpolator(new aic(aig.a));
        am.setDuration(i1);
        al = ObjectAnimator.ofFloat(f, View.TRANSLATION_X, new float[] {
            (float)ar
        });
        al.setInterpolator(new aic(aig.b));
        al.setDuration(i1);
        if (ap == cnd.g || ap == cnd.e || ap == cnd.f)
        {
            g.setImageDrawable(getResources().getDrawable(n.n));
            g.setContentDescription(getString(h.iV));
            return viewgroup;
        } else
        {
            g.setContentDescription(getString(h.iU));
            return viewgroup;
        }
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        menu.clear();
    }
}
