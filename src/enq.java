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

public final class enq
    implements eop
{

    final eof a;
    final Lock b;
    final Context c;
    fus d;
    boolean e;
    boolean f;
    epq g;
    boolean h;
    boolean i;
    private final eml j;
    private ConnectionResult k;
    private int l;
    private int m;
    private boolean n;
    private int o;
    private final Bundle p = new Bundle();
    private final Set q = new HashSet();
    private int r;
    private final epo s;
    private final Map t;
    private final emu u;
    private ArrayList v;

    public enq(eof eof1, epo epo1, Map map, eml eml1, emu emu1, Lock lock, Context context)
    {
        m = 0;
        n = false;
        v = new ArrayList();
        a = eof1;
        s = epo1;
        t = map;
        j = eml1;
        u = emu1;
        b = lock;
        c = context;
    }

    private void a(boolean flag)
    {
        if (d != null)
        {
            if (d.d() && flag)
            {
                d.n();
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
        eoq.a().execute(new enr(this));
        if (d != null)
        {
            if (h)
            {
                d.a(g, i);
            }
            a(false);
        }
        emx emx1;
        for (Iterator iterator = a.f.keySet().iterator(); iterator.hasNext(); ((emw)a.e.get(emx1)).c())
        {
            emx1 = (emx)iterator.next();
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

    public enm a(enm enm)
    {
        a.c.add(enm);
        return enm;
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
        emt emt1;
        emw emw1;
        int i1;
        for (Iterator iterator = t.keySet().iterator(); iterator.hasNext(); hashmap.put(emw1, new enx(this, emt1, i1)))
        {
            emt1 = (emt)iterator.next();
            emw1 = (emw)a.e.get(emt1.c());
            i1 = ((Integer)t.get(emt1)).intValue();
            emt1.a();
            if (!emw1.e())
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
                q.add(emt1.c());
            }
        }

        if (e)
        {
            s.a(Integer.valueOf(a.n()));
            eob eob1 = new eob(this);
            d = (fus)u.a(c, a.a(), s, s.h(), eob1, eob1);
        }
        o = a.e.size();
        v.add(eoq.a().submit(new eny(this, hashmap)));
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

    public void a(ConnectionResult connectionresult, emt emt1, int i1)
    {
        if (b(3))
        {
            b(connectionresult, emt1, i1);
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
            ((eoo)iterator.next()).c();
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
        if (!a.k() || !eml.a(c, connectionresult.c()))
        {
            a.m();
            a.b.a(connectionresult);
        }
        a.b.a();
    }

    void b(ConnectionResult connectionresult, emt emt1, int i1)
    {
        boolean flag = true;
        if (i1 == 2) goto _L2; else goto _L1
_L1:
        emt1.a();
        if (i1 != 1) goto _L4; else goto _L3
_L3:
        if (connectionresult.a())
        {
            i1 = 1;
        } else
        if (eml.a(connectionresult.c()) != null)
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
        a.f.put(emt1.c(), connectionresult);
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
                        emx emx1 = (emx)iterator.next();
                        if (a.f.containsKey(emx1))
                        {
                            if (e())
                            {
                                g();
                            }
                        } else
                        {
                            arraylist.add(a.e.get(emx1));
                        }
                    } while (true);
                    if (!arraylist.isEmpty())
                    {
                        v.add(eoq.a().submit(new eoc(this, arraylist)));
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
        v.add(eoq.a().submit(new enw(this)));
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
            emx emx1 = (emx)iterator.next();
            if (a.f.containsKey(emx1))
            {
                if (e())
                {
                    k();
                }
            } else
            {
                arraylist.add(a.e.get(emx1));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            v.add(eoq.a().submit(new eoa(this, arraylist)));
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
            emx emx1 = (emx)iterator.next();
            if (!a.f.containsKey(emx1))
            {
                a.f.put(emx1, new ConnectionResult(17, null));
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
            emt emt1 = (emt)iterator.next();
            if (!a.f.containsKey(emt1.c()))
            {
                hashset.addAll(((epp)map.get(emt1)).a);
            }
        } while (true);
        return hashset;
    }
}
