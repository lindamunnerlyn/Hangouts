// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.telecom.DisconnectCause;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;

final class dwj extends boh
{

    final dwh a;

    dwj(dwh dwh1)
    {
        a = dwh1;
        super();
    }

    public void a(bpd bpd1)
    {
        Object obj;
        dwh dwh1;
        String s;
        int i;
        int j;
        if (bpd1 != null)
        {
            j = bpd1.R();
        } else
        {
            j = 1;
        }
        bpd1 = g.h(j);
        obj = String.valueOf(a.c);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(bpd1).length() + 41 + String.valueOf(obj).length())).append("TeleWifiCall.onHangoutEnded, endCause: ").append(bpd1).append(", ").append(((String) (obj))).toString());
        bpd1 = a;
        if (!g.a(((dwh) (bpd1)).a, "babel_wifi_call_fallback_to_cellular_allowed", true))
        {
            bpd1 = String.valueOf(((dwh) (bpd1)).c);
            ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(bpd1).length() + 73)).append("TeleWifiCall.shouldFallbackToCellular, fallback to cellular not allowed, ").append(bpd1).toString());
            i = 0;
        } else
        if (!g.a(((dwh) (bpd1)).a, "babel_remote_connection_allowed", true))
        {
            bpd1 = String.valueOf(((dwh) (bpd1)).c);
            ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(bpd1).length() + 70)).append("TeleWifiCall.shouldFallbackToCellular, remote connection not allowed, ").append(bpd1).toString());
            i = 0;
        } else
        if (((dwh) (bpd1)).c == null)
        {
            bpd1 = String.valueOf(((dwh) (bpd1)).c);
            ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(bpd1).length() + 59)).append("TeleWifiCall.shouldFallbackToCellular, connection is null, ").append(bpd1).toString());
            i = 0;
        } else
        if (((dwh) (bpd1)).c.getState() != 3)
        {
            i = ((dwh) (bpd1)).c.getState();
            bpd1 = String.valueOf(((dwh) (bpd1)).c);
            ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(bpd1).length() + 62)).append("TeleWifiCall.shouldFallbackToCellular, state is: ").append(i).append(", ").append(bpd1).toString());
            i = 0;
        } else
        if (((dwh) (bpd1)).c.o() != null)
        {
            bpd1 = String.valueOf(((dwh) (bpd1)).c);
            ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(bpd1).length() + 67)).append("TeleWifiCall.shouldFallbackToCellular, already has a hangout room, ").append(bpd1).toString());
            i = 0;
        } else
        if (((dwh) (bpd1)).d == null)
        {
            bpd1 = String.valueOf(((dwh) (bpd1)).c);
            ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(bpd1).length() + 62)).append("TeleWifiCall.shouldFallbackToCellular, hangout state is null, ").append(bpd1).toString());
            i = 0;
        } else
        if (j == 1004)
        {
            bpd1 = String.valueOf(((dwh) (bpd1)).c);
            ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(bpd1).length() + 57)).append("TeleWifiCall.shouldFallbackToCellular, local user ended, ").append(bpd1).toString());
            i = 0;
        } else
        if (((dwh) (bpd1)).e != 0)
        {
            i = ((dwh) (bpd1)).e;
            bpd1 = String.valueOf(((dwh) (bpd1)).c);
            ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(bpd1).length() + 69)).append("TeleWifiCall.shouldFallbackToCellular, PSTN error code: ").append(i).append(", ").append(bpd1).toString());
            i = 0;
        } else
        if (!((dwh) (bpd1)).d.E())
        {
            bpd1 = String.valueOf(((dwh) (bpd1)).c);
            ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(bpd1).length() + 69)).append("TeleWifiCall.shouldFallbackToCellular, not waiting for remote party, ").append(bpd1).toString());
            i = 0;
        } else
        {
            bpd1 = String.valueOf(((dwh) (bpd1)).c);
            ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(bpd1).length() + 55)).append("TeleWifiCall.shouldFallbackToCellular, returning true, ").append(bpd1).toString());
            i = 1;
        }
        if (i != 0)
        {
            bpd1 = a;
            obj = String.valueOf(((dwh) (bpd1)).c);
            ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(obj).length() + 40)).append("TeleWifiCall.attemptFallbackToCellular, ").append(((String) (obj))).toString());
            obj = ((dwh) (bpd1)).c;
            Object obj1 = ((dtz) (obj)).d();
            ((dtz) (obj)).f().a(1);
            obj1 = ((TeleConnectionService) (obj1)).createRemoteOutgoingConnection(g.l(((Context) (obj1))), ((dtz) (obj)).e());
            if (obj1 == null)
            {
                bpd1 = String.valueOf(((dwh) (bpd1)).c);
                ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(bpd1).length() + 76)).append("TeleWifiCall.attemptFallbackToCellular, unable to create remote connection, ").append(bpd1).toString());
                ((dtz) (obj)).f().a(2);
                i = 0;
            } else
            {
                ((dtz) (obj)).b(new dvq(((dwh) (bpd1)).a, ((android.telecom.RemoteConnection) (obj1)), null, null, ((dwh) (bpd1)).c.i(), ((dtz) (obj)).g()));
                ((dtz) (obj)).w();
                i = 1;
            }
            if (i != 0)
            {
                dwh.a(a, null);
                return;
            }
        }
        if (a.e != 8 && (j != 1011 || a.e == 0)) goto _L2; else goto _L1
