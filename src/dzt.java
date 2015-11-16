// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.telecom.DisconnectCause;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;

final class dzt extends boq
{

    final dzr a;

    dzt(dzr dzr1)
    {
        a = dzr1;
        super();
    }

    public void a(bpm bpm1)
    {
        Object obj;
        dzr dzr1;
        String s;
        int i;
        int j;
        if (bpm1 != null)
        {
            j = bpm1.Q();
        } else
        {
            j = 1;
        }
        bpm1 = String.valueOf(g.h(j));
        obj = String.valueOf(a.c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(bpm1).length() + 41 + String.valueOf(obj).length())).append("TeleWifiCall.onHangoutEnded, endCause: ").append(bpm1).append(", ").append(((String) (obj))).toString());
        bpm1 = a;
        if (!g.a(((dzr) (bpm1)).a, "babel_wifi_call_fallback_to_cellular_allowed", true))
        {
            bpm1 = String.valueOf(((dzr) (bpm1)).c);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(bpm1).length() + 73)).append("TeleWifiCall.shouldFallbackToCellular, fallback to cellular not allowed, ").append(bpm1).toString());
            i = 0;
        } else
        if (!g.a(((dzr) (bpm1)).a, "babel_remote_connection_allowed", true))
        {
            bpm1 = String.valueOf(((dzr) (bpm1)).c);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(bpm1).length() + 70)).append("TeleWifiCall.shouldFallbackToCellular, remote connection not allowed, ").append(bpm1).toString());
            i = 0;
        } else
        if (((dzr) (bpm1)).c == null)
        {
            bpm1 = String.valueOf(((dzr) (bpm1)).c);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(bpm1).length() + 59)).append("TeleWifiCall.shouldFallbackToCellular, connection is null, ").append(bpm1).toString());
            i = 0;
        } else
        if (((dzr) (bpm1)).c.getState() != 3)
        {
            i = ((dzr) (bpm1)).c.getState();
            bpm1 = String.valueOf(((dzr) (bpm1)).c);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(bpm1).length() + 62)).append("TeleWifiCall.shouldFallbackToCellular, state is: ").append(i).append(", ").append(bpm1).toString());
            i = 0;
        } else
        if (((dzr) (bpm1)).c.o() != null)
        {
            bpm1 = String.valueOf(((dzr) (bpm1)).c);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(bpm1).length() + 67)).append("TeleWifiCall.shouldFallbackToCellular, already has a hangout room, ").append(bpm1).toString());
            i = 0;
        } else
        if (((dzr) (bpm1)).d == null)
        {
            bpm1 = String.valueOf(((dzr) (bpm1)).c);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(bpm1).length() + 62)).append("TeleWifiCall.shouldFallbackToCellular, hangout state is null, ").append(bpm1).toString());
            i = 0;
        } else
        if (j == 1004)
        {
            bpm1 = String.valueOf(((dzr) (bpm1)).c);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(bpm1).length() + 57)).append("TeleWifiCall.shouldFallbackToCellular, local user ended, ").append(bpm1).toString());
            i = 0;
        } else
        if (((dzr) (bpm1)).e != 0)
        {
            i = ((dzr) (bpm1)).e;
            bpm1 = String.valueOf(((dzr) (bpm1)).c);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(bpm1).length() + 69)).append("TeleWifiCall.shouldFallbackToCellular, PSTN error code: ").append(i).append(", ").append(bpm1).toString());
            i = 0;
        } else
        if (!((dzr) (bpm1)).d.D())
        {
            bpm1 = String.valueOf(((dzr) (bpm1)).c);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(bpm1).length() + 69)).append("TeleWifiCall.shouldFallbackToCellular, not waiting for remote party, ").append(bpm1).toString());
            i = 0;
        } else
        {
            bpm1 = String.valueOf(((dzr) (bpm1)).c);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(bpm1).length() + 55)).append("TeleWifiCall.shouldFallbackToCellular, returning true, ").append(bpm1).toString());
            i = 1;
        }
        if (i != 0)
        {
            bpm1 = a;
            obj = String.valueOf(((dzr) (bpm1)).c);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(obj).length() + 40)).append("TeleWifiCall.attemptFallbackToCellular, ").append(((String) (obj))).toString());
            obj = ((dzr) (bpm1)).c;
            Object obj1 = ((dxh) (obj)).d();
            ((dxh) (obj)).f().a(1);
            obj1 = ((TeleConnectionService) (obj1)).createRemoteOutgoingConnection(g.l(((Context) (obj1))), ((dxh) (obj)).e());
            if (obj1 == null)
            {
                bpm1 = String.valueOf(((dzr) (bpm1)).c);
                eev.e("Babel_telephony", (new StringBuilder(String.valueOf(bpm1).length() + 76)).append("TeleWifiCall.attemptFallbackToCellular, unable to create remote connection, ").append(bpm1).toString());
                ((dxh) (obj)).f().a(2);
                i = 0;
            } else
            {
                ((dxh) (obj)).b(new dyz(((dzr) (bpm1)).a, ((android.telecom.RemoteConnection) (obj1)), null, null, ((dzr) (bpm1)).c.i(), ((dxh) (obj)).g()));
                ((dxh) (obj)).w();
                i = 1;
            }
            if (i != 0)
            {
                dzr.a(a, null);
                return;
            }
        }
        if (a.e != 8 && (j != 1011 || a.e == 0)) goto _L2; else goto _L1
