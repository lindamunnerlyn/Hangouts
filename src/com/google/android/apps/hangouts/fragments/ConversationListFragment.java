// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments;

import ai;
import aia;
import android.animation.LayoutTransition;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import any;
import aoa;
import beq;
import bfr;
import bfs;
import bis;
import bit;
import biu;
import biv;
import biw;
import bix;
import biy;
import biz;
import bja;
import bjb;
import bjc;
import bjf;
import bjg;
import bjh;
import bkj;
import bq;
import br;
import bye;
import byf;
import bzd;
import bze;
import cgd;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.listui.SwipeableListView;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import coz;
import csi;
import dcn;
import dup;
import eck;
import eep;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l;
import oa;

public class ConversationListFragment extends bkj
    implements android.widget.AdapterView.OnItemClickListener, bfs, br
{

    private static final boolean b = false;
    private static final efh c = efh.a("ConversationListFragment");
    public bjc a;
    private bye aA;
    private em aB;
    private bzd aC;
    private bze aD;
    private final grf aE = new bit(this);
    private final Handler aF = new Handler();
    private boolean aG;
    private final Runnable aH = new bix(this);
    private csi aI;
    private bjb aJ;
    private Uri aj;
    private String ak[];
    private Long al[];
    private String am;
    private boolean an;
    private View ao;
    private int ap;
    private bjh aq;
    private int ar;
    private boolean as;
    private View at;
    private LinearLayout au;
    private ImageView av;
    private TextView aw;
    private long ax;
    private long ay;
    private bye az;
    private gqu d;
    private gqz e;
    private aoa h;
    private Uri i;

    public ConversationListFragment()
    {
        ap = 1;
        ar = -1;
        ax = -1L;
        ay = -2L;
        aD = new bis(this);
    }

    public static long a(Cursor cursor)
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

    public static bzd a(ConversationListFragment conversationlistfragment, bzd bzd)
    {
        conversationlistfragment.aC = bzd;
        return bzd;
    }

    public static csi a(ConversationListFragment conversationlistfragment, csi csi1)
    {
        conversationlistfragment.aI = csi1;
        return csi1;
    }

    public static em a(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.aB;
    }

    public static Object a(ConversationListFragment conversationlistfragment, int i1)
    {
        return conversationlistfragment.c(i1);
    }

    public static void a(ConversationListFragment conversationlistfragment, Context context)
    {
        View view = conversationlistfragment.getView().findViewById(h.dv);
        view.setVisibility(0);
        ((Button)view.findViewById(h.dx)).setOnClickListener(new biv(conversationlistfragment, view, g.f("https://www.google.com/support/hangouts/?hl=%locale%", "merge_convo"), context));
        ((Button)view.findViewById(h.dw)).setOnClickListener(new biw(conversationlistfragment, view));
    }

    public static void a(ConversationListFragment conversationlistfragment, View view)
    {
        conversationlistfragment.c(view);
    }

    public static void a(ConversationListFragment conversationlistfragment, oa oa1, MenuItem menuitem, long al1[])
    {
        conversationlistfragment.a(oa1, menuitem, al1);
    }

    private void a(oa oa1, MenuItem menuitem, long al1[])
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        oa1 = oa1.a();
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        int k1 = al1.length;
        int i1 = 0;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            long l1 = al1[i1];
            int j1 = 0;
            while (j1 < oa1.getCount()) 
            {
                oa1.moveToPosition(j1);
                if (oa1.getLong(0) != l1)
                {
                    continue;
                }
                Object obj = d(oa1);
                long l2 = oa1.getLong(4);
                if (menuitem.getItemId() == h.eL)
                {
                    String s1;
                    for (obj = g.g(((String) (obj))).iterator(); ((Iterator) (obj)).hasNext(); RealTimeChatService.a(h, s1, 10))
                    {
                        s1 = (String)((Iterator) (obj)).next();
                    }

                    continue;
                }
                if (menuitem.getItemId() == h.eP)
                {
                    String s2;
                    for (obj = g.g(((String) (obj))).iterator(); ((Iterator) (obj)).hasNext(); RealTimeChatService.a(h, s2, 30))
                    {
                        s2 = (String)((Iterator) (obj)).next();
                    }

                    continue;
                }
                if (menuitem.getItemId() == h.eK)
                {
                    for (obj = g.g(((String) (obj))).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add((String)((Iterator) (obj)).next())) { }
                    continue;
                }
                if (menuitem.getItemId() == h.eG)
                {
                    for (obj = g.g(((String) (obj))).iterator(); ((Iterator) (obj)).hasNext(); arraylist1.add(Long.valueOf(l2)))
                    {
                        arraylist.add((String)((Iterator) (obj)).next());
                    }

                } else
                if (menuitem.getItemId() == h.eH)
                {
                    if (al1.length > 1)
                    {
                        throw new IllegalStateException();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("conversation_name", am);
                    bundle.putString("conversation_id", ((String) (obj)));
                    getActivity().showDialog(1, bundle);
                } else
                if (menuitem.getItemId() == h.eO)
                {
                    obj = g.g(((String) (obj))).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s3 = (String)((Iterator) (obj)).next();
                        a.b(s3, l2);
                    }
                } else
                if (menuitem.getItemId() == h.eE)
                {
                    a.a(((String) (obj)));
                    a.a(((String) (obj)), l2);
                } else
                if (menuitem.getItemId() == h.eN)
                {
                    (new bja(this, ((String) (obj)))).execute(new Void[0]);
                }
                j1++;
            }
            i1++;
        } while (true);
        if (menuitem.getItemId() == h.eE)
        {
            a.a();
        }
        if (menuitem.getItemId() != h.eK && menuitem.getItemId() != h.eG) goto _L2; else goto _L1
