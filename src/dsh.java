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

public final class dsh extends hmm
    implements hjp
{

    private PreferenceCategory a;
    private dup b;
    private gqu c;
    private gqz d;

    public dsh()
    {
        new hjo(this, lifecycle);
    }

    private void a(PreferenceCategory preferencecategory, int i, int j, String s, hjv hjv)
    {
        CheckBoxPreference checkboxpreference = new CheckBoxPreference(context);
        preferencecategory.c(checkboxpreference);
        checkboxpreference.g(i);
        if (j != 0)
        {
            checkboxpreference.h(j);
        }
        checkboxpreference.a(b.b(s));
        if (hjv != null)
        {
            checkboxpreference.a(hjv);
            return;
        } else
        {
            checkboxpreference.a(new dsn(this, s));
            return;
        }
    }

    static void a(dsh dsh1)
    {
        dsh1.b();
    }

    private void a(hkd hkd1, boolean flag)
    {
        int i = hkd1.c() - 1;
        while (i >= 0) 
        {
            hjr hjr1 = hkd1.a(i);
            if (hjr1 instanceof hkd)
            {
                a((hkd)hjr1, flag);
            } else
            {
                hjr1.d(flag);
            }
            i--;
        }
    }

    static dup b(dsh dsh1)
    {
        return dsh1.b;
    }

    private void b()
    {
        boolean flag2 = dcn.j();
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
            ((CheckBoxPreference) (obj1)).g(l.bP);
            ((CheckBoxPreference) (obj1)).h(l.bO);
            ((CheckBoxPreference) (obj1)).a(new dsi(this));
        } else
        {
            obj1 = new hjr(context);
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
                ((hjr) (obj1)).g(l.kb);
                ((hjr) (obj1)).h(l.ka);
                ((hjr) (obj1)).a(((Intent) (obj)));
            } else
            {
                obj = new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT");
                ((Intent) (obj)).setPackage("com.android.settings");
                ((Intent) (obj)).putExtra("package", "com.google.android.talk");
                ((hjr) (obj1)).g(l.jZ);
                ((hjr) (obj1)).h(l.jY);
                ((hjr) (obj1)).a(((Intent) (obj)));
            }
        }
        a.c(((hjr) (obj1)));
        obj = dcn.m();
        if (obj != null && dcn.d().length > 1)
        {
            hjr hjr1 = new hjr(context);
            hjr1.g(l.jw);
            hjr1.b(((aoa) (obj)).a());
            hjr1.a(new Intent(g.nU, com/google/android/apps/hangouts/phone/SmsAccountPickerActivity));
            a.c(hjr1);
        }
        obj2 = dcn.l();
        if (obj2 != null && ((aoa) (obj2)).P())
        {
            obj = eey.g();
            String s4;
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                s1 = eey.k(((String) (obj)));
                obj = eey.p(((String) (obj)));
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
        if (obj2 != null && ((aoa) (obj2)).C())
        {
            s2 = ((aoa) (obj2)).M();
            s3 = ((aoa) (obj2)).A();
            if (s2 != null && s3 != null)
            {
                s = eey.p(s3);
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
            dso dso1 = new dso(context);
            dso1.g(l.jO);
            dso1.a(b.g());
            s4 = dso1.h();
            boolean flag1;
            boolean flag3;
            if (s4 == null || !s4.equals(s2) && !s4.equals(s1))
            {
                s3 = eey.k(s3);
                if (s4 != null && s4.equals(s3))
                {
                    dso1.a(s2);
                    b.a(s2);
                } else
                {
                    dso1.a("auto");
                    b.a("auto");
                }
            }
            flag3 = ((aoa) (obj2)).Y();
            obj2 = new gz();
            if (!TextUtils.isEmpty(s2))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            g.d(flag1, "A null/empty GV phone number is unexpected here");
            if (b.c())
            {
                s3 = getString(l.jI);
            } else
            {
                s3 = getString(l.jG);
            }
            ((Map) (obj2)).put("auto", s3);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                ((Map) (obj2)).put(s1, getString(l.jN, new Object[] {
                    obj
                }));
            } else
            {
                ((Map) (obj2)).put(s1, getString(l.jM));
            }
            if (!TextUtils.isEmpty(s))
            {
                if (flag3)
                {
                    i = l.jQ;
                } else
                {
                    i = l.jL;
                }
                ((Map) (obj2)).put(s2, getString(i, new Object[] {
                    s
                }));
            } else
            {
                if (flag3)
                {
                    i = l.jP;
                } else
                {
                    i = l.jK;
                }
                ((Map) (obj2)).put(s2, getString(i));
            }
            flag1 = b.c();
            if (flag1)
            {
                i = l.jJ;
            } else
            {
                i = l.jH;
            }
            s3 = getString(i);
            if (flag3)
            {
                i = l.jP;
            } else
            {
                i = l.jK;
            }
            dso1.b(new String[] {
                s3, getString(i), getString(l.jM)
            });
            if (flag1)
            {
                i = l.jI;
            } else
            {
                i = l.jG;
            }
            s3 = getString(i);
            if (s == null)
            {
                s = getString(l.jR);
            }
            if (obj == null)
            {
                obj = getString(l.jR);
            }
            dso1.a(new String[] {
                s3, s, obj
            });
            dso1.c(new String[] {
                "auto", s2, s1
            });
            dso1.b((CharSequence)((Map) (obj2)).get(b.g()));
            dso1.a(new dsj(this, dso1, ((Map) (obj2))));
            obj = dso1;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            a.c(((hjr) (obj)));
        }
        obj = new hjr(context);
        ((hjr) (obj)).g(l.F);
        ((hjr) (obj)).a(g.c(c.a()));
        a.c(((hjr) (obj)));
        a(((hkp)hlp.a(context, hkp)).b(), flag2);
        ((hjr) (obj1)).d(eey.d());
    }

    static gqz c(dsh dsh1)
    {
        return dsh1.d;
    }

    private boolean c()
    {
        if (dtp.a().w())
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

    static hlt d(dsh dsh1)
    {
        return dsh1.context;
    }

    public void a()
    {
        int i = c.a();
        Object obj = new hjx(context);
        a = ((hjx) (obj)).a(l.kd);
        PreferenceCategory preferencecategory = ((hjx) (obj)).a(l.ke);
        dql dql1 = new dql(context);
        preferencecategory.c(dql1);
        String s = String.valueOf("sms_notification_sound_key");
        dql1.c((new StringBuilder(String.valueOf(s).length() + 12)).append(i).append(".").append(s).toString());
        dql1.g(l.jD);
        dql1.b(2);
        dql1.w();
        dql1.a(new dsk(this, i));
        dql1.a(cfo.a(context, c.a(), cfq.a));
        if (((Vibrator)getActivity().getSystemService("vibrator")).hasVibrator())
        {
            hjd hjd1 = new hjd(context, c.a(), "sms_notification_vibrate_bool_key");
            preferencecategory.c(hjd1);
            hjd1.g(l.jE);
            hjd1.a(c.c().a("sms_notification_vibrate_bool_key", true));
        }
        obj = ((hjx) (obj)).a(l.kc);
        if (dtp.a().u() && eey.f() || dcn.k() != null)
        {
            a(((PreferenceCategory) (obj)), l.hF, l.hE, "group_mms_key", null);
        }
        a(((PreferenceCategory) (obj)), l.aJ, l.aI, "delete_old_messages_key", null);
        if (dtp.a().r())
        {
            a(((PreferenceCategory) (obj)), l.jA, l.jz, "sms_delivery_report_key", null);
        }
        a(((PreferenceCategory) (obj)), l.bL, l.bK, "enable_auto_retrieve_key", null);
        a(((PreferenceCategory) (obj)), l.bJ, l.bI, "enable_auto_retrieve_in_roaming_key", null);
        if (c())
        {
            hjr hjr1 = new hjr(context);
            hjr1.g(l.jX);
            hjr1.a(new dsl(this));
            ((PreferenceCategory) (obj)).c(hjr1);
        }
        if (!due.b(context))
        {
            hjr hjr2 = new hjr(context);
            hjr2.g(l.jy);
            hjr2.h(l.jx);
            hjr2.a(new Intent(g.nU, com/google/android/apps/hangouts/phone/ApnSettingsActivity));
            ((PreferenceCategory) (obj)).c(hjr2);
        }
        if (eep.a())
        {
            if (due.c(context))
            {
                a(((PreferenceCategory) (obj)), l.sC, l.sB, "use_local_apn_pref_key", ((hjv) (new dsm(this))));
            }
            a(((PreferenceCategory) (obj)), l.bC, l.bB, "dump_sms_pref_key", null);
            a(((PreferenceCategory) (obj)), l.bA, l.bz, "dump_mms_pref_key", null);
        }
        b();
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        c = (gqu)binder.a(gqu);
        d = (gqz)binder.a(gqz);
        b = (dup)binder.a(dup);
    }

    public void onResume()
    {
        super.onResume();
        b();
    }
}
