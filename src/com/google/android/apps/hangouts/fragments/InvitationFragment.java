// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments;

import ai;
import aih;
import amz;
import anb;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import ani;
import ap;
import bg;
import bhp;
import bhr;
import bhs;
import bht;
import bjy;
import bkm;
import bkn;
import bko;
import bkq;
import bkr;
import bks;
import bkt;
import bku;
import bkv;
import bkw;
import bq;
import br;
import ceu;
import cey;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.views.AvatarView;
import com.google.android.apps.hangouts.views.FixedParticipantsGalleryView;
import com.google.android.gms.common.people.data.AudienceMember;
import dbf;
import dgp;
import dma;
import dmd;
import ebw;
import ejx;
import ejy;
import ekd;
import ekh;
import em;
import flx;
import fme;
import fmn;
import fmq;
import g;
import gmo;
import gz;
import h;
import hgx;
import hhb;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import l;

public class InvitationFragment extends bjy
    implements android.view.View.OnClickListener, br
{

    private static String au = "inviter_circle_ids";
    private static String av = "my_circles_keys";
    private static String aw = "my_circles_vals";
    private final String a = "Babel";
    private AvatarView aj;
    private ImageView ak;
    private TextView al;
    private final ArrayList am = new ArrayList();
    private bhp an;
    private Button ao;
    private final ejx ap;
    private dma aq;
    private FixedParticipantsGalleryView ar;
    private List as;
    private final dgp at = new bko(this);
    private final ekh ax = new bkt(this);
    private final dmd ay = new bku(this);
    private final android.view.View.OnClickListener az = new bkv(this);
    private bkw b;
    private bhr c;
    private gmo d;
    private String e;
    private cey f;
    private String g;
    private ani h;
    private int i;
    public HashSet inviterCircleIds;
    public Map myCircles;

    public InvitationFragment()
    {
        ejy ejy1 = new ejy(g.nS);
        ejy1.a(fmn.c, (new fmq()).a(117).a());
        ejy1.a(new bkm(this));
        ejy1.a(new bkn(this));
        ap = ejy1.a();
    }

    private void a()
    {
        if (f == null)
        {
            return;
        }
        myCircles = null;
        inviterCircleIds = null;
        b();
        fme fme1 = new fme();
        HashSet hashset = new HashSet();
        String s = String.valueOf(f.a);
        if (s.length() != 0)
        {
            s = "g:".concat(s);
        } else
        {
            s = new String("g:");
        }
        hashset.add(s);
        fme1.a(hashset);
        fmn.e.a(ap, h.a(), h.ae(), fme1).a(ax);
        aq = new dma(ap, h, ay);
        aq.a();
    }

    private void a(bhr bhr)
    {
        c = bhr;
        if (an != null)
        {
            an.a(c);
        }
    }

    public static void a(InvitationFragment invitationfragment)
    {
        invitationfragment.a();
    }

    public static cey b(InvitationFragment invitationfragment)
    {
        return invitationfragment.f;
    }

    private void b()
    {
        if (ao == null)
        {
            return;
        }
        ao.setText(l.m);
        if (myCircles == null || inviterCircleIds == null || myCircles.size() == 0)
        {
            ao.setEnabled(false);
            ao.setVisibility(8);
            return;
        }
        ao.setEnabled(true);
        ao.setVisibility(0);
        if (inviterCircleIds.size() > 0)
        {
            ao.setBackgroundResource(com.google.android.apps.hangouts.R.drawable.aF);
            ao.setTextColor(getResources().getColor(g.dP));
            ao.setCompoundDrawablesWithIntrinsicBounds(com.google.android.apps.hangouts.R.drawable.aK, 0, 0, 0);
            if (inviterCircleIds.size() == 1)
            {
                String s = (String)inviterCircleIds.iterator().next();
                ao.setText(((String)myCircles.get(s)).toUpperCase(Locale.getDefault()));
                return;
            } else
            {
                ao.setText(getResources().getString(l.ak, new Object[] {
                    Integer.valueOf(inviterCircleIds.size())
                }));
                return;
            }
        } else
        {
            ao.setBackgroundResource(com.google.android.apps.hangouts.R.drawable.c);
            ao.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            ao.setTextColor(getResources().getColor(g.dT));
            return;
        }
    }

    private void b(View view)
    {
        if (view == null)
        {
            return;
        }
        boolean flag = TextUtils.isEmpty(e);
        view = view.findViewById(h.br);
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

    public static ArrayList c(InvitationFragment invitationfragment)
    {
        return invitationfragment.am;
    }

    private void c()
    {
        if (as != null && i == 2)
        {
            ar.setVisibility(0);
            ar.a(h, as, f);
            return;
        } else
        {
            ar.setVisibility(8);
            ar.a();
            return;
        }
    }

    public static ImageView d(InvitationFragment invitationfragment)
    {
        return invitationfragment.ak;
    }

    public static hgx e(InvitationFragment invitationfragment)
    {
        return invitationfragment.binder;
    }

    public static String f(InvitationFragment invitationfragment)
    {
        return invitationfragment.e;
    }

    public static bhp g(InvitationFragment invitationfragment)
    {
        return invitationfragment.an;
    }

    public static int h(InvitationFragment invitationfragment)
    {
        return invitationfragment.i;
    }

    public static hhb i(InvitationFragment invitationfragment)
    {
        return invitationfragment.context;
    }

    public static ani j(InvitationFragment invitationfragment)
    {
        return invitationfragment.h;
    }

    public static String k(InvitationFragment invitationfragment)
    {
        return invitationfragment.g;
    }

    public static bkw l(InvitationFragment invitationfragment)
    {
        return invitationfragment.b;
    }

    public static void m(InvitationFragment invitationfragment)
    {
        invitationfragment.b();
    }

    public String getConversationId()
    {
        return e;
    }

    public int getConversationType()
    {
        return i;
    }

    public cey getInviterId()
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
        h = dbf.e(d.a());
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
        b();
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
        if (!ap.e()) goto _L2; else goto _L1
_L1:
        a();
_L4:
        if (h != null)
        {
            if (an != null)
            {
                restartFragment(new aih(e, i));
            }
            (new bkq(this)).execute(new Void[0]);
        }
        return;
_L2:
        if (f != null)
        {
            ap.b();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean isEmpty()
    {
        return false;
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i1 == 101 && j1 == -1)
        {
            ArrayList arraylist = new ArrayList();
            Object obj;
            if (intent.hasExtra("com.google.android.gms.common.acl.EXTRA_INITIAL_AUDIENCE"))
            {
                obj = intent.getParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_INITIAL_AUDIENCE");
            } else
            {
                obj = Collections.emptyList();
            }
            if (obj != null && !((List) (obj)).isEmpty())
            {
                arraylist.addAll(((Collection) (obj)));
            }
            obj = intent.getParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_REMOVED_AUDIENCE");
            if (obj != null)
            {
                arraylist.removeAll(((Collection) (obj)));
            }
            intent = intent.getParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_ADDED_AUDIENCE");
            if (intent != null)
            {
                arraylist.addAll(intent);
            }
            inviterCircleIds.clear();
            for (intent = arraylist.iterator(); intent.hasNext(); inviterCircleIds.add(((AudienceMember) (obj)).d()))
            {
                obj = (AudienceMember)intent.next();
            }

            ao.setEnabled(false);
            if (ap.e())
            {
                a();
            }
        }
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        d = (gmo)binder.a(gmo);
        h = dbf.e(d.a());
    }

    public boolean onBackPressed()
    {
        return false;
    }

    public void onClick(View view)
    {
        if (h != null && e != null)
        {
            if (view.getId() == h.eV)
            {
                RealTimeChatService.a(h, e, true, false, false);
                b.b(e);
                g.a(h, 1551);
                return;
            }
            if (view.getId() == h.fl)
            {
                view = bht.a(d.a(), g);
                view.a(new bks(this));
                view.a(getFragmentManager(), null);
                return;
            }
            if (view == aj && f != null)
            {
                startActivity(g.o(f.a));
                return;
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            String as1[] = bundle.getStringArray(au);
            if (as1 != null)
            {
                inviterCircleIds = new HashSet();
                Collections.addAll(inviterCircleIds, as1);
            }
            as1 = bundle.getStringArray(av);
            bundle = bundle.getStringArray(aw);
            if (as1 != null && bundle != null && as1.length == bundle.length)
            {
                myCircles = new gz();
                for (int i1 = 0; i1 < as1.length; i1++)
                {
                    myCircles.put(as1[i1], bundle[i1]);
                }

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
            return amz.a(h, e, anb.b);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(g.gv, viewgroup, false);
        an = (bhp)getChildFragmentManager().a(bhp.getName());
        if (an == null)
        {
            an = ((bhs)binder.a(bhs)).a();
        }
        a(c);
        ak = (ImageView)layoutinflater.findViewById(h.aG);
        aj = (AvatarView)layoutinflater.findViewById(h.eM);
        aj.setOnClickListener(this);
        al = (TextView)layoutinflater.findViewById(h.dQ);
        am.add((TextView)layoutinflater.findViewById(h.en));
        am.add((TextView)layoutinflater.findViewById(h.eo));
        am.add((TextView)layoutinflater.findViewById(h.ep));
        layoutinflater.findViewById(h.fl).setOnClickListener(this);
        layoutinflater.findViewById(h.eV).setOnClickListener(this);
        ao = (Button)layoutinflater.findViewById(h.ae);
        b();
        ao.setOnClickListener(az);
        ar = (FixedParticipantsGalleryView)layoutinflater.findViewById(h.bN);
        c();
        b(layoutinflater);
        RealTimeChatService.a(at);
        g.a(h, 1550);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        RealTimeChatService.b(at);
        if (aq != null)
        {
            aq.b();
            aq = null;
        }
        if (ap.e() || ap.f())
        {
            ap.d();
        }
    }

    public void onHiddenChanged(boolean flag)
    {
        ebw.a("Babel", (new StringBuilder(22)).append("onHiddenChanged: ").append(flag).toString());
        super.onHiddenChanged(flag);
        if (getView() == null || getActivity() == null)
        {
            ebw.a("Babel", "onHiddenChanged: Too early. Bailing");
        } else
        if (flag)
        {
            e = null;
            f = null;
            ak.setImageBitmap(null);
            ar.a();
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
            em1 = new amz();
            em1.d(((ani) (obj)), s);
            em1.a(cursor);
            cursor = new ArrayList();
            obj = em1.b().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj1 = (ceu)((Iterator) (obj)).next();
                if (!em1.c(((ceu) (obj1)).b))
                {
                    if (!f.a(((ceu) (obj1)).b))
                    {
                        cursor.add(((ceu) (obj1)).b);
                    } else
                    {
                        g = ((ceu) (obj1)).e;
                        if (TextUtils.isEmpty(g))
                        {
                            g = getActivity().getString(l.cK);
                        }
                        aj.a(((ceu) (obj1)).h, ((ceu) (obj1)).e, h);
                        aj.setContentDescription(getActivity().getString(l.js, new Object[] {
                            g
                        }));
                        al.setText(g);
                        Object obj2 = getActivity().getText(l.iS);
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
                            ((SpannableStringBuilder) (obj2)).setSpan(new bkr(this), i1, j1, 33);
                        }
                    }
                }
            } while (true);
            as = cursor;
            c();
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
        if (inviterCircleIds != null)
        {
            bundle.putStringArray(au, (String[])inviterCircleIds.toArray(new String[inviterCircleIds.size()]));
        }
        if (myCircles != null)
        {
            String as1[] = new String[myCircles.size()];
            String as2[] = new String[myCircles.size()];
            Iterator iterator = myCircles.entrySet().iterator();
            for (int i1 = 0; iterator.hasNext(); i1++)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                as1[i1] = (String)entry.getKey();
                as2[i1] = (String)entry.getValue();
            }

            bundle.putStringArray(av, as1);
            bundle.putStringArray(aw, as2);
        }
    }

    public void onStart()
    {
        super.onStart();
        if (!ap.e() && !ap.f())
        {
            ebw.a("Babel", "Reconnecting people client for InvitationFragment.");
            ap.b();
        }
    }

    public void restartFragment(aih aih1)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            an = ((bhs)binder.a(bhs)).a();
            an.a(c);
            Bundle bundle = new Bundle();
            bundle.putParcelable("conversation_parameters", aih1);
            an.setArguments(bundle);
            an.G();
            getChildFragmentManager().a().b(h.cX, an, bhp.getName()).b();
            return;
        }
    }

    public void setHostInterface(bkw bkw1, bhr bhr)
    {
        b = bkw1;
        a(bhr);
    }

}
