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

final class bsi extends dhy
    implements doc
{

    private static final boolean a = false;
    private final bpm b;
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final Map f = new HashMap();
    private final ArrayList g = new ArrayList();
    private final Map h = new HashMap();
    private final Map i = new HashMap();
    private final ArrayList j = new ArrayList();
    private final cfz k;

    bsi(bpm bpm1, cfz cfz1)
    {
        b = bpm1;
        k = cfz1;
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
            eev.a("PSTN_META", (new StringBuilder(String.valueOf(s1).length() + 39 + String.valueOf(s).length())).append("removed request, id=").append(l).append(" for ph=").append(s1).append(s).toString());
        }
        if (h.isEmpty())
        {
            RealTimeChatService.b(this);
        }
    }

    private void a(cfz cfz1)
    {
        if (cfz1 != null && cfz1.a == cgf.d && !TextUtils.isEmpty(cfz1.c))
        {
            if (!cfz1.t)
            {
                anq anq1 = dny.a(cfz1.c, false, b.k(), this);
                if (anq1 != null)
                {
                    c.put(cfz1, anq1);
                    d.put(anq1, cfz1);
                    if (a)
                    {
                        cfz1 = String.valueOf(cfz1.c);
                        if (cfz1.length() != 0)
                        {
                            cfz1 = "sending participant request for ph=".concat(cfz1);
                        } else
                        {
                            cfz1 = new String("sending participant request for ph=");
                        }
                        eev.a("PSTN_META", cfz1);
                    }
                }
            } else
            {
                g.add(cfz1);
                if (a)
                {
                    cfz1 = String.valueOf(cfz1.c);
                    if (cfz1.length() != 0)
                    {
                        cfz1 = "participant is resolved, ph=".concat(cfz1);
                    } else
                    {
                        cfz1 = new String("participant is resolved, ph=");
                    }
                    eev.a("PSTN_META", cfz1);
                    return;
                }
            }
        }
    }

    private void a(String s)
    {
        for (Iterator iterator = b.p().iterator(); iterator.hasNext(); ((boq)iterator.next()).d(s)) { }
    }

    private cfz c(gkq gkq1)
    {
        if (gkq1 instanceof gkx)
        {
            gkx gkx1 = (gkx)gkq1;
            for (Iterator iterator = c.keySet().iterator(); iterator.hasNext();)
            {
                cfz cfz1 = (cfz)iterator.next();
                if (g.g(cfz1.s, gkx1.w()))
                {
                    if (a)
                    {
                        gkq1 = String.valueOf(gkq1.b());
                        if (gkq1.length() != 0)
                        {
                            gkq1 = "found participant request for endpoint, name=".concat(gkq1);
                        } else
                        {
                            gkq1 = new String("found participant request for endpoint, name=");
                        }
                        eev.a("PSTN_META", gkq1);
                    }
                    return cfz1;
                }
            }

            if (a)
            {
                gkq1 = String.valueOf(gkq1.b());
                if (gkq1.length() != 0)
                {
                    gkq1 = "didn't find participant request for endpoint, name=".concat(gkq1);
                } else
                {
                    gkq1 = new String("didn't find participant request for endpoint, name=");
                }
                eev.a("PSTN_META", gkq1);
            }
        }
        return null;
    }

    private cfz d(gkq gkq1)
    {
        if (gkq1 instanceof gkx)
        {
            gkx gkx1 = (gkx)gkq1;
            for (Iterator iterator = g.iterator(); iterator.hasNext();)
            {
                cfz cfz1 = (cfz)iterator.next();
                if (g.g(cfz1.s, gkx1.w()))
                {
                    if (a)
                    {
                        gkq1 = String.valueOf(gkq1.b());
                        if (gkq1.length() != 0)
                        {
                            gkq1 = "found resolved participant for endpoint, name=".concat(gkq1);
                        } else
                        {
                            gkq1 = new String("found resolved participant for endpoint, name=");
                        }
                        eev.a("PSTN_META", gkq1);
                    }
                    return cfz1;
                }
            }

            if (a)
            {
                gkq1 = String.valueOf(gkq1.b());
                if (gkq1.length() != 0)
                {
                    gkq1 = "didn't find resolved participant for endpoint, name=".concat(gkq1);
                } else
                {
                    gkq1 = new String("didn't find resolved participant for endpoint, name=");
                }
                eev.a("PSTN_META", gkq1);
            }
        }
        return null;
    }

    private void f()
    {
        gdv.a();
        for (Iterator iterator = b.p().iterator(); iterator.hasNext(); ((boq)iterator.next()).f()) { }
    }

    public void a(int l, aoa aoa1, did did1)
    {
        boolean flag = true;
        gdv.a();
        if (a)
        {
            boolean flag1 = h.containsKey(Integer.valueOf(l));
            eev.a("PSTN_META", (new StringBuilder(54)).append("received response for ").append(l).append(", was_requested=").append(flag1).toString());
        }
        if (h.containsKey(Integer.valueOf(l)))
        {
            String s = (String)h.get(Integer.valueOf(l));
            a(l);
            if (b != null && aoa1.equals(b.k()))
            {
                aoa1 = did1.c();
                gdv.a("Expected condition to be true", aoa1 instanceof cyi);
                did1 = (cyi)aoa1;
                if (did1.n())
                {
                    aoa1 = null;
                } else
                {
                    aoa1 = did1.m();
                }
                if (did1.k() == 0)
                {
                    did1 = new bpt(s, aoa1);
                } else
                {
                    if (did1.k() != 1)
                    {
                        flag = false;
                    }
                    did1 = new bpv(s, aoa1, flag, did1.l());
                }
                j.add(did1);
                if (a)
                {
                    eev.a("PSTN_META", (new StringBuilder(String.valueOf(s).length() + 29 + String.valueOf(aoa1).length())).append("valid response for ph=").append(s).append(", rate=").append(aoa1).toString());
                }
                f();
            }
        }
    }

    public void a(int l, aoa aoa1, dmf dmf, dcx dcx)
    {
        if (a)
        {
            if (h.containsKey(Integer.valueOf(l)))
            {
                aoa1 = "";
            } else
            {
                aoa1 = " not";
            }
            eev.a("PSTN_META", (new StringBuilder(String.valueOf(aoa1).length() + 52)).append("request failed, id=").append(l).append(", will").append(aoa1).append(" remove request.").toString());
        }
        if (h.containsKey(Integer.valueOf(l)))
        {
            a(l);
        }
    }

    public void a(anq anq1)
    {
        if (a)
        {
            String s = String.valueOf(anq1.c());
            if (s.length() != 0)
            {
                s = "contact info failed for request=".concat(s);
            } else
            {
                s = new String("contact info failed for request=");
            }
            eev.a("PSTN_META", s);
        }
        if (d.containsKey(anq1))
        {
            anq1 = (cfz)d.remove(anq1);
            c.remove(anq1);
            if (a)
            {
                anq1 = String.valueOf(((cfz) (anq1)).e);
                if (anq1.length() != 0)
                {
                    anq1 = "removed waiting entity, name=".concat(anq1);
                } else
                {
                    anq1 = new String("removed waiting entity, name=");
                }
                eev.a("PSTN_META", anq1);
            }
        } else
        if (f.containsKey(anq1))
        {
            anq1 = (gkq)f.remove(anq1);
            e.remove(anq1);
            if (a)
            {
                anq1 = String.valueOf(anq1.b());
                if (anq1.length() != 0)
                {
                    anq1 = "removed waiting endpoint, name=".concat(anq1);
                } else
                {
                    anq1 = new String("removed waiting endpoint, name=");
                }
                eev.a("PSTN_META", anq1);
                return;
            }
        }
    }

    void a(gkq gkq1)
    {
        cfz cfz1 = c(gkq1);
        if (cfz1 != null)
        {
            if (a)
            {
                Object obj = String.valueOf(gkq1.b());
                if (((String) (obj)).length() != 0)
                {
                    obj = "Pending entity not null, moving participant request to endpoint ep=".concat(((String) (obj)));
                } else
                {
                    obj = new String("Pending entity not null, moving participant request to endpoint ep=");
                }
                eev.a("PSTN_META", ((String) (obj)));
            }
            obj = (anq)c.remove(cfz1);
            d.remove(obj);
            e.put(gkq1, obj);
            f.put(obj, gkq1);
        } else
        {
            cfz cfz2 = d(gkq1);
            if (a)
            {
                String s1 = String.valueOf(gkq1.b());
                String s;
                if (cfz2 == null)
                {
                    s = " and no resolved request";
                } else
                {
                    s = " now attaching data";
                }
                eev.a("PSTN_META", (new StringBuilder(String.valueOf(s1).length() + 26 + String.valueOf(s).length())).append("no pending request for ep=").append(s1).append(s).toString());
            }
            if (cfz2 != null)
            {
                gdv.a("Expected condition to be true", cfz2.g());
                gkq1.a(new bsh(cfz2.e, cfz2.c, cfz2.h, cfz2.w));
                a(cfz2.s);
                return;
            }
        }
    }

    public void a(String s, String s1, int l, arn arn1, aoa aoa1)
    {
        if (a)
        {
            aoa1 = String.valueOf(s);
            if (aoa1.length() != 0)
            {
                aoa1 = "set PSTN contact info for name=".concat(aoa1);
            } else
            {
                aoa1 = new String("set PSTN contact info for name=");
            }
            eev.a("PSTN_META", aoa1);
        }
        if (d.containsKey(arn1))
        {
            arn1 = (cfz)d.remove(arn1);
            c.remove(arn1);
            arn1.e = s;
            arn1.h = s1;
            arn1.t = true;
            arn1.w = l;
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
                eev.a("PSTN_META", s);
            }
            g.add(arn1);
            a(((cfz) (arn1)).s);
        } else
        if (f.containsKey(arn1))
        {
            gkx gkx1 = (gkx)f.remove(arn1);
            e.remove(gkx1);
            aoa1 = arn1.e();
            arn1 = aoa1;
            if (k != null)
            {
                arn1 = aoa1;
                if (g.g(k.s, gkx1.w()))
                {
                    arn1 = k.f();
                }
            }
            if (a)
            {
                aoa1 = String.valueOf(gkx1.b());
                eev.a("PSTN_META", (new StringBuilder(String.valueOf(s).length() + 51 + String.valueOf(aoa1).length() + String.valueOf(arn1).length())).append("resolved participant, has endpoint. name=").append(s).append(", ep=").append(aoa1).append(", ph=").append(arn1).toString());
            }
            gkx1.a(new bsh(s, arn1, s1, l));
            a(gkx1.w());
            return;
        }
    }

    public void a(String s, String s1, anq anq1, String s2, aoa aoa1)
    {
        eev.g("PSTN_META", "didn't request non-PSTN contact info!");
    }

    void a(List list)
    {
        gdv.a();
        aoa aoa1 = b.k();
        if (aoa1 == null)
        {
            eev.g("PSTN_META", "Unexpected null account in handleOutgoingInvite");
        } else
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                Object obj = (cfz)list.next();
                if (obj != null && ((cfz) (obj)).a == cgf.d && !TextUtils.isEmpty(((cfz) (obj)).c))
                {
                    a(((cfz) (obj)));
                    obj = eey.g(((cfz) (obj)).c);
                    if (obj != null)
                    {
                        RealTimeChatService.a(this);
                        int l = RealTimeChatService.c(aoa1.h(), ((String) (obj)));
                        h.put(Integer.valueOf(l), obj);
                        i.put(obj, Integer.valueOf(l));
                        if (a)
                        {
                            eev.a("PSTN_META", (new StringBuilder(String.valueOf(obj).length() + 43)).append("requesting rate for ").append(((String) (obj))).append(" request id=").append(l).toString());
                        }
                    }
                }
            }
        }
    }

    void b(gkq gkq1)
    {
        Object obj;
        Object obj1;
        gdv.a();
        obj1 = null;
        obj = null;
        if (!e.containsKey(gkq1)) goto _L2; else goto _L1
_L1:
        obj1 = (anq)e.get(gkq1);
        dbi dbi1 = ((anq) (obj1)).d();
        if (dbi1 != null)
        {
            obj = dbi1.d;
        }
        if (a)
        {
            String s1 = String.valueOf(((anq) (obj1)).c());
            eev.a("PSTN_META", (new StringBuilder(String.valueOf(s1).length() + 43 + String.valueOf(obj).length())).append("Endpoint exits, cancelling request id=").append(s1).append(", ph=").append(((String) (obj))).toString());
        }
        ((anq) (obj1)).b();
        e.remove(gkq1);
        f.remove(obj1);
        gkq1 = ((gkq) (obj));
_L12:
        if (gkq1 == null) goto _L4; else goto _L3
_L3:
        obj1 = eey.g(gkq1);
        if (!i.containsKey(obj1)) goto _L6; else goto _L5
_L5:
        obj = (Integer)i.remove(obj1);
        if (a)
        {
            obj1 = String.valueOf(obj);
            eev.a("PSTN_META", (new StringBuilder(String.valueOf(obj1).length() + 62 + String.valueOf(gkq1).length())).append("Endpoint exits, removing pending rate request, requestId=").append(((String) (obj1))).append(", ph=").append(gkq1).toString());
        }
        h.remove(obj);
        if (h.isEmpty())
        {
            RealTimeChatService.b(this);
            if (a)
            {
                eev.a("PSTN_META", "Endpoint exits, no more rate requests");
            }
        }
_L4:
        return;
_L2:
        obj = c(gkq1);
        if (obj != null)
        {
            gkq1 = ((cfz) (obj)).c;
            obj = (anq)c.remove(obj);
            if (a)
            {
                obj1 = String.valueOf("Endpoint exits, has pending participant, cancelling request id=");
                String s2 = String.valueOf(((anq) (obj)).c());
                eev.a("PSTN_META", (new StringBuilder(String.valueOf(obj1).length() + 5 + String.valueOf(s2).length() + String.valueOf(gkq1).length())).append(((String) (obj1))).append(s2).append(", ph=").append(gkq1).toString());
            }
            d.remove(obj);
            ((anq) (obj)).b();
        } else
        {
            cfz cfz1 = d(gkq1);
            gkq1 = ((gkq) (obj1));
            if (cfz1 != null)
            {
                obj = cfz1.c;
                g.remove(cfz1);
                gkq1 = ((gkq) (obj));
                if (a)
                {
                    gkq1 = String.valueOf("Endpoint exits, removing resolved participant, ph=");
                    obj1 = String.valueOf(obj);
                    if (((String) (obj1)).length() != 0)
                    {
                        gkq1 = gkq1.concat(((String) (obj1)));
                    } else
                    {
                        gkq1 = new String(gkq1);
                    }
                    eev.a("PSTN_META", gkq1);
                    gkq1 = ((gkq) (obj));
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
        obj = (bpt)iterator.next();
        if (!((String) (obj1)).equals(((bpt) (obj)).a())) goto _L10; else goto _L9
_L9:
        if (a)
        {
            String s = String.valueOf("Endpoint exits, removing resolved rate request, ph=");
            gkq1 = String.valueOf(gkq1);
            if (gkq1.length() != 0)
            {
                gkq1 = s.concat(gkq1);
            } else
            {
                gkq1 = new String(s);
            }
            eev.a("PSTN_META", gkq1);
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
            eev.a("PSTN_META", (new StringBuilder(148)).append("Hangout ended, sizes for pending reqPart=").append(l).append(", pending reqEP=").append(i1).append(", resolvedPart=").append(j1).append(", rateReq=").append(k1).append(", callinfo=").append(l1).toString());
        }
        for (Iterator iterator = c.values().iterator(); iterator.hasNext(); ((anq)iterator.next()).b()) { }
        for (Iterator iterator1 = e.values().iterator(); iterator1.hasNext(); ((anq)iterator1.next()).b()) { }
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
        gdv.a();
        return j;
    }

    static 
    {
        hnc hnc = eev.m;
    }
}
