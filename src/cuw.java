// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cuw extends cui
{

    private static final long serialVersionUID = 1L;
    public final boolean a;
    public final String b;

    cuw(boolean flag, String s)
    {
        a = flag;
        b = s;
    }

    public kop a(String s, int i, int j)
    {
        boolean flag = true;
        if (ctr.e)
        {
            boolean flag1 = a;
            String s1 = b;
            ebw.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 48)).append("SetCallerIdRequest: enable=").append(flag1).append("e164PhoneNumber=").append(s1).toString());
        }
        ixt ixt1 = new ixt();
        ixt1.requestHeader = ctq.a(null, true, s, i, j, h);
        ixt1.a = new iqo[1];
        ixt1.a[0] = new iqo();
        ixt1.a[0].a = new jtj();
        ixt1.a[0].a.a = b;
        s = ixt1.a[0];
        if (a)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 2;
        }
        s.b = Integer.valueOf(i);
        return ixt1;
    }

    public String g()
    {
        return "contacts/setcalleridconfig";
    }
}
