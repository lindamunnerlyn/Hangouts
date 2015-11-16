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

public final class dny extends don
{

    private static final boolean b = false;
    private static final ConcurrentHashMap e = new ConcurrentHashMap();
    private final aoa c;
    private aow d;
    private final Object f = new Object();

    private dny(aoa aoa1)
    {
        c = aoa1;
        d = null;
    }

    public static anq a(cgd cgd, aoa aoa1, dob dob1)
    {
        cgd = g.a(cgd);
        if (!cgd.a())
        {
            eev.e("Babel", "lookup spec for participantId invalid", new Throwable());
        } else
        {
            cgd = new anq(cgd, dob1);
            if (!a(aoa1).a(((dor) (cgd))))
            {
                return cgd;
            }
        }
        return null;
    }

    public static anq a(String s, boolean flag, aoa aoa1, doc doc1)
    {
        gdv.b("Expected non-null", doc1);
        doc1 = new arn(s, flag, doc1);
        s = doc1;
        if (a(aoa1).a(((dor) (doc1))))
        {
            s = null;
        }
        return s;
    }

    public static dny a(aoa aoa1)
    {
        int i = aoa1.h();
        dny dny1;
        dny dny2;
        boolean flag;
        if (i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.b("Invalid account ID specified", flag);
        dny2 = (dny)e.get(Integer.valueOf(i));
        dny1 = dny2;
        if (dny2 == null)
        {
            if (b)
            {
                eev.b("Babel", (new StringBuilder(37)).append("Adding contact loader for ").append(i).toString());
            }
            aoa1 = new dny(aoa1);
            e.putIfAbsent(Integer.valueOf(i), aoa1);
            dny1 = (dny)e.get(Integer.valueOf(i));
        }
        return dny1;
    }

    public static void a(int i)
    {
        if (b)
        {
            eev.b("Babel", (new StringBuilder(39)).append("Removing contact loader for ").append(i).toString());
        }
        e.remove(Integer.valueOf(i));
    }

    public static void a(aoa aoa1, cym cym1)
    {
        dny dny1;
        HashSet hashset;
        Object obj;
        int i;
        boolean flag = true;
        dny1 = a(aoa1);
        hashset = new HashSet();
        aoa1 = cym1.l();
        if (aoa1 != null)
        {
            obj = dny1.b(aoa1);
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
                eev.b("Babel", String.format(locale, "Clearing %d request from queue: %s", new Object[] {
                    Integer.valueOf(i), aoa1
                }));
            }
        }
        if (aoa1 == null && !cym1.n())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        dny1.c();
        dny1.d.a();
        cym1 = cym1.k().iterator();
_L6:
        if (!cym1.hasNext()) goto _L2; else goto _L1
_L1:
        obj = (eeh)cym1.next();
        if (((eeh) (obj)).b == null || ((cfz[])((eeh) (obj)).b).length <= 0)
        {
            break MISSING_BLOCK_LABEL_304;
        }
        aoa1 = ((cfz[])((eeh) (obj)).b)[0];
_L8:
        if (aoa1 == null) goto _L4; else goto _L3
_L3:
        if (dny1.d.a(aoa1, true))
        {
            hashset.add(((cfz) (aoa1)).b);
        }
        if (i == 0) goto _L6; else goto _L5
_L5:
        dny1.a((dbi)((eeh) (obj)).a, ((cfz) (aoa1)));
          goto _L6
        aoa1;
        dny1.d.c();
        throw aoa1;
_L4:
        if (i == 0) goto _L6; else goto _L7
_L7:
        dny1.a((dbi)((eeh) (obj)).a);
          goto _L6
_L2:
        dny1.d.b();
        dny1.d.c();
        if (!hashset.isEmpty())
        {
            dny1.d.a(hashset);
            aoq.b(dny1.d);
            aoq.d(dny1.d);
        }
        return;
        aoa1 = null;
          goto _L8
    }

    public static void a(cgd cgd, aoa aoa1)
    {
        Object obj = g.a(cgd);
        if (!((dbi) (obj)).b())
        {
            eev.e("Babel", "participantId not valid for DB lookup", new Throwable());
            return;
        } else
        {
            cgd = new ArrayList();
            cgd.add(obj);
            obj = String.valueOf(((dbi) (obj)).c());
            cgd = new ano(cgd, (new StringBuilder(String.valueOf(obj).length() + 2)).append("#").append(((String) (obj))).append("#").toString());
            a(aoa1).c(cgd);
            return;
        }
    }

