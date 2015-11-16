// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import aik;
import ail;
import ais;
import ait;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.Toast;
import ane;
import ani;
import aob;
import aoh;
import bhj;
import bka;
import boy;
import bwf;
import cjd;
import cje;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import daf;
import dbf;
import dce;
import dgp;
import dhi;
import dkt;
import dlg;
import dlj;
import ebw;
import g;
import gam;
import gbh;
import gmp;
import gmq;
import gms;
import gng;
import hgx;
import l;

public class BabelGatewayActivity extends bka
    implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnClickListener, dlj, gmq
{

    private static final boolean m = false;
    private boolean A;
    private boolean B;
    private Uri C;
    private boolean D;
    private int E;
    private int F;
    private boolean G;
    private int H;
    private boolean I;
    private boolean J;
    private String K;
    private int L;
    private final dgp M = new cjd(this);
    private Intent n;
    private ani o;
    private String r[];
    private String s[];
    private String t;
    private String u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private long z;

    public BabelGatewayActivity()
    {
        (new gng(this, q)).a(p).a(this);
        r = new String[0];
        s = new String[0];
    }

    public static int a(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.L;
    }

    public static Intent a(int i1, String s1)
    {
        Intent intent = new Intent(g.nS, com/google/android/apps/hangouts/phone/BabelGatewayActivity);
        intent.setAction("com.google.android.apps.babel.realtimechat.update-watermark");
        intent.putExtra("account_id", i1);
        intent.putExtra("conversation_id", s1);
        return intent;
    }

    public static Intent a(int i1, String s1, String s2)
    {
        Intent intent = new Intent(g.nS, com/google/android/apps/hangouts/phone/BabelGatewayActivity);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("account_id", i1);
        intent.putExtra("conversation_id", s1);
        intent.putExtra("android.intent.extra.TEXT", s2);
        return intent;
    }

    public static Intent a(int i1, String s1, String s2, Uri uri, PendingIntent pendingintent, int j1, int k1)
    {
        Intent intent = new Intent(g.nS, com/google/android/apps/hangouts/phone/BabelGatewayActivity);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("account_id", i1);
        if (s1 != null)
        {
            intent.putExtra("participant_gaia", s1);
            intent.putExtra("participant_name", s2);
            intent.putExtra("start_video", true);
        } else
        {
            gbh.b(uri);
            intent.putExtra("hangout_uri", uri);
        }
        if (pendingintent != null)
        {
            intent.putExtra("hangout_call_end_intent", pendingintent);
        }
        intent.putExtra("hangout_auto_join", false);
        intent.putExtra("hangout_start_source", j1);
        intent.putExtra("media_type", k1);
        intent.putExtra("extra_hangout_start_time", SystemClock.elapsedRealtime());
        return intent;
    }

    public static Intent a(int i1, String s1, String s2, String s3, boolean flag, String s4)
    {
        Intent intent = new Intent(g.nS, com/google/android/apps/hangouts/phone/BabelGatewayActivity);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("account_id", i1);
        intent.putExtra("participant_gaia", s1);
        intent.putExtra("participant_name", s2);
        intent.putExtra("start_video", false);
        intent.putExtra("android.intent.extra.TEXT", s3);
        intent.putExtra("force_group", flag);
        intent.putExtra("invite_token_url", s4);
        return intent;
    }

    public static Intent a(Context context, int i1, String s1)
    {
        context = new Intent(context, com/google/android/apps/hangouts/phone/BabelGatewayActivity);
        context.setAction("android.intent.action.SENDTO");
        context.putExtra("account_id", i1);
        context.putExtra("conversation_id", s1);
        return context;
    }

    public static Intent a(Context context, int i1, String s1, long l1, boolean flag, boolean flag1)
    {
        context = new Intent(context, com/google/android/apps/hangouts/phone/BabelGatewayActivity);
        context.setAction("android.intent.action.SENDTO");
        context.putExtra("account_id", i1);
        context.putExtra("conversation_id", s1);
        context.putExtra("watermark", l1);
        context.putExtra("otr_state", flag1);
        context.putExtra("requires_mms", flag);
        return context;
    }

