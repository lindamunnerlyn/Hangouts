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

public class cyq
    implements Serializable
{

    private static final boolean a = false;
    private static final long serialVersionUID = 1L;

    public cyq()
    {
    }

    public static List a(Intent intent, ani ani1, boolean flag)
    {
        if (intent.getExtras().containsKey("payload"))
        {
            intent = intent.getStringExtra("payload");
            boolean flag1;
            if (flag && dzy.b())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                (new eaa()).a("recv_server_update").a(ani1).c(intent.length()).b();
            }
            intent = a(((String) (intent)), ani1);
            if (flag1)
            {
                dzy.c();
            }
            return intent;
        } else
        {
            return null;
        }
    }

    private static List a(String s, ani ani1)
    {
        int i = 0;
        int j;
        try
        {
            s = (iqj)kop.mergeFrom(new iqj(), Base64.decode(s, 0));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = String.valueOf(s);
            ebw.g("Babel", (new StringBuilder(String.valueOf(s).length() + 31)).append("Problem parsing client update: ").append(s).toString());
            return null;
        }
        if (a)
        {
            String s1 = String.valueOf(s);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(s1).length() + 23)).append("ClientBatchUpdate from:").append(s1).toString());
        }
        j = ((iqj) (s)).a.length;
        if (j > 0)
        {
            ArrayList arraylist = new ArrayList();
            for (; i < j; i++)
            {
                a(((iqj) (s)).a[i], ani1, arraylist);
            }

            return arraylist;
        } else
        {
            ebw.g("Babel", "received a client update with no contents");
            return null;
        }
    }

    public static void a(Intent intent, String s)
    {
        intent.putExtra("payload", s);
    }

    private static void a(cys cys1, eaa eaa1, ani ani1, long l, int i)
    {
        eaa1.a().a("server_update_field").b(cys1.getClass().getSimpleName()).a(l).b(cys1.e).a(i).c(cys1.c).a(ani1).b();
    }

    private static void a(iys iys1, ani ani1, ArrayList arraylist)
    {
        if (!a) goto _L2; else goto _L1
_L1:
        Method amethod[];
        int i;
        int k;
        String s = String.valueOf(iys1);
        ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 27)).append("received ClientStateUpdate ").append(s).toString());
        amethod = iys1.getClass().getMethods();
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
        boolean flag = g.a((Boolean)((Method) (obj)).invoke(iys1, new Object[0]), false);
        if (flag)
        {
            try
            {
                String s1 = String.valueOf(((Method) (obj)).getName());
                ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 13)).append("   ").append(s1).append(" ==> ").append(flag).toString());
            }
            catch (Exception exception)
            {
                obj = String.valueOf(((Method) (obj)).getName());
                String s2 = String.valueOf(exception);
                ebw.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 38 + String.valueOf(s2).length())).append("oops, couldn't invoke ").append(((String) (obj))).append(" gave exception ").append(s2).toString());
            }
        }
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        boolean flag5 = dzy.b();
        long l3 = System.currentTimeMillis();
        Object obj1 = ani1.b();
        eaa eaa1;
        int j;
        long l1;
        boolean flag3;
        boolean flag4;
        if (flag5)
        {
            eaa1 = new eaa();
        } else
        {
            eaa1 = null;
        }
        j = 0;
        l1 = 0L;
        flag3 = false;
        flag4 = false;
        if (iys1.a != null)
        {
            Object obj2 = iys1.a;
            int l = g.a(((iyt) (obj2)).a, 0);
            long l2 = g.a(((iyt) (obj2)).c, 0L);
            arraylist.add(new cyr(l));
            boolean flag1 = flag4;
            if (((iyt) (obj2)).b != null)
            {
                obj2 = ((iyt) (obj2)).b;
                flag1 = flag4;
                if (((ivu) (obj2)).a != null)
                {
                    flag1 = g.a(((ivu) (obj2)).a.a, false);
                }
            }
            flag3 = flag1;
            j = l;
            l1 = l2;
            if (flag5)
            {
                eaa1.a().a("server_update_field").b("ClientStateUpdateHeader").a(l3).a(l).a(flag1).a(ani1).b();
                l1 = l2;
                j = l;
                flag3 = flag1;
            }
        }
        if (ebw.a("Babel", 3))
        {
            obj1 = String.valueOf(obj1);
            ebw.c("Babel", (new StringBuilder(String.valueOf(obj1).length() + 59)).append("parseServerUpdates: acct=").append(((String) (obj1))).append(", activeClientState is ").append(j).toString());
        }
        if (j != 1 && dii.b(ani1))
        {
            if (ebw.a("Babel", 3))
            {
                ebw.c("Babel", (new StringBuilder(54)).append("Overwrite active client state from server: ").append(j).toString());
            }
            j = 1;
        }
        if (flag3)
        {
            j = 2;
        }
        if (iys1.b != null || iys1.c != null && iys1.p != null && iys1.c.a.h != null)
        {
            cyw cyw1 = new cyw(iys1.p);
            if (cyw1.y == null && ani1.A())
            {
                cyw1.a(ani1.C());
            }
            if (flag5)
            {
                eaa1.a().a("server_update_field").b("Conversation").a(l3).a(j).a(flag3).c(cyw1.c).a(ani1).b();
            }
            arraylist.add(cyw1);
        }
        if (iys1.c != null)
        {
            boolean flag2 = dbq.h(ani1.h());
            cza cza1 = cza.a(iys1.c.a, j, l1, flag2, ani1.h());
            if (cza1 != null)
            {
                if (flag5)
                {
                    eaa1.a().a("server_update_field").b(cza1.getClass().getSimpleName()).a(l3).b(cza1.e).a(j).a(flag3).b(cza1.f).c(cza1.c).a(ani1).b();
                }
                arraylist.add(cza1);
            }
        }
        if (iys1.d != null)
        {
            czk czk1 = new czk(iys1.d);
            if (flag5)
            {
                a(((cys) (czk1)), eaa1, ani1, l3, j);
            }
            arraylist.add(czk1);
        }
        if (iys1.e != null)
        {
            czl czl1 = new czl(iys1.e);
            if (flag5)
            {
                a(((cys) (czl1)), eaa1, ani1, l3, j);
            }
            arraylist.add(czl1);
        }
        if (iys1.h != null)
        {
            czn czn1 = new czn(iys1.h);
            if (flag5)
            {
                a(((cys) (czn1)), eaa1, ani1, l3, j);
            }
            arraylist.add(czn1);
        }
        if (iys1.g != null)
        {
            arraylist.add(new czh(iys1.g));
        }
        if (iys1.q != null)
        {
            czj czj1 = new czj(iys1.q);
            if (flag5)
            {
                eaa1.a().a("server_update_field").b("SelfPresenceNotification").a(l3).a(j).a(flag3).a(ani1).b();
            }
            arraylist.add(czj1);
        }
        if (iys1.m != null)
        {
            for (Iterator iterator = hgx.c(g.nS, dcd).iterator(); iterator.hasNext(); ((dcd)iterator.next()).a(ani1.h(), iys1.m.a)) { }
        }
        if (iys1.i != null)
        {
            czm czm1 = new czm(iys1.i);
            if (flag5)
            {
                eaa1.a().a("server_update_field").b("ViewModificationNotification").c(czm1.a).a(l3).a(j).a(flag3).a(ani1).b();
            }
            arraylist.add(czm1);
        }
        if (iys1.f != null)
        {
            arraylist.add(new czf(iys1.f));
        }
        if (iys1.k != null)
        {
            arraylist.add(new cyy(iys1.k));
        }
        if (iys1.s != null)
        {
            arraylist.add(new cyt(iys1.s));
        }
        if (iys1.w != null)
        {
            arraylist.add(new cyv(iys1.w, iys1.a.h));
        }
        if (iys1.v != null)
        {
            arraylist.add(new czi(iys1.v));
        }
        if (iys1.j != null)
        {
            arraylist.add(new cyz(iys1.j));
        }
        if (iys1.o != null)
        {
            arraylist.add(new czd(iys1.o));
        }
        if (arraylist.isEmpty())
        {
            ebw.f("Babel", "Unexpected update type from babel server");
        }
        return;
    }

    static 
    {
        hik hik = ebw.k;
    }
}
