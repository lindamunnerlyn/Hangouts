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
import com.google.android.apps.hangouts.peoplelistv2.impl.ScrollViewCustom;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class cgy extends bjo
{

    private gqu a;
    private dhy aj;
    private asm ak;
    private ObjectAnimator al;
    private ObjectAnimator am;
    private atu an;
    private String ao;
    private cov ap;
    private int aq;
    private int ar;
    private final asn as = new cgz(this);
    private final ehr at = new cha(this);
    private bjp b;
    private aii c;
    private cic d;
    private ViewGroup e;
    private ViewGroup f;
    private ImageView g;
    private aik h;
    private android.view.View.OnClickListener i;

    public cgy()
    {
        h = new chc(this);
        i = new che(this);
        aj = new chd(this);
    }

    public static bjo a(atu atu1, String s, cov cov1, aid aid1)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("EditParticipantsFragmentImpl.conversation_type", atu1);
        bundle.putString("EditParticipantsFragmentImpl.conversation_id", s);
        bundle.putSerializable("EditParticipantsFragmentImpl.mode", cov1);
        bundle.putSerializable("EditParticipantsFragmentImpl.audience", aid1);
        atu1 = new cgy();
        atu1.setArguments(bundle);
        return atu1;
    }

    private boolean a()
    {
        return (int)f.getTranslationX() == 0;
    }

    static boolean a(cgy cgy1)
    {
        return cgy1.b();
    }

    static aii b(cgy cgy1)
    {
        return cgy1.c;
    }

    private boolean b()
    {
        while (ap == cov.h || an == atu.b && !c()) 
        {
            return false;
        }
        return true;
    }

    static void c(cgy cgy1)
    {
        boolean flag1 = false;
        switch (chb.b[cgy1.ap.ordinal()])
        {
        default:
            cgy1 = String.valueOf(cgy1.ap);
            eev.g("Babel", (new StringBuilder(String.valueOf(cgy1).length() + 14)).append("Audience mode ").append(cgy1).toString());
            gdv.a("Unknown audience mode");
            return;

        case 1: // '\001'
        case 2: // '\002'
            ArrayList arraylist = new ArrayList(cgy1.c.e());
            for (Iterator iterator = cgy1.c.c().iterator(); iterator.hasNext(); arraylist.add(((ail)iterator.next()).h())) { }
            List list = Collections.emptyList();
            bnk.a().b(arraylist, list);
            cgy1.b.a();
            return;

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            eev.a("Babel", "createConversation");
            aot aot1;
            boolean flag;
            if (cgy1.an == atu.d || cgy1.an == atu.c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (cgy1.ap == cov.b || flag)
            {
                flag1 = true;
            }
            if (flag1)
            {
                aot1 = aot.a;
            } else
            {
                aot1 = aot.c;
            }
            cgy1.ak.a(aot1, 1635);
            return;

        case 7: // '\007'
            String s = cgy1.ao;
            aoa aoa1 = dcn.e(cgy1.a.a());
            RealTimeChatService.a(cgy1.aj);
            cgy1.aq = RealTimeChatService.a(aoa1, cgy1.c.a(), s);
            return;

        case 8: // '\b'
            RealTimeChatService.a(dcn.e(cgy1.a.a()), cgy1.ao, cgy1.c.a());
            cgy1.b.a();
            return;
        }
    }

    private boolean c()
    {
        boolean flag2 = false;
        aoa aoa1 = dcn.e(a.a());
        dup dup1 = (dup)hlp.a(context, dup);
        boolean flag;
        boolean flag1;
        if (dup1.o() && !g.g(aoa1.Q()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!g.d(aoa1.Q()) && dup1.p() && dcz.E(aoa1.h()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag || flag1)
        {
            flag2 = true;
        }
        return flag2;
    }

    static atu d(cgy cgy1)
    {
        return cgy1.an;
    }

    static bjp e(cgy cgy1)
    {
        return cgy1.b;
    }

    static asm f(cgy cgy1)
    {
        return cgy1.ak;
    }

    static gqu g(cgy cgy1)
    {
        return cgy1.a;
    }

    static hlp h(cgy cgy1)
    {
        return cgy1.binder;
    }

    static void i(cgy cgy1)
    {
        boolean flag2 = true;
        boolean flag;
        if (TextUtils.isEmpty(cgy1.c.g()) && cgy1.c.b() > 0 && cgy1.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !cgy1.a())
        {
            if (cgy1.al.isRunning())
            {
                cgy1.al.cancel();
            }
            if (!cgy1.am.isRunning())
            {
                cgy1.am.start();
            }
        } else
        if (!flag)
        {
            boolean flag1;
            if ((int)cgy1.f.getTranslationX() == cgy1.ar)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            if (!flag1)
            {
                if (cgy1.am.isRunning())
                {
                    cgy1.am.cancel();
                }
                if (!cgy1.al.isRunning())
                {
                    cgy1.al.start();
                    return;
                }
            }
        }
    }

    static boolean j(cgy cgy1)
    {
        return cgy1.a();
    }

    static int k(cgy cgy1)
    {
        return cgy1.aq;
    }

    static cov l(cgy cgy1)
    {
        return cgy1.ap;
    }

    static dhy m(cgy cgy1)
    {
        return cgy1.aj;
    }

    public void a(bjp bjp1)
    {
        b = bjp1;
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
        binder.a(ehr, at);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            activity.getWindow().setStatusBarColor(getResources().getColor(g.np));
        }
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        binder.a(asn, as);
        a = (gqu)binder.a(gqu);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        ((ScrollViewCustom)((bmr)getActivity()).l().findViewById(l.tO)).a(getResources().getDimensionPixelSize(g.nv));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        an = (atu)bundle.getSerializable("EditParticipantsFragmentImpl.conversation_type");
        ao = bundle.getString("EditParticipantsFragmentImpl.conversation_id");
        ap = (cov)bundle.getSerializable("EditParticipantsFragmentImpl.mode");
        bundle = (aid)bundle.getSerializable("EditParticipantsFragmentImpl.audience");
        boolean flag;
        if (ap == cov.c || ap == cov.d || ap == cov.e || ap == cov.f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = new aii(bundle, flag);
        c.a(h);
        ak = ((asp)binder.a(asp)).a(context, lifecycle, 0, this, c, an);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(g.nB, viewgroup, false);
        bundle = ((bmr)getActivity()).l();
        bundle.b("");
        bundle.setPadding(bundle.getPaddingLeft(), 0, bundle.getPaddingRight(), 0);
        ai ai1 = getActivity();
        bundle.setBackgroundColor(ai1.getResources().getColor(g.nq));
        EditParticipantsView editparticipantsview = (EditParticipantsView)layoutinflater.inflate(g.nC, bundle, false);
        editparticipantsview.a(c);
        editparticipantsview.a(b());
        editparticipantsview.a(dcn.e(a.a()));
        bundle.addView(editparticipantsview);
        f = (ViewGroup)ai1.findViewById(h.et);
        int i1;
        if (an != atu.b || c())
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
        e = (ViewGroup)ai1.findViewById(h.es);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            e.setTranslationZ(e.getResources().getDimensionPixelSize(g.nw));
            e.setStateListAnimator(AnimatorInflater.loadStateListAnimator(e.getContext(), g.nm));
        }
        e.setBackgroundDrawable(e.getResources().getDrawable(n.d));
        layoutinflater.inflate(g.nL, e, true);
        g = (ImageView)e.findViewById(l.tR);
        e.setOnClickListener(i);
        d = (cic)getChildFragmentManager().a(cic.getName());
        if (d == null)
        {
            d = new cic();
            if (b != null)
            {
                d.a(c);
                d.a(b());
            }
            getChildFragmentManager().a().a(l.tP, d, cic.getName()).b();
        }
        ar = getActivity().getResources().getDimensionPixelSize(g.nx);
        if (android.os.Build.VERSION.SDK_INT >= 17 && getActivity().getResources().getConfiguration().getLayoutDirection() == 1)
        {
            ar = -ar;
        }
        if (c.b() <= 0)
        {
            f.setTranslationX(ar);
        }
        if (ap == cov.d)
        {
            layoutinflater = (new dvh(context)).a(getString(h.iA)).a(TimeUnit.SECONDS.toMillis(10L)).a();
            ((dvi)binder.a(dvi)).a(layoutinflater);
        }
        i1 = getActivity().getResources().getInteger(g.nz);
        am = ObjectAnimator.ofFloat(f, View.TRANSLATION_X, new float[] {
            0.0F
        });
        am.setInterpolator(new ahv(ahz.a));
        am.setDuration(i1);
        al = ObjectAnimator.ofFloat(f, View.TRANSLATION_X, new float[] {
            (float)ar
        });
        al.setInterpolator(new ahv(ahz.b));
        al.setDuration(i1);
        if (ap == cov.g || ap == cov.e || ap == cov.f)
        {
            g.setImageDrawable(getResources().getDrawable(n.n));
            g.setContentDescription(getString(h.iT));
            return viewgroup;
        } else
        {
            g.setContentDescription(getString(h.iS));
            return viewgroup;
        }
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        menu.clear();
    }
}
