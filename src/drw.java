// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class drw
    implements bvs
{

    private final Context a;
    private final gms b;
    private final alw c;
    private final SharedPreferences d;

    public drw(Context context)
    {
        a = context;
        b = (gms)hgx.a(context, gms);
        c = (alw)hgx.a(context, alw);
        d = context.getSharedPreferences("smsmms", 0);
        c.a(new drx(this));
        q();
    }

    static void a(drw drw1)
    {
        drw1.q();
    }

    private gmu o()
    {
        return b.a(dbf.n().h());
    }

    private gmw p()
    {
        return b.b(dbf.n().h());
    }

    private void q()
    {
        while (a() || d.getInt("merged_version_key", 0) == 1) 
        {
            return;
        }
        if (b())
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
        p().c("apns_version", i1).d();
    }

    public void a(Activity activity, Bundle bundle)
    {
        bundle.putString("merged_sms", Boolean.toString(b()));
    }

    public void a(String s)
    {
        p().c("sms_send_from_key", s).d();
    }

    public void a(String s, boolean flag)
    {
        p().c(s, flag).d();
    }

    public void a(boolean flag)
    {
        d.edit().putBoolean("Enable merged conversations", flag).apply();
    }

    public boolean a()
    {
        return hgx.b(a, dpx) != null;
    }

    public void b(boolean flag)
    {
        d.edit().putBoolean("enable_smsmms_key", flag).apply();
    }

    public boolean b()
    {
        return d.getBoolean("Enable merged conversations", false);
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
            gbh.a(s);
            return false;

        case 0: // '\0'
            return n();

        case 1: // '\001'
            return l();

        case 2: // '\002'
            return k();

        case 3: // '\003'
            return g();

        case 4: // '\004'
            return h();

        case 5: // '\005'
            return o().a("use_local_apn_pref_key", false);

        case 6: // '\006'
            return i();

        case 7: // '\007'
            return j();

        case 8: // '\b'
            return b();
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

    public int c()
    {
        return o().a("apns_version", d());
    }

    public int d()
    {
        return g.a(Integer.valueOf(a.getResources().getInteger(g.eV)), 0);
    }

    public boolean e()
    {
        return d.getBoolean("enable_smsmms_key", false);
    }

    public String f()
    {
        return o().a("sms_send_from_key", "auto");
    }

    public boolean g()
    {
        return o().a("enable_auto_retrieve_key", true);
    }

    public boolean h()
    {
        return o().a("enable_auto_retrieve_in_roaming_key", false);
    }

    public boolean i()
    {
        return o().a("dump_sms_pref_key", false);
    }

    public boolean j()
    {
        return o().a("dump_mms_pref_key", false);
    }

    public boolean k()
    {
        return o().a("sms_delivery_report_key", false);
    }

    public boolean l()
    {
        return o().a("delete_old_messages_key", false);
    }

    public void m()
    {
        p().c("delete_old_messages_key", true).d();
    }

    public boolean n()
    {
        return ebz.d() && o().a("group_mms_key", true);
    }
}
