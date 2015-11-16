// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.realtimechat;

import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import aoa;
import boo;
import cgd;
import com.google.android.apps.hangouts.hangout.IncomingInviteService;
import com.google.android.apps.hangouts.serverupdate.ReceiveServerUpdateService;
import cqc;
import dcn;
import dcz;
import dee;
import dlc;
import edc;
import ede;
import eev;
import g;
import jnv;

// Referenced classes of package com.google.android.apps.hangouts.realtimechat:
//            RealTimeChatService

public class GcmIntentService extends dlc
{

    private static final boolean a = false;

    public GcmIntentService()
    {
        super("GcmIntentService");
    }

    public GcmIntentService(String s)
    {
        super(s);
    }

    public static String a(Intent intent)
    {
        return intent.getStringExtra("proto");
    }

    private static void a(String s)
    {
        String s1 = String.valueOf("[GcmIntentService] ");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        eev.c("Babel", s);
    }

    public static boolean a()
    {
        return g.a(g.nU, "babel_gcm_guard_push", true);
    }

    public static void b()
    {
        a("requestGcmRegistrationId");
        (new dee()).execute(new Void[] {
            null, null, null
        });
    }

    private static void b(String s)
    {
        String s1 = String.valueOf("[GcmIntentService] ");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        eev.b("Babel", s);
    }

    public final void a(Intent intent, jnv jnv)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        Object obj;
        long l;
        try
        {
            eev.g("Babel", "GcmIntentService.handleMessage called with null intent");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            if (a())
            {
                cqc.a(getApplicationContext());
            }
            throw intent;
        }
_L3:
        if (edc.b())
        {
            edc.c();
        }
        return;
_L2:
label0:
        {
            if (!intent.getAction().equals("com.google.android.c2dm.intent.RECEIVE"))
            {
                break MISSING_BLOCK_LABEL_11;
            }
            if (a)
            {
                String s = String.valueOf(intent);
                String s1 = String.valueOf("com.google.android.c2dm.intent.RECEIVE");
                b((new StringBuilder(String.valueOf(s).length() + 15 + String.valueOf(s1).length())).append("handleMessage ").append(s).append(" ").append(s1).toString());
            }
            l = 1000L * SystemClock.elapsedRealtime();
            obj = intent.getStringExtra("message_type");
            if (!TextUtils.equals(((CharSequence) (obj)), "send_event"))
            {
                break label0;
            }
            if (a)
            {
                eev.b("Babel", "Dropping send_event from gcm");
            }
        }
        break MISSING_BLOCK_LABEL_11;
label1:
        {
            if (!TextUtils.equals(((CharSequence) (obj)), "deleted_messages"))
            {
                break label1;
            }
            if (edc.b())
            {
                (new ede()).a("gcm_dirty_ping").b();
            }
            eev.c("Babel", "got deleted_messages tickle from GCM");
            RealTimeChatService.a(false);
        }
          goto _L3
        Object obj1;
        boolean flag2;
        obj1 = intent.getStringExtra("type");
        flag2 = TextUtils.equals(((CharSequence) (obj1)), "hangout");
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        if (!((String) (obj1)).startsWith("call/")) goto _L5; else goto _L6
_L6:
        boolean flag = true;
_L48:
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        if (!TextUtils.equals(((CharSequence) (obj1)), "babel:proto")) goto _L9; else goto _L8
_L47:
        boolean flag3 = TextUtils.equals(((CharSequence) (obj1)), "babel:synctickle");
        if (!flag2) goto _L11; else goto _L10
_L10:
        obj = intent.getStringExtra("focus_account_id");
_L16:
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L13; else goto _L12
_L12:
        intent = String.valueOf(obj1);
        if (intent.length() == 0) goto _L15; else goto _L14
_L14:
        intent = "gcm push received for empty recipient in type:".concat(intent);
_L18:
        eev.g("Babel", intent);
        g.a(null, 1837);
        if (edc.b())
        {
            (new ede()).a("gcm_error_missing_participant").b();
        }
          goto _L3
_L49:
        obj = intent.getStringExtra("recipient");
          goto _L16
_L50:
        intent = String.valueOf("gcm push with unknown type = ");
        jnv = String.valueOf(obj1);
        if (jnv.length() == 0)
        {
            break MISSING_BLOCK_LABEL_418;
        }
        intent = intent.concat(jnv);
_L17:
        eev.g("Babel", intent);
        g.a(null, 2139);
        if (edc.b())
        {
            (new ede()).a("gcm_error_unknown").b(((String) (obj1))).b();
        }
          goto _L3
        intent = new String(intent);
          goto _L17
_L15:
        intent = new String("gcm push received for empty recipient in type:");
          goto _L18
_L13:
        cgd cgd1;
        cgd1 = cgd.a(((String) (obj)));
        obj1 = dcn.a(cgd1);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_542;
        }
        intent = String.valueOf(eev.b(((String) (obj))));
        if (intent.length() == 0)
        {
            break MISSING_BLOCK_LABEL_529;
        }
        intent = "gcm push received for invalid account: ".concat(intent);
