// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.telecom.AudioState;
import android.telecom.Connection;
import android.telecom.RemoteConnection;
import android.telecom.StatusHints;
import android.text.TextUtils;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class dyz
    implements dwz
{

    final Context a;
    final List b = new LinkedList();
    final dzb c;
    dxh d;
    dza e;
    private RemoteConnection f;
    private boolean g;

    dyz(Context context, RemoteConnection remoteconnection, String s, String s1, String s2, boolean flag)
    {
        e = new dza(this);
        a = context;
        f = remoteconnection;
        f.registerCallback(e);
        c = new dzb(context, s, remoteconnection.getAddress(), s1, s2, flag);
        a(c);
        if (!flag && TextUtils.isEmpty(s))
        {
            g.o(context);
        }
    }

    static dxh a(RemoteConnection remoteconnection, TeleConnectionService teleconnectionservice)
    {
        for (teleconnectionservice = teleconnectionservice.getAllConnections().iterator(); teleconnectionservice.hasNext();)
        {
            Object obj = (Connection)teleconnectionservice.next();
            if (obj instanceof dxh)
            {
                obj = (dxh)obj;
                if ((((dxh) (obj)).j() instanceof dyz) && ((dyz)((dxh) (obj)).j()).n() == remoteconnection)
                {
                    return ((dxh) (obj));
                }
            }
        }

        return null;
    }

    public dxh a()
    {
        return d;
    }

    public void a(char c1)
    {
        String s = String.valueOf(eev.b(String.valueOf(c1)));
        String s1 = String.valueOf(d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 36 + String.valueOf(s1).length())).append("TeleRemoteCall.onPlayDtmfTone, c: ").append(s).append(", ").append(s1).toString());
        if (f != null)
        {
            f.playDtmfTone(c1);
        }
    }

    public void a(int i1)
    {
        String s = String.valueOf(Connection.stateToString(i1));
        String s1 = String.valueOf(d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 40 + String.valueOf(s1).length())).append("TeleRemoteCall.onStateChanged, state: ").append(s).append(", ").append(s1).toString());
        if (i1 == 1)
        {
            for (Iterator iterator = b.iterator(); iterator.hasNext(); ((dxa)iterator.next()).a(this, i1)) { }
        }
    }

    public void a(int i1, int j1)
    {
        eev.e("Babel_telephony", (new StringBuilder(91)).append("TeleRemoteCall.disconnectForHandoff, handoffReason: ").append(i1).append(", new call code: ").append(j1).toString());
        g();
    }

    public void a(AudioState audiostate)
    {
        String s = String.valueOf(audiostate);
        String s1 = String.valueOf(d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 45 + String.valueOf(s1).length())).append("TeleRemoteCall.onAudioStateChanged, state: ").append(s).append(", ").append(s1).toString());
        if (f != null)
        {
            f.setAudioState(audiostate);
        }
    }

    public void a(dwz dwz1)
    {
        String s = String.valueOf(dwz1);
        String s1 = String.valueOf(d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 41 + String.valueOf(s1).length())).append("TeleRemoteCall.performConferenceWith : ").append(s).append(", ").append(s1).toString());
        if (dwz1 != null)
        {
            if (!(dwz1 instanceof dyz))
            {
                eev.f("Babel_telephony", "TeleRemoteCall.performConferenceWith. Conferencing Wifi and PSTN calls together is not supported yet.");
            } else
            if (d != null)
            {
                d.d().conferenceRemoteConnections(n(), ((dyz)dwz1).n());
                return;
            }
        }
    }

    public void a(dxa dxa1)
    {
        b.add(dxa1);
    }

    public void a(dxh dxh1)
    {
        String s = String.valueOf(d);
        String s1 = String.valueOf(dxh1);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 34 + String.valueOf(s1).length())).append("TeleRemoteCall.setConnection, ").append(s).append(" -> ").append(s1).toString());
        if (d != null && dxh1 == null)
        {
            d.a(d(), c.b());
        }
        d = dxh1;
        if (d == null)
        {
            return;
        } else
        {
            d.setAudioModeIsVoip(false);
            b();
            return;
        }
    }

    public void a(dxp dxp)
    {
        String s = String.valueOf(dxp);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 47)).append("TeleRemoteCall.maybeAddExperiment, experiment: ").append(s).toString());
        c.a(dxp);
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    public void b()
    {
        Object obj;
        Object obj1;
        int i1;
        i1 = 0;
        String s = String.valueOf(d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 34)).append("TeleRemoteCall.updateStatusHints, ").append(s).toString());
        obj = d.d();
        obj1 = new ComponentName(((Context) (obj)), com/google/android/apps/hangouts/telephony/TeleConnectionService);
        if (d.k() == null || d.getState() == 3) goto _L2; else goto _L1
