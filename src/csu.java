// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class csu extends csm
{

    private static final long serialVersionUID = 1L;
    private final String a;
    private final String b;
    private final int c;
    private final csv d;

    public csu(csv csv1, String s, String s1, int i)
    {
        d = csv1;
        a = s;
        b = s1;
        c = i;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kop a(String s, int i, int j)
    {
        s = new htt();
        Object obj = new htq();
        if (d == csv.c)
        {
            obj.a = Integer.valueOf(c);
        } else
        if (d == csv.b)
        {
            obj.e = Integer.valueOf(c);
        } else
        if (d == csv.a)
        {
            obj.f = Integer.valueOf(c);
        } else
        {
            gbh.b(TextUtils.isEmpty(a));
            htr htr1 = new htr();
            htr1.a = a;
            htr1.b = b;
            htr1.c = Integer.valueOf(c);
            obj.c = (new htr[] {
                htr1
            });
        }
        s.a = ((htq) (obj));
        obj = new htk();
        obj.a = s;
        return ((kop) (obj));
    }

    public void a(ani ani1, dbo dbo)
    {
        ani1 = String.valueOf(ebw.b(ani1.c()));
        if (ani1.length() != 0)
        {
            ani1 = "SetChatAclSettingRequest failed for ".concat(ani1);
        } else
        {
            ani1 = new String("SetChatAclSettingRequest failed for ");
        }
        ebw.e("Babel", ani1, dbo);
    }

    public boolean a(cci cci, dbo dbo)
    {
        return false;
    }

    public String g()
    {
        return "setchatacls";
    }
}
