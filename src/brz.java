// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class brz extends dgp
    implements dlf
{

    private static final boolean a = false;
    private final bpd b;
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final Map f = new HashMap();
    private final ArrayList g = new ArrayList();
    private final Map h = new HashMap();
    private final Map i = new HashMap();
    private final ArrayList j = new ArrayList();
    private final ceu k;

    brz(bpd bpd1, ceu ceu1)
    {
        b = bpd1;
        k = ceu1;
        a(k);
    }

    private void a(int l)
    {
        String s1 = (String)h.remove(Integer.valueOf(l));
        i.remove(s1);
        if (a)
        {
            String s;
            if (h.isEmpty())
            {
                s = ", list empty, stop listening";
            } else
            {
                s = "";
            }
            ebw.a("PSTN_META", (new StringBuilder(String.valueOf(s1).length() + 39 + String.valueOf(s).length())).append("removed request, id=").append(l).append(" for ph=").append(s1).append(s).toString());
        }
        if (h.isEmpty())
        {
            RealTimeChatService.b(this);
        }
    }

    private void a(ceu ceu1)
    {
        if (ceu1 != null && ceu1.a == cfa.d && !TextUtils.isEmpty(ceu1.c))
        {
            if (!ceu1.t)
            {
                amy amy1 = dlb.a(ceu1.c, false, b.l(), this);
                if (amy1 != null)
                {
                    c.put(ceu1, amy1);
                    d.put(amy1, ceu1);
                    if (a)
                    {
                        ceu1 = String.valueOf(ceu1.c);
                        if (ceu1.length() != 0)
                        {
                            ceu1 = "sending participant request for ph=".concat(ceu1);
                        } else
                        {
                            ceu1 = new String("sending participant request for ph=");
                        }
                        ebw.a("PSTN_META", ceu1);
                    }
                }
            } else
            {
                g.add(ceu1);
                if (a)
                {
                    ceu1 = String.valueOf(ceu1.c);
                    if (ceu1.length() != 0)
                    {
                        ceu1 = "participant is resolved, ph=".concat(ceu1);
                    } else
                    {
                        ceu1 = new String("participant is resolved, ph=");
                    }
                    ebw.a("PSTN_META", ceu1);
                    return;
                }
            }
        }
    }

    private void a(String s)
    {
        for (Iterator iterator = b.q().iterator(); iterator.hasNext(); ((boh)iterator.next()).d(s)) { }
    }

    private ceu c(gho gho1)
    {
        if (gho1 instanceof ghv)
        {
            ghv ghv1 = (ghv)gho1;
            for (Iterator iterator = c.keySet().iterator(); iterator.hasNext();)
            {
                ceu ceu1 = (ceu)iterator.next();
                if (g.g(ceu1.s, ghv1.x()))
                {
                    if (a)
                    {
                        gho1 = String.valueOf(gho1.c());
                        if (gho1.length() != 0)
                        {
                            gho1 = "found participant request for endpoint, name=".concat(gho1);
                        } else
                        {
                            gho1 = new String("found participant request for endpoint, name=");
                        }
                        ebw.a("PSTN_META", gho1);
                    }
                    return ceu1;
                }
            }

            if (a)
            {
                gho1 = String.valueOf(gho1.c());
                if (gho1.length() != 0)
                {
                    gho1 = "didn't find participant request for endpoint, name=".concat(gho1);
                } else
                {
                    gho1 = new String("didn't find participant request for endpoint, name=");
                }
                ebw.a("PSTN_META", gho1);
            }
        }
        return null;
    }

    private ceu d(gho gho1)
    {
        if (gho1 instanceof ghv)
        {
            ghv ghv1 = (ghv)gho1;
            for (Iterator iterator = g.iterator(); iterator.hasNext();)
            {
                ceu ceu1 = (ceu)iterator.next();
                if (g.g(ceu1.s, ghv1.x()))
                {
                    if (a)
                    {
                        gho1 = String.valueOf(gho1.c());
                        if (gho1.length() != 0)
                        {
                            gho1 = "found resolved participant for endpoint, name=".concat(gho1);
                        } else
                        {
                            gho1 = new String("found resolved participant for endpoint, name=");
                        }
                        ebw.a("PSTN_META", gho1);
                    }
                    return ceu1;
                }
            }

            if (a)
            {
                gho1 = String.valueOf(gho1.c());
                if (gho1.length() != 0)
                {
                    gho1 = "didn't find resolved participant for endpoint, name=".concat(gho1);
                } else
                {
                    gho1 = new String("didn't find resolved participant for endpoint, name=");
                }
                ebw.a("PSTN_META", gho1);
            }
        }
        return null;
    }

    private void f()
    {
        gbh.a();
        for (Iterator iterator = b.q().iterator(); iterator.hasNext(); ((boh)iterator.next()).f()) { }
    }

    public void a(int l, ani ani1, dgu dgu1)
    {
        boolean flag = true;
        gbh.a();
        if (a)
        {
            boolean flag1 = h.containsKey(Integer.valueOf(l));
            ebw.a("PSTN_META", (new StringBuilder(54)).append("received response for ").append(l).append(", was_requested=").append(flag1).toString());
        }
        if (h.containsKey(Integer.valueOf(l)))
        {
            String s = (String)h.get(Integer.valueOf(l));
            a(l);
            if (b != null && ani1.equals(b.l()))
            {
                ani1 = dgu1.c();
                gbh.a(ani1 instanceof cwe);
                dgu1 = (cwe)ani1;
                if (dgu1.n())
                {
                    ani1 = null;
                } else
                {
                    ani1 = dgu1.m();
                }
                if (dgu1.k() == 0)
                {
                    dgu1 = new bpk(s, ani1);
                } else
                {
                    if (dgu1.k() != 1)
                    {
                        flag = false;
                    }
                    dgu1 = new bpm(s, ani1, flag, dgu1.l());
                }
                j.add(dgu1);
                if (a)
                {
                    ebw.a("PSTN_META", (new StringBuilder(String.valueOf(s).length() + 29 + String.valueOf(ani1).length())).append("valid response for ph=").append(s).append(", rate=").append(ani1).toString());
                }
                f();
            }
        }
    }

    public void a(int l, ani ani1, dko dko, dbo dbo)
    {
        if (a)
        {
            if (h.containsKey(Integer.valueOf(l)))
            {
                ani1 = "";
            } else
            {
                ani1 = " not";
            }
            ebw.a("PSTN_META", (new StringBuilder(String.valueOf(ani1).length() + 52)).append("request failed, id=").append(l).append(", will").append(ani1).append(" remove request.").toString());
        }
        if (h.containsKey(Integer.valueOf(l)))
        {
            a(l);
        }
    }

    public void a(amy amy1)
    {
        if (a)
        {
            String s = String.valueOf(amy1.c());
            if (s.length() != 0)
            {
                s = "contact info failed for request=".concat(s);
            } else
            {
                s = new String("contact info failed for request=");
            }
            ebw.a("PSTN_META", s);
        }
        if (d.containsKey(amy1))
        {
            amy1 = (ceu)d.remove(amy1);
            c.remove(amy1);
            if (a)
            {
                amy1 = String.valueOf(((ceu) (amy1)).e);
                if (amy1.length() != 0)
                {
                    amy1 = "removed waiting entity, name=".concat(amy1);
                } else
                {
                    amy1 = new String("removed waiting entity, name=");
                }
                ebw.a("PSTN_META", amy1);
            }
        } else
        if (f.containsKey(amy1))
        {
            amy1 = (gho)f.remove(amy1);
            e.remove(amy1);
            if (a)
            {
                amy1 = String.valueOf(amy1.c());
                if (amy1.length() != 0)
                {
                    amy1 = "removed waiting endpoint, name=".concat(amy1);
                } else
                {
                    amy1 = new String("removed waiting endpoint, name=");
                }
                ebw.a("PSTN_META", amy1);
                return;
            }
        }
    }

    void a(gho gho1)
    {
        ceu ceu1 = c(gho1);
        if (ceu1 != null)
        {
            if (a)
            {
                Object obj = String.valueOf(gho1.c());
                if (((String) (obj)).length() != 0)
                {
                    obj = "Pending entity not null, moving participant request to endpoint ep=".concat(((String) (obj)));
                } else
                {
                    obj = new String("Pending entity not null, moving participant request to endpoint ep=");
                }
                ebw.a("PSTN_META", ((String) (obj)));
            }
            obj = (amy)c.remove(ceu1);
            d.remove(obj);
            e.put(gho1, obj);
            f.put(obj, gho1);
        } else
        {
            ceu ceu2 = d(gho1);
            if (a)
            {
                String s1 = String.valueOf(gho1.c());
                String s;
                if (ceu2 == null)
                {
                    s = " and no resolved request";
                } else
                {
                    s = " now attaching data";
                }
                ebw.a("PSTN_META", (new StringBuilder(String.valueOf(s1).length() + 26 + String.valueOf(s).length())).append("no pending request for ep=").append(s1).append(s).toString());
            }
            if (ceu2 != null)
            {
                gbh.a(ceu2.g());
                gho1.a(new bry(ceu2.e, ceu2.c, ceu2.h, ceu2.w));
                a(ceu2.s);
                return;
            }
        }
    }

    public void a(String s, String s1, int l, aqw aqw1, ani ani1)
    {
        if (a)
        {
            ani1 = String.valueOf(s);
            if (ani1.length() != 0)
            {
                ani1 = "set PSTN contact info for name=".concat(ani1);
            } else
            {
                ani1 = new String("set PSTN contact info for name=");
            }
            ebw.a("PSTN_META", ani1);
        }
        if (d.containsKey(aqw1))
        {
            aqw1 = (ceu)d.remove(aqw1);
            c.remove(aqw1);
            aqw1.e = s;
            aqw1.h = s1;
            aqw1.t = true;
            aqw1.w = l;
            if (a)
            {
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    s = "resolved participant, but no endpoint yet. name=".concat(s);
                } else
                {
                    s = new String("resolved participant, but no endpoint yet. name=");
                }
                ebw.a("PSTN_META", s);
            }
            g.add(aqw1);
            a(((ceu) (aqw1)).s);
        } else
        if (f.containsKey(aqw1))
        {
            ghv ghv1 = (ghv)f.remove(aqw1);
            e.remove(ghv1);
            ani1 = aqw1.e();
            aqw1 = ani1;
            if (k != null)
            {
                aqw1 = ani1;
                if (g.g(k.s, ghv1.x()))
                {
                    aqw1 = k.f();
                }
            }
            if (a)
            {
                ani1 = String.valueOf(ghv1.c());
                ebw.a("PSTN_META", (new StringBuilder(String.valueOf(s).length() + 51 + String.valueOf(ani1).length() + String.valueOf(aqw1).length())).append("resolved participant, has endpoint. name=").append(s).append(", ep=").append(ani1).append(", ph=").append(aqw1).toString());
            }
            ghv1.a(new bry(s, aqw1, s1, l));
            a(ghv1.x());
            return;
        }
    }

    public void a(String s, String s1, amy amy1, String s2, ani ani1)
    {
        ebw.g("PSTN_META", "didn't request non-PSTN contact info!");
    }

    void a(List list)
    {
        gbh.a();
        ani ani1 = b.l();
        if (ani1 == null)
        {
            ebw.g("PSTN_META", "Unexpected null account in handleOutgoingInvite");
        } else
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                Object obj = (ceu)list.next();
                if (obj != null && ((ceu) (obj)).a == cfa.d && !TextUtils.isEmpty(((ceu) (obj)).c))
                {
                    a(((ceu) (obj)));
                    obj = ebz.g(((ceu) (obj)).c);
                    if (obj != null)
                    {
                        RealTimeChatService.a(this);
                        int l = RealTimeChatService.c(ani1.h(), ((String) (obj)));
                        h.put(Integer.valueOf(l), obj);
                        i.put(obj, Integer.valueOf(l));
                        if (a)
                        {
                            ebw.a("PSTN_META", (new StringBuilder(String.valueOf(obj).length() + 43)).append("requesting rate for ").append(((String) (obj))).append(" request id=").append(l).toString());
                        }
                    }
                }
            }
        }
    }

    void b(gho gho1)
    {
        Object obj;
        Object obj1;
        gbh.a();
        obj1 = null;
        obj = null;
        if (!e.containsKey(gho1)) goto _L2; else goto _L1
_L1:
        obj1 = (amy)e.get(gho1);
        dac dac1 = ((amy) (obj1)).d();
        if (dac1 != null)
        {
            obj = dac1.d;
        }
        if (a)
        {
            String s1 = ((amy) (obj1)).c();
            ebw.a("PSTN_META", (new StringBuilder(String.valueOf(s1).length() + 43 + String.valueOf(obj).length())).append("Endpoint exits, cancelling request id=").append(s1).append(", ph=").append(((String) (obj))).toString());
        }
        ((amy) (obj1)).b();
        e.remove(gho1);
        f.remove(obj1);
        gho1 = ((gho) (obj));
_L12:
        if (gho1 == null) goto _L4; else goto _L3
_L3:
        obj1 = ebz.g(gho1);
        if (!i.containsKey(obj1)) goto _L6; else goto _L5
_L5:
        obj = (Integer)i.remove(obj1);
        if (a)
        {
            obj1 = String.valueOf(obj);
            ebw.a("PSTN_META", (new StringBuilder(String.valueOf(obj1).length() + 62 + String.valueOf(gho1).length())).append("Endpoint exits, removing pending rate request, requestId=").append(((String) (obj1))).append(", ph=").append(gho1).toString());
        }
        h.remove(obj);
        if (h.isEmpty())
        {
            RealTimeChatService.b(this);
            if (a)
            {
                ebw.a("PSTN_META", "Endpoint exits, no more rate requests");
            }
        }
_L4:
        return;
_L2:
        obj = c(gho1);
        if (obj != null)
        {
            gho1 = ((ceu) (obj)).c;
            obj = (amy)c.remove(obj);
            if (a)
            {
                obj1 = String.valueOf("Endpoint exits, has pending participant, cancelling request id=");
                String s2 = ((amy) (obj)).c();
                ebw.a("PSTN_META", (new StringBuilder(String.valueOf(obj1).length() + 5 + String.valueOf(s2).length() + String.valueOf(gho1).length())).append(((String) (obj1))).append(s2).append(", ph=").append(gho1).toString());
            }
            d.remove(obj);
            ((amy) (obj)).b();
        } else
        {
            ceu ceu1 = d(gho1);
            gho1 = ((gho) (obj1));
            if (ceu1 != null)
            {
                obj = ceu1.c;
                g.remove(ceu1);
                gho1 = ((gho) (obj));
                if (a)
                {
                    gho1 = String.valueOf("Endpoint exits, removing resolved participant, ph=");
                    obj1 = String.valueOf(obj);
                    if (((String) (obj1)).length() != 0)
                    {
                        gho1 = gho1.concat(((String) (obj1)));
                    } else
                    {
                        gho1 = new String(gho1);
                    }
                    ebw.a("PSTN_META", gho1);
                    gho1 = ((gho) (obj));
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (obj1 == null) goto _L4; else goto _L7
_L7:
        Iterator iterator = j.iterator();
_L10:
        if (!iterator.hasNext()) goto _L4; else goto _L8
_L8:
        obj = (bpk)iterator.next();
        if (!((String) (obj1)).equals(((bpk) (obj)).a())) goto _L10; else goto _L9
_L9:
        if (a)
        {
            String s = String.valueOf("Endpoint exits, removing resolved rate request, ph=");
            gho1 = String.valueOf(gho1);
            if (gho1.length() != 0)
            {
                gho1 = s.concat(gho1);
            } else
            {
                gho1 = new String(s);
            }
            ebw.a("PSTN_META", gho1);
        }
        j.remove(obj);
        f();
        return;
        if (true) goto _L12; else goto _L11
_L11:
    }

    void d()
    {
        if (a)
        {
            int l = c.size();
            int i1 = e.size();
            int j1 = g.size();
            int k1 = h.size();
            int l1 = j.size();
            ebw.a("PSTN_META", (new StringBuilder(148)).append("Hangout ended, sizes for pending reqPart=").append(l).append(", pending reqEP=").append(i1).append(", resolvedPart=").append(j1).append(", rateReq=").append(k1).append(", callinfo=").append(l1).toString());
        }
        for (Iterator iterator = c.values().iterator(); iterator.hasNext(); ((amy)iterator.next()).b()) { }
        for (Iterator iterator1 = e.values().iterator(); iterator1.hasNext(); ((amy)iterator1.next()).b()) { }
        c.clear();
        d.clear();
        e.clear();
        f.clear();
        g.clear();
        h.clear();
        i.clear();
        j.clear();
        f();
        RealTimeChatService.b(this);
    }

    List e()
    {
        gbh.a();
        return j;
    }

    static 
    {
        hik hik = ebw.m;
    }
}
