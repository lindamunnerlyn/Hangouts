// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.telecom.AudioState;
import android.telecom.Conference;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import android.telecom.StatusHints;
import android.text.TextUtils;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public final class dzr
    implements dwz, dzy
{

    final Context a;
    final String b;
    dxh c;
    bpm d;
    int e;
    boolean f;
    String g;
    dxp h;
    private final List i = new LinkedList();
    private boo j;
    private dzu k;
    private dzt l;
    private dzs m;
    private long n;
    private long o;
    private dzx p;
    private dyu q;
    private int r;
    private boolean s;

    dzr(Context context, dzu dzu1, String s1, boolean flag)
    {
        r = 0;
        a = context;
        k = dzu1;
        b = s1;
        if (!flag && TextUtils.isEmpty(s1))
        {
            q = new dyu(this);
            a(q);
        }
    }

    private void a(DisconnectCause disconnectcause)
    {
        String s1 = String.valueOf(disconnectcause);
        String s2 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 29 + String.valueOf(s2).length())).append("TeleWifiCall.close, cause: ").append(s1).append(", ").append(s2).toString());
        p();
        if (m != null)
        {
            bnk.a().b(m);
            m = null;
        }
        if (k != null)
        {
            k.c();
            k = null;
        }
        if (p != null)
        {
            p.a();
            p = null;
        }
        if (q != null)
        {
            b(q);
            q = null;
        }
        if (c != null)
        {
            c.a(d(), s());
            if (c.k() == null)
            {
                c.w();
                if (c.getConference() != null)
                {
                    c.getConference().removeConnection(c);
                }
                c.setDisconnected(disconnectcause);
                g.a(c, disconnectcause);
                c.destroy();
            }
        }
        c = null;
        d = null;
        if (l != null)
        {
            j.b(l);
            l = null;
            j = null;
        }
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((dxa)iterator.next()).a(this, disconnectcause)) { }
    }

    static void a(TeleConnectionService teleconnectionservice, dxh dxh1)
    {
        teleconnectionservice = teleconnectionservice.getAllConnections().iterator();
        do
        {
            if (!teleconnectionservice.hasNext())
            {
                break;
            }
            dxh dxh2 = (dxh)(Connection)teleconnectionservice.next();
            if (dxh2 == dxh1 || b(dxh2))
            {
                dxh2.onHold();
            }
        } while (true);
    }

    static void a(dzr dzr1, DisconnectCause disconnectcause)
    {
        dzr1.a(disconnectcause);
    }

    static boolean a(TeleConnectionService teleconnectionservice)
    {
        for (teleconnectionservice = teleconnectionservice.getAllConnections().iterator(); teleconnectionservice.hasNext();)
        {
            if (b((dxh)(Connection)teleconnectionservice.next()))
            {
                return true;
            }
        }

        return false;
    }

    private static void b(TeleConnectionService teleconnectionservice, dxh dxh1)
    {
        teleconnectionservice = teleconnectionservice.getAllConnections().iterator();
        do
        {
            if (!teleconnectionservice.hasNext())
            {
                break;
            }
            dxh dxh2 = (dxh)(Connection)teleconnectionservice.next();
            if (dxh2 == dxh1 || b(dxh2))
            {
                dxh2.onUnhold();
            }
        } while (true);
    }

    public static boolean b(dxh dxh1)
    {
        return dxh1.j() != null && dxh1.j().d() == 2;
    }

    private void d(int i1)
    {
        String s1 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 46)).append("TeleWifiCall.exitHangout, cause: ").append(i1).append(", ").append(s1).toString());
        if (d != null && d == bnk.a().s())
        {
            p();
            d.c(i1);
            return;
        } else
        {
            String s2 = String.valueOf(c);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s2).length() + 72)).append("TeleWifiCall.exitHangout, hangout has already exited, short circuiting, ").append(s2).toString());
            a(c(i1));
            return;
        }
    }

    private void e(int i1)
    {
        if (d != null && d.q() != null)
        {
            d.q().l().b(i1);
        }
    }

    private void p()
    {
        if (c != null && TextUtils.isEmpty(c.o()) && d != null && d == bnk.a().s())
        {
            c.c(d.e().g());
        }
    }

    private void q()
    {
        boolean flag;
        boolean flag2;
        flag2 = false;
        flag = true;
        if (d == null) goto _L2; else goto _L1
_L1:
        String s1;
        boolean flag1;
        if (c.getState() == 5)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (r == 0) goto _L4; else goto _L3
_L3:
        if (r != 1)
        {
            flag = false;
        }
_L6:
        s1 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 86)).append("TeleWifiCall.updateHangoutAudioState, shouldMuteMic: ").append(flag).append(", shouldMuteSpeaker: ").append(flag1).append(", ").append(s1).toString());
        bnk.a().a(flag);
        bnk.a().b(flag1);
