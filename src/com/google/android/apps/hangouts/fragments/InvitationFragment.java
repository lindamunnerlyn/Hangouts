// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments;

import ai;
import aia;
import android.database.Cursor;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import anr;
import ant;
import aoa;
import ap;
import bg;
import bib;
import bid;
import bie;
import bif;
import bkk;
import bky;
import bkz;
import bla;
import blc;
import bld;
import ble;
import blf;
import bq;
import br;
import cfz;
import cgd;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.views.AvatarView;
import com.google.android.apps.hangouts.views.FixedParticipantsGalleryView;
import dcn;
import dhy;
import eev;
import em;
import emy;
import emz;
import fph;
import fpk;
import g;
import gqu;
import h;
import hlp;
import hlt;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l;

public class InvitationFragment extends bkk
    implements android.view.View.OnClickListener, br
{

    private final String a = "Babel";
    private AvatarView aj;
    private ImageView ak;
    private TextView al;
    private final ArrayList am = new ArrayList();
    private bib an;
    private final emy ao;
    private FixedParticipantsGalleryView ap;
    private List aq;
    private final dhy ar = new bla(this);
    private blf b;
    private bid c;
    private gqu d;
    private String e;
    private cgd f;
    private String g;
    private aoa h;
    private int i;

    public InvitationFragment()
    {
        emz emz1 = new emz(g.nU);
        emz1.a(fph.c, (new fpk()).a(117).a());
        emz1.a(new bky(this));
        emz1.a(new bkz(this));
        ao = emz1.a();
    }

    public static cgd a(InvitationFragment invitationfragment)
    {
        return invitationfragment.f;
    }

    private void a()
    {
        if (aq != null && i == 2)
        {
            ap.setVisibility(0);
            ap.a(h, aq, f);
            return;
        } else
        {
            ap.setVisibility(8);
            ap.a();
            return;
        }
    }

    private void a(bid bid)
    {
        c = bid;
        if (an != null)
        {
            an.a(c);
        }
    }

    public static ArrayList b(InvitationFragment invitationfragment)
    {
        return invitationfragment.am;
    }

    private void b(View view)
    {
        if (view == null)
        {
            return;
        }
        boolean flag = TextUtils.isEmpty(e);
        view = view.findViewById(h.bl);
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
    }

    public static ImageView c(InvitationFragment invitationfragment)
    {
        return invitationfragment.ak;
    }

    public static hlp d(InvitationFragment invitationfragment)
    {
        return invitationfragment.binder;
    }

    public static String e(InvitationFragment invitationfragment)
    {
        return invitationfragment.e;
    }

    public static bib f(InvitationFragment invitationfragment)
    {
        return invitationfragment.an;
    }

    public static int g(InvitationFragment invitationfragment)
    {
        return invitationfragment.i;
    }

    public static hlt h(InvitationFragment invitationfragment)
    {
        return invitationfragment.context;
    }

    public static aoa i(InvitationFragment invitationfragment)
    {
        return invitationfragment.h;
    }

    public static String j(InvitationFragment invitationfragment)
    {
        return invitationfragment.g;
    }

    public static blf k(InvitationFragment invitationfragment)
    {
        return invitationfragment.b;
    }

    public String getConversationId()
    {
        return e;
    }

    public int getConversationType()
    {
        return i;
    }

    public cgd getInviterId()
    {
        return f;
    }

    public void initialize(Bundle bundle)
    {
        e = bundle.getString("conversation_id");
        f = g.a(bundle);
        if (!TextUtils.isEmpty(e) && f == null)
        {
            throw new InvalidParameterException("InvitationFragment requires a valid inviter id");
        }
        h = dcn.e(d.a());
        i = bundle.getInt("client_conversation_type", 0);
        Object obj = getLoaderManager();
        ((bq) (obj)).a(1001);
        obj = ((bq) (obj)).a(1001, null, this);
        if (obj != null)
        {
            ((em) (obj)).s();
        }
        b(getView());
        if (f != null && !TextUtils.isEmpty(f.a))
        {
            RealTimeChatService.b(h, f.a);
        }
        if (!TextUtils.isEmpty(e))
        {
            g.a(context, h.h(), bundle.getLong("invite_timestamp", 0L));
        }
        if (ak != null)
        {
            ak.setImageBitmap(null);
        }
        if (aj != null)
        {
            aj.a(null, null, null);
        }
        if (al != null)
        {
            al.setText("");
        }
        for (bundle = am.iterator(); bundle.hasNext(); ((TextView)bundle.next()).setVisibility(8)) { }
        if (!ao.e())
        {
            ao.b();
        }
        if (h != null)
        {
            if (an != null)
            {
                restartFragment(new aia(e, i));
            }
            (new blc(this)).execute(new Void[0]);
        }
    }

    public boolean isEmpty()
    {
        return false;
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        d = (gqu)binder.a(gqu);
        h = dcn.e(d.a());
    }

    public boolean onBackPressed()
    {
        return false;
    }

    public void onClick(View view)
    {
        if (h != null && e != null)
        {
            if (view.getId() == h.eD)
            {
                RealTimeChatService.a(h, e, true, false, false);
                b.b(e);
                g.a(h, 1551);
                return;
            }
            if (view.getId() == h.eT)
            {
                int i1 = d.a();
                view = g;
                bif bif1 = new bif();
                Bundle bundle = new Bundle();
                bundle.putInt("account_id", i1);
                bundle.putString("dialog_inviter_name", view);
                bif1.setArguments(bundle);
                bif1.a(new ble(this));
                bif1.a(getFragmentManager(), null);
                return;
            }
            if (view == aj && f != null)
            {
                startActivity(g.o(f.a));
                return;
            }
        }
    }

    public em onCreateLoader(int i1, Bundle bundle)
    {
        i1;
        JVM INSTR tableswitch 1001 1001: default 20
    //                   1001 22;
           goto _L1 _L2
_L1:
        return null;
_L2:
        if (h != null && e != null && f != null)
        {
            return anr.a(h, e, ant.b);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(g.gr, viewgroup, false);
        an = (bib)getChildFragmentManager().a(bib.getName());
        if (an == null)
        {
            an = ((bie)binder.a(bie)).a();
        }
        a(c);
        ak = (ImageView)layoutinflater.findViewById(h.aB);
        aj = (AvatarView)layoutinflater.findViewById(h.eu);
        aj.setOnClickListener(this);
        al = (TextView)layoutinflater.findViewById(h.dH);
        am.add((TextView)layoutinflater.findViewById(h.dV));
        am.add((TextView)layoutinflater.findViewById(h.dW));
        am.add((TextView)layoutinflater.findViewById(h.dX));
        layoutinflater.findViewById(h.eT).setOnClickListener(this);
        layoutinflater.findViewById(h.eD).setOnClickListener(this);
        ap = (FixedParticipantsGalleryView)layoutinflater.findViewById(h.bG);
        a();
        b(layoutinflater);
        RealTimeChatService.a(ar);
        g.a(h, 1550);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        RealTimeChatService.b(ar);
        if (ao.e() || ao.f())
        {
            ao.d();
        }
    }

    public void onHiddenChanged(boolean flag)
    {
        eev.a("Babel", (new StringBuilder(22)).append("onHiddenChanged: ").append(flag).toString());
        super.onHiddenChanged(flag);
        if (getView() == null || getActivity() == null)
        {
            eev.a("Babel", "onHiddenChanged: Too early. Bailing");
        } else
        if (flag)
        {
            e = null;
            f = null;
            ak.setImageBitmap(null);
            ap.a();
            if (getLoaderManager().b(1001) != null)
            {
                getLoaderManager().a(1001);
                return;
            }
        }
    }

    public void onLoadFinished(em em1, Cursor cursor)
    {
        em1.o();
        JVM INSTR tableswitch 1001 1001: default 24
    //                   1001 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (cursor != null)
        {
            Object obj = h;
            String s = e;
            em1 = new anr();
            em1.d(((aoa) (obj)), s);
            em1.a(cursor);
            cursor = new ArrayList();
            obj = em1.b().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj1 = (cfz)((Iterator) (obj)).next();
                if (!em1.c(((cfz) (obj1)).b))
                {
                    if (!f.a(((cfz) (obj1)).b))
                    {
                        cursor.add(((cfz) (obj1)).b);
                    } else
                    {
                        g = ((cfz) (obj1)).e;
                        if (TextUtils.isEmpty(g))
                        {
                            g = getActivity().getString(l.ct);
                        }
                        aj.a(((cfz) (obj1)).h, ((cfz) (obj1)).e, h);
                        aj.setContentDescription(getActivity().getString(l.iK, new Object[] {
                            g
                        }));
                        al.setText(g);
                        Object obj2 = getActivity().getText(l.ik);
                        obj1 = SpannableString.valueOf(TextUtils.expandTemplate(((CharSequence) (obj2)), new CharSequence[] {
                            g
                        }));
                        URLSpan aurlspan[] = (URLSpan[])((SpannableString) (obj1)).getSpans(0, ((SpannableString) (obj1)).length(), android/text/style/URLSpan);
                        obj2 = new SpannableStringBuilder(TextUtils.expandTemplate(((CharSequence) (obj2)), new CharSequence[] {
                            g
                        }));
                        if (aurlspan.length > 0)
                        {
                            ((SpannableStringBuilder) (obj2)).clearSpans();
                            URLSpan urlspan = aurlspan[0];
                            int i1 = ((SpannableString) (obj1)).getSpanStart(urlspan);
                            int j1 = ((SpannableString) (obj1)).getSpanEnd(urlspan);
                            ((SpannableStringBuilder) (obj2)).setSpan(new bld(this), i1, j1, 33);
                        }
                    }
                }
            } while (true);
            aq = cursor;
            a();
            getLoaderManager().a(1001);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public volatile void onLoadFinished(em em1, Object obj)
    {
        onLoadFinished(em1, (Cursor)obj);
    }

    public void onLoaderReset(em em1)
    {
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        super.onStart();
        if (!ao.e() && !ao.f())
        {
            eev.a("Babel", "Reconnecting people client for InvitationFragment.");
            ao.b();
        }
    }

    public void restartFragment(aia aia1)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            an = ((bie)binder.a(bie)).a();
            an.a(c);
            Bundle bundle = new Bundle();
            bundle.putParcelable("conversation_parameters", aia1);
            an.setArguments(bundle);
            an.H();
            getChildFragmentManager().a().b(h.cM, an, bib.getName()).b();
            return;
        }
    }

    public void setHostInterface(blf blf1, bid bid)
    {
        b = blf1;
        a(bid);
    }
}