    public static Intent a(Context context, int i1, String s1, String s2, String s3)
    {
        context = new Intent(context, com/google/android/apps/hangouts/phone/BabelGatewayActivity);
        context.setAction("android.intent.action.VIEW");
        context.putExtra("account_id", i1);
        if (!TextUtils.isEmpty(s1))
        {
            context.putExtra("conversation_id", s1);
        } else
        {
            context.putExtra("participant_name", s2);
        }
        context.putExtra("android.intent.extra.TEXT", s3);
        return context;
    }

    public static Intent a(Context context, int i1, String s1, String s2, String s3, String s4, long l1, 
            boolean flag)
    {
        context = new Intent(context, com/google/android/apps/hangouts/phone/BabelGatewayActivity);
        context.setAction("android.intent.action.SENDTO");
        context.putExtra("account_id", i1);
        if (!TextUtils.isEmpty(s1))
        {
            context.putExtra("conversation_id", s1);
        } else
        {
            context.putExtra("participant_gaia", s2);
            context.putExtra("participant_name", s3);
        }
        context.putExtra("android.intent.extra.TEXT", s4);
        context.putExtra("watermark", l1);
        context.putExtra("requires_mms", flag);
        return context;
    }

    public static String a(BabelGatewayActivity babelgatewayactivity, String s1)
    {
        babelgatewayactivity.t = s1;
        return s1;
    }

    public static void a(BabelGatewayActivity babelgatewayactivity, int i1)
    {
        babelgatewayactivity.e(i1);
    }

    public static void a(String s1)
    {
        b(s1);
    }

    public static String[] a(BabelGatewayActivity babelgatewayactivity, String as[])
    {
        babelgatewayactivity.s = as;
        return as;
    }

    public static Intent b(int i1, String s1, String s2, Uri uri, PendingIntent pendingintent, int j1, int k1)
    {
        s1 = a(i1, s1, s2, uri, pendingintent, j1, k1);
        s1.setAction("android.intent.action.VIEW");
        s1.putExtra("hangout_auto_join", true);
        return s1;
    }

    public static void b(BabelGatewayActivity babelgatewayactivity, int i1)
    {
        babelgatewayactivity.f(i1);
    }

