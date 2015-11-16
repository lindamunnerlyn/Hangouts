// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;

public class cwr extends cwm
{

    private static final long serialVersionUID = 2L;
    public final int a;
    public final String b = Locale.getDefault().toString();
    public final long c;
    public final String d;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final String m;
    public final boolean n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final int r;
    public final int s;
    public final boolean t;
    public String u;
    private final String v;

    private cwr(int i, long l1, String s1, boolean flag, String s2, String s3, 
            boolean flag1, int i1, boolean flag2, boolean flag3, boolean flag4, int j1, int k1, 
            boolean flag5, String s4)
    {
        a = i;
        c = l1;
        d = s1;
        j = flag;
        l = s2;
        m = s3;
        n = flag1;
        o = i1;
        p = flag2;
        q = flag3;
        k = flag4;
        r = j1;
        s = k1;
        t = flag5;
        v = s4;
    }

    public static cwr a(String s1, long l1, String s2)
    {
        return new cwr(2, l1, s1, false, s2, null, true, 0, false, false, false, 0, 0, false, null);
    }

    public static cwr a(String s1, long l1, String s2, String s3)
    {
        return new cwr(2, l1, s1, false, s2, s3, true, 0, false, false, false, 0, 0, false, null);
    }

    public static cwr a(String s1, long l1, boolean flag, String s2, boolean flag1, int i, boolean flag2, 
            boolean flag3, boolean flag4, int i1, int j1, boolean flag5, String s3)
    {
        return new cwr(1, l1, s1, flag, s2, null, flag1, i, flag2, flag3, flag4, i1, j1, flag5, s3);
    }

    public kws a(String s1, int i, int i1)
    {
        jcz jcz1;
        jcz1 = new jcz();
        jcz1.requestHeader = cvu.a(s1, i, i1, h);
        jcz1.a = Integer.valueOf(1);
        jcz1.t = l;
        jcz1.b = Integer.valueOf(a);
        jcz1.r = d;
        jcz1.q = Long.valueOf(c);
        jcz1.c = b;
        jcz1.E = Boolean.valueOf(t);
        s1 = new ArrayList();
        s1.add("com.google.chat.MESSAGING");
        if (a == 1 && j)
        {
            s1.add("com.google.hangout.RING");
            s1.add("com.google.hangout.VOICEONLY");
            if (k)
            {
                s1.add("com.google.hangout.PSTN_RING");
            }
        }
        jcz1.s = (String[])s1.toArray(new String[s1.size()]);
        if (!TextUtils.isEmpty(m))
        {
            if (eev.a("Babel_RequestWriter", 3))
            {
                s1 = String.valueOf(m);
                jes jes1;
                if (s1.length() != 0)
                {
                    s1 = "Unregistering removed account:".concat(s1);
                } else
                {
                    s1 = new String("Unregistering removed account:");
                }
                eev.d("Babel_RequestWriter", s1);
            }
            jcz1.D = m;
        }
        if (o > 0)
        {
            jcz1.v = Integer.valueOf(o);
        }
        if (!p || !q) goto _L2; else goto _L1
_L1:
        jcz1.z = new String[2];
        jcz1.z[0] = "com.google.chat.DEVICE_SMS_ENABLED";
        jcz1.z[1] = "com.google.chat.SMS_ACCOUNT";
_L4:
        jcz1.A = Integer.valueOf(r);
        jcz1.B = Integer.valueOf(s);
        if (v != null)
        {
            s1 = new kbm();
            s1.a = v;
            jes1 = new jes();
            jes1.a = s1;
            jcz1.F = jes1;
        }
        return jcz1;
_L2:
        if (p)
        {
            jcz1.z = new String[1];
            jcz1.z[0] = "com.google.chat.DEVICE_SMS_ENABLED";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(aoa aoa1, dcx dcx)
    {
        if (a == 1)
        {
            dcn.a(aoa1, dcx);
            return;
        }
        aoa1 = String.valueOf(eev.b(aoa1.a()));
        if (aoa1.length() != 0)
        {
            aoa1 = "Unregistering account failed: ".concat(aoa1);
        } else
        {
            aoa1 = new String("Unregistering account failed: ");
        }
        eev.f("Babel_RequestWriter", aoa1);
    }

    public boolean a(cdl cdl)
    {
        boolean flag1 = false;
        boolean flag = true;
        gdv.a(getClass(), cdl.getClass());
        cdl = (cwr)cdl;
        if (TextUtils.equals(m, ((cwr) (cdl)).m))
        {
            if (a != ((cwr) (cdl)).a)
            {
                if (cvv.e)
                {
                    int i = ((cwr) (cdl)).a;
                    eev.b("Babel_RequestWriter", (new StringBuilder(69)).append("Replacing a DeviceRegistrationRequest with different type:").append(i).toString());
                }
                return true;
            }
            if (n != ((cwr) (cdl)).n)
            {
                if (n)
                {
                    flag = false;
                }
            } else
            {
                flag = true;
            }
            flag1 = flag;
            if (flag)
            {
                flag1 = flag;
                if (cvv.e)
                {
                    boolean flag2 = ((cwr) (cdl)).n;
                    boolean flag3 = n;
                    eev.b("Babel_RequestWriter", (new StringBuilder(79)).append("Replacing a DeviceRegistrationRequest. Old withRetry=").append(flag2).append(". New withRetry=").append(flag3).toString());
                    return flag;
                }
            }
        }
        return flag1;
    }

    public boolean a(cdn cdn, dcx dcx)
    {
        return n && super.a(cdn, dcx);
    }

    public long b()
    {
        if (n)
        {
            return dcn.a();
        } else
        {
            return 0L;
        }
    }

    public String f()
    {
        return "devices/registerdevice";
    }

    public boolean j()
    {
        return !n;
    }
}
