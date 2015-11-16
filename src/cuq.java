// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class cuq extends cup
{

    private static final long serialVersionUID = 1L;
    private final String a;

    public cuq(String s)
    {
        gdv.b("Expected condition to be false", TextUtils.isEmpty(s));
        a = s;
    }

    public kws a(String s, int i, int j)
    {
        s = new kmq();
        Object obj = new kku();
        obj.a = a;
        Object obj1 = new kmp();
        obj1.a = (new kku[] {
            obj
        });
        s.a = ((kmp) (obj1));
        obj1 = new kga();
        obj1.a = Boolean.valueOf(true);
        obj = new kfz();
        obj.b = ((kga) (obj1));
        obj1 = new kfy();
        obj1.b = ((kfz) (obj));
        obj = new kli();
        obj.d = ((kfy) (obj1));
        obj1 = new klk();
        obj1.c = ((kli) (obj));
        s.b = ((klk) (obj1));
        obj = new hym();
        obj.a = s;
        return ((kws) (obj));
    }

    public String f()
    {
        return "readitemsbyid";
    }
}
