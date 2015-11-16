// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;

public class cun extends cui
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

    private cun(int i, long l1, String s1, boolean flag, String s2, String s3, 
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

    public static cun a(String s1, long l1, String s2)
    {
        return new cun(2, l1, s1, false, s2, null, true, 0, false, false, false, 0, 0, false, null);
    }

    public static cun a(String s1, long l1, String s2, String s3)
    {
        return new cun(2, l1, s1, false, s2, s3, true, 0, false, false, false, 0, 0, false, null);
    }

    public static cun a(String s1, long l1, boolean flag, String s2, boolean flag1, int i, boolean flag2, 
            boolean flag3, boolean flag4, int i1, int j1, boolean flag5, String s3)
    {
        return new cun(1, l1, s1, flag, s2, null, flag1, i, flag2, flag3, flag4, i1, j1, flag5, s3);
    }

    public kop a(String s1, int i, int i1)
    {
        iwu iwu1;
        iwu1 = new iwu();
        iwu1.requestHeader = ctq.a(s1, i, i1, h);
        iwu1.a = Integer.valueOf(1);
        iwu1.r = l;
        iwu1.b = Integer.valueOf(a);
        iwu1.p = d;
        iwu1.o = Long.valueOf(c);
        iwu1.c = b;
        iwu1.C = Boolean.valueOf(t);
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
        iwu1.q = (String[])s1.toArray(new String[s1.size()]);
        if (!TextUtils.isEmpty(m))
        {
            if (ebw.a("Babel_RequestWriter", 3))
            {
                s1 = String.valueOf(m);
                iyn iyn1;
                if (s1.length() != 0)
                {
                    s1 = "Unregistering removed account:".concat(s1);
                } else
                {
                    s1 = new String("Unregistering removed account:");
                }
                ebw.d("Babel_RequestWriter", s1);
            }
            iwu1.B = m;
        }
        if (o > 0)
        {
            iwu1.t = Integer.valueOf(o);
        }
        if (!p || !q) goto _L2; else goto _L1
_L1:
        iwu1.x = new String[2];
        iwu1.x[0] = "com.google.chat.DEVICE_SMS_ENABLED";
        iwu1.x[1] = "com.google.chat.SMS_ACCOUNT";
_L4:
        iwu1.y = Integer.valueOf(r);
        iwu1.z = Integer.valueOf(s);
        if (v != null)
        {
            s1 = new jtj();
            s1.a = v;
            iyn1 = new iyn();
            iyn1.a = s1;
            iwu1.D = iyn1;
        }
        return iwu1;
_L2:
        if (p)
        {
            iwu1.x = new String[1];
            iwu1.x[0] = "com.google.chat.DEVICE_SMS_ENABLED";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(ani ani1, dbo dbo)
    {
        if (a == 1)
        {
            dbf.a(ani1, dbo);
            return;
        }
        ani1 = String.valueOf(ebw.b(ani1.a()));
        if (ani1.length() != 0)
        {
            ani1 = "Unregistering account failed: ".concat(ani1);
        } else
        {
            ani1 = new String("Unregistering account failed: ");
        }
        ebw.f("Babel_RequestWriter", ani1);
    }

    public boolean a(ccg ccg)
    {
        boolean flag1 = false;
        boolean flag = true;
        gbh.a(getClass(), ccg.getClass());
        ccg = (cun)ccg;
        if (TextUtils.equals(m, ((cun) (ccg)).m))
        {
            if (a != ((cun) (ccg)).a)
            {
                if (ctr.e)
                {
                    int i = ((cun) (ccg)).a;
                    ebw.b("Babel_RequestWriter", (new StringBuilder(69)).append("Replacing a DeviceRegistrationRequest with different type:").append(i).toString());
                }
                return true;
            }
            if (n != ((cun) (ccg)).n)
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
                if (ctr.e)
                {
                    boolean flag2 = ((cun) (ccg)).n;
                    boolean flag3 = n;
                    ebw.b("Babel_RequestWriter", (new StringBuilder(79)).append("Replacing a DeviceRegistrationRequest. Old withRetry=").append(flag2).append(". New withRetry=").append(flag3).toString());
                    return flag;
                }
            }
        }
        return flag1;
    }

    public boolean a(cci cci, dbo dbo)
    {
        return n && super.a(cci, dbo);
    }

    public long b()
    {
        if (n)
        {
            return dbf.a();
        } else
        {
            return 0L;
        }
    }

    public String g()
    {
        return "devices/registerdevice";
    }

    public boolean k()
    {
        return !n;
    }
}
