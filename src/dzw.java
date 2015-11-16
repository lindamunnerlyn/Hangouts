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

final class dzw extends Conference
    implements dxl
{

    private dzw(PhoneAccountHandle phoneaccounthandle)
    {
        super(phoneaccounthandle);
        setConnectionCapabilities(67);
        setActive();
    }

    private dxh a()
    {
        List list = getConnections();
        if (list.isEmpty())
        {
            return null;
        } else
        {
            return (dxh)list.get(0);
        }
    }

    static void a(TeleConnectionService teleconnectionservice, dxh dxh1)
    {
        Object obj;
        eev.e("Babel_telephony", "TeleWifiConference.getOrCreateWifiConference");
        obj = teleconnectionservice.getAllConnections().iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        Conference conference = ((Connection)((Iterator) (obj)).next()).getConference();
        if (!(conference instanceof dzw)) goto _L4; else goto _L3
_L3:
        obj = (dzw)conference;
_L6:
        teleconnectionservice = teleconnectionservice.getAllConnections().iterator();
        do
        {
            if (!teleconnectionservice.hasNext())
            {
                break;
            }
            dxh dxh2 = (dxh)(Connection)teleconnectionservice.next();
            if (dxh2 == dxh1 || dzr.b(dxh2))
            {
                Object obj1 = String.valueOf(dxh2);
                eev.e("Babel_telephony", (new StringBuilder(String.valueOf(obj1).length() + 57)).append("TeleWifiConference.adding connection to wifi conference: ").append(((String) (obj1))).toString());
                obj1 = dxh2.getAudioState();
                if (obj1 != null && ((AudioState) (obj1)).isMuted() && dxh2.j() != null)
                {
                    ((dzr)dxh2.j()).o();
                }
                ((dzw) (obj)).addConnection(dxh2);
            }
        } while (true);
        break; /* Loop/switch isn't completed */
_L2:
        eev.e("Babel_telephony", "TeleWifiConference.createWifiConference");
        obj = new dzw(g.l(teleconnectionservice));
        teleconnectionservice.addConference(((Conference) (obj)));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(dxh dxh1, int i)
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
                removeConnection(dxh1);
                dxh1.b(this);
                if (getConnections().size() == 0)
                {
                    setDisconnected(dxh1.getDisconnectCause());
                    destroy();
                    return;
                }
            }
        }
    }

    public void onAudioStateChanged(AudioState audiostate)
    {
        Object obj = String.valueOf(audiostate);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(obj).length() + 40)).append("TeleWifiConference.onAudioStateChanged, ").append(((String) (obj))).toString());
        obj = a();
        if (obj != null)
        {
            ((dxh) (obj)).onAudioStateChanged(audiostate);
            return;
        } else
        {
            eev.f("Babel_telephony", "No TeleConnection found while trying to change audio state.");
            return;
        }
    }

    public void onConnectionAdded(Connection connection)
    {
        ((dxh)connection).a(this);
    }

    public void onDisconnect()
    {
        eev.e("Babel_telephony", "TeleWifiConference.onDisconnect.");
        for (Iterator iterator = getConnections().iterator(); iterator.hasNext(); ((Connection)iterator.next()).onDisconnect()) { }
    }

    public void onHold()
    {
        eev.e("Babel_telephony", "TeleWifiConference.onHold");
        for (Iterator iterator = getConnections().iterator(); iterator.hasNext(); ((dxh)(Connection)iterator.next()).onHold()) { }
    }

    public void onPlayDtmfTone(char c)
    {
        dxh dxh1 = a();
        if (dxh1 != null)
        {
            dxh1.onPlayDtmfTone(c);
            return;
        } else
        {
            eev.f("Babel_telephony", "No TeleConnection found while trying to play dtmf tone.");
            return;
        }
    }

    public void onStopDtmfTone()
    {
        dxh dxh1 = a();
        if (dxh1 != null)
        {
            dxh1.onStopDtmfTone();
            return;
        } else
        {
            eev.f("Babel_telephony", "No TeleConnection found while trying to stop dtmf tone.");
            return;
        }
    }

    public void onUnhold()
    {
        eev.e("Babel_telephony", "TeleWifiConference.onUnhold");
        for (Iterator iterator = getConnections().iterator(); iterator.hasNext(); ((dxh)(Connection)iterator.next()).onUnhold()) { }
    }
}
