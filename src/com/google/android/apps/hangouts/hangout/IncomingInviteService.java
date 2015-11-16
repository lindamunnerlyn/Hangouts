// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import ani;
import bnd;
import boy;
import bpa;
import bpd;
import bpt;
import bpu;
import cey;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import dbf;
import dgw;
import doq;
import ebw;
import g;
import gbh;
import gbk;
import hgx;
import java.util.Iterator;
import java.util.List;
import jed;
import jeg;
import koo;
import kop;

// Referenced classes of package com.google.android.apps.hangouts.hangout:
//            IncomingRing

public final class IncomingInviteService extends dgw
{

    private static final boolean a = false;
    private static final Object b = new Object();
    private static android.os.PowerManager.WakeLock c;

    public IncomingInviteService()
    {
    }

    private static boy a(com.google.apps.gcomm.hangout.proto.Hangouts.HangoutStartContext hangoutstartcontext, ani ani1)
    {
        ani1 = (new bpa(ani1.a(), 1)).a(g.a(hangoutstartcontext.mediaType, 1)).e(hangoutstartcontext.hangoutId);
        if (!TextUtils.isEmpty(hangoutstartcontext.conversationId))
        {
            ani1.a("conversation");
            ani1.b(hangoutstartcontext.conversationId);
        }
        if (!TextUtils.isEmpty(hangoutstartcontext.nick))
        {
            ani1.h(hangoutstartcontext.nick);
        }
        return ani1.a();
    }

    public static void a(Intent intent)
    {
        Context context = g.nS;
        synchronized (b)
        {
            if (c == null)
            {
                if (a)
                {
                    e("initializing wakelock");
                }
                c = ((PowerManager)context.getSystemService("power")).newWakeLock(1, "babel_hoinv");
            }
        }
        if (a)
        {
            obj = String.valueOf(intent);
            String s = String.valueOf(intent.getAction());
            e((new StringBuilder(String.valueOf(obj).length() + 37 + String.valueOf(s).length())).append("acquiring wakelock for startService ").append(((String) (obj))).append(" ").append(s).toString());
        }
        c.acquire();
        intent.setClass(context, com/google/android/apps/hangouts/hangout/IncomingInviteService);
        context.startService(intent);
        return;
        intent;
        obj;
        JVM INSTR monitorexit ;
        throw intent;
    }

    private static void a(ani ani1, com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification hangoutinvitenotification, int i)
    {
        jed jed1 = new jed();
        if (hangoutinvitenotification != null)
        {
            jed1.a = hangoutinvitenotification.invitationId;
            if (hangoutinvitenotification.context != null)
            {
                jed1.b = hangoutinvitenotification.context.hangoutId;
            }
        }
        hangoutinvitenotification = new jeg();
        hangoutinvitenotification.a = Long.valueOf(System.currentTimeMillis() * 1000L);
        hangoutinvitenotification.c = Integer.valueOf(i);
        jed1.h = hangoutinvitenotification;
        RealTimeChatService.a(ani1, jed1);
    }

    private static com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification b(Intent intent)
    {
        String s = intent.getStringExtra("notification");
        if (s == null)
        {
            intent = String.valueOf(intent);
            b((new StringBuilder(String.valueOf(intent).length() + 35)).append("Missing HangoutInviteNotification: ").append(intent).toString());
            return null;
        }
        intent = Base64.decode(s, 0);
        try
        {
            intent = (com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification)kop.mergeFrom(new com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification(), intent);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            b("Invalid BatchCommand message received");
            return null;
        }
        return intent;
    }

    private static void b(String s)
    {
        String s1 = String.valueOf("[IncomingInviteService] ");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        ebw.f("Babel", s);
    }

    private static void c(String s)
    {
        String s1 = String.valueOf("[IncomingInviteService] ");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        ebw.e("Babel", s);
    }

    private static void d(String s)
    {
        String s1 = String.valueOf("[IncomingInviteService] ");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        ebw.c("Babel", s);
    }

    private static void e(String s)
    {
        String s1 = String.valueOf("[IncomingInviteService] ");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        ebw.b("Babel", s);
    }

    protected int a()
    {
        return 5000;
    }

