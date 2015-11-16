// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.List;

public class cts extends cua
{

    private static final long serialVersionUID = 1L;
    public final List a;
    public final long b;

    public cts(String s, String s1, List list, long l)
    {
        super(s1, s);
        a = list;
        b = l;
    }

    public kop a(String s, int i, int j)
    {
        if (ctr.e)
        {
            ebw.b("Babel_RequestWriter", "addUsers build protobuf");
        }
        itb itb1 = new itb();
        itb1.b = aoe.c(this.j);
        itb1.a = ctq.a(c);
        itb1.e = Integer.valueOf(4);
        iqe iqe1 = new iqe();
        iqe1.a = itb1;
        if (a.size() > 0)
        {
            ius aius[] = new ius[a.size()];
            int k = 0;
            while (k < a.size()) 
            {
                daf daf1 = (daf)a.get(k);
                boolean flag;
                if (daf1.c != null || !TextUtils.isEmpty(daf1.e))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                gbh.a(flag);
                aius[k] = daf1.d();
                k++;
            }
            iqe1.b = aius;
        }
        iqe1.requestHeader = ctq.a(s, i, j, h);
        return iqe1;
    }

    public String g()
    {
        return "conversations/adduser";
    }
}
