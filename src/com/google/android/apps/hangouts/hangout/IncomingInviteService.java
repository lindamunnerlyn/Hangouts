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
import aoa;
import bnk;
import bph;
import bpj;
import bpm;
import bqc;
import bqd;
import cgd;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import dcn;
import dif;
import drj;
import eev;
import g;
import gdv;
import gdy;
import hlp;
import java.util.Iterator;
import java.util.List;
import jkp;
import jks;
import kwr;
import kws;

// Referenced classes of package com.google.android.apps.hangouts.hangout:
//            IncomingRing

public final class IncomingInviteService extends dif
{

    private static final boolean a = false;
    private static final Object b = new Object();
    private static android.os.PowerManager.WakeLock c;

    public IncomingInviteService()
    {
    }

    private static bph a(com.google.apps.gcomm.hangout.proto.Hangouts.HangoutStartContext hangoutstartcontext, aoa aoa1)
    {
        aoa1 = (new bpj(aoa1.a(), 1)).a(g.a(hangoutstartcontext.mediaType, 1)).e(hangoutstartcontext.hangoutId);
        if (!TextUtils.isEmpty(hangoutstartcontext.conversationId))
        {
            aoa1.a("conversation");
            aoa1.b(hangoutstartcontext.conversationId);
        }
        if (!TextUtils.isEmpty(hangoutstartcontext.nick))
        {
            aoa1.h(hangoutstartcontext.nick);
        }
        return aoa1.a();
    }

