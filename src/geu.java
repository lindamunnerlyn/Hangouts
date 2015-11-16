// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class geu
{

    String a;
    String b;
    final gmn c;
    String d;
    private final String e;
    private boolean f;
    private int g;
    private int h;
    private final Map i = new HashMap();
    private gku j;
    private long k;
    private int l;
    private int m;
    private String n;
    private iui o;
    private boolean p;
    private final gey q = new gey(new gev(this));

    public geu(gmn gmn1)
    {
        e = gmn1.a();
        c = gmn1;
        f = true;
        g = -1;
        k = 0L;
        l = 0;
        j = null;
        h = 0;
        m = 0;
        n = null;
        o = null;
        p = false;
        d = gmn1.f();
    }

    static String e(int i1)
    {
        switch (i1)
        {
        case 3: // '\003'
        case 5: // '\005'
        default:
            gdv.a("Unknown type");
            return "Unknown state";

        case 0: // '\0'
            return "STATE_INIT";

        case 1: // '\001'
            return "STATE_SENTINITIATE";

        case 2: // '\002'
            return "STATE_RECEIVEDINITIATE";

        case 4: // '\004'
            return "STATE_SENTACCEPT";

        case 6: // '\006'
            return "STATE_RECEIVEDACCEPT";

        case 7: // '\007'
            return "STATE_SENTMODIFY";

        case 8: // '\b'
            return "STATE_RECEIVEDMODIFY";

        case 9: // '\t'
            return "STATE_SENTREJECT";

        case 10: // '\n'
            return "STATE_RECEIVEDREJECT";

        case 11: // '\013'
            return "STATE_SENTREDIRECT";

        case 12: // '\f'
            return "STATE_SENTTERMINATE";

        case 13: // '\r'
            return "STATE_RECEIVEDTERMINATE";

        case 14: // '\016'
            return "STATE_INPROGRESS";

        case 15: // '\017'
            return "STATE_DEINIT";

        case -1: 
            return "STATE_INVALID";
        }
    }

    String a()
    {
        return d;
    }

    public List a(Context context, int i1, int j1, ggk ggk, String s1)
    {
        gdv.b("localState is null - cannot report correct stats", ggk);
        context = q.a(context, i1, j1, k, e).a(c).a(d(), m, h).a(s1, null, null);
        if (c.p() != null)
        {
            context.a(c.p());
        }
        if (j != null)
        {
            ggk = d;
            s1 = String.valueOf(j.a());
            context.b((new StringBuilder(String.valueOf(ggk).length() + 22 + String.valueOf(s1).length())).append(ggk).append("@groupchat.google.com/").append(s1).toString());
        }
        if (o != null)
        {
            context.a(o);
        }
        return context.a();
    }

    public void a(int i1)
    {
        g = i1;
    }

    void a(int i1, String s1)
    {
        gdv.a(i1, 1, 1019);
        if (m == 0)
        {
            m = i1;
            n = s1;
        }
    }

    public void a(Bundle bundle)
    {
        if (a != null)
        {
            bundle.putString("call_state_remote_session_id", a);
        }
        bundle.putString("call_state_local_session_id", g());
        bundle.putString("is_pending_sign_in", String.valueOf(b()));
        l;
        JVM INSTR tableswitch 1 9: default 96
    //                   1 224
    //                   2 203
    //                   3 210
    //                   4 217
    //                   5 173
    //                   6 179
    //                   7 185
    //                   8 191
    //                   9 197;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        String s1 = "unk";
_L12:
        bundle.putString("media_network_type", s1);
        bundle.putString("media_state", e(k()));
        bundle.putString("p2p_mode", String.valueOf(t()));
        bundle.putString("participant_log_id", i());
        if (d != null)
        {
            bundle.putString("hangout_id", d);
        }
        bundle.putString("start_time_in_millis", String.valueOf(k));
        return;
_L6:
        s1 = "mobile";
        continue; /* Loop/switch isn't completed */
_L7:
        s1 = "mobile_2g";
        continue; /* Loop/switch isn't completed */
_L8:
        s1 = "mobile_3g";
        continue; /* Loop/switch isn't completed */
_L9:
        s1 = "mobile_4g";
        continue; /* Loop/switch isn't completed */
_L10:
        s1 = "mobile_lte";
        continue; /* Loop/switch isn't completed */
_L3:
        s1 = "wifi";
        continue; /* Loop/switch isn't completed */
_L4:
        s1 = "wimax";
        continue; /* Loop/switch isn't completed */
_L5:
        s1 = "bt";
        continue; /* Loop/switch isn't completed */
_L2:
        s1 = "eth";
        if (true) goto _L12; else goto _L11
_L11:
    }

    public void a(gkq gkq1)
    {
        gdv.b("Expected condition to be false", gkq1.k());
        i.put(gkq1.a(), gkq1);
    }

    void a(gku gku1)
    {
        gdv.a("Expected condition to be true", gku1.k());
        j = gku1;
        k = System.currentTimeMillis();
    }

    public void a(iui iui)
    {
        o = iui;
    }

    void a(String s1)
    {
        d = s1;
    }

    void a(boolean flag)
    {
        p = flag;
    }

    public gkq b(String s1)
    {
        if (j != null && s1.equals(j.a()))
        {
            return j;
        } else
        {
            return c(s1);
        }
    }

    void b(int i1)
    {
        l = i1;
    }

    void b(gkq gkq1)
    {
        gdv.b("Expected non-null", gkq1);
        gdv.b(gkq1, j);
        i.remove(gkq1.a());
    }

    boolean b()
    {
        return f;
    }

    public gkq c(String s1)
    {
        return (gkq)i.get(s1);
    }

    void c()
    {
        f = false;
    }

    void c(int i1)
    {
        h = i1;
    }

    void d(int i1)
    {
        a(i1, null);
    }

    void d(String s1)
    {
        gne.a(3, "vclib", "setRemoteSessionId = %s", new Object[] {
            s1
        });
        a = s1;
        if (b == null)
        {
            e(a);
        }
    }

    public boolean d()
    {
        return g != -1;
    }

    void e(String s1)
    {
        gne.a(3, "vclib", "setActiveSessionId = %s", new Object[] {
            s1
        });
        b = s1;
    }

    public boolean e()
    {
        return g == 4 || g == 6 || g == 14;
    }

    public boolean f()
    {
        return g == 14;
    }

    public String g()
    {
        return e;
    }

    public String h()
    {
        return a;
    }

    public String i()
    {
        return c.b();
    }

    gmn j()
    {
        return c;
    }

    int k()
    {
        return g;
    }

    public gey l()
    {
        return q;
    }

    public Collection m()
    {
        return Collections.unmodifiableCollection(i.values());
    }

    public gku n()
    {
        return j;
    }

    int o()
    {
        return l;
    }

    public int p()
    {
        gdv.b(Integer.valueOf(m), Integer.valueOf(0));
        return m;
    }

    public String q()
    {
        gdv.b(Integer.valueOf(m), Integer.valueOf(0));
        return n;
    }

    public boolean r()
    {
        return c.u();
    }

    public int s()
    {
        return gey.d(m);
    }

    public boolean t()
    {
        return p;
    }
}
