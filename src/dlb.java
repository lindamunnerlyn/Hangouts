// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

public final class dlb extends dlp
{

    private static final boolean b = false;
    private static final ConcurrentHashMap e = new ConcurrentHashMap();
    private final ani c;
    private aoe d;
    private final Object f = new Object();

    private dlb(ani ani1)
    {
        c = ani1;
        d = null;
    }

    public static amy a(cey cey, ani ani1, dle dle1)
    {
        cey = g.a(cey);
        if (!cey.a())
        {
            ebw.e("Babel", "lookup spec for participantId invalid", new Throwable());
        } else
        {
            cey = new amy(cey, dle1);
            if (!a(ani1).a(((dlt) (cey))))
            {
                return cey;
            }
        }
        return null;
    }

    public static amy a(String s, boolean flag, ani ani1, dlf dlf1)
    {
        gbh.b(dlf1);
        dlf1 = new aqw(s, flag, dlf1);
        s = dlf1;
        if (a(ani1).a(((dlt) (dlf1))))
        {
            s = null;
        }
        return s;
    }

    public static dlb a(ani ani1)
    {
        int i = ani1.h();
        dlb dlb1;
        dlb dlb2;
        boolean flag;
        if (i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.b("Invalid account ID specified", flag);
        dlb2 = (dlb)e.get(Integer.valueOf(i));
        dlb1 = dlb2;
        if (dlb2 == null)
        {
            if (b)
            {
                ebw.b("Babel", (new StringBuilder(37)).append("Adding contact loader for ").append(i).toString());
            }
            ani1 = new dlb(ani1);
            e.putIfAbsent(Integer.valueOf(i), ani1);
            dlb1 = (dlb)e.get(Integer.valueOf(i));
        }
        return dlb1;
    }

    public static void a(int i)
    {
        if (b)
        {
            ebw.b("Babel", (new StringBuilder(39)).append("Removing contact loader for ").append(i).toString());
        }
        e.remove(Integer.valueOf(i));
    }

    public static void a(ani ani1, cwi cwi1)
    {
        dlb dlb1;
        HashSet hashset;
        Object obj;
        int i;
        boolean flag = true;
        dlb1 = a(ani1);
        hashset = new HashSet();
        ani1 = cwi1.l();
        if (ani1 != null)
        {
            obj = dlb1.b(ani1);
            if (b)
            {
                Locale locale = Locale.US;
                if (obj == null)
                {
                    i = 0;
                } else
                {
                    i = ((List) (obj)).size();
                }
                ebw.b("Babel", String.format(locale, "Clearing %d request from queue: %s", new Object[] {
                    Integer.valueOf(i), ani1
                }));
            }
        }
        if (ani1 == null && !cwi1.n())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        dlb1.c();
        dlb1.d.a();
        cwi1 = cwi1.k().iterator();
_L6:
        if (!cwi1.hasNext()) goto _L2; else goto _L1
_L1:
        obj = (ebj)cwi1.next();
        if (((ebj) (obj)).b == null || ((ceu[])((ebj) (obj)).b).length <= 0)
        {
            break MISSING_BLOCK_LABEL_304;
        }
        ani1 = ((ceu[])((ebj) (obj)).b)[0];
_L8:
        if (ani1 == null) goto _L4; else goto _L3
_L3:
        if (dlb1.d.a(ani1, true))
        {
            hashset.add(((ceu) (ani1)).b);
        }
        if (i == 0) goto _L6; else goto _L5
_L5:
        dlb1.a((dac)((ebj) (obj)).a, ((ceu) (ani1)));
          goto _L6
        ani1;
        dlb1.d.c();
        throw ani1;
_L4:
        if (i == 0) goto _L6; else goto _L7
_L7:
        dlb1.a((dac)((ebj) (obj)).a);
          goto _L6
_L2:
        dlb1.d.b();
        dlb1.d.c();
        if (!hashset.isEmpty())
        {
            dlb1.d.a(hashset);
            any.b(dlb1.d);
            any.d(dlb1.d);
        }
        return;
        ani1 = null;
          goto _L8
    }

    public static void a(cey cey, ani ani1)
    {
        Object obj = g.a(cey);
        if (!((dac) (obj)).b())
        {
            ebw.e("Babel", "participantId not valid for DB lookup", new Throwable());
            return;
        } else
        {
            cey = new ArrayList();
            cey.add(obj);
            obj = String.valueOf(((dac) (obj)).c());
            cey = new amw(cey, (new StringBuilder(String.valueOf(obj).length() + 2)).append("#").append(((String) (obj))).append("#").toString(), ani1);
            a(ani1).c(cey);
            return;
        }
    }

    private void a(dac dac1, ceu ceu1)
    {
        if (b)
        {
            String s = String.valueOf(dac1);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 20)).append("Contact info ready: ").append(s).toString());
        }
        if (!a(dac1.c()))
        {
            return;
        } else
        {
            a(((Runnable) (new dlc(this, dac1, ceu1))));
            return;
        }
    }

    static void a(dlb dlb1, dac dac1)
    {
        dac1 = dlb1.b(dac1.c());
        if (dac1 != null && dac1.size() != 0)
        {
            amy amy1;
            for (dac1 = dac1.iterator(); dac1.hasNext(); amy1.a().a(amy1))
            {
                amy1 = (amy)(dlt)dac1.next();
            }

            if (b)
            {
                ebw.b("Babel", dlb1.b());
                return;
            }
        }
    }

    static void a(dlb dlb1, dac dac1, ceu ceu1)
    {
        Object obj = dlb1.b(dac1.c());
        if (obj != null && ((List) (obj)).size() != 0)
        {
            dac1 = ceu1.e;
            String s = ceu1.h;
            String s1 = ceu1.f;
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj1 = (dlt)((Iterator) (obj)).next();
                if (obj1 instanceof aqw)
                {
                    obj1 = (aqw)obj1;
                    ((dlf)((aqw) (obj1)).a()).a(dac1, s, ceu1.w, ((aqw) (obj1)), dlb1.c);
                } else
                if (obj1 instanceof amy)
                {
                    obj1 = (amy)obj1;
                    ((amy) (obj1)).a().a(dac1, s, ((amy) (obj1)), s1, dlb1.c);
                }
            } while (true);
            if (b)
            {
                ebw.b("Babel", dlb1.b());
                return;
            }
        }
    }

    public static void a(String s, ani ani1)
    {
        s = new anf(s, ani1);
        a(ani1).c(s);
    }

    private void c()
    {
        synchronized (f)
        {
            if (d == null)
            {
                d = new aoe(g.nS, c.h());
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected String a()
    {
        return "ContactLoader";
    }

    public void a(dac dac1)
    {
        if (ebw.a("Babel", 5))
        {
            String s = String.valueOf(dac1);
            ebw.f("Babel", (new StringBuilder(String.valueOf(s).length() + 21)).append("Contact info failed: ").append(s).toString());
        }
        if (!a(dac1.c()))
        {
            return;
        } else
        {
            a(((Runnable) (new dld(this, dac1))));
            return;
        }
    }

    protected void a(ArrayList arraylist)
    {
        Object obj;
        c();
        break MISSING_BLOCK_LABEL_4;
        if (!(obj1 instanceof aqw)) goto _L2; else goto _L1
_L1:
        gbh.b();
        obj2 = (aqw)obj1;
        gbh.b();
        obj1 = dme.a();
        obj = aoe.a(((aqw) (obj2)).e(), ((dme) (obj1)));
        obj3 = g.nS;
        s2 = ((aqw) (obj2)).e();
        if (obj != null) goto _L4; else goto _L3
_L3:
        arraylist = "";
          goto _L5
_L7:
        arraylist = g.a(((android.content.Context) (obj3)), s2, arraylist, ((String) (obj)));
        a(((aqw) (obj2)).d(), ((ceu) (arraylist)));
        ((dme) (obj1)).b();
          goto _L6
_L4:
        arraylist = ((bhj) (obj)).c();
          goto _L5
_L10:
        obj = ((bhj) (obj)).d();
          goto _L7
        arraylist;
        ((dme) (obj1)).b();
        throw arraylist;
_L2:
label0:
        {
            if (!(obj1 instanceof anf))
            {
                break label0;
            }
            arraylist = (anf)obj1;
            d.H(arraylist.a());
        }
          goto _L6
        if (!(obj1 instanceof amw))
        {
            break MISSING_BLOCK_LABEL_453;
        }
        arraylist = (amw)obj1;
        d.a();
        obj1 = arraylist.a().iterator();
_L8:
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_366;
        }
        obj2 = (dac)((Iterator) (obj1)).next();
        obj3 = d.a(((dac) (obj2)));
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        if (((ceu) (obj3)).j() != null)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        a(((dac) (obj2)), ((ceu) (obj3)));
          goto _L8
        arraylist;
        d.c();
        throw arraylist;
label1:
        {
            if (!((dac) (obj2)).a())
            {
                break label1;
            }
            ((ArrayList) (obj)).add(obj2);
        }
          goto _L8
        a(((dac) (obj2)));
          goto _L8
        d.b();
        d.c();
        if (((ArrayList) (obj)).size() > 0)
        {
            if (b)
            {
                obj1 = String.valueOf(obj);
                ebw.b("Babel", (new StringBuilder(String.valueOf(obj1).length() + 33)).append("Sending batch request to server: ").append(((String) (obj1))).toString());
            }
            RealTimeChatService.a(c, ((ArrayList) (obj)), arraylist.c(), false);
        }
          goto _L6
        if (obj1 instanceof amy)
        {
            obj1 = ((amy)obj1).d();
            arraylist = d.a(((dac) (obj1)));
            if (arraylist == null || arraylist.j() != null)
            {
                if (b)
                {
                    if (arraylist == null)
                    {
                        arraylist = String.valueOf(obj1);
                        arraylist = (new StringBuilder(String.valueOf(arraylist).length() + 42)).append("Contact info not in database, try server: ").append(arraylist).toString();
                    } else
                    {
                        String s = String.valueOf("Contact info is not in database: but we have already requested it: ");
                        arraylist = String.valueOf(arraylist.j());
                        if (arraylist.length() != 0)
                        {
                            arraylist = s.concat(arraylist);
                        } else
                        {
                            arraylist = new String(s);
                        }
                    }
                    ebw.b("Babel", arraylist);
                }
                ((ArrayList) (obj)).add(obj1);
                RealTimeChatService.a(c, ((ArrayList) (obj)), null, false);
            } else
            {
                if (b)
                {
                    obj = String.valueOf(((dac) (obj1)).toString());
                    String s1 = String.valueOf(arraylist.toString());
                    ebw.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 42 + String.valueOf(s1).length())).append("Contact info is in the database: ").append(((String) (obj))).append(" entity: ").append(s1).toString());
                }
                a(((dac) (obj1)), ((ceu) (arraylist)));
            }
        }
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        String s2;
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext();)
        {
label2:
            {
                arraylist = (String)iterator.next();
                obj = new ArrayList();
                obj1 = c(arraylist);
                if (obj1 != null)
                {
                    break label2;
                }
                if (b)
                {
                    arraylist = String.valueOf(arraylist);
                    if (arraylist.length() != 0)
                    {
                        arraylist = "No Contact Requests for key: ".concat(arraylist);
                    } else
                    {
                        arraylist = new String("No Contact Requests for key: ");
                    }
                    ebw.b("Babel", arraylist);
                }
            }
        }

        return;
_L5:
        if (obj != null) goto _L10; else goto _L9
_L9:
        obj = null;
          goto _L7
    }

    static 
    {
        hik hik = ebw.p;
    }
}
