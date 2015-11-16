// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.text.TextUtils;

public final class dyg
{

    public final bph a;
    public final String b;
    final long c;
    public final long d;
    final dxp e;
    public final int f;
    final boolean g;
    final dyq h;

    public dyg(bph bph1, String s, long l, long l1, dxp dxp1, 
            int i, boolean flag, dyq dyq1)
    {
        a = bph1;
        b = s;
        c = l;
        d = l1;
        e = dxp1;
        f = i;
        g = flag;
        h = dyq1;
    }

    public static dyg a(Bundle bundle)
    {
        dyq dyq1 = null;
        Bundle bundle1;
        if (bundle != null)
        {
            if ((bundle1 = (Bundle)bundle.getParcelable("com.google.android.apps.hangouts.telephony.hangout_info_bundle")) != null)
            {
                bundle1.setClassLoader(bph.getClassLoader());
                bph bph1 = (bph)bundle1.getParcelable("hangout_request");
                if (bph1 != null)
                {
label0:
                    {
                        String s = bundle1.getString("experiment_code");
                        String s1 = bundle1.getString("experiment_flags");
                        if (s == null)
                        {
                            bundle = dyq1;
                            if (s1 == null)
                            {
                                break label0;
                            }
                        }
                        bundle = new dxp(s, s1);
                    }
                    dyq1 = (dyq)bundle1.getParcelable("network_status");
                    return new dyg(bph1, bundle1.getString("inviter_phone_number"), bundle1.getLong("invitation_id"), bundle1.getLong("timestamp_millis"), bundle, bundle1.getInt("account_id"), bundle1.getBoolean("did_fallback_to_lte"), dyq1);
                }
            }
        }
        return null;
    }

    public Bundle a()
    {
        Bundle bundle = new Bundle();
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("hangout_request", a);
        bundle1.putString("inviter_phone_number", b);
        bundle1.putLong("invitation_id", c);
        bundle1.putLong("timestamp_millis", d);
        if (e != null)
        {
            bundle1.putString("experiment_code", e.a());
            bundle1.putString("experiment_flags", e.b());
        }
        bundle1.putInt("account_id", f);
        bundle1.putBoolean("did_fallback_to_lte", g);
        bundle1.putParcelable("network_status", h);
        bundle.putParcelable("com.google.android.apps.hangouts.telephony.hangout_info_bundle", bundle1);
        bundle.putParcelable("incoming_number", g.t(b));
        return bundle;
    }

    public eah b()
    {
        eah eah1 = new eah();
        if (a != null)
        {
            bph bph1 = a;
            eaf eaf1 = new eaf();
            if (!TextUtils.isEmpty(bph1.a()))
            {
                eaf1.a = bph1.a();
            }
            eaf1.j = bph1.m();
            if (!TextUtils.isEmpty(bph1.b()))
            {
                eaf1.b = bph1.b();
            }
            if (!TextUtils.isEmpty(bph1.d()))
            {
                eaf1.c = bph1.d();
            }
            if (!TextUtils.isEmpty(bph1.e()))
            {
                eaf1.d = bph1.e();
            }
            if (!TextUtils.isEmpty(bph1.f()))
            {
                eaf1.e = bph1.f();
            }
            if (!TextUtils.isEmpty(bph1.g()))
            {
                eaf1.f = bph1.g();
            }
            if (!TextUtils.isEmpty(bph1.h()))
            {
                eaf1.g = bph1.h();
            }
            if (!TextUtils.isEmpty(bph1.i()))
            {
                eaf1.h = bph1.i();
            }
            if (!TextUtils.isEmpty(bph1.j()))
            {
                eaf1.i = bph1.j();
            }
            eaf1.k = bph1.l();
            if (!TextUtils.isEmpty(bph1.n()))
            {
                eaf1.l = bph1.n();
            }
            gdv.a("Expected null", bph1.o());
            gdv.a("Expected null", bph1.k());
            eah1.a = eaf1;
        }
        if (!TextUtils.isEmpty(b))
        {
            eah1.b = b;
        }
        eah1.c = c;
        eah1.d = d;
        if (e != null)
        {
            if (!TextUtils.isEmpty(e.a()))
            {
                eah1.e = e.a();
            }
            if (!TextUtils.isEmpty(e.b()))
            {
                eah1.f = e.b();
            }
        }
        eah1.g = f;
        eah1.i = g;
        if (h != null)
        {
            eah1.h = h.f();
        }
        return eah1;
    }
}