    protected void d()
    {
        super.d();
        gbh.b(c.isHeld());
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        IncomingRing.b(getPackageName());
        IncomingRing.n();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        gbh.a(c.isHeld());
        a(j);
        gbh.b(intent);
        if (intent == null) goto _L2; else goto _L1
_L1:
        Object obj3;
        c("Hangout Invitation Receiver got invitation GCM");
        obj3 = dbf.a(cey.a(intent.getStringExtra("focus_account_id")));
        if (intent.getStringExtra("id") != null) goto _L4; else goto _L3
_L3:
        d("Missing hangoutInviteId");
        a(((ani) (obj3)), null, 3);
_L2:
        c.release();
        x_();
        return 2;
_L4:
        com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification hangoutinvitenotification = b(intent);
        if (hangoutinvitenotification != null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        a(((ani) (obj3)), hangoutinvitenotification, 3);
          goto _L2
        intent;
        c.release();
        x_();
        throw intent;
        Object obj4;
        com.google.apps.gcomm.hangout.proto.Hangouts.HangoutStartContext hangoutstartcontext;
label0:
        {
            hangoutstartcontext = hangoutinvitenotification.context;
            obj4 = a(hangoutstartcontext, ((ani) (obj3)));
            if (hangoutinvitenotification.command != null)
            {
                break label0;
            }
            d("Ignoring hangoutInviteNotification without any command");
            a(((ani) (obj3)), hangoutinvitenotification, 3);
        }
          goto _L2
label1:
        {
            if (g.a(hangoutinvitenotification.command, 0) != 1)
            {
                break MISSING_BLOCK_LABEL_522;
            }
            intent = hangoutinvitenotification.context;
            Object obj = String.valueOf("Got hangoutInviteNotification DISMISS: reason: ");
            Object obj2 = String.valueOf(hangoutinvitenotification.dismissReason);
            obj4 = String.valueOf(((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutStartContext) (intent)).hangoutId);
            c((new StringBuilder(String.valueOf(obj).length() + 12 + String.valueOf(obj2).length() + String.valueOf(obj4).length())).append(((String) (obj))).append(((String) (obj2))).append(" HangoutId: ").append(((String) (obj4))).toString());
            intent = a(intent, ((ani) (obj3)));
            i = g.a(hangoutinvitenotification.dismissReason, 0);
            obj = hgx.c(this, bpu).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label1;
                }
                obj2 = (bpu)((Iterator) (obj)).next();
            } while (!((bpu) (obj2)).a(this, ((ani) (obj3)).h(), intent, i));
            intent = String.valueOf(obj2);
            c((new StringBuilder(String.valueOf(intent).length() + 38)).append("Hangout ringing cancelled by handler: ").append(intent).toString());
        }
          goto _L2
        Object obj1 = IncomingRing.a();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_421;
        }
        if (!((IncomingRing) (obj1)).e().equals(intent))
        {
            break MISSING_BLOCK_LABEL_421;
        }
        c("Cancelling hangout ringing.");
        gbh.a(intent.n());
        ((IncomingRing) (obj1)).a(i);
          goto _L2
        obj1 = bnd.a().t();
        if (i != 3 || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_513;
        }
        if (!((bpd) (obj1)).e().equals(intent))
        {
            break MISSING_BLOCK_LABEL_513;
        }
        i = ((bpd) (obj1)).J();
        if (((bpd) (obj1)).J() == 0)
        {
            c("Ending hangout because inviter canceled and hangout is empty.");
            ((bpd) (obj1)).c(1009);
        }
        c((new StringBuilder(91)).append("Ignoring canceled notification because ").append(i).append(" remote end points are already connected.").toString());
          goto _L2
        c("Ignoring dismiss command because no matching ring activity or hangout found.");
          goto _L2
        com.google.apps.gcomm.hangout.proto.Hangouts.HangoutStartContext.Invitation invitation = hangoutstartcontext.invitation;
        if (invitation != null)
        {
            break MISSING_BLOCK_LABEL_551;
        }
        d("Ignoring hangoutStartContext without invitation");
        a(((ani) (obj3)), hangoutinvitenotification, 3);
          goto _L2
        String s2;
label2:
        {
            s2 = invitation.inviterGaiaId;
            if (!TextUtils.isEmpty(s2) && invitation.timestamp != null)
            {
                break label2;
            }
            d("Ignoring hangoutStartContext without invitation data");
            a(((ani) (obj3)), hangoutinvitenotification, 3);
        }
          goto _L2
        i = g.a(invitation.invitationType, 0);
        if (i == 0 || i == 1 || i == 2)
        {
            break MISSING_BLOCK_LABEL_668;
        }
        intent = String.valueOf(invitation.invitationType);
        d((new StringBuilder(String.valueOf(intent).length() + 36)).append("Ignoring unsupported InvitationType ").append(intent).toString());
        a(((ani) (obj3)), hangoutinvitenotification, 5);
          goto _L2
