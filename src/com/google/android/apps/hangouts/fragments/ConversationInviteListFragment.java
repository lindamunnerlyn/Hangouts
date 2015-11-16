// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments;

import ai;
import android.animation.LayoutTransition;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import aoa;
import bii;
import bij;
import bik;
import bil;
import bim;
import bin;
import bio;
import biq;
import bkj;
import bq;
import br;
import cgd;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.listui.SwipeableListView;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import coz;
import dcn;
import eck;
import eev;
import efh;
import em;
import g;
import gdv;
import gqu;
import gqz;
import grb;
import grf;
import h;
import hlp;
import hlt;
import l;

public class ConversationInviteListFragment extends bkj
    implements android.widget.AdapterView.OnItemClickListener, br
{

    private static final boolean a = false;
    private static int at;
    private static final efh b = efh.a("InviteListFragment");
    private boolean aj;
    private View ak;
    private int al;
    private bio am;
    private boolean an;
    private LinearLayout ao;
    private ImageView ap;
    private TextView aq;
    private biq ar;
    private boolean as;
    private int au;
    private long av;
    private long aw;
    private final grf ax = new bii(this);
    private final Handler ay = new Handler();
    private final Runnable az = new bij(this);
    private gqu c;
    private gqz d;
    private aoa e;
    private Uri h;
    private Uri i;

    public ConversationInviteListFragment()
    {
        al = 1;
        av = -1L;
        aw = -2L;
    }

    public static gqu a(ConversationInviteListFragment conversationinvitelistfragment)
    {
        return conversationinvitelistfragment.c;
    }

    public static String a(Cursor cursor)
    {
        return c(cursor);
    }

    public static void a(ConversationInviteListFragment conversationinvitelistfragment, View view)
    {
        conversationinvitelistfragment.c(view);
    }

    public static void a(String s1)
    {
        c(s1);
    }

    private boolean a(long l1, boolean flag)
    {
        if (a)
        {
            int i1 = al;
            long l2 = av;
            long l3 = aw;
            eev.b("Babel", (new StringBuilder(122)).append("Updating continuation end timestamp for ").append(i1).append(" from ").append(l2).append("/").append(l3).append(" to ").append(l1).toString());
        }
        boolean flag1 = false;
        if (l1 == -3L)
        {
            av = -2L;
            flag1 = true;
        } else
        {
            av = l1;
        }
        aw = -2L;
        if (flag)
        {
            f();
        }
        return flag1;
    }

    private static long b(Cursor cursor)
    {
        int j1;
        j1 = 0;
        cursor = cursor.getString(42);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        int i1;
        int k1;
        int l1;
        int i2;
        long l2;
        l2 = -1L;
        cursor = cursor.split("\\|");
        l1 = cursor.length;
        i2 = cursor.length;
        k1 = 0;
        j1 = 0;
        i1 = 0;
_L4:
        String s1;
        if (k1 >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = cursor[k1];
        long l4 = Long.parseLong(s1);
        if (l4 > l2)
        {
            i1 = j1;
            l2 = l4;
        }
_L5:
        j1++;
        k1++;
        if (true) goto _L4; else goto _L3
        NumberFormatException numberformatexception;
        numberformatexception;
          goto _L5
_L3:
        j1 = l1;
_L7:
        long l3 = i1;
        return (long)j1 << 32 | l3;
_L2:
        i1 = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static View b(View view)
    {
        return view.findViewById(h.ap);
    }

    public static gqz b(ConversationInviteListFragment conversationinvitelistfragment)
    {
        return conversationinvitelistfragment.d;
    }

    public static void b(String s1)
    {
        String s2 = String.valueOf("[InviteListFragment] ");
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s1 = s2.concat(s1);
        } else
        {
            s1 = new String(s2);
        }
        eev.c("Babel", s1);
    }

    private static String c(Cursor cursor)
    {
        return EsProvider.b(cursor.getString(1), (int)b(cursor));
    }

    private void c(View view)
    {
        if (a)
        {
            boolean flag = a();
            boolean flag1 = isEmpty();
            c((new StringBuilder(40)).append("updateView isLoading=").append(flag).append(" isEmpty=").append(flag1).toString());
        }
        if (isEmpty() && a())
        {
            showEmptyViewProgress(view);
            ak.setVisibility(8);
        } else
        {
            if (isEmpty())
            {
                showEmptyView(view);
                return;
            }
            showContent(view);
            if (s())
            {
                ak.setVisibility(8);
            } else
            {
                ak.setVisibility(0);
            }
            if (!an)
            {
                g.a(e, 1548);
                an = true;
                return;
            }
        }
    }

    public static void c(ConversationInviteListFragment conversationinvitelistfragment)
    {
        conversationinvitelistfragment.q();
    }

    private static void c(String s1)
    {
        String s2 = String.valueOf("[InviteListFragment] ");
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s1 = s2.concat(s1);
        } else
        {
            s1 = new String(s2);
        }
        eev.b("Babel", s1);
    }

    public static boolean c()
    {
        return a;
    }

    public static int d()
    {
        return at;
    }

    public static Runnable d(ConversationInviteListFragment conversationinvitelistfragment)
    {
        return conversationinvitelistfragment.az;
    }

    public static Handler e(ConversationInviteListFragment conversationinvitelistfragment)
    {
        return conversationinvitelistfragment.ay;
    }

    private void e()
    {
        while (!s() || !as || al == 4 || r()) 
        {
            return;
        }
        if (a)
        {
            eev.b("Babel", "switching filter from high affinity to low affinity");
        }
        al = 4;
        a(-1L, true);
        q();
    }

    private boolean f()
    {
        if (!s())
        {
            if (a)
            {
                long l1 = av;
                long l2 = aw;
                eev.b("Babel", (new StringBuilder(81)).append("Requesting more conversations at ").append(l1).append(" (last ").append(l2).append(")").toString());
            }
            if (aw != av)
            {
                aw = av;
                RealTimeChatService.a(e, al);
                return true;
            }
        }
        return false;
    }

    public static boolean f(ConversationInviteListFragment conversationinvitelistfragment)
    {
        return conversationinvitelistfragment.aj;
    }

    public static boolean g(ConversationInviteListFragment conversationinvitelistfragment)
    {
        return conversationinvitelistfragment.s();
    }

    public static boolean h(ConversationInviteListFragment conversationinvitelistfragment)
    {
        return conversationinvitelistfragment.r();
    }

    public static boolean i(ConversationInviteListFragment conversationinvitelistfragment)
    {
        return conversationinvitelistfragment.f();
    }

    public static void j(ConversationInviteListFragment conversationinvitelistfragment)
    {
        conversationinvitelistfragment.e();
    }

    public static hlt k(ConversationInviteListFragment conversationinvitelistfragment)
    {
        return conversationinvitelistfragment.context;
    }

    public static aoa l(ConversationInviteListFragment conversationinvitelistfragment)
    {
        return conversationinvitelistfragment.e;
    }

    public static boolean m(ConversationInviteListFragment conversationinvitelistfragment)
    {
        conversationinvitelistfragment.as = true;
        return true;
    }

    private void q()
    {
        long l1 = ((gqz)binder.a(gqz)).a(e.h()).a(EsProvider.a(al), -1L);
        boolean flag = isEmpty();
        boolean flag1 = a(l1, flag);
        e();
        if (!flag || !flag1)
        {
            c(getView());
        }
    }

    private boolean r()
    {
        return aw != -2L;
    }

    private boolean s()
    {
        return e == null || !e.s() || av == -2L;
    }

    protected void a(View view)
    {
        boolean flag = isEmpty();
        if (a)
        {
            c((new StringBuilder(43)).append("doShowEmptyViewProgress cursorIsEmpty=").append(flag).toString());
        }
        if (flag)
        {
            view.findViewById(0x1020004).setVisibility(8);
            view.findViewById(h.de).setVisibility(0);
        }
    }

    public void a(aoa aoa1)
    {
        e = aoa1;
        if (a)
        {
            aoa1 = String.valueOf(e);
            c((new StringBuilder(String.valueOf(aoa1).length() + 43)).append("ConversationInviteListFragment setAccount: ").append(aoa1).toString());
        }
        if (e != null && getActivity() != null)
        {
            h = EsProvider.a(EsProvider.f, e.h());
            i = EsProvider.a(EsProvider.h, e.h());
        }
    }

    public void a(bio bio1)
    {
        am = bio1;
    }

    public void a(em em1, Cursor cursor)
    {
        aoa aoa1;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = true;
        aoa1 = ((coz)em1).C();
        if (aoa1 != null && e != null && TextUtils.equals(aoa1.a(), e.a())) goto _L2; else goto _L1
_L1:
        eev.f("Babel", "onLoadFinished called for mismatched account");
_L4:
        return;
_L2:
        if (cursor == null)
        {
            eev.f("Babel", "onLoadFinished returned with null data");
            return;
        }
        if (em1.o() != 1) goto _L4; else goto _L3
_L3:
        String s1;
        s1 = b.b("onLoadFinished");
        aj = true;
        ((bim)f).a(cursor);
        ar.notifyDataSetChanged();
        if (isEmpty())
        {
            f();
        }
        c(getView());
        ab();
        em1 = (coz)em1;
        if (!em1.l().equals(i) || !cursor.moveToFirst()) goto _L6; else goto _L5
_L5:
        long l1 = 0L;
        long l2;
        do
        {
            l2 = Math.max(l1, cursor.getLong(4));
            l1 = l2;
        } while (cursor.moveToNext());
        l1 = g.b(context, aoa1.h());
        if (a)
        {
            if (l2 <= l1)
            {
                flag1 = false;
            }
            eev.b("Babel", (new StringBuilder(84)).append("new invite timestamp: ").append(l2).append("; old ").append(l1).append("; greater? ").append(flag1).toString());
        }
        if (l2 > l1)
        {
            g.a(context, aoa1.h(), g.a(Long.valueOf(l2), 0L));
        }
_L8:
        b.c(s1);
        q();
        return;
_L6:
        if (!em1.l().equals(h)) goto _L8; else goto _L7
_L7:
        int i1 = ((flag) ? 1 : 0);
        if (!cursor.moveToFirst()) goto _L10; else goto _L9
_L9:
        int j1;
        j1 = cursor.getInt(14);
        i1 = cursor.getInt(22);
        if (j1 == 2 || i1 <= 0) goto _L11; else goto _L10
_L10:
        if (au != i1)
        {
            au = i1;
            em1 = getActivity();
            if (em1 != null)
            {
                em1.q_();
            }
        }
          goto _L8
_L11:
        i1 = ((flag) ? 1 : 0);
        if (cursor.getPosition() == 5) goto _L10; else goto _L12
_L12:
        if (cursor.moveToNext()) goto _L9; else goto _L13
_L13:
        i1 = ((flag) ? 1 : 0);
          goto _L10
    }

    protected boolean a()
    {
        return r() || !aj;
    }

    public void b()
    {
        al = 3;
        ((SwipeableListView)g).setChoiceMode(0);
        if (e != null)
        {
            as = false;
            int i1 = at + 1;
            at = i1;
            (new bil(this, i1)).execute(new Void[0]);
        }
        a(-1L, true);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        getLoaderManager().b(1, null, this);
    }

    public void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        c = (gqu)binder.a(gqu);
        d = (gqz)binder.a(gqz);
    }

    public void onCreate(Bundle bundle)
    {
        String s1 = b.b("onCreate");
        super.onCreate(bundle);
        a(dcn.e(c.a()));
        b.c(s1);
        an = false;
    }

    public em onCreateLoader(int i1, Bundle bundle)
    {
        gdv.b("Expected non-null", e);
        switch (i1)
        {
        default:
            gdv.a((new StringBuilder(42)).append("Loader created for unknown id: ").append(i1).toString());
            return null;

        case 1: // '\001'
            break;
        }
        if (as)
        {
            return new coz(getActivity(), e, i, bin.a, null, null, "inviter_affinity, sort_timestamp DESC");
        } else
        {
            return new coz(getActivity(), e, i, bin.a, "inviter_affinity=?", new String[] {
                "1"
            }, "inviter_affinity, sort_timestamp DESC");
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        viewgroup = (ViewGroup)layoutinflater.inflate(g.fq, viewgroup, false);
        g = (SwipeableListView)viewgroup.findViewById(0x102000a);
        ((SwipeableListView)g).a(false);
        ((SwipeableListView)g).setAccessibilityDelegate(new eck());
        bundle = layoutinflater.inflate(g.gA, g, false);
        ((SwipeableListView)g).addHeaderView(bundle);
        layoutinflater = layoutinflater.inflate(g.gy, g, false);
        ak = layoutinflater.findViewById(h.dh);
        ((SwipeableListView)g).addFooterView(layoutinflater);
        ak.setVisibility(8);
        ((SwipeableListView)g).setOnItemClickListener(this);
        f = new bim(this, getActivity(), e, this);
        ao = (LinearLayout)viewgroup.findViewById(h.gI);
        aq = (TextView)viewgroup.findViewById(h.gJ);
        ar = new biq(this, (bim)f);
        ((SwipeableListView)g).setAdapter(ar);
        ((SwipeableListView)g).setOnScrollListener(new bik(this));
        viewgroup.setLayoutTransition(new LayoutTransition());
        return viewgroup;
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = ((AdapterView) (((SwipeableListView)g).getAdapter().getItem(i1)));
        break MISSING_BLOCK_LABEL_17;
        if (adapterview != null && (adapterview instanceof Cursor))
        {
            adapterview = (Cursor)adapterview;
            view = c(adapterview);
            cgd cgd1 = new cgd(adapterview.getString(16), adapterview.getString(17));
            if (am != null)
            {
                i1 = adapterview.getInt(3);
                am.a(cgd1, view, i1, adapterview.getLong(4));
                return;
            }
        }
        return;
    }

    public void onLoadFinished(em em1, Object obj)
    {
        a(em1, (Cursor)obj);
    }

    public void onLoaderReset(em em1)
    {
        if (em1.o() == 1)
        {
            if (f != null)
            {
                ((bim)f).b(null);
            }
            em1 = getView();
            if (em1 != null)
            {
                showContent(em1);
            }
        }
    }

    public void onStart()
    {
        super.onStart();
        ((bim)f).d();
        az.run();
        if (isEmpty())
        {
            f();
        }
        ((gqz)binder.a(gqz)).a(ax);
        c(getView());
    }

    public void onStop()
    {
        super.onStop();
        ay.removeCallbacks(az);
        ((bim)f).c();
        ((gqz)binder.a(gqz)).b(ax);
    }

    protected void showContent(View view)
    {
        if (ap != null)
        {
            ao.removeView(ap);
            ap = null;
        }
        super.showContent(view);
        view.findViewById(h.de).setVisibility(8);
    }

    protected void showEmptyView(View view)
    {
        int i1 = l.gH;
        int j1 = com.google.android.apps.hangouts.R.drawable.ay;
        if (!an)
        {
            g.a(e, 1549);
            an = true;
        }
        aq.setText(i1);
        if (ap == null)
        {
            ap = new ImageView(ao.getContext());
            ap.setImageResource(j1);
            ao.addView(ap, 0);
        }
        super.showEmptyView(view);
    }

    static 
    {
        hnc hnc = eev.e;
    }
}
