// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public class csq extends csm
{

    private static final long serialVersionUID = 1L;
    private final String a;

    public csq(String s)
    {
        gbh.b(TextUtils.isEmpty(s));
        a = s;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kop a(String s, int i, int j)
    {
        s = new huo();
        s.a = a;
        s.e = Integer.valueOf(100);
        s.d = Integer.valueOf(100);
        s.c = (new int[] {
            3
        });
        s.i = Boolean.valueOf(false);
        htm htm1 = new htm();
        htm1.a = s;
        return htm1;
    }

    public long b()
    {
        return TimeUnit.MINUTES.toMillis(5L);
    }

    public String g()
    {
        return "userphotoalbums";
    }
}
