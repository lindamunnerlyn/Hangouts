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

public final class dok extends hhu
    implements hey
{

    private gmo a;
    private ani b;
    private hem c;

    public dok()
    {
        new hex(this, lifecycle);
    }

    static ani a(dok dok1)
    {
        return dok1.b;
    }

    static boolean a(dok dok1, boolean flag)
    {
        if (dok1.b.ab())
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(dok1.getActivity());
            String s;
            if (flag)
            {
                builder.setTitle(dok1.getString(l.sO)).setMessage(dok1.getString(l.sN));
                s = dok1.getString(l.sM);
            } else
            {
                builder.setTitle(dok1.getString(l.sL)).setMessage(dok1.getString(l.sK));
                s = dok1.getString(l.sJ);
            }
            builder.setCancelable(false).setNegativeButton(l.T, null);
            builder.setPositiveButton(s, new don(dok1, flag));
            builder.create().show();
            return false;
        } else
        {
            ank.b(dok1.getContext(), dok1.b, flag);
            return true;
        }
    }

    static hem b(dok dok1)
    {
        return dok1.c;
    }

    public void a()
    {
        int i;
        boolean flag;
        b = dbf.e(a.a());
        boolean flag1 = b.ab();
        Object obj2 = new hfg(context);
        Object obj3 = (dan)binder.a(dan);
        boolean flag2 = b.E();
        Object obj;
        Object obj4;
        boolean flag3;
        if (b.D() || flag2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!((dan) (obj3)).a(context, b) || !b.A())
        {
            break MISSING_BLOCK_LABEL_540;
        }
        obj = b;
        obj4 = hgx.c(context, bpu).iterator();
        if (((Iterator) (obj4)).hasNext())
        {
            if (((bpu)((Iterator) (obj4)).next()).b(context, ((ani) (obj))))
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
            obj = b.C();
            Object obj1;
            int j;
            if (obj != null)
            {
                obj1 = ebz.p(((String) (obj)));
            } else
            {
                obj1 = "";
            }
            if (flag1)
            {
                j = l.sI;
            } else
            {
                j = l.cy;
            }
            obj1 = ((hfg) (obj2)).b(getString(j, new Object[] {
                obj1
            }));
            if (flag)
            {
                flag3 = ((dan) (obj3)).b(getActivity(), b);
                obj3 = new hem(context, a.a(), getString(l.cu));
                ((hem) (obj3)).g(l.cv);
                ((hem) (obj3)).b(Boolean.valueOf(flag3));
                ((hem) (obj3)).a(new dol(this));
                ((PreferenceCategory) (obj1)).c(((hfa) (obj3)));
            }
            if (i != 0)
            {
                obj3 = hfq.b(getActivity());
                if (((SharedPreferences) (obj3)).contains("gv_sms"))
                {
                    ((SharedPreferences) (obj3)).edit().remove("gv_sms").commit();
                }
                c = new hem(context, a.a(), "gv_sms", Boolean.valueOf(flag2));
                c.c("gv_sms");
                c.g(l.cx);
                ((PreferenceCategory) (obj1)).c(c);
                c.a(new dom(this));
                obj3 = context;
                obj4 = lifecycle;
                if (flag1)
                {
                    i = l.sP;
                } else
                {
                    i = l.cz;
                }
                obj3 = NotificationSettingsActivity.a(((android.content.Context) (obj3)), ((hjm) (obj4)), ((hfg) (obj2)), i, null, "gv_sms_sound_key", 2, "gv_sms_vibrate_boolean_key");
                ((PreferenceCategory) (obj1)).c(((hfa) (obj3)));
                ((hfa) (obj3)).e("gv_sms");
                obj3 = context;
                obj4 = lifecycle;
                if (flag1)
                {
                    i = l.sQ;
                } else
                {
                    i = l.cA;
                }
                obj2 = NotificationSettingsActivity.a(((android.content.Context) (obj3)), ((hjm) (obj4)), ((hfg) (obj2)), i, null, "gv_voicemail_sound_key", 2, "gv_voicemail_vibrate_boolean_key");
                ((PreferenceCategory) (obj1)).c(((hfa) (obj2)));
                ((hfa) (obj2)).e("gv_sms");
            }
        }
        return;
        flag = false;
          goto _L1
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gmo)binder.a(gmo);
    }
}
