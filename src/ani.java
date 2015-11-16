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

public final class ani
{

    private final gms a;
    private final String b;
    private final String c;
    private final boolean d;
    private cey e;
    private boolean f;
    private boolean g;

    public ani(gms gms1, String s1, String s2)
    {
        a = gms1;
        b = (String)gbh.b(s1);
        c = s2;
        d = "SMS".equals(b);
    }

    public static String N()
    {
        String s1 = ebz.g();
        if (!TextUtils.isEmpty(s1))
        {
            return ebz.p(ebz.k(s1));
        } else
        {
            return g.nS.getResources().getString(l.ky);
        }
    }

    private gmu af()
    {
        return a.a(h());
    }

    private boolean ag()
    {
        return af().a("is_gv_calling_available");
    }

    private static boolean ah()
    {
        return hgx.c(g.nS, cne).size() > 0;
    }

    private static boolean c(String s1)
    {
        return ((drw)hgx.a(g.nS, drw)).f().equals(s1);
    }

    public boolean A()
    {
        return C() != null;
    }

    public String B()
    {
        for (Iterator iterator = ank.a(af()).values().iterator(); iterator.hasNext();)
        {
            cpy cpy1 = (cpy)iterator.next();
            if (cpy1.d() && cpy1.e())
            {
                return ebz.p(cpy1.a());
            }
        }

        return g.nS.getResources().getString(l.ky);
    }

    public String C()
    {
        for (Iterator iterator = ank.a(af()).values().iterator(); iterator.hasNext();)
        {
            cpy cpy1 = (cpy)iterator.next();
            if (cpy1.d() && cpy1.e())
            {
                return cpy1.a();
            }
        }

        return null;
    }

    public boolean D()
    {
        return af().d("can_opt_into_gv_sms_integration");
    }

    public boolean E()
    {
        return af().d("is_gv_sms_integration_enabled");
    }

    public boolean F()
    {
        return c != null;
    }

    public boolean G()
    {
        return af().d("is_business_features_eligible");
    }

    public boolean H()
    {
        return af().d("is_business_features_enabled");
    }

    public boolean I()
    {
        return af().d("business_features_promo_shown");
    }

    public boolean J()
    {
        return af().a("phone_verification_prompt_shown", true);
    }

    public boolean K()
    {
        return af().d("gv_can_use_caller_id_feature");
    }

    public boolean L()
    {
        return af().a("is_photo_service_enabled", true);
    }

    public int M()
    {
        if (d)
        {
            return 3;
        }
        return !t() && !E() ? 1 : 0;
    }

    public String O()
    {
        if (S())
        {
            String s1 = ebz.g();
            if (!TextUtils.isEmpty(s1))
            {
                return ebz.k(s1);
            } else
            {
                return "unknown_sim_number";
            }
        } else
        {
            return null;
        }
    }

