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
import ani;
import bhw;
import bhx;
import bhy;
import bhz;
import bia;
import bib;
import bic;
import bie;
import bjx;
import bq;
import br;
import cey;
import cnh;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.listui.SwipeableListView;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import dbf;
import dyz;
import ebw;
import ecd;
import em;
import g;
import gbh;
import gmo;
import gms;
import gmu;
import gmy;
import h;
import hgx;
import hhb;
import l;

public class ConversationInviteListFragment extends bjx
    implements android.widget.AdapterView.OnItemClickListener, br
{

    private static final boolean a = false;
    private static int ar;
    private int aj;
    private bic ak;
    private boolean al;
    private LinearLayout am;
    private ImageView an;
    private TextView ao;
    private bie ap;
    private boolean aq;
    private int as;
    private long at;
    private long au;
    private final gmy av = new bhw(this);
    private final Handler aw = new Handler();
    private final Runnable ax = new bhx(this);
    private gmo b;
    private ani c;
    private Uri d;
    private Uri e;
    private boolean f;
    private View i;

    public ConversationInviteListFragment()
    {
        aj = 1;
        at = -1L;
        au = -2L;
    }

    public static String a(Cursor cursor)
    {
        return c(cursor);
    }

    public static void a(ConversationInviteListFragment conversationinvitelistfragment)
    {
        conversationinvitelistfragment.q();
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
            int i1 = aj;
            long l2 = at;
            long l3 = au;
            ebw.b("Babel", (new StringBuilder(122)).append("Updating continuation end timestamp for ").append(i1).append(" from ").append(l2).append("/").append(l3).append(" to ").append(l1).toString());
        }
        boolean flag1 = false;
        if (l1 == -3L)
        {
            at = -2L;
            flag1 = true;
        } else
        {
            at = l1;
        }
        au = -2L;
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
        return view.findViewById(h.au);
    }

    public static Runnable b(ConversationInviteListFragment conversationinvitelistfragment)
    {
        return conversationinvitelistfragment.ax;
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
        ebw.c("Babel", s1);
    }

    public static Handler c(ConversationInviteListFragment conversationinvitelistfragment)
    {
        return conversationinvitelistfragment.aw;
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
            i.setVisibility(8);
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
                i.setVisibility(8);
            } else
            {
                i.setVisibility(0);
            }
            if (!al)
            {
                g.a(c, 1548);
                al = true;
                return;
            }
        }
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
        ebw.b("Babel", s1);
    }

    public static boolean c()
    {
        return a;
    }

    public static int d()
    {
        return ar;
    }

    public static boolean d(ConversationInviteListFragment conversationinvitelistfragment)
    {
        return conversationinvitelistfragment.f;
    }

    private void e()
    {
        while (!s() || !aq || aj == 4 || r()) 
        {
            return;
        }
        if (a)
        {
            ebw.b("Babel", "switching filter from high affinity to low affinity");
        }
        aj = 4;
        a(-1L, true);
        q();
    }

    public static boolean e(ConversationInviteListFragment conversationinvitelistfragment)
    {
        return conversationinvitelistfragment.s();
    }

    private boolean f()
    {
        if (!s())
        {
            if (a)
            {
                long l1 = at;
                long l2 = au;
                ebw.b("Babel", (new StringBuilder(81)).append("Requesting more conversations at ").append(l1).append(" (last ").append(l2).append(")").toString());
            }
            if (au != at)
            {
                au = at;
                RealTimeChatService.a(c, aj);
                return true;
            }
        }
        return false;
    }

    public static boolean f(ConversationInviteListFragment conversationinvitelistfragment)
    {
        return conversationinvitelistfragment.r();
    }

    public static boolean g(ConversationInviteListFragment conversationinvitelistfragment)
    {
        return conversationinvitelistfragment.f();
    }

    public static void h(ConversationInviteListFragment conversationinvitelistfragment)
    {
        conversationinvitelistfragment.e();
    }

    public static hhb i(ConversationInviteListFragment conversationinvitelistfragment)
    {
        return conversationinvitelistfragment.context;
    }

    public static ani j(ConversationInviteListFragment conversationinvitelistfragment)
    {
        return conversationinvitelistfragment.c;
    }

    public static boolean k(ConversationInviteListFragment conversationinvitelistfragment)
    {
        conversationinvitelistfragment.aq = true;
        return true;
    }

    private void q()
    {
        long l1 = ((gms)binder.a(gms)).a(c.h()).a(EsProvider.a(aj), -1L);
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
        return au != -2L;
    }

    private boolean s()
    {
        return c == null || !c.u() || at == -2L;
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
            view.findViewById(h.dq).setVisibility(0);
        }
    }

    public void a(ani ani1)
    {
        c = ani1;
        if (a)
        {
            ani1 = String.valueOf(c);
            c((new StringBuilder(String.valueOf(ani1).length() + 43)).append("ConversationInviteListFragment setAccount: ").append(ani1).toString());
        }
        if (c != null && getActivity() != null)
        {
            d = EsProvider.a(EsProvider.f, c.h());
            e = EsProvider.a(EsProvider.h, c.h());
        }
    }

    public void a(bic bic1)
    {
        ak = bic1;
    }

    public void a(em em1, Cursor cursor)
    {
        ani ani1;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = true;
        ani1 = ((cnh)em1).C();
        if (ani1 != null && c != null && TextUtils.equals(ani1.a(), c.a())) goto _L2; else goto _L1
_L1:
        ebw.f("Babel", "onLoadFinished called for mismatched account");
_L4:
        return;
_L2:
        if (cursor == null)
        {
            ebw.f("Babel", "onLoadFinished returned with null data");
            return;
        }
        if (em1.o() != 1) goto _L4; else goto _L3
_L3:
        ecd.a("ConversationInviteListFragment.list load finished");
        f = true;
        ((bia)g).a(cursor);
        ap.notifyDataSetChanged();
        if (isEmpty())
        {
            f();
        }
        c(getView());
        ab();
        em1 = (cnh)em1;
        if (!em1.l().equals(e) || !cursor.moveToFirst()) goto _L6; else goto _L5
_L5:
        long l1 = 0L;
        long l2;
        do
        {
            l2 = Math.max(l1, cursor.getLong(4));
            l1 = l2;
        } while (cursor.moveToNext());
        l1 = g.b(context, ani1.h());
        if (a)
        {
            if (l2 <= l1)
            {
                flag1 = false;
            }
            ebw.b("Babel", (new StringBuilder(84)).append("new invite timestamp: ").append(l2).append("; old ").append(l1).append("; greater? ").append(flag1).toString());
        }
        if (l2 > l1)
        {
            g.a(context, ani1.h(), g.a(Long.valueOf(l2), 0L));
        }
_L8:
        ecd.a();
        q();
        return;
_L6:
        if (!em1.l().equals(d)) goto _L8; else goto _L7
_L7:
        int i1 = ((flag) ? 1 : 0);
        if (!cursor.moveToFirst()) goto _L10; else goto _L9
_L9:
        int j1;
        j1 = cursor.getInt(14);
        i1 = cursor.getInt(22);
        if (j1 == 2 || i1 <= 0) goto _L11; else goto _L10
_L10:
        if (as != i1)
        {
            as = i1;
            em1 = getActivity();
            if (em1 != null)
            {
                em1.p_();
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
        return r() || !f;
    }

    public void b()
    {
        aj = 3;
        ((SwipeableListView)h).setChoiceMode(0);
        if (c != null)
        {
            aq = false;
            int i1 = ar + 1;
            ar = i1;
            (new bhz(this, i1)).execute(new Void[0]);
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
        b = (gmo)binder.a(gmo);
    }

    public void onCreate(Bundle bundle)
    {
        ecd.a("ConversationInviteListFragment.onCreate");
        super.onCreate(bundle);
        a(dbf.e(b.a()));
        ecd.a();
        al = false;
    }

    public em onCreateLoader(int i1, Bundle bundle)
    {
        gbh.b(c);
        switch (i1)
        {
        default:
            gbh.a((new StringBuilder(42)).append("Loader created for unknown id: ").append(i1).toString());
            return null;

        case 1: // '\001'
            break;
        }
        if (aq)
        {
            return new cnh(getActivity(), c, e, bib.a, null, null, "inviter_affinity, sort_timestamp DESC");
        } else
        {
            return new cnh(getActivity(), c, e, bib.a, "inviter_affinity=?", new String[] {
                "1"
            }, "inviter_affinity, sort_timestamp DESC");
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        viewgroup = (ViewGroup)layoutinflater.inflate(g.fs, viewgroup, false);
        h = (SwipeableListView)viewgroup.findViewById(0x102000a);
        ((SwipeableListView)h).a(false);
        ((SwipeableListView)h).setAccessibilityDelegate(new dyz());
        bundle = layoutinflater.inflate(g.gF, h, false);
        ((SwipeableListView)h).addHeaderView(bundle);
        layoutinflater = layoutinflater.inflate(g.gD, h, false);
        i = layoutinflater.findViewById(h.dt);
        ((SwipeableListView)h).addFooterView(layoutinflater);
        i.setVisibility(8);
        ((SwipeableListView)h).setOnItemClickListener(this);
        g = new bia(this, getActivity(), c, this);
        am = (LinearLayout)viewgroup.findViewById(h.hc);
        ao = (TextView)viewgroup.findViewById(h.hd);
        ap = new bie(this, (bia)g);
        ((SwipeableListView)h).setAdapter(ap);
        ((SwipeableListView)h).setOnScrollListener(new bhy(this));
        viewgroup.setLayoutTransition(new LayoutTransition());
        return viewgroup;
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = ((AdapterView) (((SwipeableListView)h).getAdapter().getItem(i1)));
        break MISSING_BLOCK_LABEL_17;
        if (adapterview != null && (adapterview instanceof Cursor))
        {
            adapterview = (Cursor)adapterview;
            view = c(adapterview);
            cey cey1 = new cey(adapterview.getString(16), adapterview.getString(17));
            if (ak != null)
            {
                i1 = adapterview.getInt(3);
                ak.a(cey1, view, i1, adapterview.getLong(4));
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
            if (g != null)
            {
                ((bia)g).b(null);
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
        ((bia)g).d();
        ax.run();
        if (isEmpty())
        {
            f();
        }
        ((gms)binder.a(gms)).a(av);
        c(getView());
    }

    public void onStop()
    {
        super.onStop();
        aw.removeCallbacks(ax);
        ((bia)g).c();
        ((gms)binder.a(gms)).b(av);
    }

    protected void showContent(View view)
    {
        if (an != null)
        {
            am.removeView(an);
            an = null;
        }
        super.showContent(view);
        view.findViewById(h.dq).setVisibility(8);
    }

    protected void showEmptyView(View view)
    {
        int i1 = l.gY;
        int j1 = com.google.android.apps.hangouts.R.drawable.az;
        if (!al)
        {
            g.a(c, 1549);
            al = true;
        }
        ao.setText(i1);
        if (an == null)
        {
            an = new ImageView(am.getContext());
            an.setImageResource(j1);
            am.addView(an, 0);
        }
        super.showEmptyView(view);
    }

    static 
    {
        hik hik = ebw.e;
    }
}
