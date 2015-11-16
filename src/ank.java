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

public class ank
    implements gmx, gxq
{

    private static final boolean a = false;
    private final Context b;

    ank(Context context)
    {
        b = context;
    }

    public static long a(Context context, int i1, String s, long l1)
    {
        return ((gms)hgx.a(context, gms)).a(i1).a(s, l1);
    }

    public static ani a(Context context, String s, String s1)
    {
        boolean flag = "SMS".equals(s);
        gms gms1 = (gms)hgx.a(context, gms);
        int i1 = gms1.b(s, s1);
        if (flag)
        {
            gms1.b(i1).c("gaia_id", "_sms_only_account").c("chat_id", "_sms_only_account").c("sms_only", true).c("is_managed_account", true).d();
        }
        return new ani((gms)hgx.a(context, gms), s, s1);
    }

    public static cey a(Context context, int i1)
    {
        Object obj = ((gms)hgx.a(context, gms)).a(i1);
        if (obj != null)
        {
            context = ((gmu) (obj)).a("gaia_id", null);
            obj = ((gmu) (obj)).a("chat_id", null);
            if (obj != null || context != null)
            {
                return new cey(context, ((String) (obj)));
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

    public static Map a(gmu gmu1)
    {
        gz gz1;
        try
        {
            gmu1 = gmu1.c("phone_verification");
        }
        // Misplaced declaration of an exception variable
        catch (gmu gmu1)
        {
            ebw.f("Babel", "Not able to get phone verification state since it is in wrong format");
            gmu1 = null;
        }
        gz1 = new gz();
        if (gmu1 == null || gmu1.size() == 0)
        {
            return gz1;
        }
        gmu1 = gmu1.iterator();
        do
        {
            if (!gmu1.hasNext())
            {
                break;
            }
            cpy cpy1 = cpy.a((String)gmu1.next());
            if (cpy1 != null)
            {
                gz1.put(cpy1.a(), cpy1);
            }
        } while (true);
        return gz1;
    }

    private static Set a(Map map)
    {
        if (map == null || map.size() == 0)
        {
            return null;
        }
        HashSet hashset = new HashSet();
        for (map = map.values().iterator(); map.hasNext(); hashset.add(((cpy)map.next()).toString())) { }
        return hashset;
    }

    public static void a(Context context, int i1, String s)
    {
        context = ((gms)hgx.a(context, gms)).b(i1);
        context.c(s, 1L + context.a(s, 0L)).d();
    }

    public static void a(Context context, ani ani1)
    {
        int i1 = ani1.h();
        RealTimeChatService.a(i1, 19, true);
        ((gms)hgx.a(context, gms)).b(i1).c("last_seen_promo_shown", true).d();
    }

    public static void a(Context context, ani ani1, long l1)
    {
        ((gms)hgx.a(context, gms)).b(ani1.h()).c("registration_time", l1).d();
    }

    public static void a(Context context, ani ani1, String s)
    {
        if (a)
        {
            String s1 = String.valueOf(ebw.b(ani1.a()));
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 26 + String.valueOf(s).length())).append("setAvatarUrl: ").append(s1).append(" avatarUrl: ").append(s).toString());
        }
        context = ((gms)hgx.a(context, gms)).b(ani1.h());
        context.c("profile_photo_url", s);
        context.d();
    }

    public static void a(Context context, ani ani1, boolean flag)
    {
        RealTimeChatService.a(ani1.h(), 14, true);
        ((gms)hgx.a(context, gms)).b(ani1.h()).c("gv_sms_integration_shown", true).d();
        b(context, ani1, flag);
    }

    public static void a(Context context, ani ani1, boolean flag, boolean flag1, boolean flag2, String s, boolean flag3, boolean flag4, 
            boolean flag5, boolean flag6, boolean flag7)
    {
        if (a)
        {
            Object obj = String.valueOf(ani1.U());
            gmw gmw1;
            boolean flag8;
            if (((String) (obj)).length() != 0)
            {
                obj = "updateAccountVoiceInfo before: ".concat(((String) (obj)));
            } else
            {
                obj = new String("updateAccountVoiceInfo before: ");
            }
            ebw.b("Babel", ((String) (obj)));
        }
        obj = (dan)hgx.a(context, dan);
        flag8 = ((dan) (obj)).b(context, ani1);
        gmw1 = ((gms)hgx.a(context, gms)).b(ani1.h());
        gmw1.c("is_gv_calling_available", flag);
        gmw1.c("gv_should_show_voice_tos", flag1);
        gmw1.c("gv_emergency_dialing_supported", flag2);
        gmw1.c("gv_account_balance", s);
        gmw1.c("gv_fmf_promo_applicable", flag3);
        gmw1.c("gv_fmf_promo_could_be_applicable", flag4);
        gmw1.c("gv_fmf_promo_add_credit", flag5);
        gmw1.c("gv_fmf_promo_gv_tos_required", flag6);
        gmw1.c("gv_use_tycho_branding", flag7);
        gmw1.d();
        flag = ((dan) (obj)).b(context, ani1);
        ebw.c("Babel", (new StringBuilder(74)).append("previousIncomingPhoneCallsWanted: ").append(flag8).append(" newIncomingPhoneCallsWanted: ").append(flag).toString());
        if (flag8 != flag)
        {
            context = String.valueOf(ebw.b(ani1.a()));
            if (context.length() != 0)
            {
                context = "Re-register account to update the incoming calls preference for account ".concat(context);
            } else
            {
                context = new String("Re-register account to update the incoming calls preference for account ");
            }
            ebw.e("Babel", context);
            dbf.c(ani1);
        }
        if (a)
        {
            context = String.valueOf(ani1.U());
            if (context.length() != 0)
            {
                context = "updateAccountVoiceInfo after: ".concat(context);
            } else
            {
                context = new String("updateAccountVoiceInfo after: ");
            }
            ebw.b("Babel", context);
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
            (new Thread(new anl(ainteger, context))).start();
            return;
        }
    }

    public static void a(gmw gmw1, cey cey1, String s, boolean flag, String s1, String s2, Map map, anj anj1, 
            String as[], boolean flag1)
    {
        if (cey1 != null && cey1.a != null)
        {
            gmw1.b("gaia_id", cey1.a);
        } else
        {
            gmw1.f("gaia_id");
        }
        if (cey1 != null && cey1.b != null)
        {
            gmw1.b("chat_id", cey1.b);
        } else
        {
            gmw1.f("chat_id");
        }
        gmw1.b("display_name", s);
        gmw1.b("is_google_plus", flag);
        gmw1.b("domain_name", s1);
        gmw1.b("show_chat_warning", flag1);
        if (as != null && as.length > 0)
        {
            cey1 = new StringBuilder();
            for (int i1 = 0; i1 < as.length; i1++)
            {
                if (i1 > 0)
                {
                    cey1.append(",");
                }
                cey1.append(as[i1]);
            }

            gmw1.b("plus_page_gaia_ids", cey1.toString());
        } else
        {
            gmw1.f("plus_page_gaia_ids");
        }
        gmw1.b("profile_photo_url", s2);
        if (map != null)
        {
            gmw1.a("phone_verification", a(map));
        }
        if (anj1 != null)
        {
            gmw1.b("allowed_for_domain", anj1.c);
            gmw1.b("blocked_for_child", anj1.d);
            gmw1.b("business_features_promo_shown", anj1.n);
            gmw1.b("can_opt_into_gv_sms_integration", anj1.f);
            gmw1.b("chat_archive_enabled", anj1.e);
            gmw1.b("gplus_dismissed", anj1.b);
            gmw1.b("gv_sms_integration_shown", anj1.g);
            gmw1.b("is_business_features_eligible", anj1.l);
            gmw1.b("is_business_features_enabled", anj1.m);
            gmw1.b("account_age_group", anj1.a);
            gmw1.b("is_gv_sms_integration_enabled", anj1.h);
            if (!TextUtils.isEmpty(anj1.u))
            {
                gmw1.b("default_gmail_phone_region_code", anj1.u);
            }
            if (anj1.v != null)
            {
                gmw1.b("default_gmail_phone_country_code", g.a(anj1.v, 0));
            }
            gmw1.b("paid_dasher_user", anj1.i);
            gmw1.b("is_history_forced", anj1.j);
            gmw1.b("is_history_default_on", anj1.k);
            gmw1.b("last_seen_promo_shown", anj1.o);
            gmw1.b("phone_verification_prompt_shown", anj1.p);
            gmw1.b("abuse_reporting_tos_shown", anj1.q);
            gmw1.b("gv_can_use_caller_id_feature", anj1.r);
            gmw1.b("is_photo_service_enabled", anj1.s);
            gmw1.b("invite_notifications_enabled", anj1.t);
        }
    }

    public static void a(gmw gmw1, String s, byte abyte0[])
    {
        gmw1.c(s, Base64.encodeToString(abyte0, 0));
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

    public static gmu b(Context context, int i1)
    {
        context = (gms)hgx.a(context, gms);
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
        ((gms)hgx.a(context, gms)).b(i1).h(s).d();
    }

    public static void b(Context context, int i1, String s, long l1)
    {
        ((gms)hgx.a(context, gms)).b(i1).c(s, l1).d();
    }

    public static void b(Context context, ani ani1)
    {
        ((gms)hgx.a(context, gms)).b(ani1.h()).c("diagnostics_promo_shown", true).d();
    }

    public static void b(Context context, ani ani1, long l1)
    {
        ((gms)hgx.a(context, gms)).b(ani1.h()).c("sticker_cache_time", l1).d();
    }

    public static void b(Context context, ani ani1, String s)
    {
        ((gms)hgx.a(context, gms)).b(ani1.h()).c("full_jid", s).d();
    }

    public static void b(Context context, ani ani1, boolean flag)
    {
        if (a)
        {
            String s = String.valueOf(ebw.b(ani1.a()));
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 38)).append("setGvSmsIntegration: ").append(s).append(" gvEnabled: ").append(flag).toString());
        }
        RealTimeChatService.a(ani1.h(), 13, flag);
        ((gms)hgx.a(context, gms)).b(ani1.h()).c("is_gv_sms_integration_enabled", flag).d();
        if (!flag)
        {
            ((gms)hgx.a(context, gms)).b(ani1.h()).c("can_opt_into_gv_sms_integration", true).d();
        }
    }

    public static String c(Context context, int i1)
    {
        gmu gmu1 = b(context, i1);
        if (gmu1 != null) goto _L2; else goto _L1
_L1:
        context = null;
_L4:
        return context;
_L2:
        String s;
        if (gmu1.d("sms_only"))
        {
            return context.getString(l.km);
        }
        if (gmu1.b("effective_gaia_id") == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s = gmu1.b("display_name");
        context = s;
        if (!TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
        return gmu1.b("account_name");
    }

    public static void c(Context context)
    {
        context.getSharedPreferences("accounts", 0).edit().putBoolean("location_tos_accepted", true).apply();
    }

    public static void c(Context context, ani ani1, boolean flag)
    {
        RealTimeChatService.a(ani1.h(), 17, flag);
        ((gms)hgx.a(context, gms)).b(ani1.h()).c("is_business_features_enabled", flag).d();
    }

    public static boolean c(Context context, ani ani1)
    {
        return ((gms)hgx.a(context, gms)).a(ani1.h()).a("diagnostics_promo_shown", false);
    }

    public static byte[] c(Context context, int i1, String s)
    {
        context = ((gms)hgx.a(context, gms)).a(i1).b(s);
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

    public static void d(Context context, ani ani1)
    {
        if (a)
        {
            String s = String.valueOf(ebw.b(ani1.a()));
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 49)).append("setGmailChatArchiveEnabled: ").append(s).append(" enableArchive: true").toString());
        }
        RealTimeChatService.a(ani1.h(), 6, true);
        ((gms)hgx.a(context, gms)).b(ani1.h()).c("chat_archive_enabled", true).d();
    }

    public static boolean d(Context context)
    {
        return context.getSharedPreferences("accounts", 0).getBoolean("location_tos_accepted", false);
    }

    public static cey e(Context context, int i1)
    {
        context = b(context, i1);
        if (context == null)
        {
            return null;
        } else
        {
            return new cey(context.b("gaia_id"), context.b("chat_id"));
        }
    }

    public static String e(Context context)
    {
        return context.getSharedPreferences("accounts", 0).getString("referrer_url", "");
    }

    public static void e(Context context, ani ani1)
    {
        RealTimeChatService.a(ani1.h(), 16, true);
        ((gms)hgx.a(context, gms)).b(ani1.h()).c("business_features_promo_shown", true).d();
    }

    public static void f(Context context, ani ani1)
    {
        RealTimeChatService.a(ani1.h(), 27, true);
        ((gms)hgx.a(context, gms)).b(ani1.h()).c("phone_verification_prompt_shown", true).d();
    }

    public static boolean f(Context context, int i1)
    {
        context = (gms)hgx.a(context, gms);
        if (!context.c(i1))
        {
            return false;
        }
        context = context.a(i1);
        return context.b("effective_gaia_id") != null && context.d("is_business_features_enabled");
    }

    public static String g(Context context, ani ani1)
    {
        return ((gms)hgx.a(context, gms)).a(ani1.h()).a("full_jid", null);
    }

    public static boolean g(Context context, int i1)
    {
        return !((gms)hgx.a(context, gms)).d(i1);
    }

    public static void h(Context context, ani ani1)
    {
        context = (gms)hgx.a(context, gms);
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
            if (i1 != ani1.h())
            {
                context.b(i1).c("is_sms_account", false).d();
            }
        } while (true);
        context.b(ani1.h()).c("is_sms_account", true).d();
    }

    public static boolean h(Context context, int i1)
    {
        return ((gms)hgx.a(context, gms)).a(i1).d("logged_out");
    }

    public static long i(Context context, ani ani1)
    {
        return ((gms)hgx.a(context, gms)).a(ani1.h()).a("registration_time", -1L);
    }

    public static boolean i(Context context, int i1)
    {
        return ((gms)hgx.a(context, gms)).a(i1).a("contact_permission_banner_shown", false);
    }

    public static void j(Context context, int i1)
    {
        ((gms)hgx.a(context, gms)).b(i1).c("contact_permission_banner_shown", true).d();
    }

    public static boolean j(Context context, ani ani1)
    {
        return (ani1.j() || ebr.b()) && !((gms)hgx.a(context, gms)).a(ani1.h()).a("minor_hangout_consent", false);
    }

    public static void k(Context context, ani ani1)
    {
        ((gms)hgx.a(context, gms)).b(ani1.h()).c("minor_hangout_consent", true).d();
    }

    public static boolean l(Context context, ani ani1)
    {
        return ani1 != null && ((gms)hgx.a(context, gms)).a(ani1.h()).a("abuse_tos_accepted", false);
    }

    public static void m(Context context, ani ani1)
    {
        ((gms)hgx.a(context, gms)).b(ani1.h()).c("abuse_tos_accepted", true).d();
    }

    public static long n(Context context, ani ani1)
    {
        return ((gms)hgx.a(context, gms)).a(ani1.h()).a("setting_time", -1L);
    }

    public static void o(Context context, ani ani1)
    {
        ((gms)hgx.a(context, gms)).b(ani1.h()).c("setting_time", -1L).d();
    }

    public static long p(Context context, ani ani1)
    {
        return ((gms)hgx.a(context, gms)).a(ani1.h()).a("sticker_cache_time", -1L);
    }

    public void a(int i1)
    {
        gmu gmu1 = ((gms)hgx.a(b, gms)).a(i1);
        if (gmu1.d("logged_out"))
        {
            cej.e(b, i1);
            if (!gmu1.d("sms_only"))
            {
                ebw.e("Babel", (new StringBuilder(38)).append("Account update: ").append(i1).append(" logged off").toString());
                apa.b(b, i1);
                ((gms)hgx.a(b, gms)).b(i1).h(EsProvider.a(3)).h(EsProvider.a(1)).h(EsProvider.a(2)).h(EsProvider.a(5)).h(EsProvider.a(4)).h("last_invite_seen_timestamp").h("last_suggested_contacts_time").h("sms_last_full_sync_time_millis").h("refresh_participants_time").h("last_warm_sync_localtime").h("last_successful_sync_time").h("sms_last_sync_time_millis").h("hash_pinned").h("hash_favorites").h("hash_people_you_hangout_with").h("hash_other_people_on_hangout").h("hash_dismissed_contacts").d();
            }
        } else
        if (gmu1.d("logged_in"))
        {
            ani ani1 = dbf.e(i1);
            if (ani1.e())
            {
                String s = String.valueOf(ebw.b(ani1.a()));
                if (s.length() != 0)
                {
                    s = "activateAccount: ".concat(s);
                } else
                {
                    s = new String("activateAccount: ");
                }
                ebw.c("Babel", s);
                apa.a(b, ani1.h()).c();
                return;
            }
        }
    }

    public void a(Context context, gmw gmw1)
    {
        if (!"SMS".equals(gmw1.b("account_name"))) goto _L2; else goto _L1
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
        gmw1.b("is_sms_account", context.getBoolean((new StringBuilder(String.valueOf(s1).length() + 12)).append(i1).append(".").append(s1).toString(), false));
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
        list.add(new anm(this));
        list.add(new ann(this));
        list.add(new ano(this));
        list.add(new anp(this));
        list.add(new anq(this));
        list.add(new anr(this));
        list.add(new ans(this));
    }

    static 
    {
        hik hik = ebw.d;
    }
}
