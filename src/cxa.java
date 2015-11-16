// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxa extends cwm
{

    private static final long serialVersionUID = 1L;
    public final boolean a;
    public final String b;

    cxa(boolean flag, String s)
    {
        a = flag;
        b = s;
    }

    public kws a(String s, int i, int j)
    {
        boolean flag = true;
        if (cvv.e)
        {
            boolean flag1 = a;
            String s1 = b;
            eev.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 48)).append("SetCallerIdRequest: enable=").append(flag1).append("e164PhoneNumber=").append(s1).toString());
        }
        jdy jdy1 = new jdy();
        jdy1.requestHeader = cvu.a(null, true, s, i, j, h);
        jdy1.a = new iwt[1];
        jdy1.a[0] = new iwt();
        jdy1.a[0].a = new kbm();
        jdy1.a[0].a.a = b;
        s = jdy1.a[0];
        if (a)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 2;
        }
        s.b = Integer.valueOf(i);
        return jdy1;
    }

    public String f()
    {
        return "contacts/setcalleridconfig";
    }
}