_L1:
        ak = (String[])arraylist.toArray(new String[arraylist.size()]);
        if (menuitem.getItemId() != h.eK) goto _L4; else goto _L3
_L3:
        d();
_L6:
        return;
_L4:
        al = (Long[])arraylist1.toArray(new Long[arraylist1.size()]);
        displayDeleteConversationDialog(h.h());
        return;
_L2:
        if (aI != null)
        {
            aI.c();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean a(long l1, boolean flag)
    {
        if (b)
        {
            int i1 = ap;
            long l2 = ax;
            long l3 = ay;
            eev.b("Babel", (new StringBuilder(122)).append("Updating continuation end timestamp for ").append(i1).append(" from ").append(l2).append("/").append(l3).append(" to ").append(l1).toString());
        }
        boolean flag1 = false;
        if (l1 == -3L)
        {
            ax = -2L;
            flag1 = true;
        } else
        {
            ax = l1;
        }
        ay = -2L;
        if (flag)
        {
            s();
        }
        return flag1;
    }

    public static long b(Cursor cursor)
    {
        int i1;
        int j1;
        boolean flag;
        flag = false;
        cursor = g.g(cursor.getString(36)).iterator();
        i1 = 0;
        j1 = -1;
_L2:
        String s1;
        int k1;
        if (!cursor.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = (String)cursor.next();
        k1 = j1;
        if (j1 != -1)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        int l1 = Integer.parseInt(s1);
        k1 = j1;
        if (l1 == 1)
        {
            k1 = i1;
        }
_L3:
        i1++;
        j1 = k1;
        if (true) goto _L2; else goto _L1
_L1:
        if (j1 == -1)
        {
            j1 = ((flag) ? 1 : 0);
        }
        long l2 = j1;
        return (long)i1 << 32 | l2;
        NumberFormatException numberformatexception;
        numberformatexception;
        k1 = j1;
          goto _L3
    }

    public static View b(View view)
    {
        return view.findViewById(h.ap);
    }

    public static bzd b(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.aC;
    }

    public static String b(int i1)
    {
        if (i1 <= 99)
        {
            return String.valueOf(i1);
        } else
        {
            return String.valueOf("99").concat("+");
        }
    }

    public static gqu c(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.d;
    }

    private Object c(int i1)
    {
        ListAdapter listadapter = r();
        if (listadapter == null)
        {
            return null;
        } else
        {
            return listadapter.getItem(i1);
        }
    }

    public static String c(Cursor cursor)
    {
        return d(cursor);
    }

    private void c(View view)
    {
        boolean flag = a();
        boolean flag1 = isEmpty();
        f((new StringBuilder(40)).append("updateView isLoading=").append(flag).append(" isEmpty=").append(flag1).toString());
        if (isEmpty() && a())
        {
            showEmptyViewProgress(view);
            ao.setVisibility(8);
            if (!aG)
            {
                aA.a("conversation_list_fragment_ui_loading_spinner");
                aG = true;
            }
        } else
        {
            if (isEmpty() && ar != 3)
            {
                showEmptyView(view);
                ao.setVisibility(8);
            } else
            {
                showContent(view);
                if (v())
                {
                    ao.setVisibility(8);
                } else
                {
                    ao.setVisibility(0);
                }
            }
            if (aG)
            {
                aA.a(h.h(), "conversation_list_fragment_ui_loading_spinner", SystemClock.elapsedRealtime(), 1);
                aG = false;
                return;
            }
        }
    }

    public static gqz d(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.e;
    }

    private static String d(Cursor cursor)
    {
        return EsProvider.b(cursor.getString(1), (int)a(cursor));
    }

    public static void d(String s1)
    {
        g(s1);
    }

    public static void e(ConversationListFragment conversationlistfragment)
    {
        conversationlistfragment.t();
    }

    public static void e(String s1)
    {
        f(s1);
    }

    public static Runnable f(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.aH;
    }

    private static void f(String s1)
    {
        String s2 = String.valueOf("[ConversationListFragment] ");
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

    public static Handler g(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.aF;
    }

    private static void g(String s1)
    {
        String s2 = String.valueOf("[ConversationListFragment] ");
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

    public static aoa h(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.h;
    }

    public static bjh i(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.aq;
    }

    public static int j(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.ar;
    }

    public static boolean k(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.an;
    }

    public static boolean l(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.v();
    }

    public static boolean m(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.u();
    }

    public static boolean n(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.s();
    }

    public static int o(ConversationListFragment conversationlistfragment)
    {
        conversationlistfragment = conversationlistfragment.r();
        if (conversationlistfragment == null)
        {
            return 0;
        } else
        {
            return conversationlistfragment.getCount();
        }
    }

    public static csi p(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.aI;
    }

    public static hlt q(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.context;
    }

    public static boolean q()
    {
        return b;
    }

    private ListAdapter r()
    {
        if (g == null || ((SwipeableListView)g).getAdapter() == null)
        {
            String s1;
            if (g == null)
            {
                s1 = "ListView";
            } else
            {
                s1 = "Adapter";
            }
            s1 = String.valueOf(s1);
            if (s1.length() != 0)
            {
                s1 = "Null:".concat(s1);
            } else
            {
                s1 = new String("Null:");
            }
            eev.f("Babel", s1);
            return null;
        } else
        {
            return ((SwipeableListView)g).getAdapter();
        }
    }

    public static hlt r(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.context;
    }

    private boolean s()
    {
        if (d.b() && !v())
        {
            if (b)
            {
                long l1 = ax;
                long l2 = ay;
                eev.b("Babel", (new StringBuilder(81)).append("Requesting more conversations at ").append(l1).append(" (last ").append(l2).append(")").toString());
            }
            if (ay != ax)
            {
                ay = ax;
                RealTimeChatService.a(h, ap);
                return true;
            }
        }
        return false;
    }

    private void t()
    {
        if (d.b())
        {
            long l1 = ((gqz)binder.a(gqz)).a(h.h()).a(EsProvider.a(ap), -1L);
            boolean flag = isEmpty();
            boolean flag1 = a(l1, flag);
            if (!flag || !flag1)
            {
                c(getView());
                return;
            }
        }
    }

    private boolean u()
    {
        return ay != -2L;
    }

    private boolean v()
    {
        return h == null || !d.b() || !h.s() || ax == -2L;
    }

    public void a(int i1)
    {
        boolean flag;
        flag = false;
        if (b)
        {
            int j1 = ar;
            String s1 = String.valueOf(h);
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 70)).append("setDisplayMode: displayMode=").append(j1).append(", newMode=").append(i1).append(", account=").append(s1).toString());
        }
        if (i1 == ar)
        {
            return;
        }
        ar = i1;
        ar;
        JVM INSTR tableswitch 0 3: default 128
    //                   0 177
    //                   1 128
    //                   2 190
    //                   3 182;
           goto _L1 _L2 _L1 _L3 _L4
_L1:
        i1 = ar;
        gdv.a((new StringBuilder(52)).append("setDisplayMode called with unknown mode: ").append(i1).toString());
        flag = true;
_L6:
        a(true);
        a(-1L, flag);
        return;
_L2:
        as = false;
_L4:
        ap = 1;
        continue; /* Loop/switch isn't completed */
_L3:
        ap = 2;
        as = false;
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(Bundle bundle, String s1)
    {
        int k1 = 0;
        int i1 = 0;
        if (s1.equals("leave_conversation"))
        {
            bundle = ak;
            for (k1 = bundle.length; i1 < k1; i1++)
            {
                s1 = bundle[i1];
                RealTimeChatService.h(h, s1);
            }

        } else
        if (s1.equals("delete_conversation"))
        {
            bundle = getAccountForConversationDeletion(bundle);
            if (bundle != null)
            {
                for (int j1 = k1; j1 < ak.length; j1++)
                {
                    RealTimeChatService.a(bundle, ak[j1], g.a(al[j1], 0L));
                }

            }
        }
        if (aI != null)
        {
            aI.c();
        }
    }

    protected void a(View view)
    {
        boolean flag = isEmpty();
        if (b)
        {
            g((new StringBuilder(43)).append("doShowEmptyViewProgress cursorIsEmpty=").append(flag).toString());
        }
        if (flag)
        {
            view.findViewById(0x1020004).setVisibility(8);
            view.findViewById(h.de).setVisibility(0);
        }
    }

    public void a(aoa aoa1)
    {
        h = aoa1;
        if (b)
        {
            aoa1 = String.valueOf(h);
            g((new StringBuilder(String.valueOf(aoa1).length() + 37)).append("ConversationListFragment setAccount: ").append(aoa1).toString());
        }
        if (h != null && getActivity() != null)
        {
            i = EsProvider.a(EsProvider.f, h.h());
            aj = EsProvider.a(EsProvider.h, h.h());
            a = new bjc(this, h);
        }
    }

    public void a(bjh bjh1)
    {
        aq = bjh1;
    }

    public void a(em em1, Cursor cursor)
    {
        boolean flag = true;
        aoa aoa1 = ((coz)em1).C();
        if (aoa1 == null || h == null || !TextUtils.equals(aoa1.a(), h.a()))
        {
            eev.f("Babel", "onLoadFinished called for mismatched account");
        } else
        {
            if (cursor == null)
            {
                eev.f("Babel", "onLoadFinished returned with null data");
                return;
            }
            if (em1.o() == 1)
            {
                int i1 = cursor.getCount();
                eev.e("Babel", (new StringBuilder(63)).append("ConversationListFragment load finished with ").append(i1).append(" results").toString());
                aA.a(aoa1.h(), "conversation_list_fragment_loader", SystemClock.elapsedRealtime(), 1);
                c.b("onLoadFinished");
                an = true;
                ((bjf)f).a(cursor);
                if (isEmpty())
                {
                    s();
                }
                c(getView());
                ab();
                if (aI != null)
                {
                    aI.b();
                }
                a.a(cursor);
                if (((coz)em1).l().equals(aj) && cursor.moveToFirst())
                {
                    long l1 = 0L;
                    long l2;
                    do
                    {
                        l2 = Math.max(l1, cursor.getLong(4));
                        l1 = l2;
                    } while (cursor.moveToNext());
                    l1 = g.b(context, aoa1.h());
                    if (b)
                    {
                        if (l2 <= l1)
                        {
                            flag = false;
                        }
                        eev.b("Babel", (new StringBuilder(84)).append("new invite timestamp: ").append(l2).append("; old ").append(l1).append("; greater? ").append(flag).toString());
                    }
                    if (l2 > l1)
                    {
                        g.a(context, aoa1.h(), g.a(Long.valueOf(l2), 0L));
                    }
                }
                c.c("onLoadFinished");
                t();
                return;
            }
        }
    }

    public void a(String s1)
    {
        if (s1.equals("leave_conversation") && aI != null)
        {
            aI.c();
        }
    }

    public void a(boolean flag)
    {
        if (g != null)
        {
            SwipeableListView swipeablelistview = (SwipeableListView)g;
            if (flag && ar == 0 && binder.b(beq) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            swipeablelistview.a(flag);
        }
    }

    protected boolean a()
    {
        return u() || !an;
    }

    public void b()
    {
        if (at != null)
        {
            at.setSelected(false);
            at = null;
        }
    }

    public void b(String s1)
    {
        if (s1.equals("leave_conversation") && aI != null)
        {
            aI.c();
        }
    }

    public void b(boolean flag)
    {
        as = flag;
    }

    public any c(String s1)
    {
        if (f == null)
        {
            return null;
        }
        Cursor cursor = ((bjf)f).a();
        if (cursor != null && cursor.moveToFirst())
        {
            do
            {
                if (TextUtils.equals(d(cursor), s1))
                {
                    return new any(cursor.getString(25), cursor.getString(31), cursor.getString(32), cursor.getInt(33), cursor.getString(34), cursor.getString(35));
                }
            } while (cursor.moveToNext());
        }
        return null;
    }

    public boolean c()
    {
        return aI != null;
    }

    public void d()
    {
        bfr bfr1 = bfr.a(getString(l.iq), getString(l.ip), getString(l.io), getString(l.iN));
        bfr1.setTargetFragment(this, 0);
        bfr1.a(getFragmentManager(), "leave_conversation");
    }

    public boolean e()
    {
        switch (ar)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 3: // '\003'
        default:
            return false;

        case 2: // '\002'
            a(0);
            break;
        }
        return true;
    }

    public int f()
    {
        return ar;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        getLoaderManager().b(1, null, this);
    }

    public void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        d = (gqu)binder.a(gqu);
        e = (gqz)binder.a(gqz);
        bundle = (byf)binder.a(byf);
        az = bundle.a(17);
        aA = bundle.a(18);
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        if (menuitem.getGroupId() != h.av)
        {
            return false;
        }
        android.widget.AdapterView.AdapterContextMenuInfo adaptercontextmenuinfo = (android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo();
        if (adaptercontextmenuinfo == null)
        {
            return false;
        } else
        {
            a(f, menuitem, new long[] {
                adaptercontextmenuinfo.id
            });
            return true;
        }
    }

    public void onCreate(Bundle bundle)
    {
        c.b("onCreate");
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        bundle = getActivity();
        if (bundle != null)
        {
            dup dup1 = (dup)binder.a(dup);
            if (dup1.b())
            {
                g.a(new biu(this, dup1, bundle));
            }
        }
        aJ = new bjb(this);
        a(dcn.e(d.a()));
        c.c("onCreate");
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        boolean flag1 = true;
        view = (android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo;
        getActivity().getMenuInflater().inflate(g.hl, contextmenu);
        view = ((View) (c(((android.widget.AdapterView.AdapterContextMenuInfo) (view)).position)));
        if (!(view instanceof Cursor))
        {
            return;
        }
        Cursor cursor = (Cursor)view;
        contextmenuinfo = cursor.getString(6);
        view = contextmenuinfo;
        if (TextUtils.isEmpty(contextmenuinfo))
        {
            view = cursor.getString(7);
        }
        am = view;
        int i1 = cursor.getInt(3);
        int j1 = cursor.getInt(2);
        boolean flag2 = g.e(cursor.getInt(36));
        contextmenu.setHeaderTitle(view);
        view = contextmenu.findItem(h.eH);
        boolean flag;
        if (i1 == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setVisible(flag);
        view = contextmenu.findItem(h.eK);
        if (i1 == 2 && !flag2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setVisible(flag);
        view = contextmenu.findItem(h.eG);
        if (i1 == 1 || flag2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setVisible(flag);
        if (j1 == 10)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = contextmenu.findItem(h.eL);
        if (flag)
        {
            flag1 = false;
        }
        view.setVisible(flag1);
        contextmenu.findItem(h.eP).setVisible(flag);
        contextmenu.findItem(h.eN).setVisible(eep.a());
    }

    public em onCreateLoader(int i1, Bundle bundle)
    {
        if (h == null)
        {
            return null;
        }
        switch (i1)
        {
        default:
            gdv.a((new StringBuilder(42)).append("Loader created for unknown id: ").append(i1).toString());
            return null;

        case 1: // '\001'
            i1 = ar;
            break;
        }
        eev.e("Babel", (new StringBuilder(66)).append("ConversationListFragment load started for display mode ").append(i1).toString());
        aA.a("conversation_list_fragment_loader");
        String s1;
        switch (ar)
        {
        case 1: // '\001'
        default:
            i1 = ar;
            gdv.a((new StringBuilder(51)).append("Loader created for unknown displayMode: ").append(i1).toString());
            return null;

        case 0: // '\0'
            bundle = new coz(getActivity(), h, i, bjg.a, String.format(Locale.US, "(%s >= 0 OR %s IS NULL) AND %s = %d AND %s > 0", new Object[] {
                "is_pending_leave", "is_pending_leave", "view", Integer.valueOf(1), "sort_timestamp"
            }), null, "invite_time_aggregate DESC,call_media_type DESC, sort_timestamp DESC");
            aB = bundle;
            return bundle;

        case 2: // '\002'
            bundle = new coz(getActivity(), h, i, bjg.a, String.format(Locale.US, "(%s >= 0 OR %s IS NULL) AND %s = %d AND %s > 0 AND %s != %s", new Object[] {
                "is_pending_leave", "is_pending_leave", "view", Integer.valueOf(2), "sort_timestamp", "status", Integer.valueOf(1)
            }), null, "call_media_type DESC, sort_timestamp DESC");
            aB = bundle;
            return bundle;

        case 3: // '\003'
            s1 = String.format(Locale.US, "(%s >= 0 OR %s IS NULL) AND %s = %d AND %s > 0 AND %s == %d", new Object[] {
                "is_pending_leave", "is_pending_leave", "view", Integer.valueOf(1), "sort_timestamp", "status", Integer.valueOf(2)
            });
            break;
        }
        bundle = s1;
        if (as)
        {
            bundle = String.valueOf(s1);
            s1 = String.valueOf(EsProvider.a("transport_type", "3"));
            String s2 = String.valueOf(EsProvider.a("transport_type", "2"));
            bundle = (new StringBuilder(String.valueOf(bundle).length() + 12 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(bundle).append(" AND (").append(s1).append(" OR ").append(s2).append(") ").toString();
        }
        bundle = new coz(getActivity(), h, i, bjg.a, bundle, null, "call_media_type DESC, sort_timestamp DESC");
        aB = bundle;
        return bundle;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        viewgroup = (ViewGroup)layoutinflater.inflate(g.fu, viewgroup, false);
        if (a != null)
        {
            bjc bjc1 = a;
            if (bundle != null)
            {
                bjc1.a = (HashMap)bundle.getSerializable("last_archived");
            }
        }
        g = (SwipeableListView)viewgroup.findViewById(0x102000a);
        a(true);
        ((SwipeableListView)g).setAccessibilityDelegate(new eck());
        bundle = layoutinflater.inflate(g.gA, g, false);
        ((SwipeableListView)g).addHeaderView(bundle);
        layoutinflater = layoutinflater.inflate(g.gy, g, false);
        ao = layoutinflater.findViewById(h.dh);
        ((SwipeableListView)g).addFooterView(layoutinflater);
        ao.setVisibility(8);
        ((SwipeableListView)g).setOnItemClickListener(this);
        f = new bjf(this, getActivity(), h, this);
        au = (LinearLayout)viewgroup.findViewById(h.gI);
        av = null;
        aw = (TextView)viewgroup.findViewById(h.gJ);
        ((SwipeableListView)g).setAdapter(f);
        ((SwipeableListView)g).setOnScrollListener(new biz(this));
        if (f() != 3)
        {
            ((SwipeableListView)g).setChoiceMode(3);
            ((SwipeableListView)g).setMultiChoiceModeListener(aJ.a());
        }
        viewgroup.setLayoutTransition(new LayoutTransition());
        return viewgroup;
    }

    public void onDestroy()
    {
        if (aI != null)
        {
            aI.c();
        }
        super.onDestroy();
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = ((AdapterView) (c(i1)));
        if (adapterview != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        String s1;
        if (adapterview instanceof Cursor)
        {
            obj = (Cursor)adapterview;
            b();
            adapterview = view.findViewById(h.ap);
            if (adapterview != null)
            {
                adapterview.setSelected(true);
                at = adapterview;
            }
            s1 = d(((Cursor) (obj)));
            adapterview = new cgd(((Cursor) (obj)).getString(16), ((Cursor) (obj)).getString(17));
            if (((Cursor) (obj)).getInt(22) <= 1)
            {
                break; /* Loop/switch isn't completed */
            }
            startActivity(g.f(h));
            g.a(h, 1557);
        }
_L4:
        if (aI != null)
        {
            aI.c();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (((Cursor) (obj)).getInt(14) == 1)
        {
            if (aq != null)
            {
                i1 = ((Cursor) (obj)).getInt(3);
                aq.a(adapterview, s1, i1, ((Cursor) (obj)).getLong(4));
            }
        } else
        if (aq != null)
        {
            az.a("click_conversation_list");
            i1 = ((Cursor) (obj)).getInt(3);
            view = ((Cursor) (obj)).getString(25);
            String s2 = ((Cursor) (obj)).getString(31);
            adapterview = view;
            if (view == null)
            {
                adapterview = "";
            }
            view = ((Cursor) (obj)).getString(32);
            int j1 = ((Cursor) (obj)).getInt(33);
            String s3 = ((Cursor) (obj)).getString(34);
            String s4 = ((Cursor) (obj)).getString(35);
            l1 = ((Cursor) (obj)).getLong(29);
            String s5 = ((Cursor) (obj)).getString(6);
            ((Cursor) (obj)).getString(7);
            String s6 = ((Cursor) (obj)).getString(44);
            String s7 = ((Cursor) (obj)).getString(45);
            obj = new aia(s1, i1, Integer.parseInt(EsProvider.b(((Cursor) (obj)).getString(36), (int)a(((Cursor) (obj))))));
            obj.f = new any(adapterview, s2, view, j1, s3, s4);
            obj.g = s5;
            obj.h = l1;
            obj.i = s6;
            obj.j = s7;
            obj.k = 1634;
            aq.a(((aia) (obj)));
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
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
                ((bjf)f).b(null);
            }
            em1 = getView();
            if (em1 != null)
            {
                showContent(em1);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (a != null)
        {
            a.a(bundle);
        }
    }

    public void onStart()
    {
        super.onStart();
        ((bjf)f).d();
        aH.run();
        if (isEmpty())
        {
            s();
        }
        e.a(aE);
        c(getView());
        ((SwipeableListView)getView().findViewById(0x102000a)).a(aD);
    }

    public void onStop()
    {
        super.onStop();
        aF.removeCallbacks(aH);
        ((bjf)f).c();
        e.b(aE);
    }

    public void setUserVisibleHint(boolean flag)
    {
        super.setUserVisibleHint(flag);
        if (!flag && aI != null)
        {
            aI.c();
        }
    }

    protected void showContent(View view)
    {
        if (av != null)
        {
            au.removeView(av);
            av = null;
        }
        super.showContent(view);
        view.findViewById(h.de).setVisibility(8);
    }

    protected void showEmptyView(View view)
    {
        ar;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 130
    //                   1 32
    //                   2 174;
           goto _L1 _L2 _L1 _L3
_L1:
        Object obj;
        int i1;
        int j1;
        int k1;
        int l1;
        boolean flag;
        obj = null;
        flag = false;
        i1 = 0;
        j1 = 0;
        k1 = 0;
        l1 = 0;
_L5:
        eep.a(aw, null, l1, k1, j1);
        if (av == null)
        {
            av = new ImageView(au.getContext());
            av.setImageResource(i1);
            au.addView(av, 0);
            au.setClickable(flag);
            au.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        }
        super.showEmptyView(view);
        return;
_L2:
        g.a(h, 2137);
        l1 = l.gG;
        k1 = l.gF;
        j1 = l.gE;
        i1 = com.google.android.apps.hangouts.R.drawable.ax;
        flag = true;
        obj = new biy(this);
        continue; /* Loop/switch isn't completed */
_L3:
        l1 = l.gC;
        i1 = com.google.android.apps.hangouts.R.drawable.aw;
        j1 = 0;
        k1 = 0;
        obj = null;
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static 
    {
        hnc hnc = eev.e;
    }
}