label3:
        {
            if (((boy) (obj4)).n() != null)
            {
                break label3;
            }
            a(((ani) (obj3)), hangoutinvitenotification, 3);
        }
          goto _L2
        i = g.a(hangoutstartcontext.hangoutType, 0);
        if (i == 0 || i == 3 || i == 2)
        {
            break MISSING_BLOCK_LABEL_747;
        }
        d((new StringBuilder(52)).append("Using ding for unsupported hangout type: ").append(i).toString());
        a(((ani) (obj3)), hangoutinvitenotification, 4);
          goto _L2
label4:
        {
            if (((ani) (obj3)).ad())
            {
                break label4;
            }
            a(((ani) (obj3)), hangoutinvitenotification, 7);
        }
          goto _L2
        if (TextUtils.isEmpty(hangoutstartcontext.conversationId)) goto _L6; else goto _L5
_L5:
        obj1 = hangoutstartcontext.conversationId;
_L18:
        long l;
        long l1;
        l = g.a(hangoutinvitenotification.invitationId, 0L);
        l1 = g.a(invitation.timestamp, 0L);
        if (g.a(hangoutinvitenotification.notificationType, 0) == 0) goto _L8; else goto _L7
_L7:
        gbk.a(new bpt(this, ((ani) (obj3)), hangoutinvitenotification, s2, ((String) (obj1)), l, l1 * 1000L));
          goto _L2
_L8:
        String s;
        if (!g.a(invitation.isInviterPstnParticipant, false))
        {
            break MISSING_BLOCK_LABEL_1230;
        }
        s = invitation.inviterPhoneNumber;
_L19:
        if (!s2.equals("105250506097979753968")) goto _L10; else goto _L9
_L9:
        Iterator iterator = hgx.c(this, bpu).iterator();
_L13:
        if (!iterator.hasNext()) goto _L10; else goto _L11
_L11:
        bpu bpu1 = (bpu)iterator.next();
        if (!bpu1.a(this, this, ((ani) (obj3)), ((boy) (obj4)), s, l)) goto _L13; else goto _L12
_L12:
        intent = String.valueOf(bpu1);
        d((new StringBuilder(String.valueOf(intent).length() + 39)).append("Incoming PSTN ring handled by handler: ").append(intent).toString());
          goto _L2
_L10:
        bnd.a();
        if (!bnd.c() || bnd.a().t() == null) goto _L15; else goto _L14
_L14:
        i = 1;
_L16:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_1051;
        }
        d("Downgrading ring to ding because of ongoing ring/call");
        a(((ani) (obj3)), hangoutinvitenotification, 1);
          goto _L2
_L15:
        if (IncomingRing.a() == null)
        {
            break MISSING_BLOCK_LABEL_1030;
        }
        i = 1;
          goto _L16
        if (((TelephonyManager)getSystemService("phone")).getCallState() != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L16
label5:
        {
            if (((doq)hgx.a(g.nS, doq)).b(((ani) (obj3)).h()))
            {
                break label5;
            }
            d("Downgrading ring to ding because of user does not want to be notified");
            a(((ani) (obj3)), hangoutinvitenotification, 6);
        }
          goto _L2
        obj3 = String.valueOf("Got ring hangoutInviteNotification: InviterGaiaId: ");
        String s1 = String.valueOf(hangoutstartcontext.hangoutId);
        d((new StringBuilder(String.valueOf(obj3).length() + 12 + String.valueOf(s2).length() + String.valueOf(s1).length())).append(((String) (obj3))).append(s2).append(" HangoutId: ").append(s1).toString());
        if (!g.a(invitation.isInviterPstnParticipant, false))
        {
            break MISSING_BLOCK_LABEL_1214;
        }
        obj3 = null;
_L17:
        IncomingRing.a(this, l, ((boy) (obj4)), s2, ((String) (obj1)), s, ((String) (obj3)), intent.getStringExtra("inviter_jid"));
          goto _L2
        obj3 = invitation.inviterProfileName;
          goto _L17
_L6:
        obj1 = null;
          goto _L18
        s = null;
          goto _L19
    }

    public boolean w_()
    {
        if (super.w_())
        {
            c.acquire();
            return true;
        } else
        {
            return false;
        }
    }

    public void x_()
    {
        super.x_();
        c.release();
    }

    static 
    {
        hik hik = ebw.f;
    }
}
