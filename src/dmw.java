// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class dmw
    implements Serializable
{

    private static final boolean a = false;
    private static final long serialVersionUID = 1L;

    public dmw()
    {
    }

    public static List a(Intent intent, aoa aoa1, boolean flag)
    {
        if (intent.getExtras().containsKey("payload"))
        {
            intent = intent.getStringExtra("payload");
            boolean flag1;
            if (flag && edc.b())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                (new ede()).a("recv_server_update").a(aoa1).c(intent.length()).b();
            }
            intent = a(((String) (intent)), aoa1);
            if (flag1)
            {
                edc.c();
            }
            return intent;
        } else
        {
            return null;
        }
    }

    private static List a(String s, aoa aoa1)
    {
        int i = 0;
        int j;
        try
        {
            s = (iwo)kws.mergeFrom(new iwo(), Base64.decode(s, 0));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = String.valueOf(s);
            eev.g("Babel", (new StringBuilder(String.valueOf(s).length() + 31)).append("Problem parsing client update: ").append(s).toString());
            return null;
        }
        if (a)
        {
            String s1 = String.valueOf(s);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(s1).length() + 23)).append("ClientBatchUpdate from:").append(s1).toString());
        }
        j = ((iwo) (s)).a.length;
        if (j > 0)
        {
            ArrayList arraylist = new ArrayList();
            for (; i < j; i++)
            {
                a(((iwo) (s)).a[i], aoa1, arraylist);
            }

            return arraylist;
        } else
        {
            eev.g("Babel", "received a client update with no contents");
            return null;
        }
    }

    public static void a(Intent intent, String s)
    {
        intent.putExtra("payload", s);
    }

    private static void a(dmy dmy1, ede ede1, aoa aoa1, long l, int i)
    {
        ede1.a().a("server_update_field").b(dmy1.getClass().getSimpleName()).a(l).b(dmy1.e).a(i).c(dmy1.c).a(aoa1).b();
    }

    private static void a(jex jex1, aoa aoa1, ArrayList arraylist)
    {
        if (!a) goto _L2; else goto _L1
_L1:
        Method amethod[];
        int i;
        int k;
        String s = String.valueOf(jex1);
        eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 27)).append("received ClientStateUpdate ").append(s).toString());
        amethod = jex1.getClass().getMethods();
        k = amethod.length;
        i = 0;
