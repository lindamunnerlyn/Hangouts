// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

final class avt
    implements att
{

    private String a;
    private String b;
    private final List c = new ArrayList();

    avt()
    {
    }

    void a(hlp hlp1)
    {
        hlp1.a(att, this);
    }

    void a(String s, String s1)
    {
        if (!TextUtils.equals(a, s) || !TextUtils.equals(b, s1))
        {
            a = s;
            b = s1;
            int i = c.size() - 1;
            while (i >= 0) 
            {
                c.get(i);
                i--;
            }
        }
    }
}
