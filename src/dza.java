// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import android.telecom.RemoteConference;
import android.telecom.RemoteConnection;
import android.telecom.StatusHints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class dza extends android.telecom.RemoteConnection.Callback
{

    final dyz a;

    dza(dyz dyz1)
    {
        a = dyz1;
        super();
    }

    public void onAddressChanged(RemoteConnection remoteconnection, Uri uri, int i)
    {
        Object obj = null;
        String s;
        if (uri == null)
        {
            remoteconnection = null;
        } else
        if (uri.getScheme().equals("tel"))
        {
            remoteconnection = String.valueOf("tel:");
            String s1 = String.valueOf(g.u(uri.getSchemeSpecificPart()));
            if (s1.length() != 0)
            {
                remoteconnection = remoteconnection.concat(s1);
            } else
            {
                remoteconnection = new String(remoteconnection);
            }
        } else
        {
            remoteconnection = eev.b(uri.toString());
        }
        remoteconnection = String.valueOf(remoteconnection);
        s = String.valueOf(a.d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(remoteconnection).length() + 35 + String.valueOf(s).length())).append("TeleRemoteCall.onAddressChanged, ").append(remoteconnection).append(", ").append(s).toString());
        if (uri == null && i == 0 && a.d != null && (a.d.getState() == 1 || a.d.getState() == 0))
        {
            eev.e("Babel_telephony", "TeleRemoteCall.onAddressChanged, ignoring null address");
            return;
        }
        if (a.d != null && !a.o() && !a.d.f().a(uri))
        {
            if (a.d.f().q())
            {
                dxh dxh1 = a.d;
                if (uri == null)
                {
                    remoteconnection = obj;
                } else
                {
                    remoteconnection = uri.getSchemeSpecificPart();
                    if (uri.getScheme().equals("tel") && eey.c(remoteconnection))
                    {
                        remoteconnection = g.t(eey.a(remoteconnection, eey.j()));
                    } else
                    {
                        remoteconnection = uri;
                    }
                }
                dxh1.setAddress(remoteconnection, i);
            } else
            if (a.d.f().o())
            {
                remoteconnection = String.valueOf(g.u(a.d.f().c()));
                if (remoteconnection.length() != 0)
                {
                    remoteconnection = "TeleRemoteCall.onAddressChanged, showing un-remapped number: ".concat(remoteconnection);
                } else
                {
                    remoteconnection = new String("TeleRemoteCall.onAddressChanged, showing un-remapped number: ");
                }
                eev.e("Babel_telephony", remoteconnection);
                a.d.setAddress(g.t(a.d.f().c()), i);
            } else
            {
                a.d.setAddress(uri, i);
            }
        }
        a.c.a(uri);
    }

    public void onCallerDisplayNameChanged(RemoteConnection remoteconnection, String s, int i)
    {
        remoteconnection = String.valueOf(a.d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(remoteconnection).length() + 43)).append("TeleRemoteCall.onCallerDisplayNameChanged, ").append(remoteconnection).toString());
        if (a.d != null)
        {
            a.d.setCallerDisplayName(s, i);
        }
    }

    public void onConferenceChanged(RemoteConnection remoteconnection, RemoteConference remoteconference)
    {
        remoteconnection = String.valueOf(remoteconnection);
        remoteconference = String.valueOf(remoteconference);
        String s = String.valueOf(a.d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(remoteconnection).length() + 71 + String.valueOf(remoteconference).length() + String.valueOf(s).length())).append("TeleRemoteCall.onConferenceChanged, remote connection: ").append(remoteconnection).append(", conference: ").append(remoteconference).append(", ").append(s).toString());
    }

    public void onConferenceableConnectionsChanged(RemoteConnection remoteconnection, List list)
    {
        remoteconnection = String.valueOf(a.d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(remoteconnection).length() + 51)).append("TeleRemoteCall.onConferenceableConnectionsChanged, ").append(remoteconnection).toString());
        if (a.d != null)
        {
            remoteconnection = new ArrayList();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                dxh dxh1 = dyz.a((RemoteConnection)list.next(), a.d.d());
                if (dxh1 != null)
                {
                    remoteconnection.add(dxh1);
                }
            } while (true);
            a.d.setConferenceableConnections(remoteconnection);
        }
    }

    public void onConnectionCapabilitiesChanged(RemoteConnection remoteconnection, int i)
    {
        remoteconnection = String.valueOf(a.d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(remoteconnection).length() + 75)).append("TeleRemoteCall.onConnectionCapabilitiesChanged, capabilities: ").append(i).append(", ").append(remoteconnection).toString());
        if (a.d != null)
        {
            a.d.setConnectionCapabilities(i);
        }
    }

    public void onDestroyed(RemoteConnection remoteconnection)
    {
        String s = String.valueOf(a.d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 28)).append("TeleRemoteCall.onDestroyed, ").append(s).toString());
        if (remoteconnection != null)
        {
            remoteconnection.unregisterCallback(a.e);
        }
        for (remoteconnection = a.b.iterator(); remoteconnection.hasNext(); ((dxa)remoteconnection.next()).a(a, new DisconnectCause(2))) { }
        if (a.d != null && a.d.k() == null)
        {
            a.d.destroy();
            a.d = null;
        }
    }

    public void onDisconnected(RemoteConnection remoteconnection, DisconnectCause disconnectcause)
    {
        remoteconnection = String.valueOf(disconnectcause);
        String s = String.valueOf(a.d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(remoteconnection).length() + 40 + String.valueOf(s).length())).append("TeleRemoteCall.onDisconnected, cause: ").append(remoteconnection).append(", ").append(s).toString());
        if (a.d != null)
        {
            a.d.a(a.d(), a.c.b());
        }
        if (a.d != null && a.d.k() == null)
        {
            if (disconnectcause.getCode() == 1 && a.o())
            {
                remoteconnection = String.valueOf("TeleRemoteCall.onDisconnected, handing off to wifi., ");
                String s1 = String.valueOf(a.d);
                eev.e("Babel_telephony", (new StringBuilder(String.valueOf(remoteconnection).length() + 0 + String.valueOf(s1).length())).append(remoteconnection).append(s1).toString());
                a.c.a(3);
                dxv.b(a.a, a.d, 3);
            } else
            {
                a.d.setDisconnected(disconnectcause);
                g.a(a.d, disconnectcause);
            }
        }
        for (remoteconnection = a.b.iterator(); remoteconnection.hasNext(); ((dxa)remoteconnection.next()).a(a, disconnectcause)) { }
    }

    public void onPostDialWait(RemoteConnection remoteconnection, String s)
    {
        remoteconnection = String.valueOf(eev.b(s));
        String s1 = String.valueOf(a.d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(remoteconnection).length() + 50 + String.valueOf(s1).length())).append("TeleRemoteCall.onPostDialWait, remainingDigits: ").append(remoteconnection).append(", ").append(s1).toString());
        if (a.d != null)
        {
            a.d.setPostDialWait(s);
        }
    }

    public void onRingbackRequested(RemoteConnection remoteconnection, boolean flag)
    {
        remoteconnection = String.valueOf(a.d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(remoteconnection).length() + 53)).append("TeleRemoteCall.onRingbackRequested, ringback: ").append(flag).append(", ").append(remoteconnection).toString());
        if (a.d != null)
        {
            a.d.setRingbackRequested(flag);
        }
    }

    public void onStateChanged(RemoteConnection remoteconnection, int i)
    {
        if (a.d == null) goto _L2; else goto _L1
_L1:
        remoteconnection = String.valueOf(Connection.stateToString(a.d.getState()));
        String s = String.valueOf(Connection.stateToString(i));
        String s1 = String.valueOf(a.d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(remoteconnection).length() + 37 + String.valueOf(s).length() + String.valueOf(s1).length())).append("TeleRemoteCall.onStateChanged, ").append(remoteconnection).append(" -> ").append(s).append(", ").append(s1).toString());
        i;
        JVM INSTR tableswitch 1 5: default 156
    //                   1 156
    //                   2 200
    //                   3 213
    //                   4 226
    //                   5 239;
           goto _L2 _L2 _L3 _L4 _L5 _L6