_L2:
        return;
_L4:
        if (!flag1)
        {
            flag = flag2;
            if (c.getAudioState() == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            flag = flag2;
            if (!c.getAudioState().isMuted())
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void r()
    {
        byte byte0 = 66;
        if (c.getState() == 4 || c.getState() == 5)
        {
            byte0 = 67;
        }
        if (c.getConnectionCapabilities() != byte0)
        {
            c.setConnectionCapabilities(byte0);
        }
    }

    private long s()
    {
        if (n == 0L)
        {
            return -1L;
        }
        long l2 = o;
        long l1 = l2;
        if (l2 == 0L)
        {
            l1 = SystemClock.elapsedRealtime();
        }
        return l1 - n;
    }

    public dxh a()
    {
        return c;
    }

    public void a(char c1)
    {
        String s1 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 35)).append("TeleWifiCall.onPlayDtmfTone, c: ").append(c1).append(", ").append(s1).toString());
        if (d != null)
        {
            d.a(c1);
        }
    }

    public void a(int i1)
    {
        String s1 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 29)).append("TeleWifiCall.onStateChanged, ").append(s1).toString());
        if (i1 == 6 && o == 0L)
        {
            o = SystemClock.elapsedRealtime();
        }
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((dxa)iterator.next()).a(this, i1)) { }
        r();
        if (i1 != 3 && i1 != 2 && i1 != 1 && i1 != 0)
        {
            c.w();
        }
        if (i1 == 4)
        {
            b(c.d(), c);
        }
    }

    public void a(int i1, int j1)
    {
        eev.e("Babel_telephony", (new StringBuilder(90)).append("TeleWifiCall.disconnectForHandoff, handoffReason + ").append(i1).append(", new call code: ").append(j1).toString());
        if (j1 == 0)
        {
            d(1015);
            return;
        }
        if (i1 == 3)
        {
            eev.e("Babel_telephony", (new StringBuilder(51)).append("TeleWifiCall.setHandoffEventCode, code: ").append(j1).toString());
            if (d != null && d.q() != null)
            {
                d.q().l().c(j1);
            }
            d(1018);
            return;
        } else
        {
            d(1004);
            return;
        }
    }

    public void a(AudioState audiostate)
    {
        audiostate = String.valueOf(audiostate);
        String s1 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(audiostate).length() + 43 + String.valueOf(s1).length())).append("TeleWifiCall.onAudioStateChanged, state: ").append(audiostate).append(", ").append(s1).toString());
        r = 0;
        q();
    }

    void a(bpm bpm1, boo boo1)
    {
        String s1 = String.valueOf(bpm1);
        String s2 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 46 + String.valueOf(s2).length())).append("TeleWifiCall.setHangoutState, hangoutState: ").append(s1).append(", ").append(s2).toString());
        d = bpm1;
        j = boo1;
        f = d.D();
        if (l == null)
        {
            l = new dzt(this);
            j.a(l);
        }
        if (m == null)
        {
            m = new dzs(this);
            bnk.a().a(m);
        }
        if (TextUtils.isEmpty(b) && c != null && c.d().getAllConnections().size() == 1)
        {
            g.o(a);
        }
    }

    public void a(dwz dwz1)
    {
        dwz1 = String.valueOf(dwz1);
        String s1 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(dwz1).length() + 39 + String.valueOf(s1).length())).append("TeleWifiCall.performConferenceWith : ").append(dwz1).append(", ").append(s1).toString());
    }

    public void a(dxa dxa1)
    {
        i.add(dxa1);
    }

    public void a(dxh dxh1)
    {
        if (c != null && dxh1 == null)
        {
            c.a(d(), s());
        }
        c = dxh1;
        if (c != null)
        {
            c.setAudioModeIsVoip(true);
            r();
            b();
            if (n == 0L)
            {
                n = SystemClock.elapsedRealtime();
            }
            if (p == null && !c.u())
            {
                p = new dzx(c.d());
                p.a(this);
            }
        }
    }

    public void a(dxp dxp)
    {
        String s1 = String.valueOf(dxp);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 45)).append("TeleWifiCall.maybeAddExperiment, experiment: ").append(s1).toString());
        h = dxp;
    }

    public void a(eac eac1)
    {
        boolean flag;
        flag = false;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        if (eac1.a) goto _L2; else goto _L1
_L1:
        e(3);
        dxv.a(a, c, 3);
_L4:
        return;
_L2:
        Object obj1 = a;
        Object obj = c.h();
        obj1 = g.a(((Context) (obj1)), ((dyq) (obj)));
        if (!eac1.a(((dzv) (obj1)).c, ((dzv) (obj1)).e))
        {
            Locale locale = Locale.US;
            String s1 = String.valueOf("TeleWifiCallThreshold.hasGoodSignalForOngoingWifiCall, network status is: ");
            obj = String.valueOf(((dyq) (obj)).toString());
            eev.e("Babel_telephony", String.format(locale, (new StringBuilder(String.valueOf(s1).length() + 93 + String.valueOf(obj).length())).append(s1).append(((String) (obj))).append("wifi signal is: %s\nwhich is below wifi signal threshold: %d%% or link speed threshold: %dMbps").toString(), new Object[] {
                eac1, Integer.valueOf(((dzv) (obj1)).c), Integer.valueOf(((dzv) (obj1)).e)
            }));
        } else
        {
            flag = true;
        }
        if (flag) goto _L4; else goto _L3
_L3:
        e(1);
        dxv.a(a, c, 1);
        return;
        eac1 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(eac1).length() + 48)).append("TeleWifiCall.onWifiStateChanged, no connection, ").append(eac1).toString());
        return;
    }

    public void a(boolean flag)
    {
        s = flag;
    }

    public void b()
    {
        TeleConnectionService teleconnectionservice;
        Object obj;
        int i1;
        i1 = 0;
        String s1 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 32)).append("TeleWifiCall.updateStatusHints, ").append(s1).toString());
        teleconnectionservice = c.d();
        obj = new ComponentName(teleconnectionservice, com/google/android/apps/hangouts/telephony/TeleConnectionService);
        if (c.k() == null || c.getState() == 3) goto _L2; else goto _L1
