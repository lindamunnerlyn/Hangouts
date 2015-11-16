// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class dup
    implements bwl
{

    private final Context a;
    private final gqz b;
    private final amo c;
    private final SharedPreferences d;

    public dup(Context context)
    {
        a = context;
        b = (gqz)hlp.a(context, gqz);
        c = (amo)hlp.a(context, amo);
        d = context.getSharedPreferences("smsmms", 0);
        c.a(new duq(this));
        a();
    }

    private grb q()
    {
        return b.a(dcn.n().h());
    }

    private grd r()
    {
        return b.b(dcn.n().h());
    }

    void a()
    {
        while (b() || d.getInt("merged_version_key", 0) == 1) 
        {
            return;
        }
        if (c())
        {
            RealTimeChatService.e();
            return;
        } else
        {
            RealTimeChatService.f();
            return;
        }
    }

    public void a(int i1)
    {
        r().c("apns_version", i1).d();
    }

    public void a(Activity activity, Bundle bundle)
    {
        bundle.putString("merged_sms", Boolean.toString(c()));
    }

    public void a(String s)
    {
        r().c("sms_send_from_key", s).d();
    }

    public void a(String s, boolean flag)
    {
        r().c(s, flag).d();
    }

    public void a(boolean flag)
    {
        d.edit().putBoolean("Enable merged conversations", flag).apply();
    }

    public void b(boolean flag)
    {
        d.edit().putBoolean("enable_smsmms_key", flag).apply();
    }

    public boolean b()
    {
        return hlp.b(a, dsq) != null;
    }

    public boolean b(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 9: default 88
    //                   -1839796625: 235
    //                   -1748368360: 179
    //                   -1473012178: 221
    //                   -1098086887: 193
    //                   -446307152: 207
    //                   754442425: 279
    //                   1234600243: 165
    //                   1370303130: 264
    //                   2144799444: 249;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        break; /* Loop/switch isn't completed */
_L7:
        break MISSING_BLOCK_LABEL_279;
_L11:
        switch (byte0)
        {
        default:
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Unexpected key: ".concat(s);
            } else
            {
                s = new String("Unexpected key: ");
            }
            gdv.a(s);
            return false;

        case 0: // '\0'
            return o();

        case 1: // '\001'
            return m();

        case 2: // '\002'
            return l();

        case 3: // '\003'
            return h();

        case 4: // '\004'
            return i();

        case 5: // '\005'
            return q().a("use_local_apn_pref_key", false);

        case 6: // '\006'
            return j();

        case 7: // '\007'
            return k();

        case 8: // '\b'
            return c();
        }
_L8:
        if (s.equals("group_mms_key"))
        {
            byte0 = 0;
        }
          goto _L11
_L3:
        if (s.equals("delete_old_messages_key"))
        {
            byte0 = 1;
        }
          goto _L11
_L5:
        if (s.equals("sms_delivery_report_key"))
        {
            byte0 = 2;
        }
          goto _L11
_L6:
        if (s.equals("enable_auto_retrieve_key"))
        {
            byte0 = 3;
        }
          goto _L11
_L4:
        if (s.equals("enable_auto_retrieve_in_roaming_key"))
        {
            byte0 = 4;
        }
          goto _L11
_L2:
        if (s.equals("use_local_apn_pref_key"))
        {
            byte0 = 5;
        }
          goto _L11
_L10:
        if (s.equals("dump_sms_pref_key"))
        {
            byte0 = 6;
        }
          goto _L11
_L9:
        if (s.equals("dump_mms_pref_key"))
        {
            byte0 = 7;
        }
          goto _L11
        if (s.equals("Enable merged conversations"))
        {
            byte0 = 8;
        }
          goto _L11
    }

    public boolean c()
    {
        return d.getBoolean("Enable merged conversations", false);
    }

    public int d()
    {
        return q().a("apns_version", e());
    }

    public int e()
    {
        return g.a(Integer.valueOf(a.getResources().getInteger(g.eT)), 0);
    }

    public boolean f()
    {
        return d.getBoolean("enable_smsmms_key", false);
    }

    public String g()
    {
        return q().a("sms_send_from_key", "auto");
    }

    public boolean h()
    {
        return q().a("enable_auto_retrieve_key", true);
    }

    public boolean i()
    {
        return q().a("enable_auto_retrieve_in_roaming_key", false);
    }

    public boolean j()
    {
        return q().a("dump_sms_pref_key", false);
    }

    public boolean k()
    {
        return q().a("dump_mms_pref_key", false);
    }

    public boolean l()
    {
        return q().a("sms_delivery_report_key", false);
    }

    public boolean m()
    {
        return q().a("delete_old_messages_key", false);
    }

    public void n()
    {
        r().c("delete_old_messages_key", true).d();
    }

    public boolean o()
    {
        return eey.d() && q().a("group_mms_key", true);
    }

    public boolean p()
    {
        if (dcn.l() == null)
        {
            return true;
        } else
        {
            return q().a("group_mms_key", true);
        }
    }
}