_L1:
        obj = a;
        dzr1 = a;
        i = a.e;
        s = String.valueOf(g.h(j));
        i;
        JVM INSTR tableswitch 1 16: default 1016
    //                   1 1155
    //                   2 1161
    //                   3 1167
    //                   4 1173
    //                   5 1179
    //                   6 1185
    //                   7 1191
    //                   8 1197
    //                   9 1203
    //                   10 1209
    //                   11 1215
    //                   12 1221
    //                   13 1227
    //                   14 1233
    //                   15 1239
    //                   16 1245;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L3:
        bpm1 = (new StringBuilder(39)).append("PstnStateErrorType.UNKNOWN: ").append(i).toString();
_L26:
        bpm1 = String.valueOf(bpm1);
        s = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(bpm1).length())).append(s).append(" ").append(bpm1).toString();
        bpm1 = dzr1.a;
        i;
        JVM INSTR tableswitch 7 10: default 1124
    //                   7 1262
    //                   8 1251
    //                   9 1124
    //                   10 1273;
           goto _L20 _L21 _L22 _L20 _L23
_L20:
        bpm1 = null;
_L24:
        if (i == 8)
        {
            bpm1 = new DisconnectCause(7, bpm1, null, s, 17);
        } else
        {
            bpm1 = new DisconnectCause(1, bpm1, null, s, 21);
        }
        dzr.a(((dzr) (obj)), bpm1);
        return;
_L4:
        bpm1 = "PstnStateErrorType.ERROR_MEDIA_TIMEOUT";
        continue; /* Loop/switch isn't completed */
_L5:
        bpm1 = "PstnStateErrorType.ERROR_MEDIA_IO_EXCEPTION";
        continue; /* Loop/switch isn't completed */
_L6:
        bpm1 = "PstnStateErrorType.ERROR_UNEXPECTED_CLOSE_ENDPOINT";
        continue; /* Loop/switch isn't completed */
_L7:
        bpm1 = "PstnStateErrorType.ERROR_JINGLE_TERMINATE";
        continue; /* Loop/switch isn't completed */
_L8:
        bpm1 = "PstnStateErrorType.ERROR_DEBUG_COMMAND";
        continue; /* Loop/switch isn't completed */
_L9:
        bpm1 = "PstnStateErrorType.ERROR_SERVER_SHUTDOWN";
        continue; /* Loop/switch isn't completed */
_L10:
        bpm1 = "PstnStateErrorType.ERROR_INSUFFICIENT_FUNDS";
        continue; /* Loop/switch isn't completed */
_L11:
        bpm1 = "PstnStateErrorType.ERROR_BUSY";
        continue; /* Loop/switch isn't completed */