_L1:
        String s2 = g.h(teleconnectionservice);
        if (TextUtils.isEmpty(s2)) goto _L4; else goto _L3
_L3:
        s2 = teleconnectionservice.getString(g.py, new Object[] {
            s2
        });
        i1 = g.pc;
_L6:
        int j1 = i1;
        String s3 = s2;
        if (s2 == null)
        {
            s2 = g.i(teleconnectionservice);
            j1 = i1;
            s3 = s2;
            if (i1 == 0)
            {
                j1 = i1;
                s3 = s2;
                if (!TextUtils.isEmpty(s2))
                {
                    if (s)
                    {
                        j1 = g.pa;
                        s3 = s2;
                    } else
                    {
                        j1 = g.pe;
                        s3 = s2;
                    }
                }
            }
        }
        obj = new StatusHints(((ComponentName) (obj)), s3, j1, null);
        if (!((StatusHints) (obj)).equals(c.getStatusHints()))
        {
            if (j1 == 0)
            {
                s2 = "0";
            } else
            {
                s2 = teleconnectionservice.getResources().getResourceName(j1);
            }
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s3).length() + 47 + String.valueOf(s2).length())).append("TeleWifiCall.updateStatusHints, label: ").append(s3).append(", icon: ").append(s2).toString());
            c.setStatusHints(((StatusHints) (obj)));
        }
        return;
_L2:
        if (c.u())
        {
            i1 = g.pd;
            s2 = teleconnectionservice.getString(g.pr, new Object[] {
                g.h(teleconnectionservice)
            });
            continue; /* Loop/switch isn't completed */
        }
_L4:
        s2 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    void b(int i1)
    {
        String s1;
        s1 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 61)).append("TeleWifiCall.cancelIncomingCall, dismissReason: ").append(i1).append(", ").append(s1).toString());
        byte byte0;
        if (i1 == 1)
        {
            byte0 = 4;
        } else
        {
            byte0 = 5;
        }
        i1;
        JVM INSTR tableswitch 0 4: default 96
    //                   0 158
    //                   1 165
    //                   2 172
    //                   3 179
    //                   4 186;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_186;
_L1:
        s1 = (new StringBuilder(63)).append("HangoutInviteNotification.UNEXPECTED_DISSMIS_REASON_").append(i1).toString();
_L7:
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s1 = "cancel ring, dismiss reason: ".concat(s1);
        } else
        {
            s1 = new String("cancel ring, dismiss reason: ");
        }
        a(new DisconnectCause(byte0, s1));
        return;
_L2:
        s1 = "UNKNOWN";
          goto _L7
_L3:
        s1 = "USER_RESPONDED";
          goto _L7
_L4:
        s1 = "USER_KICKED";
          goto _L7