_L1:
        String s1 = g.i(((Context) (obj)));
        if (TextUtils.isEmpty(s1)) goto _L2; else goto _L3
_L3:
        s1 = ((Context) (obj)).getString(g.py, new Object[] {
            s1
        });
        i1 = g.oZ;
_L5:
        int j1 = i1;
        String s2 = s1;
        if (s1 == null)
        {
            j1 = i1;
            s2 = s1;
            if (o())
            {
                s1 = g.h(((Context) (obj)));
                j1 = i1;
                s2 = s1;
                if (i1 == 0)
                {
                    j1 = i1;
                    s2 = s1;
                    if (!TextUtils.isEmpty(s1))
                    {
                        if (g)
                        {
                            j1 = g.pb;
                            s2 = s1;
                        } else
                        {
                            j1 = g.pd;
                            s2 = s1;
                        }
                    }
                }
            }
        }
        obj1 = new StatusHints(((ComponentName) (obj1)), s2, j1, null);
        if (!((StatusHints) (obj1)).equals(d.getStatusHints()))
        {
            if (j1 == 0)
            {
                s1 = "0";
            } else
            {
                s1 = ((Context) (obj)).getResources().getResourceName(j1);
            }
            obj = String.valueOf(d);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s2).length() + 51 + String.valueOf(s1).length() + String.valueOf(obj).length())).append("TeleRemoteCall.updateStatusHints, label: ").append(s2).append(", icon: ").append(s1).append(", ").append(((String) (obj))).toString());
            d.setStatusHints(((StatusHints) (obj1)));
        }
        return;
_L2:
        s1 = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void b(dxa dxa1)
    {
        b.remove(dxa1);
    }

    public void b(boolean flag)
    {
        String s = String.valueOf(d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 35)).append("TeleRemoteCall.onPostDialContinue, ").append(s).toString());
        if (f != null)
        {
            f.postDialContinue(flag);
        }
    }

    public void c()
    {
        String s = String.valueOf(d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 37)).append("TeleRemoteCall.performManualHandoff, ").append(s).toString());
        c.a(2);
        dxv.b(a, d, 2);
    }

    public int d()
    {
        return 1;
    }

    public String e()
    {
        return c.a();
    }

    public void f()
    {
        String s = String.valueOf(d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 31)).append("TeleRemoteCall.onStopDtmfTone, ").append(s).toString());
        if (f != null)
        {
            f.stopDtmfTone();
        }
    }

    public void g()
    {
        String s = String.valueOf(d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 29)).append("TeleRemoteCall.onDisconnect, ").append(s).toString());
        if (f != null)
        {
            f.disconnect();
        }
    }

    public void h()
    {
        String s = String.valueOf(d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 27)).append("TeleRemoteCall.onSeparate, ").append(s).toString());
    }

    public void i()
    {
        String s = String.valueOf(d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 24)).append("TeleRemoteCall.onAbort, ").append(s).toString());
        if (f != null)
        {
            f.abort();
        }
    }

    public void j()
    {
        String s = String.valueOf(d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 23)).append("TeleRemoteCall.onHold, ").append(s).toString());
        if (f != null)
        {
            f.hold();
        }
    }

    public void k()
    {
        String s = String.valueOf(d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 24)).append("TeleRemoteCall.onUhold, ").append(s).toString());
        if (f != null)
        {
            f.unhold();
        }
    }

    public void l()
    {
        String s = String.valueOf(d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 25)).append("TeleRemoteCall.onAnswer, ").append(s).toString());
        if (f != null)
        {
            f.answer();
            g.o(a);
        }
    }

    public void m()
    {
        String s = String.valueOf(d);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 25)).append("TeleRemoteCall.onReject, ").append(s).toString());
        if (f != null)
        {
            f.reject();
        }
    }

    RemoteConnection n()
    {
        return f;
    }

    boolean o()
    {
        return d != null && !TextUtils.isEmpty(d.o());
    }
}
