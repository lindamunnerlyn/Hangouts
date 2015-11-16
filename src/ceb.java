// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ceb
{

    private static Map a;
    private static String b;
    public cda o;
    public cel p;
    public String q;
    public String r;

    ceb()
    {
    }

    static String a(String s, String s1, cda cda1, int i)
    {
        boolean flag = false;
        if (!TextUtils.equals(b, cda1.a))
        {
            Object obj = cda1.a;
            Object obj1 = (new aoe(g.nS, i)).J(((String) (obj)));
            obj = new HashMap();
            obj1 = ((List) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                ceu ceu1 = (ceu)((Iterator) (obj1)).next();
                String s2 = ceu1.f;
                if (!ank.e(g.nS, i).a(ceu1.b) && !TextUtils.isEmpty(s2))
                {
                    int j;
                    if (((HashMap) (obj)).containsKey(s2))
                    {
                        j = g.a((Integer)((HashMap) (obj)).get(s2), 0);
                    } else
                    {
                        j = 0;
                    }
                    ((HashMap) (obj)).put(s2, Integer.valueOf(j + 1));
                }
            } while (true);
            a = ((Map) (obj));
            b = cda1.a;
        }
        cda1 = a;
        i = ((flag) ? 1 : 0);
        if (cda1 != null)
        {
            i = ((flag) ? 1 : 0);
            if (s != null)
            {
                i = ((flag) ? 1 : 0);
                if (g.a((Integer)cda1.get(s), 0) > 1)
                {
                    i = 1;
                }
            }
        }
        if (i != 0)
        {
            return s1;
        } else
        {
            return s;
        }
    }
}
