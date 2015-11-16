// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class gcg
{

    final String a;
    String b;
    final gjl c;
    String d;
    ghs e;
    final gck f;
    final gcm g = new gch(this);
    private boolean h;
    private int i;
    private int j;
    private final Map k = new HashMap();
    private long l;
    private int m;
    private int n;
    private String o;
    private iod p;
    private boolean q;

    public gcg(gjl gjl1)
    {
        a = gjl1.a();
        c = gjl1;
        h = true;
        i = -1;
        l = 0L;
        m = 8;
        e = null;
        f = new gck(g);
        j = 0;
        n = 0;
        o = null;
        p = null;
        q = false;
        d = gjl1.f();
    }

    static String e(int i1)
    {
        switch (i1)
        {
        case 3: // '\003'
        case 5: // '\005'
        default:
            gbh.a("Unknown type");
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

    public jdh a(Context context, String s1, int i1, int j1, gdw gdw, String s2)
    {
        gbh.b("localState is null - cannot report correct stats", gdw);
        context = f.a(context, s1, i1, j1, l, a).a(c).a(d(), n, j).a(s2, null, null);
        if (c.p() != null)
        {
            context.a(c.p());
        }
        if (e != null)
        {
            context.b(e.a());
        }
        if (p != null)
        {
            context.a(p);
        }
        return context.a();
    }

    public void a(int i1)
    {
        i = i1;
    }

    void a(int i1, String s1)
    {
        gbh.a(i1, 1, 1019);
        if (n == 0)
        {
            n = i1;
            o = s1;
        }
    }

    public void a(Bundle bundle)
    {
        if (b != null)
        {
            bundle.putString("call_state_remote_session_id", b);
        }
        bundle.putString("call_state_session_id", g());
        bundle.putString("is_pending_sign_in", String.valueOf(b()));
        bundle.putString("media_network_type", p());
        bundle.putString("media_state", e(k()));
        bundle.putString("p2p_mode", String.valueOf(u()));
        bundle.putString("participant_log_id", i());
        if (d != null)
        {
            bundle.putString("hangout_id", d);
        }
        bundle.putString("start_time_in_millis", String.valueOf(l));
    }

    public void a(gho gho1)
    {
        gbh.b(gho1.l());
        k.put(gho1.a(), gho1);
    }

    void a(ghs ghs1)
    {
        gbh.a(ghs1.l());
        e = ghs1;
        l = System.currentTimeMillis();
    }

    public void a(iod iod)
    {
        p = iod;
    }

    void a(String s1)
    {
        d = s1;
    }

    void a(boolean flag)
    {
        q = flag;
    }

    public gho b(String s1)
    {
        if (e != null && s1.equals(e.a()))
        {
            return e;
        } else
        {
            return c(s1);
        }
    }

    void b(int i1)
    {
        m = i1;
    }

    void b(gho gho1)
    {
        gbh.b(gho1);
        gbh.b(gho1, e);
        k.remove(gho1.a());
    }

    boolean b()
    {
        return h;
    }

    public gho c(String s1)
    {
        return (gho)k.get(s1);
    }

    void c()
    {
        h = false;
    }

    void c(int i1)
    {
        j = i1;
    }

    void d(int i1)
    {
        a(i1, null);
    }

    void d(String s1)
    {
        b = s1;
    }

    public boolean d()
    {
        return i != -1;
    }

    public boolean e()
    {
        return i == 4 || i == 6 || i == 14;
    }

    public boolean f()
    {
        return i == 14;
    }

    public String g()
    {
        return a;
    }

    public String h()
    {
        return b;
    }

    public String i()
    {
        return c.b();
    }

    gjl j()
    {
        return c;
    }

    int k()
    {
        return i;
    }

    public gck l()
    {
        return f;
    }

    public Collection m()
    {
        return Collections.unmodifiableCollection(k.values());
    }

    public ghs n()
    {
        return e;
    }

    int o()
    {
        return m;
    }

    public String p()
    {
        switch (m)
        {
        default:
            return "unk";

        case 0: // '\0'
            return "mobile";

        case 1: // '\001'
            return "wifi";

        case 2: // '\002'
            return "mms";

        case 3: // '\003'
            return "supl";

        case 4: // '\004'
            return "dun";

        case 5: // '\005'
            return "hipri";

        case 6: // '\006'
            return "wimax";

        case 7: // '\007'
            return "bt";

        case 8: // '\b'
            return "dummy";

        case 9: // '\t'
            return "eth";
        }
    }

    public int q()
    {
        gbh.b(Integer.valueOf(n), Integer.valueOf(0));
        return n;
    }

    public String r()
    {
        gbh.b(Integer.valueOf(n), Integer.valueOf(0));
        return o;
    }

    public boolean s()
    {
        return c.u();
    }

    public int t()
    {
        return gck.d(n);
    }

    public boolean u()
    {
        return q;
    }
}