_L12:
        bpm1 = "PstnStateErrorType.ERROR_TPAPI";
        continue; /* Loop/switch isn't completed */
_L13:
        bpm1 = "PstnStateErrorType.ERROR_CONNECTION_FAILED";
        continue; /* Loop/switch isn't completed */
_L14:
        bpm1 = "PstnStateErrorType.ERROR_CANNOT_CALL_YOURSELF";
        continue; /* Loop/switch isn't completed */
_L15:
        bpm1 = "PstnStateErrorType.ERROR_USER_ALREADY_IN_CALL ";
        continue; /* Loop/switch isn't completed */
_L16:
        bpm1 = "PstnStateErrorType.ERROR_FAILOVER_FAILED ";
        continue; /* Loop/switch isn't completed */
_L17:
        bpm1 = "PstnStateErrorType.ERROR_INCOMING_CALL_ANSWERED_ELSEWHERE";
        continue; /* Loop/switch isn't completed */
_L18:
        bpm1 = "PstnStateErrorType.ERROR_INCOMING_CALL_WENT_TO_VOICEMAIL";
        continue; /* Loop/switch isn't completed */
_L19:
        bpm1 = "PstnStateErrorType.ERROR_CONNECTION_TIMEOUT";
        continue; /* Loop/switch isn't completed */
_L22:
        bpm1 = bpm1.getString(g.pN);
          goto _L24
_L21:
        bpm1 = bpm1.getString(g.pP);
          goto _L24
_L23:
        bpm1 = bpm1.getString(g.pO);
          goto _L24
_L2:
        dzr.a(a, a.c(j));
        return;
        if (true) goto _L26; else goto _L25
_L25:
    }

    public void a(geu geu1)
    {
        geu1 = String.valueOf("TeleWifiCall.onMediaStarted, ");
        String s = String.valueOf(a.c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(geu1).length() + 0 + String.valueOf(s).length())).append(geu1).append(s).toString());
        if (!a.f && a.c != null && a.c.getState() == 3)
        {
            a.c.setActive();
        }
    }

    public void a(gkq gkq)
    {
        gkq = String.valueOf(a.c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(gkq).length() + 53)).append("TeleWifiCall.onFirstEndpointWithEarlyMediaConnected, ").append(gkq).toString());
        if (a.c != null)
        {
            a.c.setRingbackRequested(false);
            a.c.w();
        }
    }

    public void a(gku gku1)
    {
        if (a.c != null)
        {
            String s = gku1.x();
            gku1 = gku1.a();
            String s1 = String.valueOf(g.u(s));
            String s2 = String.valueOf(a.c);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 63 + String.valueOf(gku1).length() + String.valueOf(s2).length())).append("TeleWifiCall.onMucConnected, handoffNumber: ").append(s1).append(", participantId: ").append(gku1).append(", ").append(s2).toString());
            a.c.a(s);
            a.c.e(gku1);
            a.c.c(a.d.e().g());
            a.c.d(a.d.q().g());
        }
    }

    public void a(boolean flag)
    {
        String s = String.valueOf(a.c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 58)).append("TeleWifiCall.onOutgoingInviteEnded, terminateCall: ").append(flag).append(", ").append(s).toString());
        if (!flag && a.c != null && a.c.getState() == 3)
        {
            a.c.setActive();
            a.c.w();
        }
    }

    public void b()
    {
        String s = String.valueOf(a.c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 40)).append("TeleWifiCall.onOutgoingRingtoneStopped, ").append(s).toString());
        if (a.c != null)
        {
            a.c.setRingbackRequested(false);
            a.c.w();
        }
    }

    public boolean c(int i)
    {
        String s = String.valueOf(a.c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 68)).append("TeleWifiCall.maybeDisplayPstnEndpointExitError, error: ").append(i).append(", ").append(s).toString());
        a.e = i;
        return true;
    }

    public void h()
    {
        String s = String.valueOf(a.c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 40)).append("TeleWifiCall.onOutgoingRingtoneStarted, ").append(s).toString());
        if (a.c != null)
        {
            a.c.setRingbackRequested(true);
            a.c.w();
        }
    }
}
