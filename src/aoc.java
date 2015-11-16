// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class aoc
    implements gre, hcb
{

    private static final boolean a = false;
    private final Context b;

    aoc(Context context)
    {
        b = context;
    }

    public static long a(Context context, int i1, String s, long l1)
    {
        return ((gqz)hlp.a(context, gqz)).a(i1).a(s, l1);
    }

    public static aoa a(Context context, String s, String s1)
    {
        boolean flag = "SMS".equals(s);
        gqz gqz1 = (gqz)hlp.a(context, gqz);
        int i1 = gqz1.b(s, s1);
        if (flag)
        {
            gqz1.b(i1).c("gaia_id", "_sms_only_account").c("chat_id", "_sms_only_account").c("sms_only", true).c("is_managed_account", true).d();
        }
        return new aoa((gqz)hlp.a(context, gqz), (ahd)hlp.a(context, ahd), s, s1);
    }

    public static cgd a(Context context, int i1)
    {
        Object obj = ((gqz)hlp.a(context, gqz)).a(i1);
        if (obj != null)
        {
            context = ((grb) (obj)).a("gaia_id", null);
            obj = ((grb) (obj)).a("chat_id", null);
            if (obj != null || context != null)
            {
                return new cgd(context, ((String) (obj)));
            }
        }
        return null;
    }

    public static List a(Context context)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = context.getSharedPreferences("accounts", 0).getAll().entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)((java.util.Map.Entry)iterator.next()).getKey();
            if (s.endsWith(".logged_in"))
            {
                arraylist.add(Integer.valueOf(Integer.parseInt(s.substring(0, s.indexOf(".")))));
            }
        } while (true);
        g.d(context);
        return arraylist;
    }

    public static Map a(grb grb1)
    {
        Object obj = grb1.c("phone_verification");
        grb1 = new gz();
        if (obj == null || ((Set) (obj)).size() == 0)
        {
            return grb1;
        }
        obj = ((Set) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            crp crp1 = crp.a((String)((Iterator) (obj)).next());
            if (crp1 != null)
            {
                grb1.put(crp1.a(), crp1);
            }
        } while (true);
        return grb1;
    }

    private static Set a(Map map)
    {
        if (map == null || map.size() == 0)
        {
            return null;
        }
        HashSet hashset = new HashSet();
        for (map = map.values().iterator(); map.hasNext(); hashset.add(((crp)map.next()).toString())) { }
        return hashset;
    }

    public static void a(Context context, int i1, String s)
    {
        context = ((gqz)hlp.a(context, gqz)).b(i1);
        context.c(s, 1L + context.a(s, 0L)).d();
    }

    public static void a(Context context, aoa aoa1)
    {
        int i1 = aoa1.h();
        RealTimeChatService.a(i1, 19, true);
        ((gqz)hlp.a(context, gqz)).b(i1).c("last_seen_promo_shown", true).d();
    }

    public static void a(Context context, aoa aoa1, long l1)
    {
        ((gqz)hlp.a(context, gqz)).b(aoa1.h()).c("registration_time", l1).d();
    }

    public static void a(Context context, aoa aoa1, String s)
    {
        if (a)
        {
            String s1 = String.valueOf(eev.b(aoa1.a()));
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 26 + String.valueOf(s).length())).append("setAvatarUrl: ").append(s1).append(" avatarUrl: ").append(s).toString());
        }
        context = ((gqz)hlp.a(context, gqz)).b(aoa1.h());
        context.c("profile_photo_url", s);
        context.d();
    }

    public static void a(Context context, aoa aoa1, boolean flag)
    {
        RealTimeChatService.a(aoa1.h(), 14, true);
        ((gqz)hlp.a(context, gqz)).b(aoa1.h()).c("gv_sms_integration_shown", true).d();
        b(context, aoa1, flag);
    }

    public static void a(Context context, aoa aoa1, boolean flag, boolean flag1, boolean flag2, String s, boolean flag3, boolean flag4, 
            boolean flag5, boolean flag6, boolean flag7)
    {
        if (a)
        {
            Object obj = String.valueOf(aoa1.R());
            grd grd1;
            boolean flag8;
            if (((String) (obj)).length() != 0)
            {
                obj = "updateAccountVoiceInfo before: ".concat(((String) (obj)));
            } else
            {
                obj = new String("updateAccountVoiceInfo before: ");
            }
            eev.b("Babel", ((String) (obj)));
        }
        obj = (dbt)hlp.a(context, dbt);
        flag8 = ((dbt) (obj)).b(context, aoa1);
        grd1 = ((gqz)hlp.a(context, gqz)).b(aoa1.h());
        grd1.c("is_gv_calling_available", flag);
        grd1.c("gv_should_show_voice_tos", flag1);
        grd1.c("gv_emergency_dialing_supported", flag2);
        grd1.c("gv_account_balance", s);
        grd1.c("gv_fmf_promo_applicable", flag3);
        grd1.c("gv_fmf_promo_could_be_applicable", flag4);
        grd1.c("gv_fmf_promo_add_credit", flag5);
        grd1.c("gv_fmf_promo_gv_tos_required", flag6);
        grd1.c("gv_use_tycho_branding", flag7);
        grd1.d();
        flag = ((dbt) (obj)).b(context, aoa1);
        eev.c("Babel", (new StringBuilder(74)).append("previousIncomingPhoneCallsWanted: ").append(flag8).append(" newIncomingPhoneCallsWanted: ").append(flag).toString());
        if (flag8 != flag)
        {
            context = String.valueOf(eev.b(aoa1.a()));
            if (context.length() != 0)
            {
                context = "Re-register account to update the incoming calls preference for account ".concat(context);
            } else
            {
                context = new String("Re-register account to update the incoming calls preference for account ");
            }
            eev.e("Babel", context);
            dcn.c(aoa1);
        }
        if (a)
        {
            context = String.valueOf(aoa1.R());
            if (context.length() != 0)
            {
                context = "updateAccountVoiceInfo after: ".concat(context);
            } else
            {
                context = new String("updateAccountVoiceInfo after: ");
            }
            eev.b("Babel", context);
        }
    }

    public static void a(Context context, String s)
    {
        context = context.getSharedPreferences("accounts", 0).edit();
        context.putString("referrer_url", s);
        context.apply();
    }

    private static void a(Context context, Integer ainteger[])
    {
        if (ainteger.length == 0)
        {
            return;
        } else
        {
            (new Thread(new aod(ainteger, context))).start();
            return;
        }
    }

    public static void a(grd grd1, cgd cgd1, String s, boolean flag, String s1, String s2, Map map, aob aob1, 
            String as[], boolean flag1)
    {
        if (cgd1 != null && cgd1.a != null)
        {
            grd1.b("gaia_id", cgd1.a);
        } else
        {
            grd1.f("gaia_id");
        }
        if (cgd1 != null && cgd1.b != null)
        {
            grd1.b("chat_id", cgd1.b);
        } else
        {
            grd1.f("chat_id");
        }
        grd1.b("display_name", s);
        grd1.b("is_google_plus", flag);
        grd1.b("domain_name", s1);
        grd1.b("show_chat_warning", flag1);
        if (as != null && as.length > 0)
        {
            cgd1 = new StringBuilder();
            for (int i1 = 0; i1 < as.length; i1++)
            {
                if (i1 > 0)
                {
                    cgd1.append(",");
                }
                cgd1.append(as[i1]);
            }

            grd1.b("plus_page_gaia_ids", cgd1.toString());
        } else
        {
            grd1.f("plus_page_gaia_ids");
        }
        grd1.b("profile_photo_url", s2);
        if (map != null)
        {
            grd1.a("phone_verification", a(map));
        }
        if (aob1 != null)
        {
            grd1.b("allowed_for_domain", aob1.c);
            grd1.b("blocked_for_child", aob1.d);
            grd1.b("business_features_promo_shown", aob1.n);
            grd1.b("can_opt_into_gv_sms_integration", aob1.f);
            grd1.b("chat_archive_enabled", aob1.e);
            grd1.b("gplus_dismissed", aob1.b);
            grd1.b("gv_sms_integration_shown", aob1.g);
            grd1.b("is_business_features_eligible", aob1.l);
            grd1.b("is_business_features_enabled", aob1.m);
            grd1.b("account_age_group", aob1.a);
            grd1.b("is_gv_sms_integration_enabled", aob1.h);
            if (!TextUtils.isEmpty(aob1.u))
            {
                grd1.b("default_gmail_phone_region_code", aob1.u);
            }
            if (aob1.v != null)
            {
                grd1.b("default_gmail_phone_country_code", g.a(aob1.v, 0));
            }
            grd1.b("paid_dasher_user", aob1.i);
            grd1.b("is_history_forced", aob1.j);
            grd1.b("is_history_default_on", aob1.k);
            grd1.b("last_seen_promo_shown", aob1.o);
            grd1.b("phone_verification_prompt_shown", aob1.p);
            grd1.b("abuse_reporting_tos_shown", aob1.q);
            grd1.b("gv_can_use_caller_id_feature", aob1.r);
            grd1.b("is_photo_service_enabled", aob1.s);
            grd1.b("invite_notifications_enabled", aob1.t);
        }
    }

    public static void a(grd grd1, String s, byte abyte0[])
    {
        grd1.c(s, Base64.encodeToString(abyte0, 0));
    }

    private static Integer[] a(SharedPreferences sharedpreferences)
    {
        ArrayList arraylist = new ArrayList();
        int j1 = sharedpreferences.getInt("count", 0);
        int i1 = 0;
        while (i1 < j1) 
        {
            String s2 = (new StringBuilder(12)).append(i1).append(".").toString();
            String s = String.valueOf(s2);
            String s1 = String.valueOf("account_name");
            if (s1.length() != 0)
            {
                s = s.concat(s1);
            } else
            {
                s = new String(s);
            }
            s1 = sharedpreferences.getString(s, sharedpreferences.getString(String.valueOf(s2).concat("name"), ""));
            s = String.valueOf(s2);
            s2 = String.valueOf("gaia_id");
            if (s2.length() != 0)
            {
                s = s.concat(s2);
            } else
            {
                s = new String(s);
            }
            s = sharedpreferences.getString(s, null);
            if (TextUtils.isEmpty(s1) || s1.equals(s))
            {
                arraylist.add(Integer.valueOf(i1));
            }
            i1++;
        }
        return (Integer[])arraylist.toArray(new Integer[arraylist.size()]);
    }

    public static grb b(Context context, int i1)
    {
        context = (gqz)hlp.a(context, gqz);
        if (!context.c(i1))
        {
            return null;
        } else
        {
            return context.a(i1);
        }
    }

    public static void b(Context context)
    {
        context.getSharedPreferences("accounts", 0).edit().putBoolean("warning_is_displayed", false).apply();
    }

    public static void b(Context context, int i1, String s)
    {
        ((gqz)hlp.a(context, gqz)).b(i1).h(s).d();
    }

    public static void b(Context context, int i1, String s, long l1)
    {
        ((gqz)hlp.a(context, gqz)).b(i1).c(s, l1).d();
    }

    public static void b(Context context, aoa aoa1)
    {
        ((gqz)hlp.a(context, gqz)).b(aoa1.h()).c("diagnostics_promo_shown", true).d();
    }

    public static void b(Context context, aoa aoa1, long l1)
    {
        ((gqz)hlp.a(context, gqz)).b(aoa1.h()).c("sticker_cache_time", l1).d();
    }

    public static void b(Context context, aoa aoa1, String s)
    {
        ((gqz)hlp.a(context, gqz)).b(aoa1.h()).c("full_jid", s).d();
    }

    public static void b(Context context, aoa aoa1, boolean flag)
    {
        if (a)
        {
            String s = String.valueOf(eev.b(aoa1.a()));
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 38)).append("setGvSmsIntegration: ").append(s).append(" gvEnabled: ").append(flag).toString());
        }
        RealTimeChatService.a(aoa1.h(), 13, flag);
        ((gqz)hlp.a(context, gqz)).b(aoa1.h()).c("is_gv_sms_integration_enabled", flag).d();
        if (!flag)
        {
            ((gqz)hlp.a(context, gqz)).b(aoa1.h()).c("can_opt_into_gv_sms_integration", true).d();
        }
    }

    public static String c(Context context, int i1)
    {
        grb grb1 = b(context, i1);
        if (grb1 != null) goto _L2; else goto _L1
_L1:
        context = null;
_L4:
        return context;
_L2:
        String s;
        if (grb1.d("sms_only"))
        {
            return context.getString(l.jF);
        }
        if (grb1.b("effective_gaia_id") == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s = grb1.b("display_name");
        context = s;
        if (!TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
        return grb1.b("account_name");
    }

    public static void c(Context context)
    {
        context.getSharedPreferences("accounts", 0).edit().putBoolean("location_tos_accepted", true).apply();
    }

    public static void c(Context context, aoa aoa1, boolean flag)
    {
        RealTimeChatService.a(aoa1.h(), 17, flag);
        ((gqz)hlp.a(context, gqz)).b(aoa1.h()).c("is_business_features_enabled", flag).d();
    }

    public static boolean c(Context context, aoa aoa1)
    {
        return ((gqz)hlp.a(context, gqz)).a(aoa1.h()).a("diagnostics_promo_shown", false);
    }

    public static byte[] c(Context context, int i1, String s)
    {
        context = ((gqz)hlp.a(context, gqz)).a(i1).b(s);
        if (TextUtils.isEmpty(context))
        {
            return null;
        } else
        {
            return Base64.decode(context, 0);
        }
    }

    public static String d(Context context, int i1)
    {
        context = b(context, i1);
        if (context == null)
        {
            return null;
        } else
        {
            return context.b("gaia_id");
        }
    }

    public static void d(Context context, aoa aoa1)
    {
        if (a)
        {
            String s = String.valueOf(eev.b(aoa1.a()));
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 49)).append("setGmailChatArchiveEnabled: ").append(s).append(" enableArchive: true").toString());
        }
        RealTimeChatService.a(aoa1.h(), 6, true);
        ((gqz)hlp.a(context, gqz)).b(aoa1.h()).c("chat_archive_enabled", true).d();
    }

    public static boolean d(Context context)
    {
        return context.getSharedPreferences("accounts", 0).getBoolean("location_tos_accepted", false);
    }

    public static cgd e(Context context, int i1)
    {
        context = b(context, i1);
        if (context == null)
        {
            return null;
        } else
        {
            return new cgd(context.b("gaia_id"), context.b("chat_id"));
        }
    }

    public static String e(Context context)
    {
        return context.getSharedPreferences("accounts", 0).getString("referrer_url", "");
    }

    public static void e(Context context, aoa aoa1)
    {
        RealTimeChatService.a(aoa1.h(), 16, true);
        ((gqz)hlp.a(context, gqz)).b(aoa1.h()).c("business_features_promo_shown", true).d();
    }

    public static void f(Context context, aoa aoa1)
    {
        RealTimeChatService.a(aoa1.h(), 27, true);
        ((gqz)hlp.a(context, gqz)).b(aoa1.h()).c("phone_verification_prompt_shown", true).d();
    }

    public static boolean f(Context context, int i1)
    {
        context = (gqz)hlp.a(context, gqz);
        if (!context.c(i1))
        {
            return false;
        }
        context = context.a(i1);
        return context.b("effective_gaia_id") != null && context.d("is_business_features_enabled");
    }

    public static String g(Context context, aoa aoa1)
    {
        return ((gqz)hlp.a(context, gqz)).a(aoa1.h()).a("full_jid", null);
    }

    public static boolean g(Context context, int i1)
    {
        return !((gqz)hlp.a(context, gqz)).d(i1);
    }

    public static void h(Context context, aoa aoa1)
    {
        context = (gqz)hlp.a(context, gqz);
        Iterator iterator = context.a(new String[] {
            "is_sms_account"
        }).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            int i1 = g.a((Integer)iterator.next(), 0);
            if (i1 != aoa1.h())
            {
                context.b(i1).c("is_sms_account", false).d();
            }
        } while (true);
        context.b(aoa1.h()).c("is_sms_account", true).d();
    }

    public static boolean h(Context context, int i1)
    {
        return ((gqz)hlp.a(context, gqz)).a(i1).d("logged_out");
    }

    public static long i(Context context, aoa aoa1)
    {
        return ((gqz)hlp.a(context, gqz)).a(aoa1.h()).a("registration_time", -1L);
    }

    public static boolean i(Context context, int i1)
    {
        return ((gqz)hlp.a(context, gqz)).a(i1).a("contact_permission_banner_shown", false);
    }

    public static void j(Context context, int i1)
    {
        ((gqz)hlp.a(context, gqz)).b(i1).c("contact_permission_banner_shown", true).d();
    }

    public static boolean j(Context context, aoa aoa1)
    {
        return (aoa1.i() || eep.b()) && !((gqz)hlp.a(context, gqz)).a(aoa1.h()).a("minor_hangout_consent", false);
    }

    public static void k(Context context, aoa aoa1)
    {
        ((gqz)hlp.a(context, gqz)).b(aoa1.h()).c("minor_hangout_consent", true).d();
    }

    public static long l(Context context, aoa aoa1)
    {
        return ((gqz)hlp.a(context, gqz)).a(aoa1.h()).a("setting_time", -1L);
    }

    public static void m(Context context, aoa aoa1)
    {
        ((gqz)hlp.a(context, gqz)).b(aoa1.h()).c("setting_time", -1L).d();
    }

    public static long n(Context context, aoa aoa1)
    {
        return ((gqz)hlp.a(context, gqz)).a(aoa1.h()).a("sticker_cache_time", -1L);
    }

    public void a(int i1)
    {
        grb grb1 = ((gqz)hlp.a(b, gqz)).a(i1);
        if (grb1.d("logged_out"))
        {
            cfo.e(b, i1);
            if (!grb1.d("sms_only"))
            {
                eev.e("Babel", (new StringBuilder(38)).append("Account update: ").append(i1).append(" logged off").toString());
                aps.b(b, i1);
                ((gqz)hlp.a(b, gqz)).b(i1).h(EsProvider.a(3)).h(EsProvider.a(1)).h(EsProvider.a(2)).h(EsProvider.a(5)).h(EsProvider.a(4)).h("last_invite_seen_timestamp").h("last_suggested_contacts_time").h("sms_last_full_sync_time_millis").h("refresh_participants_time").h("last_warm_sync_localtime").h("last_successful_sync_time").h("sms_last_sync_time_millis").h("hash_pinned").h("hash_favorites").h("hash_people_you_hangout_with").h("hash_other_people_on_hangout").h("hash_dismissed_contacts").d();
            }
        } else
        if (grb1.d("logged_in"))
        {
            aoa aoa1 = dcn.e(i1);
            if (aoa1.e())
            {
                String s = String.valueOf(eev.b(aoa1.a()));
                if (s.length() != 0)
                {
                    s = "activateAccount: ".concat(s);
                } else
                {
                    s = new String("activateAccount: ");
                }
                eev.c("Babel", s);
                aps.a(b, aoa1.h()).c();
                return;
            }
        }
    }

    public void a(Context context, grd grd1)
    {
        if (!"SMS".equals(grd1.b("account_name"))) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        context = context.getSharedPreferences("accounts", 0);
        j1 = context.getInt("count", 0);
        i1 = 0;
_L7:
        if (i1 >= j1) goto _L2; else goto _L3
_L3:
        String s;
        s = String.valueOf("account_name");
        s = context.getString((new StringBuilder(String.valueOf(s).length() + 12)).append(i1).append(".").append(s).toString(), null);
        if (s == null || !s.equals("SMS")) goto _L5; else goto _L4
_L4:
        String s1 = String.valueOf("is_sms_account");
        grd1.b("is_sms_account", context.getBoolean((new StringBuilder(String.valueOf(s1).length() + 12)).append(i1).append(".").append(s1).toString(), false));
_L2:
        return;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void a(List list)
    {
        boolean flag = false;
        Context context = b;
        SharedPreferences sharedpreferences = context.getSharedPreferences("accounts", 0);
        Object obj = new ArrayList();
        int k1 = sharedpreferences.getInt("count", 0);
        for (int i1 = 0; i1 < k1; i1++)
        {
            if (sharedpreferences.getBoolean((new StringBuilder(22)).append(i1).append(".logged_off").toString(), false))
            {
                ((List) (obj)).add(Integer.valueOf(i1));
            }
        }

        a(context, (Integer[])((List) (obj)).toArray(new Integer[((List) (obj)).size()]));
        if (sharedpreferences.contains("active"))
        {
            sharedpreferences.edit().putInt("key.active-hangouts-account", sharedpreferences.getInt("active", -1)).remove("active").apply();
        }
        obj = sharedpreferences.edit();
        Map map = sharedpreferences.getAll();
        Integer ainteger[] = a(sharedpreferences);
        k1 = ainteger.length;
label0:
        for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
        {
            String s = String.valueOf(ainteger[j1]);
            s = (new StringBuilder(String.valueOf(s).length() + 1)).append(s).append(".").toString();
            Iterator iterator = map.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                String s1 = (String)((java.util.Map.Entry)iterator.next()).getKey();
                if (s1.startsWith(s))
                {
                    ((android.content.SharedPreferences.Editor) (obj)).remove(s1);
                }
            } while (true);
        }

        ((android.content.SharedPreferences.Editor) (obj)).apply();
        a(context, ainteger);
        list.add(new aoe(this));
        list.add(new aof(this));
        list.add(new aog(this));
        list.add(new aoh(this));
        list.add(new aoi(this));
        list.add(new aoj(this));
        list.add(new aok(this));
    }

    static 
    {
        hnc hnc = eev.d;
    }
}
