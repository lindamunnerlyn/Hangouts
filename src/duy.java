// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.text.TextUtils;

public final class duy
{

    public final boy a;
    public final String b;
    final long c;
    public final long d;
    final duh e;
    public final int f;
    final boolean g;
    final dvh h;

    public duy(boy boy1, String s, long l, long l1, duh duh1, 
            int i, boolean flag, dvh dvh1)
    {
        a = boy1;
        b = s;
        c = l;
        d = l1;
        e = duh1;
        f = i;
        g = flag;
        h = dvh1;
    }

    public static duy a(Bundle bundle)
    {
        dvh dvh1 = null;
        Bundle bundle1;
        if (bundle != null)
        {
            if ((bundle1 = (Bundle)bundle.getParcelable("com.google.android.apps.hangouts.telephony.hangout_info_bundle")) != null)
            {
                bundle1.setClassLoader(boy.getClassLoader());
                boy boy1 = (boy)bundle1.getParcelable("hangout_request");
                if (boy1 != null)
                {
label0:
                    {
                        String s = bundle1.getString("experiment_code");
                        String s1 = bundle1.getString("experiment_flags");
                        if (s == null)
                        {
                            bundle = dvh1;
                            if (s1 == null)
                            {
                                break label0;
                            }
                        }
                        bundle = new duh(s, s1);
                    }
                    dvh1 = (dvh)bundle1.getParcelable("network_status");
                    return new duy(boy1, bundle1.getString("inviter_phone_number"), bundle1.getLong("invitation_id"), bundle1.getLong("timestamp_millis"), bundle, bundle1.getInt("account_id"), bundle1.getBoolean("did_fallback_to_lte"), dvh1);
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

    public dwx b()
    {
        dwx dwx1 = new dwx();
        if (a != null)
        {
            boy boy1 = a;
            dwv dwv1 = new dwv();
            if (!TextUtils.isEmpty(boy1.a()))
            {
                dwv1.a = boy1.a();
            }
            dwv1.j = boy1.m();
            if (!TextUtils.isEmpty(boy1.b()))
            {
                dwv1.b = boy1.b();
            }
            if (!TextUtils.isEmpty(boy1.d()))
            {
                dwv1.c = boy1.d();
            }
            if (!TextUtils.isEmpty(boy1.e()))
            {
                dwv1.d = boy1.e();
            }
            if (!TextUtils.isEmpty(boy1.f()))
            {
                dwv1.e = boy1.f();
            }
            if (!TextUtils.isEmpty(boy1.g()))
            {
                dwv1.f = boy1.g();
            }
            if (!TextUtils.isEmpty(boy1.h()))
            {
                dwv1.g = boy1.h();
            }
            if (!TextUtils.isEmpty(boy1.i()))
            {
                dwv1.h = boy1.i();
            }
            if (!TextUtils.isEmpty(boy1.j()))
            {
                dwv1.i = boy1.j();
            }
            dwv1.k = boy1.l();
            if (!TextUtils.isEmpty(boy1.n()))
            {
                dwv1.l = boy1.n();
            }
            gbh.a(boy1.o());
            gbh.a(boy1.k());
            dwx1.a = dwv1;
        }
        if (!TextUtils.isEmpty(b))
        {
            dwx1.b = b;
        }
        dwx1.c = c;
        dwx1.d = d;
        if (e != null)
        {
            if (!TextUtils.isEmpty(e.a()))
            {
                dwx1.e = e.a();
            }
            if (!TextUtils.isEmpty(e.b()))
            {
                dwx1.f = e.b();
            }
        }
        dwx1.g = f;
        dwx1.i = g;
        if (h != null)
        {
            dwx1.h = h.f();
        }
        return dwx1;
    }
}
