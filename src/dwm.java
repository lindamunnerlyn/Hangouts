// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.telecom.AudioState;
import android.telecom.Conference;
import android.telecom.Connection;
import android.telecom.PhoneAccountHandle;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class dwm extends Conference
    implements dud
{

    private dwm(PhoneAccountHandle phoneaccounthandle)
    {
        super(phoneaccounthandle);
        setConnectionCapabilities(67);
        setActive();
    }

    private dtz a()
    {
        List list = getConnections();
        if (list.isEmpty())
        {
            return null;
        } else
        {
            return (dtz)list.get(0);
        }
    }

    static void a(TeleConnectionService teleconnectionservice, dtz dtz1)
    {
        Object obj;
        ebw.e("Babel_telephony", "TeleWifiConference.getOrCreateWifiConference");
        obj = teleconnectionservice.getAllConnections().iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        Conference conference = ((Connection)((Iterator) (obj)).next()).getConference();
        if (!(conference instanceof dwm)) goto _L4; else goto _L3
_L3:
        obj = (dwm)conference;
_L6:
        teleconnectionservice = teleconnectionservice.getAllConnections().iterator();
        do
        {
            if (!teleconnectionservice.hasNext())
            {
                break;
            }
            dtz dtz2 = (dtz)(Connection)teleconnectionservice.next();
            if (dtz2 == dtz1 || dtz2.j() != null && dtz2.j().d() == 2)
            {
                Object obj1 = String.valueOf(dtz2);
                String s = String.valueOf(Connection.stateToString(dtz2.getState()));
                ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(obj1).length() + 66 + String.valueOf(s).length())).append("TeleWifiConference.adding connection to wifi conference: ").append(((String) (obj1))).append(", state: ").append(s).toString());
                if (dtz2.getState() == 5)
                {
                    dtz2.onUnhold();
                }
                obj1 = dtz2.getAudioState();
                if (obj1 != null && ((AudioState) (obj1)).isMuted() && dtz2.j() != null)
                {
                    ((dwh)dtz2.j()).o();
                }
                ((dwm) (obj)).addConnection(dtz2);
            }
        } while (true);
        break; /* Loop/switch isn't completed */
_L2:
        ebw.e("Babel_telephony", "TeleWifiConference.createWifiConference");
        obj = new dwm(g.l(teleconnectionservice));
        teleconnectionservice.addConference(((Conference) (obj)));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(dtz dtz1, int i)
    {
        if (i == 4)
        {
            setActive();
        } else
        {
            if (i == 5)
            {
                setOnHold();
                return;
            }
            if (i == 6)
            {
                removeConnection(dtz1);
                dtz1.b(this);
                if (getConnections().size() == 0)
                {
                    setDisconnected(dtz1.getDisconnectCause());
                    destroy();
                    return;
                }
            }
        }
    }

    public void onAudioStateChanged(AudioState audiostate)
    {
        Object obj = String.valueOf(audiostate);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(obj).length() + 40)).append("TeleWifiConference.onAudioStateChanged, ").append(((String) (obj))).toString());
        obj = a();
        if (obj != null)
        {
            ((dtz) (obj)).onAudioStateChanged(audiostate);
            return;
        } else
        {
            ebw.f("Babel_telephony", "No TeleConnection found while trying to change audio state.");
            return;
        }
    }

    public void onConnectionAdded(Connection connection)
    {
        ((dtz)connection).a(this);
    }

    public void onDisconnect()
    {
        ebw.e("Babel_telephony", "TeleWifiConference.onDisconnect.");
        for (Iterator iterator = getConnections().iterator(); iterator.hasNext(); ((Connection)iterator.next()).onDisconnect()) { }
    }

    public void onHold()
    {
        ebw.e("Babel_telephony", "TeleWifiConference.onHold");
        for (Iterator iterator = getConnections().iterator(); iterator.hasNext(); ((dtz)(Connection)iterator.next()).onHold()) { }
    }

    public void onPlayDtmfTone(char c)
    {
        dtz dtz1 = a();
        if (dtz1 != null)
        {
            dtz1.onPlayDtmfTone(c);
            return;
        } else
        {
            ebw.f("Babel_telephony", "No TeleConnection found while trying to play dtmf tone.");
            return;
        }
    }

    public void onStopDtmfTone()
    {
        dtz dtz1 = a();
        if (dtz1 != null)
        {
            dtz1.onStopDtmfTone();
            return;
        } else
        {
            ebw.f("Babel_telephony", "No TeleConnection found while trying to stop dtmf tone.");
            return;
        }
    }

    public void onUnhold()
    {
        ebw.e("Babel_telephony", "TeleWifiConference.onUnhold");
        for (Iterator iterator = getConnections().iterator(); iterator.hasNext(); ((dtz)(Connection)iterator.next()).onUnhold()) { }
    }
}
