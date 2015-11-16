// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class cfg
{

    private static Map a;
    private static String b;
    public cef o;
    public cfq p;
    public String q;
    public String r;

    cfg()
    {
    }

    static String a(String s, String s1, cef cef1, int i)
    {
        boolean flag = false;
        if (!TextUtils.equals(b, cef1.a))
        {
            Object obj = cef1.a;
            Object obj1 = (new aow(g.nU, i)).J(((String) (obj)));
            obj = new HashMap();
            obj1 = ((List) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                cfz cfz1 = (cfz)((Iterator) (obj1)).next();
                String s2 = cfz1.f;
                if (!aoc.e(g.nU, i).a(cfz1.b) && !TextUtils.isEmpty(s2))
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
            b = cef1.a;
        }
        cef1 = a;
        i = ((flag) ? 1 : 0);
        if (cef1 != null)
        {
            i = ((flag) ? 1 : 0);
            if (s != null)
            {
                i = ((flag) ? 1 : 0);
                if (g.a((Integer)cef1.get(s), 0) > 1)
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
