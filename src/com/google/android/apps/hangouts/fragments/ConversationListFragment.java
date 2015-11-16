// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments;

import ai;
import aih;
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
import ang;
import ani;
import bea;
import bff;
import bfg;
import big;
import bih;
import bii;
import bij;
import bik;
import bil;
import bim;
import bin;
import bio;
import bip;
import biq;
import bit;
import biu;
import biv;
import bjx;
import bq;
import br;
import bxi;
import bxj;
import bya;
import byb;
import cey;
import cnh;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.listui.SwipeableListView;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import cqr;
import dbf;
import drw;
import dyz;
import ebr;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l;
import ny;

public class ConversationListFragment extends bjx
    implements android.widget.AdapterView.OnItemClickListener, bfg, br
{

    private static final boolean b = false;
    public biq a;
    private bya aA;
    private byb aB;
    private final gmy aC = new bih(this);
    private final Handler aD = new Handler();
    private boolean aE;
    private final Runnable aF = new bil(this);
    private cqr aG;
    private bip aH;
    private Long aj[];
    private String ak;
    private boolean al;
    private View am;
    private int an;
    private biv ao;
    private int ap;
    private boolean aq;
    private View ar;
    private LinearLayout as;
    private ImageView at;
    private TextView au;
    private long av;
    private long aw;
    private bxi ax;
    private bxi ay;
    private em az;
    private gmo c;
    private ani d;
    private Uri e;
    private Uri f;
    private String i[];

    public ConversationListFragment()
    {
        an = 1;
        ap = -1;
        av = -1L;
        aw = -2L;
        aB = new big(this);
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

    public static bya a(ConversationListFragment conversationlistfragment, bya bya)
    {
        conversationlistfragment.aA = bya;
        return bya;
    }

    public static cqr a(ConversationListFragment conversationlistfragment, cqr cqr1)
    {
        conversationlistfragment.aG = cqr1;
        return cqr1;
    }

    public static em a(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.az;
    }

    public static Object a(ConversationListFragment conversationlistfragment, int i1)
    {
        return conversationlistfragment.c(i1);
    }

    public static void a(ConversationListFragment conversationlistfragment, Context context)
    {
        View view = conversationlistfragment.getView().findViewById(h.dH);
        view.setVisibility(0);
        ((Button)view.findViewById(h.dJ)).setOnClickListener(new bij(conversationlistfragment, view, g.f("https://www.google.com/support/hangouts/?hl=%locale%", "merge_convo"), context));
        ((Button)view.findViewById(h.dI)).setOnClickListener(new bik(conversationlistfragment, view));
    }

    public static void a(ConversationListFragment conversationlistfragment, View view)
    {
        conversationlistfragment.c(view);
    }

    public static void a(ConversationListFragment conversationlistfragment, ny ny1, MenuItem menuitem, long al1[])
    {
        conversationlistfragment.a(ny1, menuitem, al1);
    }

    private void a(ny ny1, MenuItem menuitem, long al1[])
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        ny1 = ny1.a();
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
            while (j1 < ny1.getCount()) 
            {
                ny1.moveToPosition(j1);
                if (ny1.getLong(0) != l1)
                {
                    continue;
                }
                Object obj = d(ny1);
                long l2 = ny1.getLong(4);
                if (menuitem.getItemId() == h.fd)
                {
                    String s1;
                    for (obj = g.g(((String) (obj))).iterator(); ((Iterator) (obj)).hasNext(); RealTimeChatService.a(d, s1, 10))
                    {
                        s1 = (String)((Iterator) (obj)).next();
                    }

                    continue;
                }
                if (menuitem.getItemId() == h.fh)
                {
                    String s2;
                    for (obj = g.g(((String) (obj))).iterator(); ((Iterator) (obj)).hasNext(); RealTimeChatService.a(d, s2, 30))
                    {
                        s2 = (String)((Iterator) (obj)).next();
                    }

                    continue;
                }
                if (menuitem.getItemId() == h.fc)
                {
                    for (obj = g.g(((String) (obj))).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add((String)((Iterator) (obj)).next())) { }
                    continue;
                }
                if (menuitem.getItemId() == h.eY)
                {
                    for (obj = g.g(((String) (obj))).iterator(); ((Iterator) (obj)).hasNext(); arraylist1.add(Long.valueOf(l2)))
                    {
                        arraylist.add((String)((Iterator) (obj)).next());
                    }

                } else
                if (menuitem.getItemId() == h.eZ)
                {
                    if (al1.length > 1)
                    {
                        throw new IllegalStateException();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("conversation_name", ak);
                    bundle.putString("conversation_id", ((String) (obj)));
                    getActivity().showDialog(1, bundle);
                } else
                if (menuitem.getItemId() == h.fg)
                {
                    obj = g.g(((String) (obj))).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s3 = (String)((Iterator) (obj)).next();
                        a.b(s3, l2);
                    }
                } else
                if (menuitem.getItemId() == h.eW)
                {
                    a.a(((String) (obj)));
                    a.a(((String) (obj)), l2);
                } else
                if (menuitem.getItemId() == h.ff)
                {
                    (new bio(this, ((String) (obj)))).execute(new Void[0]);
                }
                j1++;
            }
            i1++;
        } while (true);
        if (menuitem.getItemId() == h.eW)
        {
            a.a();
        }
        if (menuitem.getItemId() != h.fc && menuitem.getItemId() != h.eY) goto _L2; else goto _L1
_L1:
        i = (String[])arraylist.toArray(new String[arraylist.size()]);
        if (menuitem.getItemId() != h.fc) goto _L4; else goto _L3
_L3:
        d();
_L6:
        return;
_L4:
        aj = (Long[])arraylist1.toArray(new Long[arraylist1.size()]);
        displayDeleteConversationDialog(d.h());
        return;
_L2:
        if (aG != null)
        {
            aG.c();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean a(long l1, boolean flag)
    {
        if (b)
        {
            int i1 = an;
            long l2 = av;
            long l3 = aw;
            ebw.b("Babel", (new StringBuilder(122)).append("Updating continuation end timestamp for ").append(i1).append(" from ").append(l2).append("/").append(l3).append(" to ").append(l1).toString());
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
        return view.findViewById(h.au);
    }

    public static bya b(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.aA;
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
            am.setVisibility(8);
            if (ay != null && !aE)
            {
                ay.a("conversation_list_fragment_ui_loading_spinner");
                aE = true;
            }
        } else
        {
            if (isEmpty() && ap != 3)
            {
                showEmptyView(view);
                am.setVisibility(8);
            } else
            {
                showContent(view);
                if (v())
                {
                    am.setVisibility(8);
                } else
                {
                    am.setVisibility(0);
                }
            }
            if (ay != null && aE)
            {
                ay.a(d.h(), "conversation_list_fragment_ui_loading_spinner", SystemClock.elapsedRealtime(), 1);
                aE = false;
                return;
            }
        }
    }

    public static void c(ConversationListFragment conversationlistfragment)
    {
        conversationlistfragment.t();
    }

    public static Runnable d(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.aF;
    }

    private static String d(Cursor cursor)
    {
        return EsProvider.b(cursor.getString(1), (int)a(cursor));
    }

    public static void d(String s1)
    {
        g(s1);
    }

    public static Handler e(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.aD;
    }

    public static void e(String s1)
    {
        f(s1);
    }

    public static ani f(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.d;
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
        ebw.c("Babel", s1);
    }

    public static biv g(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.ao;
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
        ebw.b("Babel", s1);
    }

    public static int h(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.ap;
    }

    public static boolean i(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.al;
    }

    public static boolean j(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.v();
    }

    public static boolean k(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.u();
    }

    public static boolean l(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.s();
    }

    public static int m(ConversationListFragment conversationlistfragment)
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

    public static cqr n(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.aG;
    }

    public static hhb o(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.context;
    }

    public static hhb p(ConversationListFragment conversationlistfragment)
    {
        return conversationlistfragment.context;
    }

    public static boolean q()
    {
        return b;
    }

    private ListAdapter r()
    {
        if (h == null || ((SwipeableListView)h).getAdapter() == null)
        {
            String s1;
            if (h == null)
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
            ebw.f("Babel", s1);
            return null;
        } else
        {
            return ((SwipeableListView)h).getAdapter();
        }
    }

    private boolean s()
    {
        if (c.b() && !v())
        {
            if (b)
            {
                long l1 = av;
                long l2 = aw;
                ebw.b("Babel", (new StringBuilder(81)).append("Requesting more conversations at ").append(l1).append(" (last ").append(l2).append(")").toString());
            }
            if (aw != av)
            {
                aw = av;
                RealTimeChatService.a(d, an);
                return true;
            }
        }
        return false;
    }

    private void t()
    {
        if (c.b())
        {
            long l1 = ((gms)binder.a(gms)).a(d.h()).a(EsProvider.a(an), -1L);
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
        return aw != -2L;
    }

    private boolean v()
    {
        return d == null || !c.b() || !d.u() || av == -2L;
    }

    public void a(int i1)
    {
        boolean flag;
        flag = false;
        if (b)
        {
            int j1 = ap;
            String s1 = String.valueOf(d);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 70)).append("setDisplayMode: displayMode=").append(j1).append(", newMode=").append(i1).append(", account=").append(s1).toString());
        }
        if (i1 == ap)
        {
            return;
        }
        ap = i1;
        ap;
        JVM INSTR tableswitch 0 3: default 128
    //                   0 177
    //                   1 128
    //                   2 190
    //                   3 182;
           goto _L1 _L2 _L1 _L3 _L4
_L1:
        i1 = ap;
        gbh.a((new StringBuilder(52)).append("setDisplayMode called with unknown mode: ").append(i1).toString());
        flag = true;
_L6:
        a(true);
        a(-1L, flag);
        return;
_L2:
        aq = false;
_L4:
        an = 1;
        continue; /* Loop/switch isn't completed */
_L3:
        an = 2;
        aq = false;
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
            bundle = i;
            for (k1 = bundle.length; i1 < k1; i1++)
            {
                s1 = bundle[i1];
                RealTimeChatService.h(d, s1);
            }

        } else
        if (s1.equals("delete_conversation"))
        {
            bundle = getAccountForConversationDeletion(bundle);
            if (bundle != null)
            {
                for (int j1 = k1; j1 < i.length; j1++)
                {
                    RealTimeChatService.a(bundle, i[j1], g.a(aj[j1], 0L));
                }

            }
        }
        if (aG != null)
        {
            aG.c();
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
            view.findViewById(h.dq).setVisibility(0);
        }
    }

    public void a(ani ani1)
    {
        d = ani1;
        if (b)
        {
            ani1 = String.valueOf(d);
            g((new StringBuilder(String.valueOf(ani1).length() + 37)).append("ConversationListFragment setAccount: ").append(ani1).toString());
        }
        if (d != null && getActivity() != null)
        {
            e = EsProvider.a(EsProvider.f, d.h());
            f = EsProvider.a(EsProvider.h, d.h());
            a = new biq(this, d);
        }
    }

    public void a(biv biv1)
    {
        ao = biv1;
    }

    public void a(em em1, Cursor cursor)
    {
        boolean flag = true;
        ani ani1 = ((cnh)em1).C();
        if (ani1 == null || d == null || !TextUtils.equals(ani1.a(), d.a()))
        {
            ebw.f("Babel", "onLoadFinished called for mismatched account");
        } else
        {
            if (cursor == null)
            {
                ebw.f("Babel", "onLoadFinished returned with null data");
                return;
            }
            if (em1.o() == 1)
            {
                int i1 = cursor.getCount();
                ebw.e("Babel", (new StringBuilder(63)).append("ConversationListFragment load finished with ").append(i1).append(" results").toString());
                if (ay != null)
                {
                    ay.a(ani1.h(), "conversation_list_fragment_loader", SystemClock.elapsedRealtime(), 1);
                }
                ecd.a("ConversationListFragment.list load finished");
                al = true;
                ((bit)g).a(cursor);
                if (isEmpty())
                {
                    s();
                }
                c(getView());
                ab();
                if (aG != null)
                {
                    aG.b();
                }
                a.a(cursor);
                if (((cnh)em1).l().equals(f) && cursor.moveToFirst())
                {
                    long l1 = 0L;
                    long l2;
                    do
                    {
                        l2 = Math.max(l1, cursor.getLong(4));
                        l1 = l2;
                    } while (cursor.moveToNext());
                    l1 = g.b(context, ani1.h());
                    if (b)
                    {
                        if (l2 <= l1)
                        {
                            flag = false;
                        }
                        ebw.b("Babel", (new StringBuilder(84)).append("new invite timestamp: ").append(l2).append("; old ").append(l1).append("; greater? ").append(flag).toString());
                    }
                    if (l2 > l1)
                    {
                        g.a(context, ani1.h(), g.a(Long.valueOf(l2), 0L));
                    }
                }
                ecd.a();
                t();
                return;
            }
        }
    }

    public void a(String s1)
    {
        if (s1.equals("leave_conversation") && aG != null)
        {
            aG.c();
        }
    }

    public void a(boolean flag)
    {
        if (h != null)
        {
            SwipeableListView swipeablelistview = (SwipeableListView)h;
            if (flag && ap == 0 && !ebr.a(getActivity()) && binder.b(bea) != null)
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
        return u() || !al;
    }

    public void b()
    {
        if (ar != null)
        {
            ar.setSelected(false);
            ar = null;
        }
    }

    public void b(String s1)
    {
        if (s1.equals("leave_conversation") && aG != null)
        {
            aG.c();
        }
    }

    public void b(boolean flag)
    {
        aq = flag;
    }

    public ang c(String s1)
    {
        if (g == null)
        {
            return null;
        }
        Cursor cursor = ((bit)g).a();
        if (cursor != null && cursor.moveToFirst())
        {
            do
            {
                if (TextUtils.equals(d(cursor), s1))
                {
                    return new ang(cursor.getString(25), cursor.getString(31), cursor.getString(32), cursor.getInt(33), cursor.getString(34), cursor.getString(35));
                }
            } while (cursor.moveToNext());
        }
        return null;
    }

    public boolean c()
    {
        return aG != null;
    }

    public void d()
    {
        bff bff1 = bff.a(getString(l.iY), getString(l.iX), getString(l.iW), getString(l.jv));
        bff1.setTargetFragment(this, 0);
        bff1.a(getFragmentManager(), "leave_conversation");
    }

    public boolean e()
    {
        switch (ap)
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
        return ap;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        getLoaderManager().b(1, null, this);
    }

    public void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        c = (gmo)binder.a(gmo);
        bundle = (bxj)binder.b(bxj);
        if (bundle != null)
        {
            ax = bundle.a(17);
            ay = bundle.a(18);
        }
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        if (menuitem.getGroupId() != h.aA)
        {
            return false;
        }
        android.widget.AdapterView.AdapterContextMenuInfo adaptercontextmenuinfo;
        try
        {
            adaptercontextmenuinfo = (android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo();
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            return false;
        }
        if (adaptercontextmenuinfo == null)
        {
            return false;
        } else
        {
            a(g, menuitem, new long[] {
                adaptercontextmenuinfo.id
            });
            return true;
        }
    }

    public void onCreate(Bundle bundle)
    {
        ecd.a("ConversationListFragment.onCreate");
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        bundle = getActivity();
        if (bundle != null)
        {
            drw drw1 = (drw)binder.a(drw);
            if (drw1.a())
            {
                g.a(new bii(this, drw1, bundle));
            }
        }
        aH = new bip(this);
        a(dbf.e(c.a()));
        ecd.a();
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        boolean flag1 = true;
        Cursor cursor;
        int i1;
        int j1;
        boolean flag;
        boolean flag2;
        try
        {
            view = (android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo;
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu)
        {
            return;
        }
        getActivity().getMenuInflater().inflate(g.ht, contextmenu);
        view = ((View) (c(((android.widget.AdapterView.AdapterContextMenuInfo) (view)).position)));
        if (!(view instanceof Cursor))
        {
            return;
        }
        cursor = (Cursor)view;
        contextmenuinfo = cursor.getString(6);
        view = contextmenuinfo;
        if (TextUtils.isEmpty(contextmenuinfo))
        {
            view = cursor.getString(7);
        }
        ak = view;
        i1 = cursor.getInt(3);
        j1 = cursor.getInt(2);
        flag2 = g.e(cursor.getInt(36));
        contextmenu.setHeaderTitle(view);
        view = contextmenu.findItem(h.eZ);
        if (i1 == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setVisible(flag);
        view = contextmenu.findItem(h.fc);
        if (i1 == 2 && !flag2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setVisible(flag);
        view = contextmenu.findItem(h.eY);
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
        view = contextmenu.findItem(h.fd);
        if (flag)
        {
            flag1 = false;
        }
        view.setVisible(flag1);
        contextmenu.findItem(h.fh).setVisible(flag);
        contextmenu.findItem(h.ff).setVisible(ebr.a());
    }

    public em onCreateLoader(int i1, Bundle bundle)
    {
        gbh.b(d);
        switch (i1)
        {
        default:
            gbh.a((new StringBuilder(42)).append("Loader created for unknown id: ").append(i1).toString());
            return null;

        case 1: // '\001'
            i1 = ap;
            break;
        }
        ebw.e("Babel", (new StringBuilder(66)).append("ConversationListFragment load started for display mode ").append(i1).toString());
        if (ay != null)
        {
            ay.a("conversation_list_fragment_loader");
        }
        String s1;
        switch (ap)
        {
        case 1: // '\001'
        default:
            i1 = ap;
            gbh.a((new StringBuilder(51)).append("Loader created for unknown displayMode: ").append(i1).toString());
            return null;

        case 0: // '\0'
            bundle = new cnh(getActivity(), d, e, biu.a, String.format(Locale.US, "(%s >= 0 OR %s IS NULL) AND %s = %d AND %s > 0", new Object[] {
                "is_pending_leave", "is_pending_leave", "view", Integer.valueOf(1), "sort_timestamp"
            }), null, "invite_time_aggregate DESC,call_media_type DESC, sort_timestamp DESC");
            az = bundle;
            return bundle;

        case 2: // '\002'
            bundle = new cnh(getActivity(), d, e, biu.a, String.format(Locale.US, "(%s >= 0 OR %s IS NULL) AND %s = %d AND %s > 0 AND %s != %s", new Object[] {
                "is_pending_leave", "is_pending_leave", "view", Integer.valueOf(2), "sort_timestamp", "status", Integer.valueOf(1)
            }), null, "call_media_type DESC, sort_timestamp DESC");
            az = bundle;
            return bundle;

        case 3: // '\003'
            s1 = String.format(Locale.US, "(%s >= 0 OR %s IS NULL) AND %s = %d AND %s > 0 AND %s == %d", new Object[] {
                "is_pending_leave", "is_pending_leave", "view", Integer.valueOf(1), "sort_timestamp", "status", Integer.valueOf(2)
            });
            break;
        }
        bundle = s1;
        if (aq)
        {
            bundle = String.valueOf(s1);
            s1 = EsProvider.a("transport_type", "3");
            String s2 = EsProvider.a("transport_type", "2");
            bundle = (new StringBuilder(String.valueOf(bundle).length() + 12 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(bundle).append(" AND (").append(s1).append(" OR ").append(s2).append(") ").toString();
        }
        bundle = new cnh(getActivity(), d, e, biu.a, bundle, null, "call_media_type DESC, sort_timestamp DESC");
        az = bundle;
        return bundle;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        viewgroup = (ViewGroup)layoutinflater.inflate(g.fw, viewgroup, false);
        if (a != null)
        {
            biq biq1 = a;
            if (bundle != null)
            {
                biq1.a = (HashMap)bundle.getSerializable("last_archived");
            }
        }
        h = (SwipeableListView)viewgroup.findViewById(0x102000a);
        a(true);
        ((SwipeableListView)h).setAccessibilityDelegate(new dyz());
        bundle = layoutinflater.inflate(g.gF, h, false);
        ((SwipeableListView)h).addHeaderView(bundle);
        layoutinflater = layoutinflater.inflate(g.gD, h, false);
        am = layoutinflater.findViewById(h.dt);
        ((SwipeableListView)h).addFooterView(layoutinflater);
        am.setVisibility(8);
        ((SwipeableListView)h).setOnItemClickListener(this);
        g = new bit(this, getActivity(), d, this);
        as = (LinearLayout)viewgroup.findViewById(h.hc);
        at = null;
        au = (TextView)viewgroup.findViewById(h.hd);
        ((SwipeableListView)h).setAdapter(g);
        ((SwipeableListView)h).setOnScrollListener(new bin(this));
        if (f() != 3)
        {
            ((SwipeableListView)h).setChoiceMode(3);
            ((SwipeableListView)h).setMultiChoiceModeListener(aH.a());
        }
        viewgroup.setLayoutTransition(new LayoutTransition());
        return viewgroup;
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
            adapterview = view.findViewById(h.au);
            if (adapterview != null)
            {
                adapterview.setSelected(true);
                ar = adapterview;
            }
            s1 = d(((Cursor) (obj)));
            adapterview = new cey(((Cursor) (obj)).getString(16), ((Cursor) (obj)).getString(17));
            if (((Cursor) (obj)).getInt(22) <= 1)
            {
                break; /* Loop/switch isn't completed */
            }
            startActivity(g.g(d));
            g.a(d, 1557);
        }
_L4:
        if (aG != null)
        {
            aG.c();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (((Cursor) (obj)).getInt(14) == 1)
        {
            if (ao != null)
            {
                i1 = ((Cursor) (obj)).getInt(3);
                ao.a(adapterview, s1, i1, ((Cursor) (obj)).getLong(4));
            }
        } else
        if (ao != null)
        {
            if (ax != null)
            {
                ax.a("click_conversation_list");
            }
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
            obj = new aih(s1, i1, Integer.parseInt(EsProvider.b(((Cursor) (obj)).getString(36), (int)a(((Cursor) (obj))))));
            obj.f = new ang(adapterview, s2, view, j1, s3, s4);
            obj.g = s5;
            obj.h = l1;
            obj.i = s6;
            obj.j = s7;
            obj.k = 1634;
            ao.a(((aih) (obj)));
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
            if (g != null)
            {
                ((bit)g).b(null);
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
        ((bit)g).d();
        aF.run();
        if (isEmpty())
        {
            s();
        }
        ((gms)binder.a(gms)).a(aC);
        c(getView());
        ((SwipeableListView)getView().findViewById(0x102000a)).a(aB);
    }

    public void onStop()
    {
        super.onStop();
        aD.removeCallbacks(aF);
        ((bit)g).c();
        ((gms)binder.a(gms)).b(aC);
    }

    public void setUserVisibleHint(boolean flag)
    {
        super.setUserVisibleHint(flag);
        if (!flag && aG != null)
        {
            aG.c();
        }
    }

    protected void showContent(View view)
    {
        if (at != null)
        {
            as.removeView(at);
            at = null;
        }
        super.showContent(view);
        view.findViewById(h.dq).setVisibility(8);
    }

    protected void showEmptyView(View view)
    {
        ap;
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
        ebr.a(au, null, l1, k1, j1);
        if (at == null)
        {
            at = new ImageView(as.getContext());
            at.setImageResource(i1);
            as.addView(at, 0);
            as.setClickable(flag);
            as.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        }
        super.showEmptyView(view);
        return;
_L2:
        g.a(d, 2137);
        l1 = l.gX;
        k1 = l.gW;
        j1 = l.gV;
        i1 = com.google.android.apps.hangouts.R.drawable.ay;
        flag = true;
        obj = new bim(this);
        continue; /* Loop/switch isn't completed */
_L3:
        l1 = l.gT;
        i1 = com.google.android.apps.hangouts.R.drawable.ax;
        j1 = 0;
        k1 = 0;
        obj = null;
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static 
    {
        hik hik = ebw.e;
    }
}