_L5:
        s1 = "INVITER_CANCELLED";
          goto _L7
        s1 = "INVITE_TIMEOUT";
          goto _L7
    }

    public void b(dxa dxa1)
    {
        i.remove(dxa1);
    }

    public void b(boolean flag)
    {
        String s1 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 33)).append("TeleWifiCall.onPostDialContinue, ").append(s1).toString());
        q.a(flag);
    }

    DisconnectCause c(int i1)
    {
        Object obj;
        byte byte1;
        int j1;
        byte1 = 27;
        j1 = g.i(i1);
        obj = a;
        i1;
        JVM INSTR lookupswitch 34: default 300
    //                   1: 340
    //                   3: 351
    //                   4: 351
    //                   5: 351
    //                   6: 351
    //                   7: 351
    //                   8: 351
    //                   9: 351
    //                   10: 351
    //                   11: 351
    //                   12: 362
    //                   13: 362
    //                   14: 362
    //                   15: 362
    //                   16: 362
    //                   17: 362
    //                   18: 362
    //                   19: 362
    //                   20: 362
    //                   21: 384
    //                   22: 384
    //                   23: 384
    //                   26: 362
    //                   1000: 373
    //                   1001: 362
    //                   1002: 362
    //                   1003: 384
    //                   1008: 395
    //                   1010: 406
    //                   1011: 406
    //                   1012: 362
    //                   1013: 362
    //                   1014: 417
    //                   1018: 384;
           goto _L1 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L5 _L5 _L5 _L4 _L6 _L4 _L4 _L5 _L7 _L8 _L8 _L4 _L4 _L9 _L5
_L1:
        obj = null;
_L16:
        String s1 = g.h(i1);
        if (i1 != 1003 && i1 != 1018) goto _L11; else goto _L10
_L10:
        byte byte0 = 95;
_L13:
        return new DisconnectCause(j1, ((CharSequence) (obj)), null, s1, byte0);
_L2:
        obj = ((Context) (obj)).getString(g.pJ);
        continue; /* Loop/switch isn't completed */
_L3:
        obj = ((Context) (obj)).getString(g.pM);
        continue; /* Loop/switch isn't completed */
_L4:
        obj = ((Context) (obj)).getString(g.pK);
        continue; /* Loop/switch isn't completed */
_L6:
        obj = ((Context) (obj)).getString(g.pL);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = ((Context) (obj)).getString(g.pH);
        continue; /* Loop/switch isn't completed */
_L7:
        obj = ((Context) (obj)).getString(g.pG);
        continue; /* Loop/switch isn't completed */
_L8:
        obj = ((Context) (obj)).getString(g.pI);
        continue; /* Loop/switch isn't completed */
_L9:
        obj = ((Context) (obj)).getString(g.pP);
        continue; /* Loop/switch isn't completed */
_L11:
        byte0 = byte1;
        if (i1 == 1012) goto _L13; else goto _L12
_L12:
        byte0 = byte1;
        switch (g.i(i1))
        {
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        default:
            byte0 = -1;
            break;

        case 7: // '\007'
            byte0 = 17;
            break;

        case 2: // '\002'
        case 3: // '\003'
            break;
        }
        if (true) goto _L13; else goto _L14
_L14:
        if (true) goto _L16; else goto _L15
_L15:
    }

    public void c()
    {
        String s1 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 35)).append("TeleWifiCall.performManualHandoff, ").append(s1).toString());
        e(2);
        dxv.a(a, c, 2);
    }

    public int d()
    {
        return 2;
    }

    public String e()
    {
        return g;
    }

    public void f()
    {
        String s1 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 29)).append("TeleWifiCall.onStopDtmfTone, ").append(s1).toString());
    }

    public void g()
    {
        String s1 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 27)).append("TeleWifiCall.onDisconnect, ").append(s1).toString());
        d(1004);
    }

    public void h()
    {
        String s1 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 25)).append("TeleWifiCall.onSeparate, ").append(s1).toString());
    }

    public void i()
    {
        String s1 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 22)).append("TeleWifiCall.onAbort, ").append(s1).toString());
        g();
    }

    public void j()
    {
        String s1 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 21)).append("TeleWifiCall.onHold, ").append(s1).toString());
        if (c.getState() != 5)
        {
            c.setOnHold();
            r = 0;
            q();
        }
    }

    public void k()
    {
        String s1 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 23)).append("TeleWifiCall.onUnhold, ").append(s1).toString());
        if (c.getState() != 4)
        {
            c.setActive();
            r = 0;
            q();
        }
    }

    public void l()
    {
        String s1 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 23)).append("TeleWifiCall.onAnswer, ").append(s1).toString());
        if (k != null)
        {
            k.b();
            k = null;
        }
    }

    public void m()
    {
        String s1 = String.valueOf(c);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 23)).append("TeleWifiCall.onReject, ").append(s1).toString());
        if (k != null)
        {
            k.c();
            k = null;
        }
        a(new DisconnectCause(6, "incoming request ignored"));
    }

    public bpm n()
    {
        return d;
    }

    void o()
    {
        r = 2;
        q();
    }
}