    private void a(dbi dbi1, cfz cfz1)
    {
        if (b)
        {
            String s = String.valueOf(dbi1);
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 20)).append("Contact info ready: ").append(s).toString());
        }
        if (!a(dbi1.c()))
        {
            return;
        } else
        {
            a(((Runnable) (new dnz(this, dbi1, cfz1))));
            return;
        }
    }

    static void a(dny dny1, dbi dbi1)
    {
        dbi1 = dny1.b(dbi1.c());
        if (dbi1 != null && dbi1.size() != 0)
        {
            anq anq1;
            for (dbi1 = dbi1.iterator(); dbi1.hasNext(); anq1.a().a(anq1))
            {
                anq1 = (anq)(dor)dbi1.next();
            }

            if (b)
            {
                eev.b("Babel", dny1.b());
                return;
            }
        }
    }

    static void a(dny dny1, dbi dbi1, cfz cfz1)
    {
        Object obj = dny1.b(dbi1.c());
        if (obj != null && ((List) (obj)).size() != 0)
        {
            dbi1 = cfz1.e;
            String s = cfz1.h;
            String s1 = cfz1.f;
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj1 = (dor)((Iterator) (obj)).next();
                if (obj1 instanceof arn)
                {
                    obj1 = (arn)obj1;
                    ((doc)((arn) (obj1)).a()).a(dbi1, s, cfz1.w, ((arn) (obj1)), dny1.c);
                } else
                if (obj1 instanceof anq)
                {
                    obj1 = (anq)obj1;
                    ((anq) (obj1)).a().a(dbi1, s, ((anq) (obj1)), s1, dny1.c);
                }
            } while (true);
            if (b)
            {
                eev.b("Babel", dny1.b());
                return;
            }
        }
    }

    public static void a(String s, aoa aoa1)
    {
        s = new anx(s, aoa1);
        a(aoa1).c(s);
    }

    private void c()
    {
        synchronized (f)
        {
            if (d == null)
            {
                d = new aow(g.nU, c.h());
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

    public void a(dbi dbi1)
    {
        if (eev.a("Babel", 5))
        {
            String s = String.valueOf(dbi1);
            eev.f("Babel", (new StringBuilder(String.valueOf(s).length() + 21)).append("Contact info failed: ").append(s).toString());
        }
        if (!a(dbi1.c()))
        {
            return;
        } else
        {
            a(((Runnable) (new doa(this, dbi1))));
            return;
        }
    }

    protected void a(ArrayList arraylist)
    {
        Object obj;
        c();
        break MISSING_BLOCK_LABEL_4;
        if (!(obj1 instanceof arn)) goto _L2; else goto _L1
_L1:
        gdv.b();
        obj2 = (arn)obj1;
        gdv.b();
        obj1 = doy.a();
        obj = aow.a(((arn) (obj2)).e(), ((doy) (obj1)));
        obj3 = g.nU;
        s2 = ((arn) (obj2)).e();
        if (obj != null) goto _L4; else goto _L3
_L3:
        arraylist = "";
          goto _L5
_L7:
        arraylist = g.a(((android.content.Context) (obj3)), s2, arraylist, ((String) (obj)));
        a(((arn) (obj2)).d(), ((cfz) (arraylist)));
        ((doy) (obj1)).b();
          goto _L6
_L4:
        arraylist = ((bhv) (obj)).c();
          goto _L5
_L10:
        obj = ((bhv) (obj)).d();
          goto _L7
        arraylist;
        ((doy) (obj1)).b();
        throw arraylist;
_L2:
label0:
        {
            if (!(obj1 instanceof anx))
            {
                break label0;
            }
            arraylist = (anx)obj1;
            d.H(arraylist.a());
        }
          goto _L6
        if (!(obj1 instanceof ano))
        {
            break MISSING_BLOCK_LABEL_453;
        }
        arraylist = (ano)obj1;
        d.a();
        obj1 = arraylist.a().iterator();
_L8:
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_366;
        }
        obj2 = (dbi)((Iterator) (obj1)).next();
        obj3 = d.a(((dbi) (obj2)));
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        if (((cfz) (obj3)).j() != null)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        a(((dbi) (obj2)), ((cfz) (obj3)));
          goto _L8
        arraylist;
        d.c();
        throw arraylist;
label1:
        {
            if (!((dbi) (obj2)).a())
            {
                break label1;
            }
            ((ArrayList) (obj)).add(obj2);
        }
          goto _L8
        a(((dbi) (obj2)));
          goto _L8
        d.b();
        d.c();
        if (((ArrayList) (obj)).size() > 0)
        {
            if (b)
            {
                obj1 = String.valueOf(obj);
                eev.b("Babel", (new StringBuilder(String.valueOf(obj1).length() + 33)).append("Sending batch request to server: ").append(((String) (obj1))).toString());
            }
            RealTimeChatService.a(c, ((ArrayList) (obj)), arraylist.c(), false);
        }
          goto _L6
        if (obj1 instanceof anq)
        {
            obj1 = ((anq)obj1).d();
            arraylist = d.a(((dbi) (obj1)));
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
                    eev.b("Babel", arraylist);
                }
                ((ArrayList) (obj)).add(obj1);
                RealTimeChatService.a(c, ((ArrayList) (obj)), null, false);
            } else
            {
                if (b)
                {
                    obj = String.valueOf(((dbi) (obj1)).toString());
                    String s1 = String.valueOf(arraylist.toString());
                    eev.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 42 + String.valueOf(s1).length())).append("Contact info is in the database: ").append(((String) (obj))).append(" entity: ").append(s1).toString());
                }
                a(((dbi) (obj1)), ((cfz) (arraylist)));
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
                    eev.b("Babel", arraylist);
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
        hnc hnc = eev.p;
    }
}
