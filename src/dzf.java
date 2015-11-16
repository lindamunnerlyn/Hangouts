// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.telecom.Connection;
import android.telecom.DisconnectCause;
import android.telecom.RemoteConference;
import android.telecom.RemoteConnection;

final class dzf extends android.telecom.RemoteConference.Callback
{

    final dze a;

    dzf(dze dze1)
    {
        a = dze1;
        super();
    }

    public void onConnectionAdded(RemoteConference remoteconference, RemoteConnection remoteconnection)
    {
        remoteconference = String.valueOf(remoteconference);
        String s = String.valueOf(remoteconnection);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(remoteconference).length() + 73 + String.valueOf(s).length())).append("TeleRemoteConferenceWrapper.onConnectionAdded, conference: ").append(remoteconference).append(", connection: ").append(s).toString());
        remoteconference = dyz.a(remoteconnection, a.b);
        if (remoteconference == null)
        {
            remoteconference = String.valueOf("TeleRemoteConferenceWrapper.onConnectionAdded cannot find remote  connection: ");
            remoteconnection = String.valueOf(remoteconnection);
            eev.f("Babel_telephony", (new StringBuilder(String.valueOf(remoteconference).length() + 0 + String.valueOf(remoteconnection).length())).append(remoteconference).append(remoteconnection).toString());
            return;
        } else
        {
            a.addConnection(remoteconference);
            return;
        }
    }

    public void onConnectionCapabilitiesChanged(RemoteConference remoteconference, int i)
    {
        String s = String.valueOf("TeleRemoteConferenceWrapper.onConnectionCapabilitiesChanged, conference: ");
        remoteconference = String.valueOf(remoteconference);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 27 + String.valueOf(remoteconference).length())).append(s).append(remoteconference).append(", capabilities: ").append(i).toString());
        a.setConnectionCapabilities(i);
    }

    public void onConnectionRemoved(RemoteConference remoteconference, RemoteConnection remoteconnection)
    {
        remoteconference = String.valueOf(remoteconference);
        String s = String.valueOf(remoteconnection);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(remoteconference).length() + 75 + String.valueOf(s).length())).append("TeleRemoteConferenceWrapper.onConnectionRemoved, conference: ").append(remoteconference).append(", connection: ").append(s).toString());
        remoteconference = dyz.a(remoteconnection, a.b);
        if (remoteconference == null)
        {
            remoteconference = String.valueOf("TeleRemoteConferenceWrapper.onConnectionRemoved cannot find remote  connection: ");
            remoteconnection = String.valueOf(remoteconnection);
            eev.f("Babel_telephony", (new StringBuilder(String.valueOf(remoteconference).length() + 0 + String.valueOf(remoteconnection).length())).append(remoteconference).append(remoteconnection).toString());
            return;
        } else
        {
            a.removeConnection(remoteconference);
            return;
        }
    }

    public void onDestroyed(RemoteConference remoteconference)
    {
        remoteconference = String.valueOf(remoteconference);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(remoteconference).length() + 53)).append("TeleRemoteConferenceWrapper.onDestroyed, conference: ").append(remoteconference).toString());
        a.a.unregisterCallback(a.c);
        a.destroy();
    }

    public void onDisconnected(RemoteConference remoteconference, DisconnectCause disconnectcause)
    {
        remoteconference = String.valueOf(remoteconference);
        String s = String.valueOf(disconnectcause);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(remoteconference).length() + 65 + String.valueOf(s).length())).append("TeleRemoteConferenceWrapper.onDisconnected, conference: ").append(remoteconference).append(", cause: ").append(s).toString());
        a.setDisconnected(disconnectcause);
    }

    public void onStateChanged(RemoteConference remoteconference, int i, int j)
    {
        remoteconference = String.valueOf(remoteconference);
        String s = String.valueOf(Connection.stateToString(i));
        String s1 = String.valueOf(Connection.stateToString(j));
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(remoteconference).length() + 62 + String.valueOf(s).length() + String.valueOf(s1).length())).append("TeleRemoteConferenceWrapper.onStateChanged, conference: ").append(remoteconference).append(", ").append(s).append(" -> ").append(s1).toString());
        a.a(j);
    }
}
