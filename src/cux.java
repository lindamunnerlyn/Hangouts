// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class cux extends cup
{

    private static final long serialVersionUID = 1L;
    private final String a;
    private final String b;
    private final int c;
    private final cuy d;

    public cux(cuy cuy1, String s, String s1, int i)
    {
        d = cuy1;
        a = s;
        b = s1;
        c = i;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kws a(String s, int i, int j)
    {
        s = new hyx();
        Object obj = new hyu();
        if (d == cuy.c)
        {
            obj.a = Integer.valueOf(c);
        } else
        if (d == cuy.b)
        {
            obj.e = Integer.valueOf(c);
        } else
        if (d == cuy.a)
        {
            obj.f = Integer.valueOf(c);
        } else
        {
            gdv.b("Expected condition to be false", TextUtils.isEmpty(a));
            hyv hyv1 = new hyv();
            hyv1.a = a;
            hyv1.b = b;
            hyv1.c = Integer.valueOf(c);
            obj.c = (new hyv[] {
                hyv1
            });
        }
        s.a = ((hyu) (obj));
        obj = new hyo();
        obj.a = s;
        return ((kws) (obj));
    }

    public void a(aoa aoa1, dcx dcx)
    {
        aoa1 = String.valueOf(eev.b(aoa1.c()));
        if (aoa1.length() != 0)
        {
            aoa1 = "SetChatAclSettingRequest failed for ".concat(aoa1);
        } else
        {
            aoa1 = new String("SetChatAclSettingRequest failed for ");
        }
        eev.e("Babel", aoa1, dcx);
    }

    public boolean a(cdn cdn, dcx dcx)
    {
        return false;
    }

    public String f()
    {
        return "setchatacls";
    }
}
