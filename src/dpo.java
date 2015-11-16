// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import com.google.android.apps.hangouts.phone.ApnSettingsActivity;
import com.google.android.apps.hangouts.phone.SmsAccountPickerActivity;
import com.google.android.libraries.social.settings.CheckBoxPreference;
import com.google.android.libraries.social.settings.PreferenceCategory;
import java.util.Map;

public final class dpo extends hhu
    implements hey
{

    private PreferenceCategory a;
    private drw b;
    private gmo c;
    private gms d;

    public dpo()
    {
        new hex(this, lifecycle);
    }

    private void a(PreferenceCategory preferencecategory, int i, int j, String s, hfe hfe)
    {
        CheckBoxPreference checkboxpreference = new CheckBoxPreference(context);
        preferencecategory.c(checkboxpreference);
        checkboxpreference.g(i);
        if (j != 0)
        {
            checkboxpreference.h(j);
        }
        checkboxpreference.a(b.b(s));
        if (hfe != null)
        {
            checkboxpreference.a(hfe);
            return;
        } else
        {
            checkboxpreference.a(new dpu(this, s));
            return;
        }
    }

    static void a(dpo dpo1)
    {
        dpo1.b();
    }

    private void a(hfm hfm1, boolean flag)
    {
        int i = hfm1.c() - 1;
        while (i >= 0) 
        {
            hfa hfa1 = hfm1.a(i);
            if (hfa1 instanceof hfm)
            {
                a((hfm)hfa1, flag);
            } else
            {
                hfa1.d(flag);
            }
            i--;
        }
    }

    static drw b(dpo dpo1)
    {
        return dpo1.b;
    }

    private void b()
    {
        boolean flag2 = dbf.j();
        a.d();
        Object obj;
        String s;
        String s1;
        String s2;
        String s3;
        Object obj1;
        Object obj2;
        int i;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            obj1 = new CheckBoxPreference(context);
            ((CheckBoxPreference) (obj1)).a(flag2);
            ((CheckBoxPreference) (obj1)).g(l.bV);
            ((CheckBoxPreference) (obj1)).h(l.bU);
            ((CheckBoxPreference) (obj1)).a(new dpp(this));
        } else
        {
            obj1 = new hfa(context);
            if (flag2)
            {
                if (android.os.Build.VERSION.SDK_INT >= 23)
                {
                    obj = new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT");
                } else
                {
                    obj = new Intent("android.settings.WIRELESS_SETTINGS");
                    ((Intent) (obj)).setPackage("com.android.settings");
                }
                ((hfa) (obj1)).g(l.kI);
                ((hfa) (obj1)).h(l.kH);
                ((hfa) (obj1)).a(((Intent) (obj)));
            } else
            {
                obj = new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT");
                ((Intent) (obj)).setPackage("com.android.settings");
                ((Intent) (obj)).putExtra("package", "com.google.android.talk");
                ((hfa) (obj1)).g(l.kG);
                ((hfa) (obj1)).h(l.kF);
                ((hfa) (obj1)).a(((Intent) (obj)));
            }
        }
        a.c(((hfa) (obj1)));
        obj = dbf.m();
        if (obj != null && dbf.d().length > 1)
        {
            hfa hfa1 = new hfa(context);
            hfa1.g(l.kd);
            hfa1.b(((ani) (obj)).a());
            hfa1.a(new Intent(g.nS, com/google/android/apps/hangouts/phone/SmsAccountPickerActivity));
            a.c(hfa1);
        }
        obj2 = dbf.l();
        if (obj2 != null && ((ani) (obj2)).S())
        {
            obj = ebz.g();
            String s4;
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                s1 = ebz.k(((String) (obj)));
                obj = ebz.p(((String) (obj)));
                i = 1;
            } else
            {
                obj = null;
                s1 = "unknown_sim_number";
                i = 1;
            }
        } else
        {
            obj = null;
            s1 = null;
            i = 0;
        }
        if (obj2 != null && ((ani) (obj2)).E())
        {
            s2 = ((ani) (obj2)).P();
            s3 = ((ani) (obj2)).C();
            if (s2 != null && s3 != null)
            {
                s = ebz.p(s3);
                flag = true;
            } else
            {
                s = null;
                s2 = null;
                flag = false;
            }
        } else
        {
            s = null;
            s3 = null;
            s2 = null;
            flag = false;
        }
        if (i != 0 && flag)
        {
            dpv dpv1 = new dpv(context);
            dpv1.g(l.kv);
            dpv1.a(b.f());
            s4 = dpv1.h();
            boolean flag1;
            boolean flag3;
            if (s4 == null || !s4.equals(s2) && !s4.equals(s1))
            {
                s3 = ebz.k(s3);
                if (s4 != null && s4.equals(s3))
                {
                    dpv1.a(s2);
                    b.a(s2);
                } else
                {
                    dpv1.a("auto");
                    b.a("auto");
                }
            }
            flag3 = ((ani) (obj2)).ab();
            obj2 = new gz();
            if (!TextUtils.isEmpty(s2))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            g.b(flag1, "A null/empty GV phone number is unexpected here");
            if (b.b())
            {
                s3 = getString(l.kp);
            } else
            {
                s3 = getString(l.kn);
            }
            ((Map) (obj2)).put("auto", s3);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                ((Map) (obj2)).put(s1, getString(l.ku, new Object[] {
                    obj
                }));
            } else
            {
                ((Map) (obj2)).put(s1, getString(l.kt));
            }
            if (!TextUtils.isEmpty(s))
            {
                if (flag3)
                {
                    i = l.kx;
                } else
                {
                    i = l.ks;
                }
                ((Map) (obj2)).put(s2, getString(i, new Object[] {
                    s
                }));
            } else
            {
                if (flag3)
                {
                    i = l.kw;
                } else
                {
                    i = l.kr;
                }
                ((Map) (obj2)).put(s2, getString(i));
            }
            flag1 = b.b();
            if (flag1)
            {
                i = l.kq;
            } else
            {
                i = l.ko;
            }
            s3 = getString(i);
            if (flag3)
            {
                i = l.kw;
            } else
            {
                i = l.kr;
            }
            dpv1.b(new String[] {
                s3, getString(i), getString(l.kt)
            });
            if (flag1)
            {
                i = l.kp;
            } else
            {
                i = l.kn;
            }
            s3 = getString(i);
            if (s == null)
            {
                s = getString(l.ky);
            }
            if (obj == null)
            {
                obj = getString(l.ky);
            }
            dpv1.a(new String[] {
                s3, s, obj
            });
            dpv1.c(new String[] {
                "auto", s2, s1
            });
            dpv1.b((CharSequence)((Map) (obj2)).get(b.f()));
            dpv1.a(new dpq(this, dpv1, ((Map) (obj2))));
            obj = dpv1;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            a.c(((hfa) (obj)));
        }
        obj = new hfa(context);
        ((hfa) (obj)).g(l.I);
        ((hfa) (obj)).a(g.c(c.a()));
        a.c(((hfa) (obj)));
        a(((hfy)hgx.a(context, hfy)).a(), flag2);
        ((hfa) (obj1)).d(ebz.d());
    }

    static gms c(dpo dpo1)
    {
        return dpo1.d;
    }

    private boolean c()
    {
        if (dqv.a().w())
        {
            int i;
            try
            {
                i = getActivity().getPackageManager().getApplicationEnabledSetting("com.android.cellbroadcastreceiver");
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                return false;
            }
            if (i != 2)
            {
                return true;
            }
        }
        return false;
    }

    static hhb d(dpo dpo1)
    {
        return dpo1.context;
    }

    public void a()
    {
        int i = c.a();
        Object obj = new hfg(context);
        a = ((hfg) (obj)).a(l.kK);
        PreferenceCategory preferencecategory = ((hfg) (obj)).a(l.kL);
        dns dns1 = new dns(context);
        preferencecategory.c(dns1);
        String s = String.valueOf("sms_notification_sound_key");
        dns1.c((new StringBuilder(String.valueOf(s).length() + 12)).append(i).append(".").append(s).toString());
        dns1.g(l.kk);
        dns1.a(2);
        dns1.w();
        dns1.a(new dpr(this, i));
        dns1.a(cej.a(context, c.a(), cel.a));
        if (((Vibrator)getActivity().getSystemService("vibrator")).hasVibrator())
        {
            hem hem1 = new hem(context, c.a(), "sms_notification_vibrate_bool_key");
            preferencecategory.c(hem1);
            hem1.g(l.kl);
            hem1.a(c.c().a("sms_notification_vibrate_bool_key", true));
        }
        obj = ((hfg) (obj)).a(l.kJ);
        if (dqv.a().u() && ebz.f() || dbf.k() != null)
        {
            a(((PreferenceCategory) (obj)), l.il, l.ik, "group_mms_key", null);
        }
        a(((PreferenceCategory) (obj)), l.aP, l.aO, "delete_old_messages_key", null);
        if (dqv.a().r())
        {
            a(((PreferenceCategory) (obj)), l.kh, l.kg, "sms_delivery_report_key", null);
        }
        a(((PreferenceCategory) (obj)), l.bR, l.bQ, "enable_auto_retrieve_key", null);
        a(((PreferenceCategory) (obj)), l.bP, l.bO, "enable_auto_retrieve_in_roaming_key", null);
        if (c())
        {
            hfa hfa1 = new hfa(context);
            hfa1.g(l.kE);
            hfa1.a(new dps(this));
            ((PreferenceCategory) (obj)).c(hfa1);
        }
        if (!drk.a(context))
        {
            hfa hfa2 = new hfa(context);
            hfa2.g(l.kf);
            hfa2.h(l.ke);
            hfa2.a(new Intent(g.nS, com/google/android/apps/hangouts/phone/ApnSettingsActivity));
            ((PreferenceCategory) (obj)).c(hfa2);
        }
        if (ebr.a())
        {
            if (drk.b(context))
            {
                a(((PreferenceCategory) (obj)), l.tk, l.tj, "use_local_apn_pref_key", ((hfe) (new dpt(this))));
            }
            a(((PreferenceCategory) (obj)), l.bI, l.bH, "dump_sms_pref_key", null);
            a(((PreferenceCategory) (obj)), l.bG, l.bF, "dump_mms_pref_key", null);
        }
        b();
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        c = (gmo)binder.a(gmo);
        d = (gms)binder.a(gms);
        b = (drw)binder.a(drw);
    }

    public void onResume()
    {
        super.onResume();
        b();
    }
}