    public static void a(Intent intent)
    {
        f();
        if (a)
        {
            Object obj = String.valueOf(intent);
            String s = String.valueOf(intent.getAction());
            s = (new StringBuilder(String.valueOf(obj).length() + 37 + String.valueOf(s).length())).append("acquiring wakelock for startService ").append(((String) (obj))).append(" ").append(s).toString();
            obj = String.valueOf("[IncomingInviteService] ");
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                obj = ((String) (obj)).concat(s);
            } else
            {
                obj = new String(((String) (obj)));
            }
            eev.b("Babel", ((String) (obj)));
        }
        c.acquire();
        obj = g.nU;
        intent.setClass(((Context) (obj)), com/google/android/apps/hangouts/hangout/IncomingInviteService);
        ((Context) (obj)).startService(intent);
    }

    private static void a(aoa aoa1, com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification hangoutinvitenotification, int i)
    {
        jkp jkp1 = new jkp();
        if (hangoutinvitenotification != null)
        {
            jkp1.a = hangoutinvitenotification.invitationId;
            if (hangoutinvitenotification.context != null)
            {
                jkp1.b = hangoutinvitenotification.context.hangoutId;
            }
        }
        hangoutinvitenotification = new jks();
        hangoutinvitenotification.a = Long.valueOf(System.currentTimeMillis() * 1000L);
        hangoutinvitenotification.c = Integer.valueOf(i);
        jkp1.h = hangoutinvitenotification;
        RealTimeChatService.a(aoa1, jkp1);
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
        eev.f("Babel", s);
    }

    private boolean b(Intent intent)
    {
        Object obj1;
        Object obj2;
        Object obj3;
        com.google.apps.gcomm.hangout.proto.Hangouts.HangoutStartContext hangoutstartcontext;
        c("Hangout Invitation Receiver got invitation GCM");
        obj1 = dcn.a(cgd.a(intent.getStringExtra("focus_account_id")));
        if (intent.getStringExtra("id") == null)
        {
            d("Missing hangoutInviteId");
            a(((aoa) (obj1)), null, 3);
            return true;
        }
        obj2 = c(intent);
        if (obj2 == null)
        {
            a(((aoa) (obj1)), ((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification) (obj2)), 3);
            return true;
        }
        hangoutstartcontext = ((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification) (obj2)).context;
        obj3 = a(hangoutstartcontext, ((aoa) (obj1)));
        if (((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification) (obj2)).command == null)
        {
            d("Ignoring hangoutInviteNotification without any command");
            a(((aoa) (obj1)), ((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification) (obj2)), 3);
            return true;
        }
        if (g.a(((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification) (obj2)).command, 0) != 1) goto _L2; else goto _L1
_L1:
        Object obj;
        int i;
        intent = ((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification) (obj2)).context;
        obj = String.valueOf("Got hangoutInviteNotification DISMISS: reason: ");
        String s1 = String.valueOf(((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification) (obj2)).dismissReason);
        obj3 = String.valueOf(((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutStartContext) (intent)).hangoutId);
        c((new StringBuilder(String.valueOf(obj).length() + 12 + String.valueOf(s1).length() + String.valueOf(obj3).length())).append(((String) (obj))).append(s1).append(" HangoutId: ").append(((String) (obj3))).toString());
        intent = a(intent, ((aoa) (obj1)));
        i = g.a(((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification) (obj2)).dismissReason, 0);
        obj = hlp.c(this, bqd).iterator();
_L6:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        bqd bqd1 = (bqd)((Iterator) (obj)).next();
        if (!bqd1.a(this, ((aoa) (obj1)).h(), intent, i)) goto _L6; else goto _L5
_L5:
        intent = String.valueOf(bqd1);
        c((new StringBuilder(String.valueOf(intent).length() + 38)).append("Hangout ringing cancelled by handler: ").append(intent).toString());
_L7:
        return true;
_L4:
        IncomingRing incomingring = IncomingRing.a();
        if (incomingring != null && incomingring.f().equals(intent))
        {
            c("Cancelling hangout ringing.");
            gdv.a("Expected null", intent.n());
            incomingring.a(i);
        } else
        {
            bpm bpm1 = bnk.a().s();
            if (i == 3 && bpm1 != null && bpm1.e().equals(intent))
            {
                int j = bpm1.I();
                if (bpm1.I() == 0)
                {
                    c("Ending hangout because inviter canceled and hangout is empty.");
                    bpm1.c(1009);
                }
                c((new StringBuilder(91)).append("Ignoring canceled notification because ").append(j).append(" remote end points are already connected.").toString());
            } else
            {
                c("Ignoring dismiss command because no matching ring activity or hangout found.");
            }
        }
        if (true) goto _L7; else goto _L2
_L2:
        String s;
        String s2;
        String s3;
        com.google.apps.gcomm.hangout.proto.Hangouts.HangoutStartContext.Invitation invitation;
        long l;
label0:
        {
            invitation = hangoutstartcontext.invitation;
            if (invitation == null)
            {
                d("Ignoring hangoutStartContext without invitation");
                a(((aoa) (obj1)), ((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification) (obj2)), 3);
                return true;
            }
            s3 = invitation.inviterGaiaId;
            if (TextUtils.isEmpty(s3) || invitation.timestamp == null)
            {
                d("Ignoring hangoutStartContext without invitation data");
                a(((aoa) (obj1)), ((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification) (obj2)), 3);
                return true;
            }
            int k = g.a(invitation.invitationType, 0);
            if (k != 0 && k != 1 && k != 2)
            {
                intent = String.valueOf(invitation.invitationType);
                d((new StringBuilder(String.valueOf(intent).length() + 36)).append("Ignoring unsupported InvitationType ").append(intent).toString());
                a(((aoa) (obj1)), ((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification) (obj2)), 5);
                return true;
            }
            if (((bph) (obj3)).n() == null)
            {
                a(((aoa) (obj1)), ((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification) (obj2)), 3);
                return true;
            }
            k = g.a(hangoutstartcontext.hangoutType, 0);
            if (k != 0 && k != 3 && k != 2)
            {
                d((new StringBuilder(52)).append("Using ding for unsupported hangout type: ").append(k).toString());
                a(((aoa) (obj1)), ((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification) (obj2)), 4);
                return true;
            }
            if (!((aoa) (obj1)).aa())
            {
                a(((aoa) (obj1)), ((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification) (obj2)), 7);
                return true;
            }
            long l1;
            if (!TextUtils.isEmpty(hangoutstartcontext.conversationId))
            {
                s = hangoutstartcontext.conversationId;
            } else
            {
                s = null;
            }
            l = g.a(((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification) (obj2)).invitationId, 0L);
            l1 = g.a(invitation.timestamp, 0L);
            if (g.a(((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification) (obj2)).notificationType, 0) != 0)
            {
                gdy.a(new bqc(this, ((aoa) (obj1)), ((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification) (obj2)), s3, s, l, l1 * 1000L));
                return false;
            }
            Iterator iterator;
            bqd bqd2;
            if (g.a(invitation.isInviterPstnParticipant, false))
            {
                s2 = invitation.inviterPhoneNumber;
            } else
            {
                s2 = null;
            }
            if (!s3.equals("105250506097979753968"))
            {
                break label0;
            }
            iterator = hlp.c(this, bqd).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                bqd2 = (bqd)iterator.next();
            } while (!bqd2.a(this, this, ((aoa) (obj1)), ((bph) (obj3)), s2, l));
            intent = String.valueOf(bqd2);
            d((new StringBuilder(String.valueOf(intent).length() + 39)).append("Incoming PSTN ring handled by handler: ").append(intent).toString());
            return true;
        }
        bnk.a();
        boolean flag;
        if (bnk.c() && bnk.a().s() != null)
        {
            flag = true;
        } else
        if (IncomingRing.a() != null)
        {
            flag = true;
        } else
        if (((TelephonyManager)getSystemService("phone")).getCallState() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            d("Downgrading ring to ding because of ongoing ring/call");
            a(((aoa) (obj1)), ((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification) (obj2)), 1);
            return true;
        }
        if (!((drj)hlp.a(g.nU, drj)).b(((aoa) (obj1)).h()))
        {
            d("Downgrading ring to ding because of user does not want to be notified");
            a(((aoa) (obj1)), ((com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification) (obj2)), 6);
            return true;
        }
        obj1 = String.valueOf("Got ring hangoutInviteNotification: InviterGaiaId: ");
        obj2 = String.valueOf(hangoutstartcontext.hangoutId);
        d((new StringBuilder(String.valueOf(obj1).length() + 12 + String.valueOf(s3).length() + String.valueOf(obj2).length())).append(((String) (obj1))).append(s3).append(" HangoutId: ").append(((String) (obj2))).toString());
        if (g.a(invitation.isInviterPstnParticipant, false))
        {
            obj1 = null;
        } else
        {
            obj1 = invitation.inviterProfileName;
        }
        IncomingRing.a(this, l, ((bph) (obj3)), s3, s, s2, ((String) (obj1)), intent.getStringExtra("inviter_jid"));
        return true;
    }

    private static com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification c(Intent intent)
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
            intent = (com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification)kws.mergeFrom(new com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification(), intent);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            b("Invalid BatchCommand message received");
            return null;
        }
        return intent;
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
        eev.e("Babel", s);
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
        eev.c("Babel", s);
    }

    public static android.os.PowerManager.WakeLock e()
    {
        return c;
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
        eev.d("Babel", s);
    }

    private static boolean f()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        e("initializing wakelock");
        c = ((PowerManager)g.nU.getSystemService("power")).newWakeLock(1, "babel_hoinv");
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int a()
    {
        return 5000;
    }

    protected void d()
    {
        super.d();
        gdv.b("Expected condition to be false", c.isHeld());
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        IncomingRing.b(getPackageName());
        IncomingRing.o();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (f())
        {
            String s = String.valueOf(intent);
            String s1 = String.valueOf(intent.getAction());
            e((new StringBuilder(String.valueOf(s).length() + 38 + String.valueOf(s1).length())).append("acquiring wakelock in  onStartCommand").append(s).append(" ").append(s1).toString());
            c.acquire();
        }
        gdv.a("Expected condition to be true", c.isHeld());
        a(j);
        gdv.b("Expected non-null", intent);
        if (b(intent))
        {
            c.release();
        }
        x_();
        return 2;
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
        hnc hnc = eev.f;
    }
}