_L2:
        for (remoteconnection = a.b.iterator(); remoteconnection.hasNext(); ((dxa)remoteconnection.next()).a(a, i)) { }
        break; /* Loop/switch isn't completed */
_L3:
        a.d.setRinging();
        continue; /* Loop/switch isn't completed */
_L4:
        a.d.setDialing();
        continue; /* Loop/switch isn't completed */
_L5:
        a.d.setActive();
        continue; /* Loop/switch isn't completed */
_L6:
        a.d.setOnHold();
        if (true) goto _L2; else goto _L7
_L7:
    }

    public void onStatusHintsChanged(RemoteConnection remoteconnection, StatusHints statushints)
    {
        remoteconnection = String.valueOf(a.d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(remoteconnection).length() + 37)).append("TeleRemoteCall.onStatusHintsChanged, ").append(remoteconnection).toString());
        if (a.d != null)
        {
            a.d.setStatusHints(statushints);
        }
    }

    public void onVoipAudioChanged(RemoteConnection remoteconnection, boolean flag)
    {
        remoteconnection = String.valueOf(a.d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(remoteconnection).length() + 50)).append("TeleRemoteCall.onVoipAudioChanged, isVoip: ").append(flag).append(", ").append(remoteconnection).toString());
        if (a.d != null)
        {
            a.d.setAudioModeIsVoip(flag);
        }
    }
}
