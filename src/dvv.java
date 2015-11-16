// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.telecom.AudioState;
import android.telecom.Conference;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.PhoneAccountHandle;
import android.telecom.RemoteConference;
import android.telecom.RemoteConnection;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.Iterator;
import java.util.List;

public final class dvv extends Conference
{

    private final RemoteConference a;
    private final TeleConnectionService b;
    private final android.telecom.RemoteConference.Callback c = new dvw(this);

    private dvv(PhoneAccountHandle phoneaccounthandle, RemoteConference remoteconference, TeleConnectionService teleconnectionservice)
    {
        super(phoneaccounthandle);
        a = remoteconference;
        b = teleconnectionservice;
        setConnectionCapabilities(remoteconference.getConnectionCapabilities());
        a(remoteconference.getState());
        remoteconference.registerCallback(c);
        phoneaccounthandle = remoteconference.getConnections().iterator();
        do
        {
            if (!phoneaccounthandle.hasNext())
            {
                break;
            }
            remoteconference = (RemoteConnection)phoneaccounthandle.next();
            dtz dtz1 = dvq.a(remoteconference, teleconnectionservice);
            if (dtz1 != null)
            {
                if (!addConnection(dtz1))
                {
                    remoteconference = String.valueOf(dtz1);
                    ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(remoteconference).length() + 66)).append("TeleRemoteConferenceWrapper, failed to add conference connection: ").append(remoteconference).toString());
                }
            } else
            {
                String s = String.valueOf("TeleRemoteConferenceWrapper, failed to find connection for remote connection: ");
                remoteconference = String.valueOf(remoteconference);
                ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(remoteconference).length())).append(s).append(remoteconference).toString());
            }
        } while (true);
    }

    static TeleConnectionService a(dvv dvv1)
    {
        return dvv1.b;
    }

    public static dvv a(RemoteConference remoteconference, TeleConnectionService teleconnectionservice)
    {
        Object obj = remoteconference.getConnections().iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        dtz dtz1 = dvq.a((RemoteConnection)((Iterator) (obj)).next(), teleconnectionservice);
        if (dtz1 == null || dtz1.e() == null) goto _L4; else goto _L3
_L3:
        obj = dtz1.e().getAccountHandle();
_L6:
        if (obj == null)
        {
            String s = String.valueOf("TeleRemoteConferenceWrapper.createConferenceWrapper, didn't find phone account to add to conference: ");
            String s1 = String.valueOf(remoteconference);
            ebw.f("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s1).length())).append(s).append(s1).toString());
        }
        return new dvv(((PhoneAccountHandle) (obj)), remoteconference, teleconnectionservice);
_L2:
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(int i)
    {
        switch (i)
        {
        default:
            String s = String.valueOf("TeleRemoteConferenceWrapper.updateState. unrecognized state for Conference: ");
            ebw.f("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString());
            // fall through

        case 6: // '\006'
            return;

        case 5: // '\005'
            setOnHold();
            return;

        case 4: // '\004'
            setActive();
            return;
        }
    }

    static void a(dvv dvv1, int i)
    {
        dvv1.a(i);
    }

    static android.telecom.RemoteConference.Callback b(dvv dvv1)
    {
        return dvv1.c;
    }

    static RemoteConference c(dvv dvv1)
    {
        return dvv1.a;
    }

    public void onAudioStateChanged(AudioState audiostate)
    {
        String s = String.valueOf(audiostate);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 56)).append("TeleRemoteConferenceWrapper.onAudioStateChanged, state: ").append(s).toString());
        a.setAudioState(audiostate);
    }

    public void onDisconnect()
    {
        ebw.e("Babel_telephony", "TeleRemoteConferenceWrapper.onDisconnect");
        a.disconnect();
    }

    public void onHold()
    {
        ebw.e("Babel_telephony", "TeleRemoteConferenceWrapper.onHold");
        a.hold();
    }

    public void onMerge()
    {
        ebw.e("Babel_telephony", "TeleRemoteConferenceWrapper.onMerge");
        a.merge();
    }

    public void onPlayDtmfTone(char c1)
    {
        String s = String.valueOf(ebw.b(String.valueOf(c1)));
        if (s.length() != 0)
        {
            s = "TeleRemoteConferenceWrapper.onPlayDtmfTone, ".concat(s);
        } else
        {
            s = new String("TeleRemoteConferenceWrapper.onPlayDtmfTone, ");
        }
        ebw.e("Babel_telephony", s);
        a.playDtmfTone(c1);
    }

    public void onSeparate(Connection connection)
    {
        String s = String.valueOf(connection);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 52)).append("TeleRemoteConferenceWrapper.onSeparate, connection: ").append(s).toString());
        if (a != null && (connection instanceof dtz))
        {
            connection = ((dtz)connection).j();
            if (connection instanceof dvq)
            {
                a.separate(((dvq)connection).n());
            }
        }
    }

    public void onStopDtmfTone()
    {
        ebw.e("Babel_telephony", "TeleRemoteConferenceWrapper.onStopDtmfTone");
        a.stopDtmfTone();
    }

    public void onSwap()
    {
        ebw.e("Babel_telephony", "TeleRemoteConferenceWrapper.onSwap");
        a.swap();
    }

    public void onUnhold()
    {
        ebw.e("Babel_telephony", "TeleRemoteConferenceWrapper.onUnhold");
        a.unhold();
    }
}