    private static void b(String s1)
    {
        String s2 = String.valueOf("[BabelGatewayActivity] ");
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

    public static boolean b(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.B;
    }

    public static ani c(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.o;
    }

    private void c(Intent intent)
    {
        startActivity(intent);
        setResult(-1);
        finish();
    }

    public static int d(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.H;
    }

    public static Intent d(int i1)
    {
        Intent intent = new Intent(g.nS, com/google/android/apps/hangouts/phone/BabelGatewayActivity);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("account_id", i1);
        return intent;
    }

    private void e(int i1)
    {
        Toast.makeText(this, i1, 0).show();
        setResult(0);
        finish();
    }

    public static boolean e(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.D;
    }

    public static int f(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.E;
    }

    private void f(int i1)
    {
        if (v)
        {
            boolean flag;
            if (!TextUtils.isEmpty(u))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gbh.a(flag);
            if (z > 0L)
            {
                RealTimeChatService.b(o, t, z);
            }
            if (m)
            {
                String s1 = String.valueOf(t);
                if (s1.length() != 0)
                {
                    s1 = "Auto-sending message to conversation ".concat(s1);
                } else
                {
                    s1 = new String("Auto-sending message to conversation ");
                }
                b(s1);
            }
            ((dkt)p.a(dkt)).a(o, t, u, null, 0, null, 0, 0, null, null, A, null, y);
            setResult(-1);
            finish();
            return;
        }
        if (w)
        {
            RealTimeChatService.b(o, t, z);
            setResult(-1);
            finish();
            return;
        }
        Intent intent = g.a(o.h(), t, i1);
        if (!TextUtils.isEmpty(u))
        {
            Intent intent1 = new Intent();
            intent1.putExtra("android.intent.extra.TEXT", u);
            intent1.putExtra("conversation_id", t);
            intent.putExtra("share_intent", intent1);
        }
        c(intent);
    }

    public static int g(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.F;
    }

    public static boolean h(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.G;
    }

    public static boolean i(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.I;
    }

    public static boolean j()
    {
        return m;
    }

    public static boolean j(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.J;
    }

    public static String[] k(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.r;
    }

    public static String[] l(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.s;
    }

    private void m()
    {
        if (r.length != s.length)
        {
            gbh.a("BabelGatewayActivity.createConversationWithParticipants: different number of participant gaia ids and names");
            return;
        }
        ail ail1 = aik.newBuilder();
        for (int i1 = 0; i1 < r.length; i1++)
        {
            ail1.a(ais.newBuilder().a(s[i1]).a(daf.a(r[i1], s[i1])).a());
        }

        RealTimeChatService.a(M);
        dhi dhi1 = dhi.b();
        L = dhi1.a();
        RealTimeChatService.a(dhi1, (new dce(getApplicationContext())).a(o.h()).a(ail1.a()).a(aob.c).a(B).b(x).a(K).a());
    }

    public static void m(BabelGatewayActivity babelgatewayactivity)
    {
        babelgatewayactivity.m();
    }

    public void a(aoh aoh1)
    {
        t = aoh1.s;
        f(aoh1.b);
    }

    public void a(boolean flag, gmp gmp1, gmp gmp2, int i1, int j1)
    {
        if (gmp2 != gmp.c) goto _L2; else goto _L1
_L1:
        o = dbf.e(j1);
        gbh.b(o);
        i1 = n.getIntExtra("opened_from_impression", 0);
        if (i1 != 0)
        {
            ((bwf)p.a(bwf)).a(o.h(), i1).d();
        }
        if (!v && !w)
        {
            ((gms)p.a(gms)).a("active-hangouts-account", o.h());
        }
        if (C == null) goto _L4; else goto _L3
_L3:
        gmp2 = C;
        gmp1 = (PendingIntent)n.getParcelableExtra("hangout_call_end_intent");
        gmp2 = boy.a(gmp2, o.a(), gmp1);
        if (gmp2 != null) goto _L6; else goto _L5
_L5:
        ebw.g("Babel", "invalid hangout request");
        if (gmp1 != null)
        {
            try
            {
                gmp1.send();
            }
            // Misplaced declaration of an exception variable
            catch (gmp gmp1)
            {
                ebw.d("Babel", "callCompletionIntent failed", gmp1);
            }
        }
        e(l.di);
_L8:
        return;
_L6:
        startActivity(g.a(gmp2, null, D, E, SystemClock.elapsedRealtime(), F, G, I, J));
        setResult(-1);
        finish();
        return;
_L4:
        if (!TextUtils.isEmpty(t) || r.length > 0 || s.length > 0)
        {
            if (m)
            {
                b("getConversation");
            }
            gbh.b(o);
            if (!TextUtils.isEmpty(t))
            {
                dlg.a(o).a(new ane(t, this));
                return;
            }
            if (r.length > 0)
            {
                if (s.length > 0)
                {
                    m();
                    return;
                } else
                {
                    ebw.f("Babel", "BabelGatewayActivity.createConversation: incoming intent has no participant name");
                    (new cje(this)).g();
                    return;
                }
            }
            if (s.length > 0 && bhj.b(s[0]) != null)
            {
                gmp1 = bhj.b(s[0]);
                gmp2 = aik.newBuilder();
                gmp2.a(ais.newBuilder().a(gmp1).a(daf.a(gmp1)).a());
                RealTimeChatService.a(M);
                dhi dhi1;
                if (x)
                {
                    gmp1 = aob.b;
                } else
                {
                    gmp1 = aob.c;
                }
                dhi1 = dhi.b();
                L = dhi1.a();
                RealTimeChatService.a(dhi1, (new dce(getApplicationContext())).a(o.h()).a(gmp2.a()).a(gmp1).a(B).b(x).a(K).a());
                return;
            } else
            {
                gbh.a("BabelGatewayActivity.createConversation: Participant id is null and conversation id is null");
                return;
            }
        } else
        {
            c(g.e(o));
            return;
        }
_L2:
        if (C != null)
        {
            gmp1 = (PendingIntent)n.getParcelableExtra("hangout_call_end_intent");
            if (gmp1 != null)
            {
                try
                {
                    gmp1.send();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (gmp gmp1)
                {
                    ebw.d("Babel", "Call complete intent could not be sent", gmp1);
                }
                return;
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        setResult(0);
        finish();
    }

    public void onClick(DialogInterface dialoginterface, int i1)
    {
        setResult(0);
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        if (m)
        {
            b("BabelGatewayActivity.onCreate()");
        }
        n = getIntent();
        if (m)
        {
            String s1 = String.valueOf(n.getType());
            String s2;
            Intent intent;
            if (s1.length() != 0)
            {
                s1 = "intent.getType() = ".concat(s1);
            } else
            {
                s1 = new String("intent.getType() = ");
            }
            b(s1);
        }
        s1 = n.getStringExtra("participant_gaia");
        if (!TextUtils.isEmpty(s1))
        {
            r = s1.split("\\|");
        }
        s1 = n.getStringExtra("participant_name");
        if (!TextUtils.isEmpty(s1))
        {
            s = s1.split("\\|");
        }
        t = n.getStringExtra("conversation_id");
        intent = n;
        s2 = intent.getStringExtra("android.intent.extra.TEXT");
        s1 = s2;
        if (s2 == null)
        {
            s1 = g.a(intent, "android.intent.extra.TEXT");
        }
        u = s1;
        v = n.getAction().equals("android.intent.action.SENDTO");
        w = n.getAction().equals("com.google.android.apps.babel.realtimechat.update-watermark");
        if (n.hasExtra("otr_state"))
        {
            if (n.getBooleanExtra("otr_state", false))
            {
                y = 2;
            } else
            {
                y = 1;
            }
        } else
        {
            y = 0;
        }
        z = n.getLongExtra("watermark", 0L);
        A = n.getBooleanExtra("requires_mms", false);
        B = n.getBooleanExtra("start_video", false);
        x = n.getBooleanExtra("force_group", false);
        C = (Uri)n.getParcelableExtra("hangout_uri");
        D = n.getBooleanExtra("hangout_auto_join", false);
        E = n.getIntExtra("hangout_start_source", 51);
        F = n.getIntExtra("hangout_video_source", 0);
        G = n.getBooleanExtra("hangout_mute_microphone", false);
        H = n.getIntExtra("media_type", 0);
        I = n.getBooleanExtra("hangout_mute_playback", false);
        J = n.getBooleanExtra("hangout_present_all", false);
        K = n.getStringExtra("invite_token_url");
        super.onCreate(bundle);
    }

    public Dialog onCreateDialog(int i1, Bundle bundle)
    {
        String s1;
        if (bundle == null)
        {
            s1 = null;
        } else
        {
            s1 = bundle.getString("error_title");
        }
        if (bundle == null)
        {
            bundle = null;
        } else
        {
            bundle = bundle.getString("error_message");
        }
        android.app.AlertDialog.Builder builder;
        switch (i1)
        {
        default:
            return null;

        case 0: // '\0'
            builder = new android.app.AlertDialog.Builder(this);
            break;
        }
        builder.setTitle(s1);
        builder.setMessage(bundle);
        builder.setNeutralButton(0x104000a, this);
        builder.setOnCancelListener(this);
        return builder.create();
    }

    public void onDestroy()
    {
        RealTimeChatService.b(M);
        super.onDestroy();
    }

    static 
    {
        hik hik = ebw.j;
    }
}
