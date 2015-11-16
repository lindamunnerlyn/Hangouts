// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import aid;
import aie;
import ail;
import aim;
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
import anw;
import aoa;
import aot;
import aoz;
import bhv;
import bkm;
import bph;
import cki;
import ckj;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import dbl;
import dcn;
import ddm;
import dhy;
import dir;
import dml;
import dod;
import dog;
import eev;
import g;
import gcz;
import gda;
import gdd;
import gdv;
import gqv;
import gqw;
import gqz;
import grn;
import hlp;
import l;

public class BabelGatewayActivity extends bkm
    implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnClickListener, dog, gqw
{

    private static final boolean n = false;
    private long A;
    private boolean B;
    private boolean C;
    private Uri D;
    private boolean E;
    private int F;
    private int G;
    private boolean H;
    private int I;
    private boolean J;
    private boolean K;
    private String L;
    private int M;
    private final dhy N = new cki(this);
    private Intent o;
    private aoa p;
    private String s[];
    private String t[];
    private String u;
    private String v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    public BabelGatewayActivity()
    {
        (new grn(this, r)).a(q).a(this);
        s = new String[0];
        t = new String[0];
    }

    public static int a(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.M;
    }

    public static Intent a(int i1, String s1)
    {
        Intent intent = new Intent(g.nU, com/google/android/apps/hangouts/phone/BabelGatewayActivity);
        intent.setAction("com.google.android.apps.babel.realtimechat.update-watermark");
        intent.putExtra("account_id", i1);
        intent.putExtra("conversation_id", s1);
        return intent;
    }

    public static Intent a(int i1, String s1, String s2)
    {
        Intent intent = new Intent(g.nU, com/google/android/apps/hangouts/phone/BabelGatewayActivity);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("account_id", i1);
        intent.putExtra("conversation_id", s1);
        intent.putExtra("android.intent.extra.TEXT", s2);
        return intent;
    }