_L1:
        obj = a;
        dwh1 = a;
        i = a.e;
        s = g.h(j);
        i;
        JVM INSTR tableswitch 1 16: default 1012
    //                   1 1147
    //                   2 1153
    //                   3 1159
    //                   4 1165
    //                   5 1171
    //                   6 1177
    //                   7 1183
    //                   8 1189
    //                   9 1195
    //                   10 1201
    //                   11 1207
    //                   12 1213
    //                   13 1219
    //                   14 1225
    //                   15 1231
    //                   16 1237;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L3:
        bpd1 = (new StringBuilder(39)).append("PstnStateErrorType.UNKNOWN: ").append(i).toString();
_L26:
        s = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(bpd1).length())).append(s).append(" ").append(bpd1).toString();
        bpd1 = dwh1.a;
        i;
        JVM INSTR tableswitch 7 10: default 1116
    //                   7 1254
    //                   8 1243
    //                   9 1116
    //                   10 1265;
           goto _L20 _L21 _L22 _L20 _L23
_L20:
        bpd1 = null;
_L24:
        if (i == 8)
        {
            bpd1 = new DisconnectCause(7, bpd1, null, s, 17);
        } else
        {
            bpd1 = new DisconnectCause(1, bpd1, null, s, 21);
        }
        dwh.a(((dwh) (obj)), bpd1);
        return;
_L4:
        bpd1 = "PstnStateErrorType.ERROR_MEDIA_TIMEOUT";
        continue; /* Loop/switch isn't completed */
_L5:
        bpd1 = "PstnStateErrorType.ERROR_MEDIA_IO_EXCEPTION";
        continue; /* Loop/switch isn't completed */
_L6:
        bpd1 = "PstnStateErrorType.ERROR_UNEXPECTED_CLOSE_ENDPOINT";
        continue; /* Loop/switch isn't completed */
_L7:
        bpd1 = "PstnStateErrorType.ERROR_JINGLE_TERMINATE";
        continue; /* Loop/switch isn't completed */
_L8:
        bpd1 = "PstnStateErrorType.ERROR_DEBUG_COMMAND";
        continue; /* Loop/switch isn't completed */
_L9:
        bpd1 = "PstnStateErrorType.ERROR_SERVER_SHUTDOWN";
        continue; /* Loop/switch isn't completed */
_L10:
        bpd1 = "PstnStateErrorType.ERROR_INSUFFICIENT_FUNDS";
        continue; /* Loop/switch isn't completed */
_L11:
        bpd1 = "PstnStateErrorType.ERROR_BUSY";
        continue; /* Loop/switch isn't completed */
_L12:
        bpd1 = "PstnStateErrorType.ERROR_TPAPI";
        continue; /* Loop/switch isn't completed */
