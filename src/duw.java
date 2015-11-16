// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

public final class duw
    implements dtu, dxl
{

    private final Context a;
    private final dux b;
    private final TelecomManager c;
    private final boolean d;
    private duy e;
    private dgw f;
    private boolean g;
    private boolean h;
    private boolean i;

    public duw(Context context, dux dux1, TelecomManager telecommanager, duy duy1, boolean flag)
    {
        a = context.getApplicationContext();
        b = dux1;
        c = telecommanager;
        e = duy1;
        d = flag;
    }

    private void b()
    {
        ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.addNewIncomingCall");
        if (c.getDefaultOutgoingPhoneAccount("tel") != null)
        {
            try
            {
                c.addNewIncomingCall(c.getDefaultOutgoingPhoneAccount("tel"), e.a());
                h = true;
            }
            catch (Exception exception)
            {
                String s = String.valueOf("TeleIncomingWifiCallInvite.addNewIncomingCall, adding call with SIM account failed, trying non-SIM account, exception: ");
                String s1 = String.valueOf(exception);
                ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s1).length())).append(s).append(s1).toString());
            }
        }
        if (!h)
        {
            c.addNewIncomingCall(g.l(a), e.a());
            h = true;
        }
    }

    private boolean b(dtv dtv1)
    {
        alw alw1;
        boolean flag3;
        flag3 = true;
        gbh.a(g.p(a));
        alw1 = g.a(a);
        if (g.r(a)) goto _L2; else goto _L1
_L1:
        boolean flag2;
        ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, not allowed by gservices");
        flag2 = false;
_L4:
        return flag2;
_L2:
        if (!dwz.a(a).c())
        {
            ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, wifi calling not enabled");
            return false;
        }
        if (!g.m(a))
        {
            ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, not connection manager");
            return false;
        }
        boolean flag;
        if (ebz.c() && dtv1 != null && !dtv1.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && TextUtils.isEmpty(e.b) && !alw1.a("babel_blocked_incoming_wifi_calls_allowed", true))
        {
            ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, incoming wifi calls from blocked numbers not allowed");
            return false;
        }
        if (!d)
        {
            break; /* Loop/switch isn't completed */
        }
        ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, falling back to Wi-Fi, only checking for Wi-Fi connection");
        flag2 = flag3;
        if (!g.k(a))
        {
            ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, not connected to wifi");
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!bnd.a().n())
        {
            break; /* Loop/switch isn't completed */
        }
        ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, hangout already exists, answering incoming ring will exit hangout");
        flag2 = flag3;
        if (!g.k(a))
        {
            ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, not connected to wifi");
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
        dws dws1 = dwn.a(a);
        String s = String.valueOf(dws1);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 56)).append("TeleIncomingWifiCallInvite.shouldAllowRing, wifi state: ").append(s).toString());
        flag2 = flag3;
        if (e.e == null)
        {
            flag2 = flag3;
            if (!g.a(a, e.h, dtv1, dws1, null))
            {
                Context context = a;
                dvh dvh1 = e.h;
                boolean flag1;
                if (dws1.a)
                {
                    ebw.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowIncomingLteCall, connected to wifi");
                    flag1 = false;
                } else
                if (dtv1.e != 13)
                {
                    ebw.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowIncomingLteCall, not connected to LTE");
                    flag1 = false;
                } else
                if (!g.j(context))
                {
                    ebw.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowIncomingLteCall, not connected to internet");
                    flag1 = false;
                } else
                {
                    if (dvh1.c() != 2)
                    {
                        ebw.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowEmergencyCallbackOverLte, not on T-Mobile");
                        flag1 = false;
                    } else
                    {
                        long l = dwz.a(context).j();
                        if (l == 0L)
                        {
                            ebw.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowEmergencyCallbackOverLte, user never made an emergency call over LTE");
                            flag1 = false;
                        } else
                        {
                            l = System.currentTimeMillis() - l;
                            long l1 = g.a(context, "babel_lte_fallback_for_emergency_callback_duration_millis", 0x5265c00L);
                            if (l > l1)
                            {
                                dtv1 = String.valueOf("TeleWifiCallThreshold.shouldAllowEmergencyCallbackOverLte, last emergency call over LTE was: ");
                                ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(dtv1).length() + 85)).append(dtv1).append(l).append(" millis ago which is greater than threshold: ").append(l1).toString());
                                flag1 = false;
                            } else
                            {
                                flag1 = true;
                            }
                        }
                    }
                    if (flag1)
                    {
                        ebw.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowIncomingLteCall, allowing possible emergency callback over LTE");
                        flag1 = true;
                    } else
                    if (g.a(context, "babel_lte_incoming_call_allowed", false))
                    {
                        ebw.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowIncomingLteCall, any incoming call over LTE allowed by config");
                        flag1 = true;
                    } else
                    {
                        ebw.e("Babel_telephony", "TeleWifiCallThreshold.shouldAllowIncomingLteCall, returning false");
                        flag1 = false;
                    }
                }
                if (flag1)
                {
                    ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, bad wifi connection, falling back to LTE");
                    e = new duy(e.a, e.b, e.c, e.d, e.e, e.f, true, e.h);
                    return true;
                } else
                {
                    ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, bad wifi connection");
                    return false;
                }
            }
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    private void c()
    {
        ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.cleanupInvite");
        g = false;
        if (!h && !i)
        {
            g.a(a, e.f, e.b, 2337);
        }
        b.a(this);
        if (f != null)
        {
            f.x_();
        }
    }

    public void a(dgw dgw1)
    {
        ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.startProcessing");
        gbh.a(a());
        boolean flag;
        if (dgw1 != null || d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(flag);
        g = true;
        if (dgw1 != null)
        {
            f = dgw1;
            dgw1.h();
        }
        if (!g.p(a))
        {
            ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.startProcessing, no permissions.");
            c();
            return;
        }
        if (d)
        {
            if (b(null))
            {
                ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.startProcessing, falling back to Wi-Fi");
                g.a(a, e);
                b();
            } else
            {
                ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.startProcessing, not falling back to Wi-Fi");
            }
            c();
            return;
        } else
        {
            g.a(a, this);
            return;
        }
    }

    public void a(dtv dtv1)
    {
        gbh.a(g.p(a));
        String s = String.valueOf(dtv1);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 51)).append("TeleIncomingWifiCallInvite.onCellState, cellState: ").append(s).toString());
        if (!g)
        {
            ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.onCellState, invite cancelled");
            return;
        }
        g.a(a, e);
        if (!b(dtv1)) goto _L2; else goto _L1
