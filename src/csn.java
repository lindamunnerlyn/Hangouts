// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class csn extends csm
{

    private static final long serialVersionUID = 1L;
    private final String a;

    public csn(String s)
    {
        gbh.b(TextUtils.isEmpty(s));
        a = s;
    }

    public kop a(String s, int i, int j)
    {
        s = new ken();
        Object obj = new kcr();
        obj.a = a;
        Object obj1 = new kem();
        obj1.a = (new kcr[] {
            obj
        });
        s.a = ((kem) (obj1));
        obj1 = new jxx();
        obj1.a = Boolean.valueOf(true);
        obj = new jxw();
        obj.b = ((jxx) (obj1));
        obj1 = new jxv();
        obj1.b = ((jxw) (obj));
        obj = new kdf();
        obj.d = ((jxv) (obj1));
        obj1 = new kdh();
        obj1.c = ((kdf) (obj));
        s.b = ((kdh) (obj1));
        obj = new hti();
        obj.a = s;
        return ((kop) (obj));
    }

    public String g()
    {
        return "readitemsbyid";
    }
}