    public String P()
    {
        if (E())
        {
            String s1 = C();
            if (s1 != null)
            {
                s1 = String.valueOf(ebz.k(s1));
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

    public boolean Q()
    {
        String s1 = C();
        return !TextUtils.isEmpty(s1) && c(s1);
    }

    public boolean R()
    {
        while (d || !S() || !E()) 
        {
            return false;
        }
        return c("auto");
    }

    public boolean S()
    {
        return t() && ebz.f();
    }

    public int T()
    {
        byte byte0;
        boolean flag;
        boolean flag1;
        byte0 = 2;
        if (d)
        {
            return 3;
        }
        flag = S();
        flag1 = E();
        if (!flag || !flag1) goto _L2; else goto _L1
_L1:
        String s3 = ((drw)hgx.a(g.nS, drw)).f();
        if (!s3.equals("auto")) goto _L4; else goto _L3
_L3:
        byte0 = 0;
_L7:
        return byte0;
_L4:
        if (!s3.equals(O()))
        {
            if (!s3.equals(P()))
            {
                String s2 = C();
                String s1 = s2;
                if (s2 != null)
                {
                    s1 = ebz.k(s2);
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

    public String U()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        stringbuilder.append(ebw.b(b));
        return stringbuilder.toString();
    }

    public void V()
    {
        f = true;
    }

    public void W()
    {
        g = true;
    }

    public int X()
    {
        byte byte0 = 3;
        if (ag()) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L4:
        return i1;
_L2:
        if (!af().d("gv_emergency_dialing_supported"))
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = byte0;
        if (!ah()) goto _L4; else goto _L3
_L3:
        if (af().d("is_gv_calling_available"))
        {
            return 1;
        }
        i1 = byte0;
        if (af().d("gv_should_show_voice_tos"))
        {
            return 2;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public boolean Y()
    {
        int i1;
        if (ag())
        {
            if ((i1 = X()) == 1 || i1 == 2)
            {
                return true;
            }
        }
        return false;
    }

    public String Z()
    {
        if (!ag())
        {
            return null;
        } else
        {
            return af().b("gv_account_balance");
        }
    }

    public int a(int i1)
    {
        int j1 = T();
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
        return b;
    }

    public boolean a(cey cey1)
    {
        if (!f())
        {
            return false;
        } else
        {
            return e.a(cey1);
        }
    }

    public boolean a(String s1)
    {
        s1 = (cpy)ank.a(af()).get(s1);
        return s1 != null && s1.b();
    }

    public boolean aa()
    {
        while (!ag() || !af().d("gv_emergency_dialing_supported") || !ah()) 
        {
            return false;
        }
        return true;
    }

    public boolean ab()
    {
        return ag() && af().d("gv_use_tycho_branding");
    }

    public boolean ac()
    {
        return D() && g.a(this, apk.b) && !af().d("gv_sms_integration_shown") && !E();
    }

    public boolean ad()
    {
        boolean flag = false;
        if (!F() || g.a(g.nS, "babel_enable_plus_page_video", false))
        {
            flag = true;
        }
        return flag;
    }

    public String ae()
    {
        return c;
    }

    public cey b()
    {
        if (!f())
        {
            String s1 = String.valueOf(ebw.b(b));
            ebw.g("Babel", (new StringBuilder(String.valueOf(s1).length() + 73)).append("mParticipantId id not yet set for account: ").append(s1).append(" -- account not yet signed in?").toString());
            throw new IllegalStateException("mParticipantId id not yet set, account not yet signed in?");
        } else
        {
            return e;
        }
    }

    public boolean b(String s1)
    {
        s1 = (cpy)ank.a(af()).get(s1);
        return s1 != null && s1.d();
    }

    public String c()
    {
        if (d)
        {
            return g.nS.getString(l.km);
        } else
        {
            return af().b("display_name");
        }
    }

    public String d()
    {
        String s1 = c();
        if (F() && !TextUtils.isEmpty(s1))
        {
            return s1;
        } else
        {
            return b;
        }
    }

    public boolean e()
    {
        while (!f() || TextUtils.isEmpty(e.a) || g()) 
        {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof ani))
        {
            obj = (ani)obj;
            if (b.equals(((ani) (obj)).b) && TextUtils.equals(c, ((ani) (obj)).c))
            {
                return true;
            }
        }
        return false;
    }

    public boolean f()
    {
        if (e == null)
        {
            gmu gmu1 = af();
            if (gmu1.a("gaia_id") || gmu1.a("chat_id"))
            {
                e = new cey(gmu1.b("gaia_id"), gmu1.b("chat_id"));
            }
            if (e == null)
            {
                return false;
            }
        }
        return true;
    }

    public boolean g()
    {
        if (f() && !TextUtils.isEmpty(e.a)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        boolean flag;
        if (dbf.x() || af().a("allowed_for_domain", true))
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
        if (af().a("chat_archive_enabled", true) || n())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !af().d("blocked_for_child")) goto _L1; else goto _L3
_L3:
        return true;
    }

    public int h()
    {
        int i1 = a.b(b, c);
        if (i1 == -1)
        {
            ebw.f("Babel", "Returning invalid account ID");
        }
        return i1;
    }

    public int hashCode()
    {
        int j1 = b.hashCode();
        int i1 = j1;
        if (c != null)
        {
            i1 = j1 * 31 + c.hashCode();
        }
        return i1;
    }

    public boolean i()
    {
        boolean flag = false;
        if (af().a("account_age_group", 0) == 3)
        {
            flag = true;
        }
        return flag;
    }

    public boolean j()
    {
        boolean flag = false;
        int i1 = af().a("account_age_group", 0);
        if (i1 == 3 || i1 == 2)
        {
            flag = true;
        }
        return flag;
    }

    public boolean k()
    {
        return af().d("is_google_plus");
    }

    public String l()
    {
        return af().a("domain_name", "");
    }

    public boolean m()
    {
        return af().d("show_chat_warning");
    }

    public boolean n()
    {
        return !af().a("allowed_for_domain", true);
    }

    public boolean o()
    {
        return af().d("is_history_forced");
    }

    public boolean p()
    {
        return af().d("is_history_default_on");
    }

    public boolean q()
    {
        return d;
    }

    public boolean r()
    {
        return t() || E();
    }

    public boolean s()
    {
        return af().d("is_sms_account");
    }

    public boolean t()
    {
        return dbf.j() && (s() || d);
    }

    public String toString()
    {
        String s2 = String.valueOf(b);
        String s1;
        if (c != null)
        {
            s1 = String.valueOf(c);
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
        return !d && af().a("allowed_for_domain", true);
    }

    public boolean v()
    {
        return !d;
    }

    public boolean w()
    {
        return af().d("last_seen_promo_shown");
    }

    public String x()
    {
        return af().b("profile_photo_url");
    }

    public boolean y()
    {
        for (Iterator iterator = ank.a(af()).values().iterator(); iterator.hasNext();)
        {
            cpy cpy1 = (cpy)iterator.next();
            if (cpy1 != null && cpy1.c())
            {
                return true;
            }
        }

        return false;
    }

    public ArrayList z()
    {
        Object obj = ank.a(af());
        ArrayList arraylist = new ArrayList();
        obj = ((Map) (obj)).values().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            cpy cpy1 = (cpy)((Iterator) (obj)).next();
            if (cpy1.b())
            {
                arraylist.add(cpy1.a());
            }
        } while (true);
        return arraylist;
    }
}
