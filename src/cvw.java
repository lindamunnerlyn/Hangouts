// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.List;

public class cvw extends cwe
{

    private static final long serialVersionUID = 1L;
    public final List a;
    public final long b;

    public cvw(String s, String s1, List list, long l)
    {
        super(s1, s);
        a = list;
        b = l;
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            eev.b("Babel_RequestWriter", "addUsers build protobuf");
        }
        izg izg1 = new izg();
        izg1.b = aow.c(this.j);
        izg1.a = cvu.a(c);
        izg1.e = Integer.valueOf(4);
        iwj iwj1 = new iwj();
        iwj1.a = izg1;
        if (a.size() > 0)
        {
            jax ajax[] = new jax[a.size()];
            int k = 0;
            while (k < a.size()) 
            {
                dbl dbl1 = (dbl)a.get(k);
                boolean flag;
                if (dbl1.c != null || !TextUtils.isEmpty(dbl1.e))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                gdv.a("Expected condition to be true", flag);
                ajax[k] = dbl1.d();
                k++;
            }
            iwj1.b = ajax;
        }
        iwj1.requestHeader = cvu.a(s, i, j, h);
        return iwj1;
    }

    public String f()
    {
        return "conversations/adduser";
    }
}