_L3:
        Object obj;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = amethod[i];
        if (!((Method) (obj)).getName().startsWith("has") || ((Method) (obj)).getParameterTypes().length != 0 || ((Method) (obj)).getGenericReturnType() != Boolean.TYPE)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        boolean flag = g.a((Boolean)((Method) (obj)).invoke(jex1, new Object[0]), false);
        if (flag)
        {
            try
            {
                String s1 = String.valueOf(((Method) (obj)).getName());
                eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 13)).append("   ").append(s1).append(" ==> ").append(flag).toString());
            }
            catch (Exception exception)
            {
                obj = String.valueOf(((Method) (obj)).getName());
                String s2 = String.valueOf(exception);
                eev.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 38 + String.valueOf(s2).length())).append("oops, couldn't invoke ").append(((String) (obj))).append(" gave exception ").append(s2).toString());
            }
        }
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        boolean flag5 = edc.b();
        long l3 = System.currentTimeMillis();
        Object obj1 = aoa1.b();
        ede ede1;
        int j;
        long l1;
        boolean flag3;
        boolean flag4;
        if (flag5)
        {
            ede1 = new ede();
        } else
        {
            ede1 = null;
        }
        j = 0;
        l1 = 0L;
        flag3 = false;
        flag4 = false;
        if (jex1.a != null)
        {
            Object obj2 = jex1.a;
            int l = g.a(((jey) (obj2)).a, 0);
            long l2 = g.a(((jey) (obj2)).c, 0L);
            arraylist.add(new dmx(l));
            boolean flag1 = flag4;
            if (((jey) (obj2)).b != null)
            {
                obj2 = ((jey) (obj2)).b;
                flag1 = flag4;
                if (((jbz) (obj2)).a != null)
                {
                    flag1 = g.a(((jbz) (obj2)).a.a, false);
                }
            }
            flag3 = flag1;
            j = l;
            l1 = l2;
            if (flag5)
            {
                ede1.a().a("server_update_field").b("ClientStateUpdateHeader").a(l3).a(l).a(flag1).a(aoa1).b();
                l1 = l2;
                j = l;
                flag3 = flag1;
            }
        }
        if (eev.a("Babel", 3))
        {
            obj1 = String.valueOf(obj1);
            eev.c("Babel", (new StringBuilder(String.valueOf(obj1).length() + 59)).append("parseServerUpdates: acct=").append(((String) (obj1))).append(", activeClientState is ").append(j).toString());
        }
        if (j != 1 && djt.b(aoa1))
        {
            if (eev.a("Babel", 3))
            {
                eev.c("Babel", (new StringBuilder(54)).append("Overwrite active client state from server: ").append(j).toString());
            }
            j = 1;
        }
        if (flag3)
        {
            j = 2;
        }
        if (jex1.b != null || jex1.c != null && jex1.p != null && jex1.c.a.h != null)
        {
            dnc dnc1 = new dnc(jex1.p);
            if (dnc1.y == null && aoa1.y())
            {
                dnc1.a(aoa1.A());
            }
            if (flag5)
            {
                ede1.a().a("server_update_field").b("Conversation").a(l3).a(j).a(flag3).c(dnc1.c).a(aoa1).b();
            }
            arraylist.add(dnc1);
        }
        if (jex1.c != null)
        {
            boolean flag2 = dcz.h(aoa1.h());
            dng dng1 = dng.a(jex1.c.a, j, l1, flag2, aoa1.h());
            if (dng1 != null)
            {
                if (flag5)
                {
                    ede1.a().a("server_update_field").b(dng1.getClass().getSimpleName()).a(l3).b(dng1.e).a(j).a(flag3).b(dng1.f).c(dng1.c).a(aoa1).b();
                }
                arraylist.add(dng1);
            }
        }
        if (jex1.d != null)
        {
            dnq dnq1 = new dnq(jex1.d);
            if (flag5)
            {
                a(((dmy) (dnq1)), ede1, aoa1, l3, j);
            }
            arraylist.add(dnq1);
        }
        if (jex1.e != null)
        {
            dnr dnr1 = new dnr(jex1.e);
            if (flag5)
            {
                a(((dmy) (dnr1)), ede1, aoa1, l3, j);
            }
            arraylist.add(dnr1);
        }
        if (jex1.h != null)
        {
            dnt dnt1 = new dnt(jex1.h);
            if (flag5)
            {
                a(((dmy) (dnt1)), ede1, aoa1, l3, j);
            }
            arraylist.add(dnt1);
        }
        if (jex1.g != null)
        {
            arraylist.add(new dnn(jex1.g));
        }
        if (jex1.q != null)
        {
            dnp dnp1 = new dnp(jex1.q);
            if (flag5)
            {
                ede1.a().a("server_update_field").b("SelfPresenceNotification").a(l3).a(j).a(flag3).a(aoa1).b();
            }
            arraylist.add(dnp1);
        }
        if (jex1.m != null)
        {
            for (Iterator iterator = hlp.c(g.nU, ddl).iterator(); iterator.hasNext(); ((ddl)iterator.next()).a(aoa1.h(), jex1.m.a)) { }
        }
        if (jex1.i != null)
        {
            dns dns1 = new dns(jex1.i);
            if (flag5)
            {
                ede1.a().a("server_update_field").b("ViewModificationNotification").c(dns1.a).a(l3).a(j).a(flag3).a(aoa1).b();
            }
            arraylist.add(dns1);
        }
        if (jex1.f != null)
        {
            arraylist.add(new dnl(jex1.f));
        }
        if (jex1.k != null)
        {
            arraylist.add(new dne(jex1.k));
        }
        if (jex1.s != null)
        {
            arraylist.add(new dmz(jex1.s));
        }
        if (jex1.w != null)
        {
            arraylist.add(new dnb(jex1.w, jex1.a.h));
        }
        if (jex1.v != null)
        {
            arraylist.add(new dno(jex1.v));
        }
        if (jex1.j != null)
        {
            arraylist.add(new dnf(jex1.j));
        }
        if (jex1.o != null)
        {
            arraylist.add(new dnj(jex1.o));
        }
        if (arraylist.isEmpty())
        {
            eev.f("Babel", "Unexpected update type from babel server");
        }
        return;
    }

    static 
    {
        hnc hnc = eev.k;
    }
}