_L19:
        eev.g("Babel", intent);
        g.a(null, 1838);
        if (edc.b())
        {
            (new ede()).a("gcm_error_unknown_participant").a(cgd1).b();
        }
        RealTimeChatService.b(((String) (obj)));
          goto _L3
        intent = new String("gcm push received for invalid account: ");
          goto _L19
        if (!dcn.f(((aoa) (obj1))))
        {
            break MISSING_BLOCK_LABEL_636;
        }
        if (!eev.a("Babel", 3)) goto _L21; else goto _L20
_L20:
        intent = String.valueOf(((aoa) (obj1)).a());
        if (intent.length() == 0)
        {
            break MISSING_BLOCK_LABEL_623;
        }
        intent = "gcm push received for logged off account: ".concat(intent);
_L22:
        a(((String) (intent)));
_L21:
        if (edc.b())
        {
            (new ede()).a("gcm_error_logged_out_participant").a(((aoa) (obj1))).b();
        }
        dcn.h(((aoa) (obj1)).h());
          goto _L3
        intent = new String("gcm push received for logged off account: ");
          goto _L22
        if (!a) goto _L24; else goto _L23
_L23:
        if (!flag2) goto _L26; else goto _L25
_L25:
        obj = String.valueOf(((aoa) (obj1)).a());
        if (((String) (obj)).length() == 0) goto _L28; else goto _L27
_L27:
        obj = "gcm hangout push received for account: ".concat(((String) (obj)));
_L33:
        b(((String) (obj)));
_L24:
        if (!edc.b()) goto _L30; else goto _L29
_L29:
        obj = new ede();
        if (!flag2) goto _L32; else goto _L31
_L31:
        ((ede) (obj)).a("gcm_video_ring");
_L41:
        ((ede) (obj)).a(((aoa) (obj1))).b();
_L30:
        boolean flag1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_930;
        }
        long l1;
        obj = intent.getStringExtra("proto");
        l1 = intent.getLongExtra("timestamp", 0L);
        if (!dcz.y(((aoa) (obj1)).h()))
        {
            break MISSING_BLOCK_LABEL_910;
        }
        b("ReceiveServerUpdateService will handle all server updates.");
        ReceiveServerUpdateService.a(((String) (obj)), ((aoa) (obj1)).h(), l1, l, jnv);
          goto _L3
_L28:
        obj = new String("gcm hangout push received for account: ");
          goto _L33
_L26:
        if (!flag1) goto _L35; else goto _L34
_L34:
        obj = String.valueOf(((aoa) (obj1)).a());
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_814;
        }
        obj = "gcm heavy tickle push received for account: ".concat(((String) (obj)));
_L36:
        b(((String) (obj)));
          goto _L24
        obj = new String("gcm heavy tickle push received for account: ");
          goto _L36
_L35:
        if (!flag3) goto _L24; else goto _L37
_L37:
        obj = String.valueOf(((aoa) (obj1)).a());
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_864;
        }
        obj = "gcm sync tickle push received for account: ".concat(((String) (obj)));
_L38:
        b(((String) (obj)));
          goto _L24
        obj = new String("gcm sync tickle push received for account: ");
          goto _L38
_L32:
        if (!flag1) goto _L40; else goto _L39
_L39:
        ((ede) (obj)).a("gcm_heavy");
          goto _L41
_L40:
        if (!flag3) goto _L41; else goto _L42
_L42:
        ((ede) (obj)).a("gcm_sync");
          goto _L41
        b("RTCS will handle all server updates.");
        RealTimeChatService.a(((String) (obj)), ((aoa) (obj1)), l1, l, jnv);
          goto _L3
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_950;
        }
        RealTimeChatService.a(((aoa) (obj1)).h(), true, false, 1, false);
          goto _L3
        if (!flag2) goto _L44; else goto _L43
_L43:
        if (!dcn.f(((aoa) (obj1))))
        {
            break MISSING_BLOCK_LABEL_1013;
        }
        intent = String.valueOf(eev.b(((aoa) (obj1)).a()));
        if (intent.length() == 0)
        {
            break MISSING_BLOCK_LABEL_999;
        }
        intent = "Hangout notification for account that is not setup yet: ".concat(intent);
_L45:
        eev.f("Babel", intent);
          goto _L3
        intent = new String("Hangout notification for account that is not setup yet: ");
          goto _L45
        IncomingInviteService.a(intent);
          goto _L3
_L44:
        if (!flag) goto _L3; else goto _L46
_L46:
        boo.a().a(intent);
          goto _L3
_L8:
        flag1 = true;
          goto _L47
_L5:
        flag = false;
          goto _L48
_L9:
        flag1 = false;
          goto _L47
_L11:
        if (!flag && !flag1 && !flag3) goto _L50; else goto _L49
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