    public static Intent a(int i1, String s1, String s2, Uri uri, PendingIntent pendingintent, int j1, int k1)
    {
        Intent intent = new Intent(g.nU, com/google/android/apps/hangouts/phone/BabelGatewayActivity);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("account_id", i1);
        if (s1 != null)
        {
            intent.putExtra("participant_gaia", s1);
            intent.putExtra("participant_name", s2);
            intent.putExtra("start_video", true);
        } else
        {
            gdv.b("Expected non-null", uri);
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
        Intent intent = new Intent(g.nU, com/google/android/apps/hangouts/phone/BabelGatewayActivity);
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
        babelgatewayactivity.u = s1;
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
        babelgatewayactivity.t = as;
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
        eev.b("Babel", s1);
    }

    public static boolean b(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.C;
    }

    public static aoa c(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.p;
    }

    private void c(Intent intent)
    {
        startActivity(intent);
        setResult(-1);
        finish();
    }

    public static int d(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.I;
    }

    public static Intent d(int i1)
    {
        Intent intent = new Intent(g.nU, com/google/android/apps/hangouts/phone/BabelGatewayActivity);
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
        return babelgatewayactivity.E;
    }

    public static int f(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.F;
    }

    private void f(int i1)
    {
        if (w)
        {
            boolean flag;
            if (!TextUtils.isEmpty(v))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gdv.a("Expected condition to be true", flag);
            if (A > 0L)
            {
                RealTimeChatService.b(p, u, A);
            }
            if (n)
            {
                String s1 = String.valueOf(u);
                if (s1.length() != 0)
                {
                    s1 = "Auto-sending message to conversation ".concat(s1);
                } else
                {
                    s1 = new String("Auto-sending message to conversation ");
                }
                b(s1);
            }
            ((dml)q.a(dml)).a(p, u, v, null, 0, null, 0, 0, null, null, B, null, z);
            setResult(-1);
            finish();
            return;
        }
        if (x)
        {
            RealTimeChatService.b(p, u, A);
            setResult(-1);
            finish();
            return;
        }
        Intent intent = g.a(p.h(), u, i1);
        if (!TextUtils.isEmpty(v))
        {
            Intent intent1 = new Intent();
            intent1.putExtra("android.intent.extra.TEXT", v);
            intent1.putExtra("conversation_id", u);
            intent.putExtra("share_intent", intent1);
        }
        c(intent);
    }

    public static int g(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.G;
    }

    public static boolean h(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.H;
    }

    public static boolean i(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.J;
    }

    public static boolean j()
    {
        return n;
    }

    public static boolean j(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.K;
    }

    public static String[] k(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.s;
    }

    public static String[] l(BabelGatewayActivity babelgatewayactivity)
    {
        return babelgatewayactivity.t;
    }

    private void m()
    {
        if (s.length != t.length)
        {
            gdv.a("BabelGatewayActivity.createConversationWithParticipants: different number of participant gaia ids and names");
            return;
        }
        aie aie1 = aid.newBuilder();
        for (int i1 = 0; i1 < s.length; i1++)
        {
            aie1.a(ail.newBuilder().a(t[i1]).a(dbl.a(s[i1], t[i1])).a());
        }

        RealTimeChatService.a(N);
        dir dir1 = dir.b();
        M = dir1.a();
        RealTimeChatService.a(dir1, (new ddm(getApplicationContext())).a(p.h()).a(aie1.a()).a(aot.c).a(C).b(y).a(L).a());
    }

    public static void m(BabelGatewayActivity babelgatewayactivity)
    {
        babelgatewayactivity.m();
    }

    public void a(aoz aoz1)
    {
        u = aoz1.s;
        f(aoz1.b);
    }

    public void a(boolean flag, gqv gqv1, gqv gqv2, int i1, int j1)
    {
        if (gqv2 != gqv.c) goto _L2; else goto _L1
_L1:
        p = dcn.e(j1);
        gdv.b("Expected non-null", p);
        i1 = o.getIntExtra("opened_from_impression", 0);
        if (i1 != 0)
        {
            ((gdd)q.a(gdd)).a(p.h()).a(i1).d();
        }
        if (!w && !x)
        {
            ((gqz)q.a(gqz)).a("active-hangouts-account", p.h());
        }
        if (D == null) goto _L4; else goto _L3
_L3:
        gqv2 = D;
        gqv1 = (PendingIntent)o.getParcelableExtra("hangout_call_end_intent");
        gqv2 = bph.a(gqv2, p.a(), gqv1);
        if (gqv2 != null) goto _L6; else goto _L5
_L5:
        eev.g("Babel", "invalid hangout request");
        if (gqv1 != null)
        {
            try
            {
                gqv1.send();
            }
            // Misplaced declaration of an exception variable
            catch (gqv gqv1)
            {
                eev.d("Babel", "callCompletionIntent failed", gqv1);
            }
        }
        e(l.cR);
_L8:
        return;
_L6:
        startActivity(g.a(gqv2, null, E, F, SystemClock.elapsedRealtime(), G, H, J, K));
        setResult(-1);
        finish();
        return;
_L4:
        if (!TextUtils.isEmpty(u) || s.length > 0 || t.length > 0)
        {
            if (n)
            {
                b("getConversation");
            }
            gdv.b("Expected non-null", p);
            if (!TextUtils.isEmpty(u))
            {
                dod.a(p).a(new anw(u, this));
                return;
            }
            if (s.length > 0)
            {
                if (t.length > 0)
                {
                    m();
                    return;
                } else
                {
                    eev.f("Babel", "BabelGatewayActivity.createConversation: incoming intent has no participant name");
                    (new ckj(this)).g();
                    return;
                }
            }
            if (t.length > 0 && bhv.b(t[0]) != null)
            {
                gqv1 = bhv.b(t[0]);
                gqv2 = aid.newBuilder();
                gqv2.a(ail.newBuilder().a(gqv1).a(dbl.a(gqv1)).a());
                RealTimeChatService.a(N);
                dir dir1;
                if (y)
                {
                    gqv1 = aot.b;
                } else
                {
                    gqv1 = aot.c;
                }
                dir1 = dir.b();
                M = dir1.a();
                RealTimeChatService.a(dir1, (new ddm(getApplicationContext())).a(p.h()).a(gqv2.a()).a(gqv1).a(C).b(y).a(L).a());
                return;
            } else
            {
                gdv.a("BabelGatewayActivity.createConversation: Participant id is null and conversation id is null");
                return;
            }
        } else
        {
            c(g.d(p));
            return;
        }
_L2:
        if (D != null)
        {
            gqv1 = (PendingIntent)o.getParcelableExtra("hangout_call_end_intent");
            if (gqv1 != null)
            {
                try
                {
                    gqv1.send();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (gqv gqv1)
                {
                    eev.d("Babel", "Call complete intent could not be sent", gqv1);
                }
                return;
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void b()
    {
        e(l.bX);
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
        if (n)
        {
            b("BabelGatewayActivity.onCreate()");
        }
        o = getIntent();
        if (n)
        {
            String s1 = String.valueOf(o.getType());
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
        s1 = o.getStringExtra("participant_gaia");
        if (!TextUtils.isEmpty(s1))
        {
            s = s1.split("\\|");
        }
        s1 = o.getStringExtra("participant_name");
        if (!TextUtils.isEmpty(s1))
        {
            t = s1.split("\\|");
        }
        u = o.getStringExtra("conversation_id");
        intent = o;
        s2 = intent.getStringExtra("android.intent.extra.TEXT");
        s1 = s2;
        if (s2 == null)
        {
            s1 = g.a(intent, "android.intent.extra.TEXT");
        }
        v = s1;
        w = o.getAction().equals("android.intent.action.SENDTO");
        x = o.getAction().equals("com.google.android.apps.babel.realtimechat.update-watermark");
        if (o.hasExtra("otr_state"))
        {
            if (o.getBooleanExtra("otr_state", false))
            {
                z = 2;
            } else
            {
                z = 1;
            }
        } else
        {
            z = 0;
        }
        A = o.getLongExtra("watermark", 0L);
        B = o.getBooleanExtra("requires_mms", false);
        C = o.getBooleanExtra("start_video", false);
        y = o.getBooleanExtra("force_group", false);
        D = (Uri)o.getParcelableExtra("hangout_uri");
        E = o.getBooleanExtra("hangout_auto_join", false);
        F = o.getIntExtra("hangout_start_source", 51);
        G = o.getIntExtra("hangout_video_source", 0);
        H = o.getBooleanExtra("hangout_mute_microphone", false);
        I = o.getIntExtra("media_type", 0);
        J = o.getBooleanExtra("hangout_mute_playback", false);
        K = o.getBooleanExtra("hangout_present_all", false);
        L = o.getStringExtra("invite_token_url");
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
        RealTimeChatService.b(N);
        super.onDestroy();
    }

    static 
    {
        hnc hnc = eev.j;
    }
}