_L13:
        bpd1 = "PstnStateErrorType.ERROR_CONNECTION_FAILED";
        continue; /* Loop/switch isn't completed */
_L14:
        bpd1 = "PstnStateErrorType.ERROR_CANNOT_CALL_YOURSELF";
        continue; /* Loop/switch isn't completed */
_L15:
        bpd1 = "PstnStateErrorType.ERROR_USER_ALREADY_IN_CALL ";
        continue; /* Loop/switch isn't completed */
_L16:
        bpd1 = "PstnStateErrorType.ERROR_FAILOVER_FAILED ";
        continue; /* Loop/switch isn't completed */
_L17:
        bpd1 = "PstnStateErrorType.ERROR_INCOMING_CALL_ANSWERED_ELSEWHERE";
        continue; /* Loop/switch isn't completed */
_L18:
        bpd1 = "PstnStateErrorType.ERROR_INCOMING_CALL_WENT_TO_VOICEMAIL";
        continue; /* Loop/switch isn't completed */
_L19:
        bpd1 = "PstnStateErrorType.ERROR_CONNECTION_TIMEOUT";
        continue; /* Loop/switch isn't completed */
_L22:
        bpd1 = bpd1.getString(g.pL);
          goto _L24
_L21:
        bpd1 = bpd1.getString(g.pN);
          goto _L24
_L23:
        bpd1 = bpd1.getString(g.pM);
          goto _L24
_L2:
        dwh.a(a, a.c(j));
        return;
        if (true) goto _L26; else goto _L25
_L25:
    }

    public void a(gcg gcg1)
    {
        gcg1 = String.valueOf("TeleWifiCall.onMediaStarted, ");
        String s = String.valueOf(a.c);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(gcg1).length() + 0 + String.valueOf(s).length())).append(gcg1).append(s).toString());
        if (!a.f && a.c != null && a.c.getState() == 3)
        {
            a.c.setActive();
        }
    }

    public void a(gho gho)
    {
        gho = String.valueOf(a.c);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(gho).length() + 53)).append("TeleWifiCall.onFirstEndpointWithEarlyMediaConnected, ").append(gho).toString());
        if (a.c != null)
        {
            a.c.setRingbackRequested(false);
            a.c.w();
        }
    }

    public void a(ghs ghs1)
    {
        if (a.c != null)
        {
            String s = ghs1.y();
            ghs1 = g.y(ghs1.a());
            String s1 = g.u(s);
            String s2 = String.valueOf(a.c);
            ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 63 + String.valueOf(ghs1).length() + String.valueOf(s2).length())).append("TeleWifiCall.onMucConnected, handoffNumber: ").append(s1).append(", participantId: ").append(ghs1).append(", ").append(s2).toString());
            a.c.a(s);
            a.c.e(ghs1);
            a.c.c(a.d.e().g());
            a.c.d(a.d.r().g());
        }
    }

    public void a(boolean flag)
    {
        String s = String.valueOf(a.c);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 58)).append("TeleWifiCall.onOutgoingInviteEnded, terminateCall: ").append(flag).append(", ").append(s).toString());
        if (!flag && a.c != null && a.c.getState() == 3)
        {
            a.c.setActive();
            a.c.w();
        }
    }

    public void b()
    {
        String s = String.valueOf(a.c);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 40)).append("TeleWifiCall.onOutgoingRingtoneStopped, ").append(s).toString());
        if (a.c != null)
        {
            a.c.setRingbackRequested(false);
            a.c.w();
        }
    }

    public boolean c(int i)
    {
        String s = String.valueOf(a.c);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 68)).append("TeleWifiCall.maybeDisplayPstnEndpointExitError, error: ").append(i).append(", ").append(s).toString());
        a.e = i;
        return true;
    }

    public void h()
    {
        String s = String.valueOf(a.c);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 40)).append("TeleWifiCall.onOutgoingRingtoneStarted, ").append(s).toString());
        if (a.c != null)
        {
            a.c.setRingbackRequested(true);
            a.c.w();
        }
    }
}
