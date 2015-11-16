// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.apps.hangouts.settings.NotificationSettingsActivity;
import com.google.android.libraries.social.settings.PreferenceCategory;
import java.util.Iterator;
import java.util.List;

public final class drd extends hmm
    implements hjp
{

    private gqu a;
    private aoa b;
    private hjd c;

    public drd()
    {
        new hjo(this, lifecycle);
    }

    static aoa a(drd drd1)
    {
        return drd1.b;
    }

    static boolean a(drd drd1, boolean flag)
    {
        if (drd1.b.Y())
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(drd1.getActivity());
            String s;
            if (flag)
            {
                builder.setTitle(drd1.getString(l.sh)).setMessage(drd1.getString(l.sg));
                s = drd1.getString(l.sf);
            } else
            {
                builder.setTitle(drd1.getString(l.se)).setMessage(drd1.getString(l.sd));
                s = drd1.getString(l.sc);
            }
            builder.setCancelable(false).setNegativeButton(l.Q, null);
            builder.setPositiveButton(s, new drg(drd1, flag));
            builder.create().show();
            return false;
        } else
        {
            aoc.b(drd1.getContext(), drd1.b, flag);
            return true;
        }
    }

    static hjd b(drd drd1)
    {
        return drd1.c;
    }

    public void a()
    {
        int i;
        boolean flag;
        b = dcn.e(a.a());
        boolean flag1 = b.Y();
        Object obj2 = new hjx(context);
        Object obj3 = (dbt)binder.a(dbt);
        boolean flag2 = b.C();
        Object obj;
        Object obj4;
        boolean flag3;
        if (b.B() || flag2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!((dbt) (obj3)).a(context, b) || !b.y())
        {
            break MISSING_BLOCK_LABEL_540;
        }
        obj = b;
        obj4 = hlp.c(context, bqd).iterator();
        if (((Iterator) (obj4)).hasNext())
        {
            if (((bqd)((Iterator) (obj4)).next()).b(context, ((aoa) (obj))))
            {
                break MISSING_BLOCK_LABEL_125;
            }
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_540;
        }
        flag = true;
_L1:
        if (i != 0 || flag)
        {
            obj = b.A();
            Object obj1;
            int j;
            if (obj != null)
            {
                obj1 = eey.p(((String) (obj)));
            } else
            {
                obj1 = "";
            }
            if (flag1)
            {
                j = l.sb;
            } else
            {
                j = l.cm;
            }
            obj1 = ((hjx) (obj2)).b(getString(j, new Object[] {
                obj1
            }));
            if (flag)
            {
                flag3 = ((dbt) (obj3)).b(getActivity(), b);
                obj3 = new hjd(context, a.a(), getString(l.ci));
                ((hjd) (obj3)).g(l.cj);
                ((hjd) (obj3)).b(Boolean.valueOf(flag3));
                ((hjd) (obj3)).a(new dre(this));
                ((PreferenceCategory) (obj1)).c(((hjr) (obj3)));
            }
            if (i != 0)
            {
                obj3 = hkh.b(getActivity());
                if (((SharedPreferences) (obj3)).contains("gv_sms"))
                {
                    ((SharedPreferences) (obj3)).edit().remove("gv_sms").commit();
                }
                c = new hjd(context, a.a(), "gv_sms", Boolean.valueOf(flag2));
                c.c("gv_sms");
                c.g(l.cl);
                ((PreferenceCategory) (obj1)).c(c);
                c.a(new drf(this));
                obj3 = context;
                obj4 = lifecycle;
                if (flag1)
                {
                    i = l.si;
                } else
                {
                    i = l.cn;
                }
                obj3 = NotificationSettingsActivity.a(((android.content.Context) (obj3)), ((hof) (obj4)), ((hjx) (obj2)), i, null, "gv_sms_sound_key", 2, "gv_sms_vibrate_boolean_key");
                ((PreferenceCategory) (obj1)).c(((hjr) (obj3)));
                ((hjr) (obj3)).e("gv_sms");
                obj3 = context;
                obj4 = lifecycle;
                if (flag1)
                {
                    i = l.sj;
                } else
                {
                    i = l.co;
                }
                obj2 = NotificationSettingsActivity.a(((android.content.Context) (obj3)), ((hof) (obj4)), ((hjx) (obj2)), i, null, "gv_voicemail_sound_key", 2, "gv_voicemail_vibrate_boolean_key");
                ((PreferenceCategory) (obj1)).c(((hjr) (obj2)));
                ((hjr) (obj2)).e("gv_sms");
            }
        }
        return;
        flag = false;
          goto _L1
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gqu)binder.a(gqu);
    }
}