_L1:
        b();
_L4:
        c();
        return;
_L2:
        if (!d)
        {
            dtv1 = a;
            Object obj = e;
            int j;
            boolean flag;
            if (((TelephonyManager)dtv1.getSystemService("phone")).getPhoneType() == 2)
            {
                j = g.a(dtv1, "babel_fallback_to_wifi_timeout_cdma_millis", 5000);
            } else
            {
                j = g.a(dtv1, "babel_fallback_to_wifi_timeout_gsm_millis", 5000);
            }
            if (j < 0)
            {
                ebw.e("Babel_telephony", "TeleIncomingWifiCallFallback.scheduleAlarm, fallback disabled");
                flag = false;
            } else
            {
                obj = PendingIntent.getBroadcast(dtv1, 0, (new Intent("com.google.android.apps.hangouts.telephony.TeleIncomingWifiCallFallback.ALARM")).putExtra("invite_info", ((duy) (obj)).a()), 0x40000000);
                ebw.e("Babel_telephony", (new StringBuilder(80)).append("TeleIncomingWifiCallFallback.scheduleAlarm, scheduling for (millis): ").append(j).toString());
                dtv1 = (AlarmManager)dtv1.getSystemService("alarm");
                long l = SystemClock.elapsedRealtime();
                dtv1.setExact(2, (long)j + l, ((PendingIntent) (obj)));
                flag = true;
            }
            i = flag;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(boolean flag, boolean flag1)
    {
        byte byte0;
        if (flag)
        {
            if (flag1)
            {
                byte0 = 2;
            } else
            {
                byte0 = 1;
            }
        } else
        {
            byte0 = 3;
        }
        ebw.e("Babel_telephony", (new StringBuilder(79)).append("TeleIncomingWifiCallInvite.onHomeVoiceNetworkResult, roamingStatus: ").append(byte0).toString());
        if (!g)
        {
            ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.onHomeVoiceNetworkResult, invite cancelled");
            return;
        }
        if (byte0 != 3)
        {
            e = new duy(e.a, e.b, e.c, e.d, e.e, e.f, e.g, new dvh(a, byte0));
        }
        dtt.a(a, this);
    }

    boolean a()
    {
        ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.shouldProcess");
        dwz dwz1 = dwz.a(a);
        boolean flag;
        if (e.f == dwz1.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            ebw.e("Babel_telephony", "TeleIncomingWifiCallInvite.shouldProcess, processing invite for Tycho  account");
        } else
        {
            int j = dwz1.b();
            if (e.f != j)
            {
                ebw.e("Babel_telephony", String.format("TeleIncomingWifiCallInvite.shouldProcess, selected account id: %d doesn't match incoming account: %s, id: %d", new Object[] {
                    Integer.valueOf(j), ebw.b(dbf.a(a, e.f)), Integer.valueOf(e.f)
                }));
                return false;
            }
        }
        return true;
    }

    boolean a(boy boy1)
    {
        if (e.a.equals(boy1))
        {
            c();
            return true;
        } else
        {
            return false;
        }
    }
}
