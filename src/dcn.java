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
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class dcn
    implements gqx, hcb
{

    public static dcs a = new dcs();
    private static final boolean b = false;
    private static final String c[] = {
        "Init", "Pending", "Ready", "Err_net", "Err_gcm", "Err_svr", "Err_auth", "Err_profile", "Err_oobe", "Err_transient"
    };
    private static final ConcurrentHashMap d = new ConcurrentHashMap();
    private static Boolean e = null;
    private static Boolean f = null;
    private static dcr h = new dcr();
    private static dcp i = new dcp();
    private static final Comparator j = new dco();
    private final Context g;

    dcn(Context context)
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

    static aoa C()
    {
        return G();
    }

    static boolean D()
    {
        return b;
    }

    static dcp E()
    {
        return i;
    }

    private static void F()
    {
        gqz gqz1 = (gqz)hlp.a(g.nU, gqz);
        Iterator iterator = d.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!gqz1.c(g.a((Integer)iterator.next(), 0)))
            {
                iterator.remove();
            }
        } while (true);
    }

    private static aoa G()
    {
        List list = ((gqz)hlp.a(g.nU, gqz)).a(new String[] {
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
        g.d(flag);
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
        return g.a(g.nU, "babel_ac_registration_renew_days", 7L) * 0x5265c00L;
    }

    public static aoa a(Context context)
    {
label0:
        {
            gqz gqz1 = (gqz)hlp.a(context, gqz);
            Iterator iterator = gqz1.a().iterator();
            context = null;
            Object obj;
            dcq dcq1;
label1:
            do
            {
                while (iterator.hasNext()) 
                {
                    obj = gqz1.a(g.a((Integer)iterator.next(), 0));
                    if (!((grb) (obj)).a("effective_gaia_id"))
                    {
                        obj = ((grb) (obj)).b("account_name");
                        dcq1 = b(((String) (obj)), ((String) (null)));
                        if (dcq1 == null)
                        {
                            obj = String.valueOf(eev.b(((String) (obj))));
                            if (((String) (obj)).length() != 0)
                            {
                                obj = "Account has not been setup yet. Skip:".concat(((String) (obj)));
                            } else
                            {
                                obj = new String("Account has not been setup yet. Skip:");
                            }
                            eev.f("Babel", ((String) (obj)));
                        } else
                        {
                            obj = dcq1.h();
                            if (!((aoa) (obj)).o())
                            {
                                continue label1;
                            }
                            context = ((Context) (obj));
                        }
                    }
                }
                break label0;
            } while (dcq1.v());
            return ((aoa) (obj));
        }
        if (dcs.a())
        {
            return context;
        } else
        {
            return null;
        }
    }

    public static aoa a(aoa aoa1)
    {
        if (aoa1 == null) goto _L2; else goto _L1
_L1:
        aoa aoa2 = aoa1;
        if (aoa1.p()) goto _L4; else goto _L3
_L3:
        if (!aoa1.o()) goto _L2; else goto _L5
_L5:
        aoa2 = aoa1;
_L4:
        return aoa2;
_L2:
        if (dcs.a())
        {
            aoa1 = l();
        } else
        {
            aoa1 = null;
        }
        aoa2 = aoa1;
        if (aoa1 == null)
        {
            return k();
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public static aoa a(cgd cgd1)
    {
        F();
        j(8);
        for (Iterator iterator = d.values().iterator(); iterator.hasNext();)
        {
            Object obj = (dcq)iterator.next();
            aoa aoa1 = ((dcq) (obj)).h();
            boolean flag1 = aoa1.e();
            boolean flag2 = aoa1.f();
            String s1;
            boolean flag;
            if (flag2 && aoa1.b().a(cgd1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s1 = String.valueOf(((dcq) (obj)).a());
            eev.c("Babel", (new StringBuilder(String.valueOf(s1).length() + 52)).append("Account ").append(s1).append(", valid: ").append(flag1).append(", matches participantId: ").append(flag).toString());
            if (!flag)
            {
                if (flag2)
                {
                    obj = String.valueOf(aoa1.b().toString());
                    String s2 = String.valueOf(cgd1.toString());
                    eev.c("Babel", (new StringBuilder(String.valueOf(obj).length() + 44 + String.valueOf(s2).length())).append("account.getParticipantId(): ").append(((String) (obj))).append(", participantId:").append(s2).toString());
                } else
                {
                    obj = String.valueOf(((dcq) (obj)).a());
                    eev.c("Babel", (new StringBuilder(String.valueOf(obj).length() + 37)).append("Account ").append(((String) (obj))).append("does not have a participantId").toString());
                }
            }
            if (flag1 && flag)
            {
                return aoa1;
            }
        }

        return null;
    }

    public static aoa a(String s1, String s2)
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
            return ((gqz)hlp.a(context, gqz)).a(i1).b("account_name");
        }
    }

    public static void a(aoa aoa1, Exception exception)
    {
        aoa1 = String.valueOf(l(aoa1.h()).a());
        if (aoa1.length() != 0)
        {
            aoa1 = "Account registration failed ".concat(aoa1);
        } else
        {
            aoa1 = new String("Account registration failed ");
        }
        eev.e("Babel", aoa1, exception);
    }

    public static void a(aoa aoa1, String s1)
    {
        aoa1 = l(aoa1.h());
        if (aoa1 == null)
        {
            return;
        } else
        {
            aoa1.a(s1);
            return;
        }
    }

    public static void a(aoa aoa1, boolean flag, boolean flag1, boolean flag2, String s1, boolean flag3, boolean flag4, boolean flag5, 
            boolean flag6, boolean flag7)
    {
        String s2 = aoa1.a();
        if (l(aoa1.h()) == null)
        {
            aoa1 = String.valueOf(eev.b(s2));
            if (aoa1.length() != 0)
            {
                aoa1 = "Unable to update voice info for account ".concat(aoa1);
            } else
            {
                aoa1 = new String("Unable to update voice info for account ");
            }
            eev.f("Babel", aoa1);
            return;
        } else
        {
            aoc.a(g.nU, aoa1, flag, flag1, flag2, s1, flag3, flag4, flag5, flag6, flag7);
            return;
        }
    }

    public static void a(gqz gqz1, int i1)
    {
        Object obj = gqz1.a(i1);
        if (!((grb) (obj)).d("is_managed_account")) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String as[];
        Object obj1;
        Object obj2;
        Integer integer1;
        grb grb1;
        int j1;
        if (((grb) (obj)).a("plus_page_gaia_ids"))
        {
            as = ((grb) (obj)).b("plus_page_gaia_ids").split(",");
        } else
        {
            as = new String[0];
        }
        obj1 = new ArrayList();
        obj2 = gqz1.a();
        obj = ((grb) (obj)).b("account_name");
        obj2 = ((List) (obj2)).iterator();
        if (!((Iterator) (obj2)).hasNext()) goto _L4; else goto _L3
_L3:
        integer1 = (Integer)((Iterator) (obj2)).next();
        grb1 = gqz1.a(g.a(integer1, 0));
        if (!grb1.b("account_name").equals(obj) || !grb1.d("is_plus_page"))
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
        if (!TextUtils.equals(as[i1], grb1.b("effective_gaia_id"))) goto _L6; else goto _L5
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
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); gqz1.f(g.a(integer, 0)))
        {
            integer = (Integer)((Iterator) (obj1)).next();
            String s1 = String.valueOf(integer);
            eev.e("Babel", (new StringBuilder(String.valueOf(s1).length() + 20)).append("Removing old +Page: ").append(s1).toString());
        }

        int k1 = as.length;
        i1 = 0;
        while (i1 < k1) 
        {
            gqz1 = b(((String) (obj)), as[i1]);
            if (gqz1 != null)
            {
                gqz1.u();
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
                Object obj = (dcq)iterator.next();
                Object obj1 = ((dcq) (obj)).h();
                if (obj1 == null)
                {
                    String s1 = String.valueOf(((dcq) (obj)).o());
                    obj = String.valueOf(m(((dcq) (obj)).i()));
                    printwriter.println((new StringBuilder(String.valueOf(s1).length() + 7 + String.valueOf(obj).length())).append("-, -,").append(s1).append(", ").append(((String) (obj))).toString());
                } else
                {
                    String s2;
                    String s3;
                    try
                    {
                        s2 = ((aoa) (obj1)).b().toString();
                    }
                    catch (Throwable throwable)
                    {
                        throwable = "(unk)";
                    }
                    obj1 = String.valueOf(((aoa) (obj1)).a());
                    s3 = String.valueOf(((dcq) (obj)).o());
                    obj = String.valueOf(m(((dcq) (obj)).i()));
                    printwriter.println((new StringBuilder(String.valueOf(obj1).length() + 6 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(obj).length())).append(((String) (obj1))).append(", ").append(s2).append(", ").append(s3).append(", ").append(((String) (obj))).toString());
                }
            }

            printwriter.println();
            return;
        } while (true);
    }

    public static void a(Exception exception)
    {
        eev.e("Babel", "onAccountSetSelfInfoBitFailed: ", exception);
    }

    public static void a(boolean flag)
    {
        dcs.a(flag);
    }

    static boolean a(grb grb1)
    {
        return grb1.b("account_name").endsWith("@google.com");
    }

    public static int b(Context context)
    {
        context = ((gqz)hlp.a(context, gqz)).a(j);
        if (context.isEmpty())
        {
            return -1;
        } else
        {
            return g.a((Integer)context.get(0), -1);
        }
    }

    public static long b()
    {
        return g.a(g.nU, "babel_ac_setting_renew_minutes", 1440L) * 60000L;
    }

    private static dcq b(String s1, String s2)
    {
        Object obj;
label0:
        {
            F();
            for (Iterator iterator = d.values().iterator(); iterator.hasNext();)
            {
                dcq dcq1 = (dcq)iterator.next();
                if (dcq1.e().equals(s1) && TextUtils.equals(dcq1.f(), s2))
                {
                    return dcq1;
                }
            }

            gdv.b("Expected non-null", s1);
            if (s2 == null)
            {
                break MISSING_BLOCK_LABEL_338;
            }
            obj = b(s1, ((String) (null)));
            if (obj == null)
            {
                eev.f("Babel", "No owner account for plus page");
                s2 = null;
                break label0;
            }
        }
_L2:
label1:
        {
            gqz gqz1 = (gqz)hlp.a(g.nU, gqz);
            if (gqz1.b(s1, s2) == -1)
            {
                if (s2 == null)
                {
                    break label1;
                }
                gqz1.a(s1, s2).d();
            }
            s2 = new dcq(aoc.a(g.nU, s1, s2), ((dcq) (obj)));
        }
          goto _L1
        s2 = null;
_L1:
        if (s2 == null)
        {
            return null;
        }
        obj = String.valueOf(s2.d());
        eev.c("Babel", (new StringBuilder(String.valueOf(s1).length() + 20 + String.valueOf(obj).length())).append("created account ").append(s1).append(" => ").append(((String) (obj))).toString());
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
                eev.a("Babel", s1);
                i1++;
            }
        }
        int j1 = s2.h().h();
        d.putIfAbsent(Integer.valueOf(j1), s2);
        return l(j1);
        obj = null;
          goto _L2
    }

    public static void b(aoa aoa1)
    {
        aoa aoa2;
label0:
        {
            gdv.b("Expected non-null", aoa1);
            aoa aoa3;
            boolean flag;
            if (aoa1.o() || !aoc.g(g.nU, aoa1.h()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gdv.a("Expected condition to be true", flag);
            gdv.a("Expected condition to be true", dcs.a());
            e(aoa1.o());
            if (eev.a("Babel", 3))
            {
                String s1 = String.valueOf(eev.b(aoa1.a()));
                if (s1.length() != 0)
                {
                    s1 = "setCarrierSmsAccount: ".concat(s1);
                } else
                {
                    s1 = new String("setCarrierSmsAccount: ");
                }
                eev.c("Babel", s1);
            }
            aoa3 = G();
            if (aoa1 == aoa3)
            {
                return;
            }
            Object obj = null;
            aoa2 = obj;
            if (aoa3 == null)
            {
                break label0;
            }
            if (aoc.g(g.nU, aoa3.h()))
            {
                aoa2 = obj;
                if (!aoa3.o())
                {
                    break label0;
                }
            }
            aoa2 = aoa3;
        }
        if (aoa2 != null)
        {
            dur.a(aoa2);
        }
        aoc.h(g.nU, aoa1);
        dur.c(aoa1);
    }

    public static void b(aoa aoa1, Exception exception)
    {
        aoa1 = String.valueOf(l(aoa1.h()).a());
        if (aoa1.length() != 0)
        {
            aoa1 = "Account self info failed ".concat(aoa1);
        } else
        {
            aoa1 = new String("Account self info failed ");
        }
        eev.e("Babel", aoa1, exception);
    }

    public static void b(boolean flag)
    {
        def.j();
        Iterator iterator = ((gqz)hlp.a(g.nU, gqz)).a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dcq dcq1 = l(g.a((Integer)iterator.next(), 0));
            if (dcq1.i() == 102 || dcq1.i() == 108 || dcq1.w())
            {
                if (flag)
                {
                    dcq1.s();
                }
                dcq1.u();
                if (!dcq1.w())
                {
                    dcq1.t();
                }
            }
        } while (true);
    }

    public static void c(aoa aoa1)
    {
        aoa1 = l(aoa1.h());
        if (aoa1 != null)
        {
            aoa1.a(true, true);
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

    public static String d(aoa aoa1)
    {
        return k(aoa1.h());
    }

    static void d(boolean flag)
    {
        e(flag);
    }

    public static boolean d(int i1)
    {
        aoa aoa1 = e(i1);
        return aoa1 != null && aoa1.o();
    }

    public static int[] d()
    {
        return j(8);
    }

    public static aoa e(int i1)
    {
        dcq dcq1 = l(i1);
        if (dcq1 != null)
        {
            return dcq1.h();
        } else
        {
            return null;
        }
    }

    public static String e(aoa aoa1)
    {
        return g(aoa1.h());
    }

    private static void e(boolean flag)
    {
        boolean flag1 = true;
        if (!eey.d())
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            g.c(flag);
            return;
        }
        int i1 = n().h();
        grd grd1 = ((gqz)hlp.a(g.nU, gqz)).b(i1).c("logged_in", flag);
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        grd1.c("logged_out", flag).d();
    }

    public static int[] e()
    {
        return j(12);
    }

    public static void f(int i1)
    {
        dcq dcq1 = l(i1);
        if (dcq1 != null)
        {
            dcq1.p();
        }
    }

    public static boolean f(aoa aoa1)
    {
label0:
        {
            if (aoa1 != null)
            {
                aoa1 = l(aoa1.h());
                if (aoa1 != null)
                {
                    break label0;
                }
            }
            return true;
        }
        return aoa1.v();
    }

    public static int[] f()
    {
        return j(4);
    }

    public static dcw g(aoa aoa1)
    {
        aoa1 = b(aoa1.a(), aoa1.ab());
        if (aoa1 == null)
        {
            return null;
        } else
        {
            return aoa1.c();
        }
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

    public static int[] g()
    {
        return j(32);
    }

    public static void h(int i1)
    {
        dcq dcq1 = l(i1);
        if (dcq1 == null)
        {
            return;
        } else
        {
            dcq1.q();
            return;
        }
    }

    public static boolean h()
    {
        return ((gqz)hlp.a(g.nU, gqz)).a().size() > 1;
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
        dcq dcq1 = l(i1);
        return dcq1 != null && dcq1.l();
    }

    public static boolean j()
    {
        return dcs.a();
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
        arraylist = new ArrayList();
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
        iterator = ((gqz)hlp.a(g.nU, gqz)).a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dcq dcq1 = l(g.a((Integer)iterator.next(), 0));
            if (dcq1 != null && (!flag1 || !dcq1.m()) && (flag3 || !dcq1.v()) && (!flag || dcq1.l()))
            {
                if ("SMS".equals(dcq1.e()))
                {
                    k1 = dcq1.g();
                } else
                if ((!dcq1.b() && !dcq1.h().D() || !flag6 && (!flag2 || dcq1.h().c() != null)) && (!flag4 || dcq1.h().p()))
                {
                    if (dcq1.l())
                    {
                        int l1 = j1 + 1;
                        arraylist.add(j1, Integer.valueOf(dcq1.g()));
                        int ai[];
                        if (dcq1.n())
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
                        arraylist.add(Integer.valueOf(dcq1.g()));
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
                if (dcs.a())
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
                eev.b("Babel", "internalGetSortedAccountNames couldn't find sms logged in account");
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

    public static aoa k()
    {
        for (Iterator iterator = t().iterator(); iterator.hasNext();)
        {
            aoa aoa1 = (aoa)iterator.next();
            if (aoa1.C())
            {
                return aoa1;
            }
        }

        return null;
    }

    private static String k(int i1)
    {
        dcq dcq1 = l(i1);
        if (dcq1 == null)
        {
            return null;
        } else
        {
            return dcq1.o();
        }
    }

    public static aoa l()
    {
        aoa aoa1;
        if (!dcs.a())
        {
            aoa1 = null;
        } else
        {
            aoa aoa2 = m();
            aoa1 = aoa2;
            if (aoa2 != null)
            {
                aoa1 = aoa2;
                if (!aoa2.q())
                {
                    b(aoa2);
                    return aoa2;
                }
            }
        }
        return aoa1;
    }

    private static dcq l(int i1)
    {
        F();
        gqz gqz1 = (gqz)hlp.a(g.nU, gqz);
        dcq dcq1;
        if (!gqz1.c(i1))
        {
            eev.f("Babel", (new StringBuilder(40)).append("BAM#gBA: invalid account id: ").append(i1).toString());
            d.remove(Integer.valueOf(i1));
            dcq1 = null;
        } else
        {
            dcq dcq2 = (dcq)d.get(Integer.valueOf(i1));
            dcq1 = dcq2;
            if (dcq2 == null)
            {
                grb grb1 = gqz1.a(i1);
                return b(grb1.b("account_name"), grb1.b("effective_gaia_id"));
            }
        }
        return dcq1;
    }

    public static aoa m()
    {
        aoa aoa1;
        aoa aoa2;
        aoa2 = null;
        aoa1 = null;
        if (eey.d()) goto _L2; else goto _L1
_L1:
        aoa2 = aoa1;
_L4:
        return aoa2;
_L2:
        aoa aoa3 = G();
        aoa1 = aoa3;
        if (aoa3 == null)
        {
            aoa aoa4 = a(g.nU);
            aoa1 = aoa2;
            if (aoa4 != null)
            {
                aoa1 = aoa4;
                if (aoa4.o())
                {
                    aoa1 = aoa2;
                }
            }
        }
        if (aoa1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        aoa2 = aoa1;
        if (!aoc.g(g.nU, aoa1.h())) goto _L4; else goto _L3
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

    public static aoa n()
    {
        g.d(eey.d());
        gqz gqz1 = (gqz)hlp.a(g.nU, gqz);
        if (gqz1.b("SMS", null) == -1)
        {
            gqz1.a("SMS").c("gaia_id", "_sms_only_account").c("chat_id", "_sms_only_account").c("sms_only", true).c("is_managed_account", true).d();
        }
        return b("SMS", ((String) (null))).h();
    }

    public static void o()
    {
        F();
        j(8);
        Iterator iterator = d.values().iterator();
        do
        {
            if (iterator.hasNext())
            {
                dcq dcq1 = (dcq)iterator.next();
                if (dcq1.i() == 101 && !dcq1.v())
                {
                    String s1 = String.valueOf(dcq1.a());
                    if (s1.length() != 0)
                    {
                        s1 = "Registering account for ".concat(s1);
                    } else
                    {
                        s1 = new String("Registering account for ");
                    }
                    eev.e("Babel", s1);
                    dcq1.p();
                } else
                if (dcq1.i() == 102)
                {
                    if (eev.a("Babel", 3))
                    {
                        String s2 = String.valueOf("Renewing account registration after babel upgrade. Account: ");
                        String s3 = String.valueOf(dcq1.a());
                        if (s3.length() != 0)
                        {
                            s2 = s2.concat(s3);
                        } else
                        {
                            s2 = new String(s2);
                        }
                        eev.c("Babel", s2);
                    }
                    dcq1.r();
                    dcq1.t();
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
        j(8);
        Iterator iterator = d.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dcq dcq1 = (dcq)iterator.next();
            if (!dcq1.v())
            {
                dcq1.t();
            }
        } while (true);
    }

    public static void q()
    {
        F();
        j(8);
        for (Iterator iterator = d.values().iterator(); iterator.hasNext(); ((dcq)iterator.next()).r()) { }
    }

    public static void r()
    {
        if (eev.a("Babel", 3))
        {
            eev.c("Babel", "Scheduling acount renewal");
        }
        RealTimeChatService.b(SystemClock.elapsedRealtime(), g.a(g.nU, "babel_ac_registration_renew_window_days", 3L) * 0x5265c00L);
    }

    public static boolean s()
    {
        F();
        j(8);
        for (Iterator iterator = d.values().iterator(); iterator.hasNext();)
        {
            if (((dcq)iterator.next()).k())
            {
                return true;
            }
        }

        return false;
    }

    public static List t()
    {
        F();
        j(8);
        ArrayList arraylist = new ArrayList(d.size());
        Iterator iterator = d.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dcq dcq1 = (dcq)iterator.next();
            if (!dcq1.v())
            {
                arraylist.add(dcq1.h());
            }
        } while (true);
        return arraylist;
    }

    public static boolean u()
    {
        for (Iterator iterator = t().iterator(); iterator.hasNext();)
        {
            if (((aoa)iterator.next()).w())
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
            dcq dcq1 = (dcq)iterator.next();
            if (!dcq1.v())
            {
                dcq1.j();
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
            dcq dcq1 = (dcq)iterator.next();
            if (!dcq1.v() && dcq1.i() > 102)
            {
                dcq1.j();
            }
        } while (true);
    }

    public static boolean x()
    {
        return g.a(g.nU, "babel_allowed_for_domain_bit", true);
    }

    public static boolean y()
    {
        F();
        gqz gqz1 = (gqz)hlp.a(g.nU, gqz);
        for (Iterator iterator = gqz1.a().iterator(); iterator.hasNext();)
        {
            if (!gqz1.a(g.a((Integer)iterator.next(), 0)).d("sms_only"))
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
        eev.e("Babel", (new StringBuilder(32)).append("BAM#account updated: ").append(i1).toString());
        Object obj = (gqz)hlp.a(g, gqz);
        grb grb1 = ((gqz) (obj)).a(i1);
        if (grb1.d("logged_out"))
        {
            eev.e("Babel", (new StringBuilder(25)).append("BAM, cleanup: ").append(i1).toString());
            obj = ((gqz)hlp.a(g, gqz)).a(i1);
            RealTimeChatService.b(i1);
            if (((grb) (obj)).d("is_sms_account") && dcs.a())
            {
                b(n());
            }
        } else
        if (!grb1.d("sms_only"))
        {
            RealTimeChatService.a(i1);
            a(((gqz) (obj)), i1);
            return;
        }
    }

    public void b(int i1)
    {
        eev.e("Babel", (new StringBuilder(23)).append("BAM created ").append(i1).toString());
        grb grb1 = ((gqz)hlp.a(g, gqz)).a(i1);
        dcq dcq1 = b(grb1.b("account_name"), grb1.b("effective_gaia_id"));
        gdv.b("babelAccount should not be null", dcq1);
        gdv.b("babelAccount.getName() should not be null", dcq1.e());
        d.put(Integer.valueOf(i1), dcq1);
        if (grb1.a())
        {
            RealTimeChatService.a(i1);
        }
    }

    public void c(int i1)
    {
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
