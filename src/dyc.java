// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.telecom.ConnectionRequest;
import android.telecom.DisconnectCause;
import android.telecom.RemoteConnection;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.concurrent.TimeUnit;

public final class dyc
{

    private final Context a;
    private final dxm b;
    private final dxh c;

    public dyc(Context context, TeleConnectionService teleconnectionservice, ConnectionRequest connectionrequest, dxm dxm1)
    {
        a = context;
        b = dxm1;
        c = new dxh(new dyt(teleconnectionservice, connectionrequest, new dyq(teleconnectionservice, dzg.a(teleconnectionservice)), true));
        c.b();
    }

    private void b()
    {
        Object obj = c.d();
        obj = ((TeleConnectionService) (obj)).createRemoteIncomingConnection(g.l(((Context) (obj))), c.e());
        if (obj != null)
        {
            eev.e("Babel_telephony", "TeleIncomingCellCallRequest.rejectCanceledCellularCall, rejecting call");
            ((RemoteConnection) (obj)).reject();
        }
    }

    public dxh a()
    {
        int j;
        j = 0;
        eev.e("Babel_telephony", "TeleIncomingCellCallRequest.startRequest");
        if (b == null || !b.a(c.e(), false)) goto _L2; else goto _L1
_L1:
        int i;
        eev.e("Babel_telephony", "TeleIncomingCellCallRequest.startRequest, call is duplicate");
        b();
        c.setDisconnected(new DisconnectCause(4, null));
        i = 2446;
_L10:
        j = eaj.a(a).b();
        g.a(a, j, c.f().c(), i);
        return c;
_L2:
        String s;
        String s1;
        s = g.a(a, "babel_spam_caller_id", "+14082560700");
        s1 = c.f().d();
        if (c.h().e() != 1) goto _L4; else goto _L3
_L3:
        if (g.d(s1, s)) goto _L6; else goto _L5
_L5:
        eev.e("Babel_telephony", String.format("TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, not blocking. Incoming caller ID: %s, didn't exactly match blocked caller ID: %s", new Object[] {
            g.u(s1), s
        }));
        i = j;
_L8:
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        eev.e("Babel_telephony", "TeleIncomingCellCallRequest.startRequest, call is spam to dark number");
        b();
        c.setDisconnected(new DisconnectCause(4, null));
        i = 2338;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!g.e(s1, s))
        {
            eev.e("Babel_telephony", String.format("TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, not blocking. Incoming caller ID: %s, didn't fuzzy match blocked caller ID: %s", new Object[] {
                g.u(s1), s
            }));
            i = j;
            continue; /* Loop/switch isn't completed */
        }
_L6:
        long l = eaj.a(a).f();
        if (l > 0L)
        {
            i = (int)((System.currentTimeMillis() - l) / TimeUnit.DAYS.toMillis(1L));
        } else
        {
            i = -1;
        }
        if (i == -1)
        {
            eev.e("Babel_telephony", "TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, blocking. Caller ID matches and user never made an emergency call");
            i = 1;
        } else
        {
            int k = g.a(a, "days_to_unblock_spam", 30);
            if (i > k)
            {
                eev.e("Babel_telephony", String.format("TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, blocking. Caller ID matches and user made an emergency call %d days ago which is greater than the threshold: %d", new Object[] {
                    Integer.valueOf(i), Integer.valueOf(k)
                }));
                i = 1;
            } else
            {
                eev.e("Babel_telephony", String.format("TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, not blocking even though caller ID matches. Use made an emergency call %d days ago which is less than the threshold: %d", new Object[] {
                    Integer.valueOf(i), Integer.valueOf(k)
                }));
                i = j;
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (g.a(a, "babel_remote_connection_allowed", true))
        {
            break; /* Loop/switch isn't completed */
        }
        eev.e("Babel_telephony", "TeleIncomingCellCallRequest.createRemoteConnection, remote connection disallowed by gservices");
        c.setDisconnected(new DisconnectCause(10));
_L11:
        g.a(a, c);
        i = 2338;
        if (true) goto _L10; else goto _L9
_L9:
        Object obj = c.d();
        obj = ((TeleConnectionService) (obj)).createRemoteIncomingConnection(g.l(((Context) (obj))), c.e());
        if (obj == null)
        {
            eev.e("Babel_telephony", "TeleIncomingCellCallRequest.createRemoteConnection, remoteConnection is null");
            c.setDisconnected(new DisconnectCause(10));
        } else
        {
            eev.e("Babel_telephony", "TeleIncomingCellCallRequest.createRemoteConnection");
            obj = new dyz(a, ((RemoteConnection) (obj)), null, null, c.i(), true);
            c.a(((dwz) (obj)));
        }
          goto _L11
        if (true) goto _L10; else goto _L12
_L12:
    }
}
