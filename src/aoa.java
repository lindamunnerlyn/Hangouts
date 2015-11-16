// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class aoa
{

    private final gqz a;
    private final ahd b;
    private final String c;
    private final String d;
    private final boolean e;
    private cgd f;
    private boolean g;
    private boolean h;

    public aoa(gqz gqz1, ahd ahd1, String s1, String s2)
    {
        a = gqz1;
        c = (String)gdv.b("Expected non-null", s1);
        d = s2;
        e = "SMS".equals(c);
        b = ahd1;
    }

    public static String K()
    {
        String s1 = eey.g();
        if (!TextUtils.isEmpty(s1))
        {
            return eey.p(eey.k(s1));
        } else
        {
            return g.nU.getResources().getString(l.jR);
        }
    }

    private grb ac()
    {
        return a.a(h());
    }

    private boolean ad()
    {
        return ac().a("is_gv_calling_available");
    }

    private static boolean ae()
    {
        return hlp.c(g.nU, cow).size() > 0;
    }

    private static boolean c(String s1)
    {
        return ((dup)hlp.a(g.nU, dup)).g().equals(s1);
    }

    public String A()
    {
        for (Iterator iterator = aoc.a(ac()).values().iterator(); iterator.hasNext();)
        {
            crp crp1 = (crp)iterator.next();
            if (crp1.d() && crp1.e())
            {
                return crp1.a();
            }
        }

        return null;
    }

    public boolean B()
    {
        return ac().d("can_opt_into_gv_sms_integration");
    }

    public boolean C()
    {
        return b.c(h());
    }

    public boolean D()
    {
        return d != null;
    }

    public boolean E()
    {
        return ac().d("is_business_features_eligible");
    }

    public boolean F()
    {
        return ac().d("is_business_features_enabled");
    }

    public boolean G()
    {
        return ac().d("business_features_promo_shown");
    }

    public boolean H()
    {
        return ac().a("phone_verification_prompt_shown", true);
    }

    public boolean I()
    {
        return ac().d("gv_can_use_caller_id_feature");
    }

    public int J()
    {
        if (e)
        {
            return 3;
        }
        return !r() && !C() ? 1 : 0;
    }

    public String L()
    {
        if (P())
        {
            String s1 = eey.g();
            if (!TextUtils.isEmpty(s1))
            {
                return eey.k(s1);
            } else
            {
                return "unknown_sim_number";
            }
        } else
        {
            return null;
        }
    }

    public String M()
    {
        if (C())
        {
            String s1 = A();
            if (s1 != null)
            {
                s1 = String.valueOf(eey.k(s1));
                String s2 = String.valueOf("_gv");
                if (s2.length() != 0)
                {
                    return s1.concat(s2);
                } else
                {
                    return new String(s1);
                }
            }
        }
        return null;
    }

    public boolean N()
    {
        String s1 = A();
        return !TextUtils.isEmpty(s1) && c(s1);
    }

    public boolean O()
    {
        while (e || !P() || !C()) 
        {
            return false;
        }
        return c("auto");
    }

    public boolean P()
    {
        return r() && eey.f() && (e || !b.i(h()));
    }

    public int Q()
    {
        byte byte0;
        boolean flag;
        boolean flag1;
        byte0 = 2;
        if (e)
        {
            return 3;
        }
        flag = P();
        flag1 = C();
        if (!flag || !flag1) goto _L2; else goto _L1
_L1:
        String s3 = ((dup)hlp.a(g.nU, dup)).g();
        if (!s3.equals("auto")) goto _L4; else goto _L3
_L3:
        byte0 = 0;
_L7:
        return byte0;
_L4:
        if (!s3.equals(L()))
        {
            if (!s3.equals(M()))
            {
                String s2 = A();
                String s1 = s2;
                if (s2 != null)
                {
                    s1 = eey.k(s2);
                }
                if (s3.equals(s1))
                {
                    byte0 = 2;
                } else
                {
                    byte0 = 3;
                }
            }
            continue; /* Loop/switch isn't completed */
        }
          goto _L5
_L2:
        if (flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        byte0 = 3;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public String R()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        stringbuilder.append(eev.b(c));
        return stringbuilder.toString();
    }

    public void S()
    {
        g = true;
    }

    public void T()
    {
        h = true;
    }

    public int U()
    {
        byte byte0 = 3;
        if (ad()) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L4:
        return i1;
_L2:
        if (!ac().d("gv_emergency_dialing_supported"))
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = byte0;
        if (!ae()) goto _L4; else goto _L3
_L3:
        if (ac().d("is_gv_calling_available"))
        {
            return 1;
        }
        i1 = byte0;
        if (ac().d("gv_should_show_voice_tos"))
        {
            return 2;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public boolean V()
    {
        int i1;
        if (ad())
        {
            if ((i1 = U()) == 1 || i1 == 2)
            {
                return true;
            }
        }
        return false;
    }

    public String W()
    {
        if (!ad())
        {
            return null;
        } else
        {
            return ac().b("gv_account_balance");
        }
    }

    public boolean X()
    {
        while (!ad() || !ac().d("gv_emergency_dialing_supported") || !ae()) 
        {
            return false;
        }
        return true;
    }

    public boolean Y()
    {
        return b.d(h());
    }

    public boolean Z()
    {
        return B() && g.a(this, aqc.b) && !ac().d("gv_sms_integration_shown") && !C();
    }

    public int a(int i1)
    {
        int j1 = Q();
        if (j1 == 0)
        {
            if (g.e(i1))
            {
                return i1;
            } else
            {
                return 2;
            }
        } else
        {
            return j1;
        }
    }

    public String a()
    {
        return c;
    }

    public boolean a(cgd cgd1)
    {
        if (!f())
        {
            return false;
        } else
        {
            return f.a(cgd1);
        }
    }

    public boolean a(String s1)
    {
        s1 = (crp)aoc.a(ac()).get(s1);
        return s1 != null && s1.b();
    }

    public boolean aa()
    {
        boolean flag = false;
        if (!D() || g.a(g.nU, "babel_enable_plus_page_video", false))
        {
            flag = true;
        }
        return flag;
    }

    public String ab()
    {
        return d;
    }

    public cgd b()
    {
        if (!f())
        {
            String s1 = String.valueOf(eev.b(c));
            eev.g("Babel", (new StringBuilder(String.valueOf(s1).length() + 73)).append("mParticipantId id not yet set for account: ").append(s1).append(" -- account not yet signed in?").toString());
            throw new IllegalStateException("mParticipantId id not yet set, account not yet signed in?");
        } else
        {
            return f;
        }
    }

    public boolean b(String s1)
    {
        s1 = (crp)aoc.a(ac()).get(s1);
        return s1 != null && s1.d();
    }

    public String c()
    {
        if (e)
        {
            return g.nU.getString(l.jF);
        } else
        {
            return ac().b("display_name");
        }
    }

    public String d()
    {
        String s1 = c();
        if (D() && !TextUtils.isEmpty(s1))
        {
            return s1;
        } else
        {
            return c;
        }
    }

    public boolean e()
    {
        while (!f() || TextUtils.isEmpty(f.a) || g()) 
        {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof aoa))
        {
            obj = (aoa)obj;
            if (c.equals(((aoa) (obj)).c) && TextUtils.equals(d, ((aoa) (obj)).d))
            {
                return true;
            }
        }
        return false;
    }

    public boolean f()
    {
        if (f == null)
        {
            grb grb1 = ac();
            if (grb1.a("gaia_id") || grb1.a("chat_id"))
            {
                f = new cgd(grb1.b("gaia_id"), grb1.b("chat_id"));
            }
            if (f == null)
            {
                return false;
            }
        }
        return true;
    }

    public boolean g()
    {
        if (f() && !TextUtils.isEmpty(f.a)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        boolean flag;
        if (dcn.x() || ac().a("allowed_for_domain", true))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (ac().a("chat_archive_enabled", true) || l())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !ac().d("blocked_for_child")) goto _L1; else goto _L3
_L3:
        return true;
    }

    public int h()
    {
        int i1 = a.b(c, d);
        if (i1 == -1)
        {
            eev.f("Babel", "Returning invalid account ID");
        }
        return i1;
    }

    public int hashCode()
    {
        int j1 = c.hashCode();
        int i1 = j1;
        if (d != null)
        {
            i1 = j1 * 31 + d.hashCode();
        }
        return i1;
    }

    public boolean i()
    {
        return b.h(h());
    }

    public String j()
    {
        return ac().a("domain_name", "");
    }

    public boolean k()
    {
        return ac().d("show_chat_warning");
    }

    public boolean l()
    {
        return b.e(h());
    }

    public boolean m()
    {
        return ac().d("is_history_forced");
    }

    public boolean n()
    {
        return ac().d("is_history_default_on");
    }

    public boolean o()
    {
        return e;
    }

    public boolean p()
    {
        return b.a(h());
    }

    public boolean q()
    {
        return ac().d("is_sms_account");
    }

    public boolean r()
    {
        return b.b(h());
    }

    public boolean s()
    {
        return !e && ac().a("allowed_for_domain", true);
    }

    public boolean t()
    {
        return !e;
    }

    public String toString()
    {
        String s2 = String.valueOf(c);
        String s1;
        if (d != null)
        {
            s1 = String.valueOf(d);
            if (s1.length() != 0)
            {
                s1 = "-".concat(s1);
            } else
            {
                s1 = new String("-");
            }
        } else
        {
            s1 = "";
        }
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            return s2.concat(s1);
        } else
        {
            return new String(s2);
        }
    }

    public boolean u()
    {
        return ac().d("last_seen_promo_shown");
    }

    public String v()
    {
        return ac().b("profile_photo_url");
    }

    public boolean w()
    {
        for (Iterator iterator = aoc.a(ac()).values().iterator(); iterator.hasNext();)
        {
            crp crp1 = (crp)iterator.next();
            if (crp1 != null && crp1.c())
            {
                return true;
            }
        }

        return false;
    }

    public ArrayList x()
    {
        Object obj = aoc.a(ac());
        ArrayList arraylist = new ArrayList();
        obj = ((Map) (obj)).values().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            crp crp1 = (crp)((Iterator) (obj)).next();
            if (crp1.b())
            {
                arraylist.add(crp1.a());
            }
        } while (true);
        return arraylist;
    }

    public boolean y()
    {
        return A() != null;
    }

    public String z()
    {
        for (Iterator iterator = aoc.a(ac()).values().iterator(); iterator.hasNext();)
        {
            crp crp1 = (crp)iterator.next();
            if (crp1.d() && crp1.e())
            {
                return eey.p(crp1.a());
            }
        }

        return g.nU.getResources().getString(l.jR);
    }
}
