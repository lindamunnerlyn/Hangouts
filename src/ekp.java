// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public final class ekp
    implements elo
{

    final ele a;
    final Lock b;
    final Context c;
    fsl d;
    boolean e;
    boolean f;
    emq g;
    boolean h;
    boolean i;
    private final ejk j;
    private ConnectionResult k;
    private int l;
    private int m;
    private boolean n;
    private int o;
    private final Bundle p = new Bundle();
    private final Set q = new HashSet();
    private int r;
    private final emo s;
    private final Map t;
    private final ejt u;
    private ArrayList v;

    public ekp(ele ele1, emo emo1, Map map, ejk ejk1, ejt ejt1, Lock lock, Context context)
    {
        m = 0;
        n = false;
        v = new ArrayList();
        a = ele1;
        s = emo1;
        t = map;
        j = ejk1;
        u = ejt1;
        b = lock;
        c = context;
    }

    private void a(boolean flag)
    {
        if (d != null)
        {
            if (d.d() && flag)
            {
                d.o();
            }
            d.c();
            g = null;
        }
    }

    private static String c(int i1)
    {
        switch (i1)
        {
        default:
            return "UNKNOWN";

        case 0: // '\0'
            return "STEP_GETTING_SERVICE_BINDINGS";

        case 1: // '\001'
            return "STEP_VALIDATING_ACCOUNT";

        case 2: // '\002'
            return "STEP_AUTHENTICATING";

        case 3: // '\003'
            return "STEP_GETTING_REMOTE_SERVICE";
        }
    }

    private void k()
    {
        a.j();
        elp.a().execute(new ekq(this));
        if (d != null)
        {
            if (h)
            {
                d.a(g, i);
            }
            a(false);
        }
        ejw ejw1;
        for (Iterator iterator = a.f.keySet().iterator(); iterator.hasNext(); ((ejv)a.e.get(ejw1)).c())
        {
            ejw1 = (ejw)iterator.next();
        }

        if (n)
        {
            n = false;
            b();
            return;
        }
        Bundle bundle;
        if (p.isEmpty())
        {
            bundle = null;
        } else
        {
            bundle = p;
        }
        a.b.a(bundle);
    }

    private void l()
    {
        for (Iterator iterator = v.iterator(); iterator.hasNext(); ((Future)iterator.next()).cancel(true)) { }
        v.clear();
    }

    public ekl a(ekl ekl)
    {
        a.c.add(ekl);
        return ekl;
    }

    public void a()
    {
        a.b.b();
        a.f.clear();
        n = false;
        e = false;
        k = null;
        m = 0;
        r = 2;
        f = false;
        h = false;
        HashMap hashmap = new HashMap();
        ejs ejs1;
        ejv ejv1;
        int i1;
        for (Iterator iterator = t.keySet().iterator(); iterator.hasNext(); hashmap.put(ejv1, new ekw(this, ejs1, i1)))
        {
            ejs1 = (ejs)iterator.next();
            ejv1 = (ejv)a.e.get(ejs1.c());
            i1 = ((Integer)t.get(ejs1)).intValue();
            ejs1.a();
            if (!ejv1.e())
            {
                continue;
            }
            e = true;
            if (i1 < r)
            {
                r = i1;
            }
            if (i1 != 0)
            {
                q.add(ejs1.c());
            }
        }

        if (e)
        {
            s.a(Integer.valueOf(a.n()));
            ela ela1 = new ela(this);
            d = (fsl)u.a(c, a.a(), s, s.h(), ela1, ela1);
        }
        o = a.e.size();
        v.add(elp.a().submit(new ekx(this, hashmap)));
    }

    public void a(int i1)
    {
        b(new ConnectionResult(8, null));
    }

    public void a(Bundle bundle)
    {
        if (b(3))
        {
            if (bundle != null)
            {
                p.putAll(bundle);
            }
            if (e())
            {
                k();
                return;
            }
        }
    }

    public void a(ConnectionResult connectionresult, ejs ejs1, int i1)
    {
        if (b(3))
        {
            b(connectionresult, ejs1, i1);
            if (e())
            {
                k();
                return;
            }
        }
    }

    boolean a(ConnectionResult connectionresult)
    {
        return r == 2 || r == 1 && !connectionresult.a();
    }

    public void b()
    {
        for (Iterator iterator = a.c.iterator(); iterator.hasNext(); iterator.remove())
        {
            ((eln)iterator.next()).b();
        }

        a.g();
        if (k == null && !a.c.isEmpty())
        {
            n = true;
            return;
        } else
        {
            l();
            a(true);
            a.f.clear();
            a.a(null);
            a.b.a();
            return;
        }
    }

    void b(ConnectionResult connectionresult)
    {
        boolean flag = false;
        n = false;
        l();
        if (!connectionresult.a())
        {
            flag = true;
        }
        a(flag);
        a.f.clear();
        a.a(connectionresult);
        if (!a.k() || !ejk.a(c, connectionresult.c()))
        {
            a.m();
            a.b.a(connectionresult);
        }
        a.b.a();
    }

    void b(ConnectionResult connectionresult, ejs ejs1, int i1)
    {
        boolean flag = true;
        if (i1 == 2) goto _L2; else goto _L1
_L1:
        ejs1.a();
        if (i1 != 1) goto _L4; else goto _L3
_L3:
        if (connectionresult.a())
        {
            i1 = 1;
        } else
        if (ejk.a(connectionresult.c()) != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L5; else goto _L4
_L4:
        i1 = ((flag) ? 1 : 0);
        if (k == null) goto _L7; else goto _L6
_L6:
        if (0x7fffffff >= l) goto _L5; else goto _L8
_L8:
        i1 = ((flag) ? 1 : 0);
_L7:
        if (i1 != 0)
        {
            k = connectionresult;
            l = 0x7fffffff;
        }
_L2:
        a.f.put(ejs1.c(), connectionresult);
        return;
_L5:
        i1 = 0;
        if (true) goto _L7; else goto _L9
_L9:
    }

    boolean b(int i1)
    {
        if (m != i1)
        {
            Log.wtf("GoogleApiClientConnecting", (new StringBuilder("GoogleApiClient connecting is in step ")).append(c(m)).append(" but received callback for step ").append(c(i1)).toString());
            b(new ConnectionResult(8, null));
            return false;
        } else
        {
            return true;
        }
    }

    public void c()
    {
        n = false;
    }

    public String d()
    {
        return "CONNECTING";
    }

    boolean e()
    {
        o = o - 1;
        if (o > 0)
        {
            return false;
        }
        if (o < 0)
        {
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.");
            b(new ConnectionResult(8, null));
            return false;
        }
        if (k != null)
        {
            b(k);
            return false;
        } else
        {
            return true;
        }
    }

    void f()
    {
        if (o == 0)
        {
            if (e)
            {
                if (f)
                {
                    ArrayList arraylist = new ArrayList();
                    m = 1;
                    o = a.e.size();
                    Iterator iterator = a.e.keySet().iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        ejw ejw1 = (ejw)iterator.next();
                        if (a.f.containsKey(ejw1))
                        {
                            if (e())
                            {
                                g();
                            }
                        } else
                        {
                            arraylist.add(a.e.get(ejw1));
                        }
                    } while (true);
                    if (!arraylist.isEmpty())
                    {
                        v.add(elp.a().submit(new elb(this, arraylist)));
                        return;
                    }
                }
            } else
            {
                h();
                return;
            }
        }
    }

    void g()
    {
        m = 2;
        a.g = j();
        v.add(elp.a().submit(new ekv(this)));
    }

    void h()
    {
        ArrayList arraylist = new ArrayList();
        m = 3;
        o = a.e.size();
        Iterator iterator = a.e.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ejw ejw1 = (ejw)iterator.next();
            if (a.f.containsKey(ejw1))
            {
                if (e())
                {
                    k();
                }
            } else
            {
                arraylist.add(a.e.get(ejw1));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            v.add(elp.a().submit(new ekz(this, arraylist)));
        }
    }

    void i()
    {
        e = false;
        a.g = Collections.emptySet();
        Iterator iterator = q.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ejw ejw1 = (ejw)iterator.next();
            if (!a.f.containsKey(ejw1))
            {
                a.f.put(ejw1, new ConnectionResult(17, null));
            }
        } while (true);
    }

    Set j()
    {
        HashSet hashset = new HashSet(s.c());
        Map map = s.e();
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ejs ejs1 = (ejs)iterator.next();
            if (!a.f.containsKey(ejs1.c()))
            {
                hashset.addAll(((emp)map.get(ejs1)).a);
            }
        } while (true);
        return hashset;
    }
}
