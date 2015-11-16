// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class dbf
    implements gmr, gxq
{

    public static dbj a = new dbj();
    private static final boolean b = false;
    private static final String c[] = {
        "Init", "Pending", "Ready", "Err_net", "Err_gcm", "Err_svr", "Err_auth", "Err_profile", "Err_oobe", "Err_transient"
    };
    private static final ConcurrentHashMap d = new ConcurrentHashMap();
    private static Boolean e = null;
    private static Boolean f = null;
    private static dbi h = new dbi();
    private static dbg i = new dbg();
    private final Context g;

    dbf(Context context)
    {
        g = context;
    }

    public static int[] A()
    {
        return j(21);
    }

    static Boolean B()
    {
        return f;
    }

    static ani C()
    {
        return G();
    }

    static boolean D()
    {
        return b;
    }

    static dbg E()
    {
        return i;
    }

    private static void F()
    {
        gms gms1 = (gms)hgx.a(g.nS, gms);
        Iterator iterator = d.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!gms1.c(g.a((Integer)iterator.next(), 0)))
            {
                iterator.remove();
            }
        } while (true);
    }

    private static ani G()
    {
        List list = ((gms)hgx.a(g.nS, gms)).a(new String[] {
            "is_sms_account"
        });
        boolean flag;
        if (list.size() <= 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.b(flag);
        if (list.size() == 1)
        {
            return e(g.a((Integer)list.get(0), -1));
        } else
        {
            return null;
        }
    }

    public static long a()
    {
        return g.a(g.nS, "babel_ac_registration_renew_days", 7L) * 0x5265c00L;
    }

    public static ani a(Context context)
    {
label0:
        {
            gms gms1 = (gms)hgx.a(context, gms);
            Iterator iterator = gms1.a().iterator();
            context = null;
            Object obj;
            dbh dbh1;
label1:
            do
            {
                while (iterator.hasNext()) 
                {
                    obj = gms1.a(g.a((Integer)iterator.next(), 0));
                    if (!((gmu) (obj)).a("effective_gaia_id"))
                    {
                        obj = ((gmu) (obj)).b("account_name");
                        dbh1 = b(((String) (obj)), ((String) (null)));
                        if (dbh1 == null)
                        {
                            obj = String.valueOf(ebw.b(((String) (obj))));
                            if (((String) (obj)).length() != 0)
                            {
                                obj = "Account has not been setup yet. Skip:".concat(((String) (obj)));
                            } else
                            {
                                obj = new String("Account has not been setup yet. Skip:");
                            }
                            ebw.f("Babel", ((String) (obj)));
                        } else
                        {
                            obj = dbh1.h();
                            if (!((ani) (obj)).q())
                            {
                                continue label1;
                            }
                            context = ((Context) (obj));
                        }
                    }
                }
                break label0;
            } while (dbh1.t());
            return ((ani) (obj));
        }
        if (dbj.a())
        {
            return context;
        } else
        {
            return null;
        }
    }

    public static ani a(ani ani1)
    {
        if (ani1 == null) goto _L2; else goto _L1
_L1:
        ani ani2 = ani1;
        if (ani1.r()) goto _L4; else goto _L3
_L3:
        if (!ani1.q()) goto _L2; else goto _L5
_L5:
        ani2 = ani1;
_L4:
        return ani2;
_L2:
        if (dbj.a())
        {
            ani1 = l();
        } else
        {
            ani1 = null;
        }
        ani2 = ani1;
        if (ani1 == null)
        {
            return k();
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public static ani a(cey cey1)
    {
        F();
        j(8);
        for (Iterator iterator = d.values().iterator(); iterator.hasNext();)
        {
            Object obj = (dbh)iterator.next();
            ani ani1 = ((dbh) (obj)).h();
            boolean flag1 = ani1.e();
            boolean flag2 = ani1.f();
            String s1;
            boolean flag;
            if (flag2 && ani1.b().a(cey1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s1 = ((dbh) (obj)).a();
            ebw.c("Babel", (new StringBuilder(String.valueOf(s1).length() + 52)).append("Account ").append(s1).append(", valid: ").append(flag1).append(", matches participantId: ").append(flag).toString());
            if (!flag)
            {
                if (flag2)
                {
                    obj = String.valueOf(ani1.b().toString());
                    String s2 = String.valueOf(cey1.toString());
                    ebw.c("Babel", (new StringBuilder(String.valueOf(obj).length() + 44 + String.valueOf(s2).length())).append("account.getParticipantId(): ").append(((String) (obj))).append(", participantId:").append(s2).toString());
                } else
                {
                    obj = ((dbh) (obj)).a();
                    ebw.c("Babel", (new StringBuilder(String.valueOf(obj).length() + 37)).append("Account ").append(((String) (obj))).append("does not have a participantId").toString());
                }
            }
            if (flag1 && flag)
            {
                return ani1;
            }
        }

        return null;
    }

    public static ani a(String s1, String s2)
    {
        if (!TextUtils.isEmpty(s1))
        {
            if ((s1 = b(s1, s2)) != null)
            {
                return s1.h();
            }
        }
        return null;
    }

    static Boolean a(Boolean boolean1)
    {
        f = boolean1;
        return boolean1;
    }

    public static String a(Context context, int i1)
    {
        if (i1 == -1)
        {
            return null;
        } else
        {
            return ((gms)hgx.a(context, gms)).a(i1).b("account_name");
        }
    }

    public static void a(ani ani1, Exception exception)
    {
        ani1 = String.valueOf(l(ani1.h()).a());
        if (ani1.length() != 0)
        {
            ani1 = "Account registration failed ".concat(ani1);
        } else
        {
            ani1 = new String("Account registration failed ");
        }
        ebw.e("Babel", ani1, exception);
    }

    public static void a(ani ani1, String s1)
    {
        ani1 = l(ani1.h());
        if (ani1 == null)
        {
            return;
        } else
        {
            ani1.a(s1);
            return;
        }
    }

    public static void a(ani ani1, boolean flag, boolean flag1, boolean flag2, String s1, boolean flag3, boolean flag4, boolean flag5, 
            boolean flag6, boolean flag7)
    {
        String s2 = ani1.a();
        if (l(ani1.h()) == null)
        {
            ani1 = String.valueOf(ebw.b(s2));
            if (ani1.length() != 0)
            {
                ani1 = "Unable to update voice info for account ".concat(ani1);
            } else
            {
                ani1 = new String("Unable to update voice info for account ");
            }
            ebw.f("Babel", ani1);
            return;
        } else
        {
            ank.a(g.nS, ani1, flag, flag1, flag2, s1, flag3, flag4, flag5, flag6, flag7);
            return;
        }
    }

    public static void a(gms gms1, int i1)
    {
        Object obj = gms1.a(i1);
        if (!((gmu) (obj)).d("is_managed_account")) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String as[];
        Object obj1;
        Object obj2;
        Integer integer1;
        gmu gmu1;
        int j1;
        if (((gmu) (obj)).a("plus_page_gaia_ids"))
        {
            as = ((gmu) (obj)).b("plus_page_gaia_ids").split(",");
        } else
        {
            as = new String[0];
        }
        obj1 = new ArrayList();
        obj2 = gms1.a();
        obj = ((gmu) (obj)).b("account_name");
        obj2 = ((List) (obj2)).iterator();
        if (!((Iterator) (obj2)).hasNext()) goto _L4; else goto _L3
_L3:
        integer1 = (Integer)((Iterator) (obj2)).next();
        gmu1 = gms1.a(g.a(integer1, 0));
        if (!gmu1.b("account_name").equals(obj) || !gmu1.d("is_plus_page"))
        {
            break MISSING_BLOCK_LABEL_84;
        }
        j1 = as.length;
        i1 = 0;
_L7:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        if (!TextUtils.equals(as[i1], gmu1.b("effective_gaia_id"))) goto _L6; else goto _L5
_L5:
        i1 = 1;
_L8:
        if (i1 == 0)
        {
            ((List) (obj1)).add(integer1);
        }
        break MISSING_BLOCK_LABEL_84;
_L6:
        i1++;
          goto _L7
_L4:
        Integer integer;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); gms1.f(g.a(integer, 0)))
        {
            integer = (Integer)((Iterator) (obj1)).next();
            String s1 = String.valueOf(integer);
            ebw.e("Babel", (new StringBuilder(String.valueOf(s1).length() + 20)).append("Removing old +Page: ").append(s1).toString());
        }

        int k1 = as.length;
        i1 = 0;
        while (i1 < k1) 
        {
            gms1 = b(((String) (obj)), as[i1]);
            if (gms1 != null)
            {
                dbh.a(gms1);
            }
            i1++;
        }
          goto _L1
        i1 = 0;
          goto _L8
    }

    public static void a(PrintWriter printwriter)
    {
        printwriter.println("Account list:");
        printwriter.println("Name,ID,jid,state");
        F();
        do
        {
            for (Iterator iterator = d.values().iterator(); iterator.hasNext();)
            {
                Object obj = (dbh)iterator.next();
                Object obj1 = ((dbh) (obj)).h();
                if (obj1 == null)
                {
                    String s1 = ((dbh) (obj)).o();
                    obj = m(((dbh) (obj)).i());
                    printwriter.println((new StringBuilder(String.valueOf(s1).length() + 7 + String.valueOf(obj).length())).append("-, -,").append(s1).append(", ").append(((String) (obj))).toString());
                } else
                {
                    String s2;
                    String s3;
                    try
                    {
                        s2 = ((ani) (obj1)).b().toString();
                    }
                    catch (Throwable throwable)
                    {
                        throwable = "(unk)";
                    }
                    obj1 = ((ani) (obj1)).a();
                    s3 = ((dbh) (obj)).o();
                    obj = m(((dbh) (obj)).i());
                    printwriter.println((new StringBuilder(String.valueOf(obj1).length() + 6 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(obj).length())).append(((String) (obj1))).append(", ").append(s2).append(", ").append(s3).append(", ").append(((String) (obj))).toString());
                }
            }

            printwriter.println();
            return;
        } while (true);
    }

    public static void a(Exception exception)
    {
        ebw.e("Babel", "onAccountSetSelfInfoBitFailed: ", exception);
    }

    public static void a(boolean flag)
    {
        dbj.a(flag);
    }

    public static long b()
    {
        return g.a(g.nS, "babel_ac_setting_renew_minutes", 1440L) * 60000L;
    }

    private static dbh b(String s1, String s2)
    {
        Object obj;
label0:
        {
            F();
            for (Iterator iterator = d.values().iterator(); iterator.hasNext();)
            {
                dbh dbh1 = (dbh)iterator.next();
                if (dbh1.e().equals(s1) && TextUtils.equals(dbh1.f(), s2))
                {
                    return dbh1;
                }
            }

            gbh.b(s1);
            if (s2 == null)
            {
                break MISSING_BLOCK_LABEL_332;
            }
            obj = b(s1, ((String) (null)));
            if (obj == null)
            {
                ebw.f("Babel", "No owner account for plus page");
                s2 = null;
                break label0;
            }
        }
_L2:
label1:
        {
            gms gms1 = (gms)hgx.a(g.nS, gms);
            if (gms1.b(s1, s2) == -1)
            {
                if (s2 == null)
                {
                    break label1;
                }
                gms1.a(s1, s2).d();
            }
            s2 = new dbh(ank.a(g.nS, s1, s2), ((dbh) (obj)));
        }
          goto _L1
        s2 = null;
_L1:
        if (s2 == null)
        {
            return null;
        }
        obj = s2.d();
        ebw.c("Babel", (new StringBuilder(String.valueOf(s1).length() + 20 + String.valueOf(obj).length())).append("created account ").append(s1).append(" => ").append(((String) (obj))).toString());
        if (b)
        {
            obj = (new Exception()).getStackTrace();
            int k1 = obj.length;
            int i1 = 0;
            while (i1 < k1) 
            {
                s1 = String.valueOf(obj[i1].toString());
                if (s1.length() != 0)
                {
                    s1 = "    ".concat(s1);
                } else
                {
                    s1 = new String("    ");
                }
                ebw.a("Babel", s1);
                i1++;
            }
        }
        int j1 = s2.h().h();
        d.putIfAbsent(Integer.valueOf(j1), s2);
        return l(j1);
        obj = null;
          goto _L2
    }

    public static void b(ani ani1)
    {
        ani ani2;
label0:
        {
            gbh.b(ani1);
            ani ani3;
            boolean flag;
            if (ani1.q() || !ank.g(g.nS, ani1.h()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gbh.a(flag);
            gbh.a(dbj.a());
            e(ani1.q());
            if (ebw.a("Babel", 3))
            {
                String s1 = String.valueOf(ebw.b(ani1.a()));
                if (s1.length() != 0)
                {
                    s1 = "setCarrierSmsAccount: ".concat(s1);
                } else
                {
                    s1 = new String("setCarrierSmsAccount: ");
                }
                ebw.c("Babel", s1);
            }
            ani3 = G();
            if (ani1 == ani3)
            {
                return;
            }
            Object obj = null;
            ani2 = obj;
            if (ani3 == null)
            {
                break label0;
            }
            if (ank.g(g.nS, ani3.h()))
            {
                ani2 = obj;
                if (!ani3.q())
                {
                    break label0;
                }
            }
            ani2 = ani3;
        }
        if (ani2 != null)
        {
            dry.a(ani2);
        }
        ank.h(g.nS, ani1);
        dry.c(ani1);
    }

    public static void b(ani ani1, Exception exception)
    {
        ani1 = String.valueOf(l(ani1.h()).a());
        if (ani1.length() != 0)
        {
            ani1 = "Account self info failed ".concat(ani1);
        } else
        {
            ani1 = new String("Account self info failed ");
        }
        ebw.e("Babel", ani1, exception);
    }

    public static void b(boolean flag)
    {
        dcx.j();
        Iterator iterator = ((gms)hgx.a(g.nS, gms)).a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dbh dbh1 = l(g.a((Integer)iterator.next(), 0));
            if (dbh1.i() == 102 || dbh1.i() == 108 || dbh1.u())
            {
                if (flag)
                {
                    dbh1.s();
                }
                dbh.a(dbh1);
                if (!dbh1.u())
                {
                    dbh.b(dbh1);
                }
            }
        } while (true);
    }

    public static void c(ani ani1)
    {
        ani1 = l(ani1.h());
        if (ani1 != null)
        {
            ani1.a(true, true);
        }
    }

    public static int[] c()
    {
        return j(0);
    }

    public static int[] c(boolean flag)
    {
        if (flag)
        {
            return j(5);
        } else
        {
            return j(0);
        }
    }

    static void d(boolean flag)
    {
        e(flag);
    }

    public static boolean d(int i1)
    {
        ani ani1 = e(i1);
        return ani1 != null && ani1.q();
    }

    public static boolean d(ani ani1)
    {
        ani1 = l(ani1.h());
        if (ani1 == null)
        {
            return false;
        } else
        {
            return ani1.k();
        }
    }

    public static int[] d()
    {
        return j(8);
    }

    public static ani e(int i1)
    {
        dbh dbh1 = l(i1);
        if (dbh1 != null)
        {
            return dbh1.h();
        } else
        {
            return null;
        }
    }

    public static String e(ani ani1)
    {
        return k(ani1.h());
    }

    private static void e(boolean flag)
    {
        boolean flag1 = true;
        if (!ebz.d())
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            g.a(flag);
            return;
        }
        int i1 = n().h();
        gmw gmw1 = ((gms)hgx.a(g.nS, gms)).b(i1).c("logged_in", flag);
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        gmw1.c("logged_out", flag).d();
    }

    public static int[] e()
    {
        return j(12);
    }

    public static String f(ani ani1)
    {
        return g(ani1.h());
    }

    public static void f(int i1)
    {
        dbh dbh1 = l(i1);
        if (dbh1 != null)
        {
            dbh1.p();
        }
    }

    public static int[] f()
    {
        return j(4);
    }

    public static String g(int i1)
    {
        String s1 = k(i1);
        if (!TextUtils.isEmpty(s1))
        {
            i1 = s1.indexOf('/');
            if (i1 >= 0)
            {
                return s1.substring(i1 + 1);
            }
        }
        return null;
    }

    public static boolean g(ani ani1)
    {
label0:
        {
            if (ani1 != null)
            {
                ani1 = l(ani1.h());
                if (ani1 != null)
                {
                    break label0;
                }
            }
            return true;
        }
        return ani1.t();
    }

    public static int[] g()
    {
        return j(32);
    }

    public static dbn h(ani ani1)
    {
        ani1 = b(ani1.a(), ani1.ae());
        if (ani1 == null)
        {
            return null;
        } else
        {
            return ani1.c();
        }
    }

    public static void h(int i1)
    {
        dbh dbh1 = l(i1);
        if (dbh1 == null)
        {
            return;
        } else
        {
            dbh1.q();
            return;
        }
    }

    public static boolean h()
    {
        return ((gms)hgx.a(g.nS, gms)).a().size() > 1;
    }

    public static boolean i()
    {
        if (e == null)
        {
            e = Boolean.valueOf(false);
        }
        return g.a(e, false);
    }

    public static boolean i(int i1)
    {
        dbh dbh1 = l(i1);
        return dbh1 != null && dbh1.l();
    }

    public static boolean j()
    {
        return dbj.a();
    }

    private static int[] j(int i1)
    {
        ArrayList arraylist;
        Iterator iterator;
        int j1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        int k1;
        boolean flag5;
        boolean flag6;
        if ((i1 & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i1 & 2) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((i1 & 0x40) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if ((i1 & 4) == 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        j1 = 0;
        flag5 = false;
        k1 = -1;
        arraylist = new ArrayList(d.size());
        if ((i1 & 0x20) != 0)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if ((i1 & 0x80) != 0)
        {
            flag6 = true;
        } else
        {
            flag6 = false;
        }
        iterator = ((gms)hgx.a(g.nS, gms)).a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dbh dbh1 = l(g.a((Integer)iterator.next(), 0));
            if (dbh1 != null && (!flag1 || !dbh1.m()) && (flag3 || !dbh1.t()) && (!flag || dbh1.l()))
            {
                if ("SMS".equals(dbh1.e()))
                {
                    k1 = dbh1.g();
                } else
                if ((!dbh1.b() && !dbh1.h().F() || !flag6 && (!flag2 || dbh1.h().c() != null)) && (!flag4 || dbh1.h().r()))
                {
                    if (dbh1.l())
                    {
                        int l1 = j1 + 1;
                        arraylist.add(j1, Integer.valueOf(dbh1.g()));
                        int ai[];
                        if (dbh1.n())
                        {
                            flag5 = true;
                            j1 = l1;
                        } else
                        {
                            j1 = l1;
                        }
                    } else
                    if (!flag)
                    {
                        arraylist.add(Integer.valueOf(dbh1.g()));
                    }
                }
            }
        } while (true);
        if ((i1 & 8) != 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        flag = j1;
        if (j1 == 0)
        {
            flag = j1;
            if (!flag5)
            {
                flag = j1;
                if (dbj.a())
                {
                    if ((i1 & 0x10) != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                }
            }
        }
        if (flag)
        {
            if (b)
            {
                ebw.b("Babel", "internalGetSortedAccountNames couldn't find sms logged in account");
            }
            if (k1 != -1)
            {
                arraylist.add(Integer.valueOf(k1));
            }
        }
        ai = new int[arraylist.size()];
        for (i1 = 0; i1 < ai.length; i1++)
        {
            ai[i1] = g.a((Integer)arraylist.get(i1), -1);
        }

        return ai;
    }

    public static ani k()
    {
        for (Iterator iterator = t().iterator(); iterator.hasNext();)
        {
            ani ani1 = (ani)iterator.next();
            if (ani1.E())
            {
                return ani1;
            }
        }

        return null;
    }

    private static String k(int i1)
    {
        dbh dbh1 = l(i1);
        if (dbh1 == null)
        {
            return null;
        } else
        {
            return dbh1.o();
        }
    }

    public static ani l()
    {
        ani ani1;
        if (!dbj.a())
        {
            ani1 = null;
        } else
        {
            ani ani2 = m();
            ani1 = ani2;
            if (ani2 != null)
            {
                ani1 = ani2;
                if (!ani2.s())
                {
                    b(ani2);
                    return ani2;
                }
            }
        }
        return ani1;
    }

    private static dbh l(int i1)
    {
        F();
        gms gms1 = (gms)hgx.a(g.nS, gms);
        dbh dbh1;
        if (!gms1.c(i1))
        {
            ebw.f("Babel", (new StringBuilder(40)).append("BAM#gBA: invalid account id: ").append(i1).toString());
            d.remove(Integer.valueOf(i1));
            dbh1 = null;
        } else
        {
            dbh dbh2 = (dbh)d.get(Integer.valueOf(i1));
            dbh1 = dbh2;
            if (dbh2 == null)
            {
                gmu gmu1 = gms1.a(i1);
                return b(gmu1.b("account_name"), gmu1.b("effective_gaia_id"));
            }
        }
        return dbh1;
    }

    public static ani m()
    {
        ani ani1;
        ani ani2;
        ani2 = null;
        ani1 = null;
        if (ebz.d()) goto _L2; else goto _L1
_L1:
        ani2 = ani1;
_L4:
        return ani2;
_L2:
        ani ani3 = G();
        ani1 = ani3;
        if (ani3 == null)
        {
            ani ani4 = a(g.nS);
            ani1 = ani2;
            if (ani4 != null)
            {
                ani1 = ani4;
                if (ani4.q())
                {
                    ani1 = ani2;
                }
            }
        }
        if (ani1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ani2 = ani1;
        if (!ank.g(g.nS, ani1.h())) goto _L4; else goto _L3
_L3:
        return n();
    }

    private static String m(int i1)
    {
        if (i1 >= 100 && i1 <= 109)
        {
            return c[i1 - 100];
        } else
        {
            return Integer.toString(i1);
        }
    }

    public static ani n()
    {
        g.b(ebz.d());
        gms gms1 = (gms)hgx.a(g.nS, gms);
        if (gms1.b("SMS", null) == -1)
        {
            gms1.a("SMS").c("gaia_id", "_sms_only_account").c("chat_id", "_sms_only_account").c("sms_only", true).c("is_managed_account", true).d();
        }
        return b("SMS", ((String) (null))).h();
    }

    public static void o()
    {
        F();
        Iterator iterator = d.values().iterator();
        do
        {
            if (iterator.hasNext())
            {
                dbh dbh1 = (dbh)iterator.next();
                if (dbh1.i() == 101 && !dbh1.t())
                {
                    String s1 = String.valueOf(dbh1.a());
                    if (s1.length() != 0)
                    {
                        s1 = "Registering account for ".concat(s1);
                    } else
                    {
                        s1 = new String("Registering account for ");
                    }
                    ebw.e("Babel", s1);
                    dbh1.p();
                } else
                if (dbh1.i() == 102)
                {
                    if (ebw.a("Babel", 3))
                    {
                        String s2 = String.valueOf("Renewing account registration after babel upgrade. Account: ");
                        String s3 = String.valueOf(dbh1.a());
                        if (s3.length() != 0)
                        {
                            s2 = s2.concat(s3);
                        } else
                        {
                            s2 = new String(s2);
                        }
                        ebw.c("Babel", s2);
                    }
                    dbh1.r();
                    dbh.b(dbh1);
                }
            } else
            {
                return;
            }
        } while (true);
    }

    public static void p()
    {
        F();
        Iterator iterator = d.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dbh dbh1 = (dbh)iterator.next();
            if (!dbh1.t())
            {
                dbh.b(dbh1);
            }
        } while (true);
    }

    public static void q()
    {
        F();
        for (Iterator iterator = d.values().iterator(); iterator.hasNext(); ((dbh)iterator.next()).r()) { }
    }

    public static void r()
    {
        if (ebw.a("Babel", 3))
        {
            ebw.c("Babel", "Scheduling acount renewal");
        }
        RealTimeChatService.b(SystemClock.elapsedRealtime(), g.a(g.nS, "babel_ac_registration_renew_window_days", 3L) * 0x5265c00L);
    }

    public static boolean s()
    {
        F();
        for (Iterator iterator = d.values().iterator(); iterator.hasNext();)
        {
            if (((dbh)iterator.next()).k())
            {
                return true;
            }
        }

        return false;
    }

    public static List t()
    {
        F();
        ArrayList arraylist = new ArrayList(d.size());
        Iterator iterator = d.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dbh dbh1 = (dbh)iterator.next();
            if (!dbh1.t())
            {
                arraylist.add(dbh1.h());
            }
        } while (true);
        return arraylist;
    }

    public static boolean u()
    {
        for (Iterator iterator = t().iterator(); iterator.hasNext();)
        {
            if (((ani)iterator.next()).y())
            {
                return true;
            }
        }

        return false;
    }

    public static void v()
    {
        F();
        Iterator iterator = d.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dbh dbh1 = (dbh)iterator.next();
            if (!dbh1.t())
            {
                dbh1.j();
            }
        } while (true);
    }

    public static void w()
    {
        F();
        Iterator iterator = d.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dbh dbh1 = (dbh)iterator.next();
            if (!dbh1.t() && dbh1.i() > 102)
            {
                dbh1.j();
            }
        } while (true);
    }

    public static boolean x()
    {
        return g.a(g.nS, "babel_allowed_for_domain_bit", true);
    }

    public static boolean y()
    {
        F();
        gms gms1 = (gms)hgx.a(g.nS, gms);
        for (Iterator iterator = gms1.a().iterator(); iterator.hasNext();)
        {
            if (!gms1.a(g.a((Integer)iterator.next(), 0)).d("sms_only"))
            {
                return true;
            }
        }

        return false;
    }

    public static int[] z()
    {
        return j(32);
    }

    public void a(int i1)
    {
        ebw.e("Babel", (new StringBuilder(32)).append("BAM#account updated: ").append(i1).toString());
        Object obj = (gms)hgx.a(g, gms);
        gmu gmu1 = ((gms) (obj)).a(i1);
        if (gmu1.d("logged_out"))
        {
            ebw.e("Babel", (new StringBuilder(25)).append("BAM, cleanup: ").append(i1).toString());
            obj = ((gms)hgx.a(g, gms)).a(i1);
            RealTimeChatService.b(i1);
            if (((gmu) (obj)).d("is_sms_account") && dbj.a())
            {
                b(n());
            }
        } else
        if (!gmu1.d("sms_only"))
        {
            RealTimeChatService.a(i1);
            a(((gms) (obj)), i1);
            return;
        }
    }

    public void b(int i1)
    {
        ebw.e("Babel", (new StringBuilder(23)).append("BAM created ").append(i1).toString());
        gmu gmu1 = ((gms)hgx.a(g, gms)).a(i1);
        dbh dbh1 = b(gmu1.b("account_name"), gmu1.b("effective_gaia_id"));
        gbh.b("babelAccount should not be null", dbh1);
        gbh.b("babelAccount.getName() should not be null", dbh1.e());
        d.put(Integer.valueOf(i1), dbh1);
        if (gmu1.a())
        {
            RealTimeChatService.a(i1);
        }
    }

    public void c(int i1)
    {
    }

    static 
    {
        hik hik = ebw.n;
    }
}
