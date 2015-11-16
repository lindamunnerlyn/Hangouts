// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments;

import ahc;
import ai;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import anr;
import ant;
import aoa;
import ap;
import atu;
import bfr;
import bji;
import bjj;
import bjk;
import bkk;
import blr;
import bls;
import blt;
import blu;
import bmb;
import bq;
import br;
import cfo;
import cfz;
import cgd;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import cov;
import dcn;
import dql;
import due;
import eeg;
import eep;
import eev;
import em;
import g;
import gdv;
import gf;
import gq;
import gqu;
import h;
import hlp;
import hlt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l;

public class ConversationParticipantsFragment extends bkk
    implements br
{

    private gqu a;
    private cfz aA;
    private String aB;
    private String aC;
    private boolean aD;
    private final bji aE = new bji(this);
    private final bjk aF = new bjk(this);
    private List aG;
    private int aj;
    private String ak;
    private int al;
    private final anr am = new anr();
    private long an;
    private boolean ao;
    private blt ap;
    private blt aq;
    private blt ar;
    private blt as;
    private blt at;
    private cfz au;
    private boolean av;
    private boolean aw;
    private boolean ax;
    private String ay;
    private String az;
    private String b;
    private ahc c;
    private String d[];
    private aoa e;
    private ListView f;
    private blr g;
    private blu h;
    private int i;

    public ConversationParticipantsFragment()
    {
        aD = false;
    }

    private Uri a()
    {
        if (aB != null)
        {
            return eep.c(aB);
        } else
        {
            return b();
        }
    }

    public static hlp a(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        return conversationparticipantsfragment.binder;
    }

    private static String a(Intent intent)
    {
        intent = intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
        if (intent == null)
        {
            return "";
        } else
        {
            return intent.toString();
        }
    }

    private static String a(String s1, Uri uri)
    {
        if (uri != null && uri.toString().equals(s1))
        {
            uri = null;
        } else
        {
            uri = s1;
            if (s1 == null)
            {
                return "";
            }
        }
        return uri;
    }

    private static void a(blt blt1, String s1)
    {
        if (blt1.g != null)
        {
            blt1.b = s1;
            ((TextView)blt1.g.findViewById(h.fU)).setText(s1);
        }
    }

    public static void a(ConversationParticipantsFragment conversationparticipantsfragment, String s1, Uri uri, Uri uri1, int i1, int j1)
    {
        Intent intent = (new Intent("android.intent.action.RINGTONE_PICKER")).putExtra("android.intent.extra.ringtone.TYPE", j1).putExtra("android.intent.extra.ringtone.TITLE", s1);
        if (!eeg.a.equals(uri)) goto _L2; else goto _L1
_L1:
        s1 = dql.a(g.hZ);
_L4:
        conversationparticipantsfragment.startActivityForResult(intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", s1).putExtra("android.intent.extra.ringtone.DEFAULT_URI", uri1), i1);
        return;
_L2:
        s1 = uri;
        if (eeg.b.equals(uri))
        {
            s1 = dql.a(g.hY);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(boolean flag)
    {
        at = new blt(context.getString(l.eB), eeg.a(context, d()), false, false, 5);
        at.a(flag);
    }

    private Uri b()
    {
        cfq cfq = cfo.a(aj);
        return cfo.a(context, e.h(), cfq);
    }

    public static aoa b(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        return conversationparticipantsfragment.e;
    }

    private Uri c()
    {
        return eep.c(g.b(e));
    }

    public static void c(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        bg bg = conversationparticipantsfragment.getFragmentManager().a();
        String s1 = conversationparticipantsfragment.ak;
        bmb bmb1 = new bmb();
        Bundle bundle = new Bundle();
        bundle.putString("name", s1);
        bmb1.setArguments(bundle);
        bmb1.setTargetFragment(conversationparticipantsfragment, 0);
        bmb1.a(bg, null);
    }

    private Uri d()
    {
        if (aC != null)
        {
            return eep.c(aC);
        } else
        {
            return c();
        }
    }

    public static void d(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        int i1 = 0;
        String as1[];
        if (conversationparticipantsfragment.al == 30)
        {
            conversationparticipantsfragment.al = 10;
            conversationparticipantsfragment.aq.d = false;
        } else
        {
            conversationparticipantsfragment.al = 30;
            conversationparticipantsfragment.aq.d = true;
        }
        as1 = conversationparticipantsfragment.d;
        for (int j1 = as1.length; i1 < j1; i1++)
        {
            String s1 = as1[i1];
            RealTimeChatService.a(conversationparticipantsfragment.e, s1, conversationparticipantsfragment.al);
        }

        if (conversationparticipantsfragment.aq.g != null)
        {
            ((CheckBox)conversationparticipantsfragment.aq.g.findViewById(h.Z)).setChecked(conversationparticipantsfragment.aq.d);
            if (conversationparticipantsfragment.as != null)
            {
                conversationparticipantsfragment.as.a(conversationparticipantsfragment.aq.d);
            }
            if (conversationparticipantsfragment.at != null)
            {
                conversationparticipantsfragment.at.a(conversationparticipantsfragment.aq.d);
            }
        }
    }

    public static boolean e(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        return conversationparticipantsfragment.av;
    }

    public static cfz f(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        return conversationparticipantsfragment.au;
    }

    public static boolean g(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        conversationparticipantsfragment.av = false;
        return false;
    }

    public static blt h(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        return conversationparticipantsfragment.ar;
    }

    public static void i(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        Object obj = null;
        String s1;
        if (conversationparticipantsfragment.au != null)
        {
            s1 = eep.d(conversationparticipantsfragment.au.e);
        } else
        {
            s1 = null;
        }
        if (conversationparticipantsfragment.i == 1)
        {
            if (conversationparticipantsfragment.aw)
            {
                obj = conversationparticipantsfragment.getString(l.hO);
            } else
            if (conversationparticipantsfragment.ax)
            {
                obj = conversationparticipantsfragment.getString(l.hP);
            } else
            {
                obj = conversationparticipantsfragment.getString(l.hR);
            }
        }
        obj = bfr.a(conversationparticipantsfragment.getString(l.hS, new Object[] {
            s1
        }), ((String) (obj)), conversationparticipantsfragment.getString(l.hQ), conversationparticipantsfragment.getString(l.Q));
        ((bfr) (obj)).setTargetFragment(conversationparticipantsfragment, 0);
        ((bfr) (obj)).a(new bjj(conversationparticipantsfragment));
        ((bfr) (obj)).a(conversationparticipantsfragment.getFragmentManager(), "block_user");
        g.a(conversationparticipantsfragment.e, 1818);
    }

    public static Uri j(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        return conversationparticipantsfragment.a();
    }

    public static Uri k(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        return conversationparticipantsfragment.b();
    }

    public static Uri l(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        return conversationparticipantsfragment.d();
    }

    public static Uri m(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        return conversationparticipantsfragment.c();
    }

    public static String n(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        return conversationparticipantsfragment.b;
    }

    public static ahc o(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        return conversationparticipantsfragment.c;
    }

    public static int p(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        return conversationparticipantsfragment.i;
    }

    public static String[] q(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        return conversationparticipantsfragment.d;
    }

    public static long r(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        return conversationparticipantsfragment.an;
    }

    public static anr s(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        return conversationparticipantsfragment.am;
    }

    public void a(em em1, Cursor cursor)
    {
        boolean flag2 = true;
        em1.o();
        JVM INSTR tableswitch 1025 1025: default 24
    //                   1025 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        am.a(cursor);
        boolean flag1;
        if (i == 1)
        {
            em1 = am.b().iterator();
            int i1 = 0;
            do
            {
                if (!em1.hasNext())
                {
                    break;
                }
                cfz cfz1 = (cfz)em1.next();
                if (Boolean.TRUE.equals(cfz1.i))
                {
                    av = true;
                }
                if (au == null || TextUtils.isEmpty(cfz1.c))
                {
                    au = cfz1;
                    if (au.e == null)
                    {
                        au.e = "";
                    }
                }
                int j1 = i1 + 1;
                i1 = j1;
                if (aA != null)
                {
                    continue;
                }
                boolean flag = g.e(aj);
                if (!flag || !TextUtils.equals(cfz1.b.b, ay))
                {
                    i1 = j1;
                    if (flag)
                    {
                        continue;
                    }
                    i1 = j1;
                    if (!TextUtils.equals(cfz1.b.a, az))
                    {
                        continue;
                    }
                }
                aA = cfz1;
                i1 = j1;
            } while (true);
            if (i1 > 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            aw = flag1;
            if (!aw && au != null)
            {
                if (!TextUtils.isEmpty(au.c))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                ax = flag1;
            }
        }
        if (ar != null && au != null)
        {
            em1 = gf.a();
            if (av)
            {
                ar.a = getActivity().getString(l.aA, new Object[] {
                    em1.a(au.e, gq.e)
                });
            } else
            {
                ar.a = getActivity().getString(l.an, new Object[] {
                    em1.a(au.e, gq.e)
                });
            }
            if (ar.g != null)
            {
                ((TextView)ar.g.findViewById(h.gh)).setText(ar.a);
            }
        }
        h.a(cursor);
        if (g.e(aj) && am.b().size() == 1)
        {
            if (al == 30)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            a(flag1);
            aG.add(at);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void a(String s1)
    {
        boolean flag;
        if (i == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            s1 = String.valueOf("should not call setConversationName on a conversation which is not a group conversation ");
            String s2 = String.valueOf(b);
            if (s2.length() != 0)
            {
                s1 = s1.concat(s2);
            } else
            {
                s1 = new String(s1);
            }
            eev.g("Babel", s1);
        } else
        if (!TextUtils.equals(ak, s1))
        {
            ak = s1;
            RealTimeChatService.c(e, b, ak);
            if (ap.g != null)
            {
                ap.a = getResources().getString(l.av);
                ap.b = s1;
                ((TextView)ap.g.findViewById(h.fU)).setText(ap.a);
                ((TextView)ap.g.findViewById(h.fU)).setText(s1);
                return;
            }
        }
    }

    protected boolean isEmpty()
    {
        return false;
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (j1 != -1) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR tableswitch 102 103: default 28
    //                   102 68
    //                   103 152;
           goto _L3 _L4 _L5
_L3:
        gdv.a((new StringBuilder(28)).append("Bad request code ").append(i1).toString());
_L7:
        if (h != null)
        {
            h.notifyDataSetChanged();
        }
_L2:
        return;
_L4:
        String s1 = a(intent);
        if (!s1.equals(aC))
        {
            g.a(e, 1600);
        }
        intent = d[0];
        aC = s1;
        s1 = a(s1, c());
        RealTimeChatService.e(e, intent, s1);
        a(at, eeg.a(context, d()));
        continue; /* Loop/switch isn't completed */
_L5:
        String s2 = a(intent);
        intent = d[0];
        aB = s2;
        s2 = a(s2, b());
        RealTimeChatService.d(e, intent, s2);
        a(as, eeg.a(context, a()));
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        Intent intent = activity.getIntent();
        b = intent.getStringExtra("conversation_id");
        ak = intent.getStringExtra("conversation_name");
        al = intent.getIntExtra("notification_level", 10);
        i = intent.getIntExtra("client_conversation_type", 0);
        an = intent.getLongExtra("latest_timestamp", 0L);
        ao = intent.getBooleanExtra("has_unknown_sender", false);
        aB = intent.getStringExtra("chat_ringtone_uri");
        aC = intent.getStringExtra("hangout_ringtone_uri");
        d = intent.getStringArrayExtra("merged_conversation_ids");
        ay = intent.getStringExtra("preferred_chat_id");
        az = intent.getStringExtra("preferred_gaia_id");
        aA = null;
        if (d.length == 0)
        {
            eev.g("Babel", "should not have mergedConversationIds.length == 0");
        }
        activity.setTitle(ak);
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gqu)binder.a(gqu);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getActivity().getIntent();
        e = dcn.e(a.a());
        aj = bundle.getIntExtra("transport_type", e.J());
        getActivity().setResult(0);
        setHasOptionsMenu(true);
        am.d(null, null);
        c = (ahc)binder.b(ahc);
    }

    public em onCreateLoader(int i1, Bundle bundle)
    {
        switch (i1)
        {
        default:
            return null;

        case 1025: 
            am.d(e, b);
            break;
        }
        return am.a(ant.a);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(g.hm, menu);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(g.fA, viewgroup, false);
        boolean flag1 = g.e(aj);
        bundle = new ArrayList();
        if (!flag1 && i == 2)
        {
            ap = new blt(context.getString(l.av), ak, false, false, 1);
            bundle.add(ap);
        }
        boolean flag;
        if (al == 30)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aq = new blt(context.getString(l.aw), null, true, flag, 2);
        bundle.add(aq);
        as = new blt(context.getString(l.eE), eeg.a(context, a()), false, false, 4);
        as.a(flag);
        bundle.add(as);
        if (g.f(aj))
        {
            a(flag);
            bundle.add(at);
        }
        if (i == 1 && !ao)
        {
            ar = new blt(null, null, false, false, 3);
            bundle.add(ar);
        }
        if (c != null)
        {
            String s1 = c.a();
            if (s1 != null)
            {
                bundle.add(new blt(s1, null, false, false, 6));
            }
        }
        aG = bundle;
        bundle = new bls(context, aG, aF);
        h = new blu(context, e, au, flag1, aE);
        g = new blr(context, bundle, h);
        f = (ListView)viewgroup.findViewById(h.dj);
        layoutinflater = layoutinflater.inflate(g.gA, f, false);
        f.addHeaderView(layoutinflater);
        f.setAdapter(g);
        getLoaderManager().a(1025, new Bundle(), this).s();
        return viewgroup;
    }

    public void onDestroy()
    {
        super.onDestroy();
        f.setAdapter(null);
        g.b();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
    }

    public void onLoadFinished(em em1, Object obj)
    {
        a(em1, (Cursor)obj);
    }

    public void onLoaderReset(em em1)
    {
        switch (em1.o())
        {
        default:
            return;

        case 1025: 
            h.a(null);
            break;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == h.eJ || menuitem.getItemId() == h.eM)
        {
            if (aD)
            {
                return false;
            }
            if (am.d())
            {
                return false;
            }
            Object obj;
            atu atu1;
            ai ai1;
            if (i == 2)
            {
                obj = cov.d;
                menuitem = am.e();
            } else
            {
                if (aA == null)
                {
                    return false;
                }
                obj = cov.c;
                menuitem = new ArrayList();
                menuitem.add(aA);
            }
            ai1 = getActivity();
            if (g.e(aj))
            {
                atu1 = atu.b;
            } else
            {
                atu1 = atu.a;
            }
            menuitem = g.a(e, b, menuitem, ((cov) (obj)), atu1);
            obj = (Intent)ai1.getIntent().getParcelableExtra("share_intent");
            if (obj != null)
            {
                ((Intent) (obj)).putExtra("conversation_id", b);
                menuitem.putExtra("share_intent", ((android.os.Parcelable) (obj)));
            }
            ai1.startActivityForResult(menuitem, 101);
            aD = true;
            return true;
        }
        if (menuitem.getItemId() == h.eI)
        {
            if (am.d())
            {
                return false;
            }
            boolean flag;
            if (i == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                menuitem = String.valueOf("should not call forkGroupConversation on a conversation which is not a group conversation ");
                String s1 = String.valueOf(b);
                if (s1.length() != 0)
                {
                    menuitem = menuitem.concat(s1);
                } else
                {
                    menuitem = new String(menuitem);
                }
                eev.g("Babel", menuitem);
                return false;
            }
            getActivity();
            if (g.e(aj))
            {
                menuitem = atu.b;
            } else
            {
                menuitem = atu.a;
            }
            startActivity(g.a(e, b, am.e(), cov.b, menuitem));
            getActivity().finish();
            return true;
        } else
        {
            return false;
        }
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        boolean flag = true;
        boolean flag1 = true;
        MenuItem menuitem = menu.findItem(h.eJ);
        MenuItem menuitem1 = menu.findItem(h.eM);
        menu = menu.findItem(h.eI);
        boolean flag2 = g.e(aj);
        if (i == 2)
        {
            if (!flag2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            menuitem.setVisible(flag);
            menuitem1.setVisible(false);
            if (!flag2)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            menu.setVisible(flag);
            return;
        }
        menuitem.setVisible(false);
        if (e.l() || flag2 && !due.a(e.h(), aj) || ao)
        {
            flag = false;
        }
        menuitem1.setVisible(flag);
        menu.setVisible(false);
    }

    public void onResume()
    {
        super.onResume();
        aD = false;
    }
}
