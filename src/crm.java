// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class crm extends cza
{

    private static final long serialVersionUID = 1L;
    private static final boolean v = false;
    public final List a;
    public final List b;
    private int w;

    public crm(isv isv1, int i, long l, iqr iqr1, boolean flag)
    {
        boolean flag1;
label0:
        {
            boolean flag2 = false;
            super(isv1, i, l);
            if (i == 2 && flag && g.a(Integer.valueOf(g), 0) != 10)
            {
                ebw.c("Babel", ">>> Other client is active, downgrade notification to DISPLAYONLY");
                f = dfb.a();
            }
            a = crr.a(iqr1.a.a);
            kuj akuj[] = iqr1.a.b;
            int j = g.a(isv1.t, 0);
            ArrayList arraylist = new ArrayList();
            if (akuj.length > 0)
            {
                int i1 = akuj.length;
                for (i = 0; i < i1; i++)
                {
                    crn crn1 = crn.a(akuj[i], j);
                    if (crn1 != null)
                    {
                        arraylist.add(crn1);
                    }
                }

            }
            b = arraylist;
            new ArrayList();
            Object obj = crn.a(iqr1.a.a, g.a(isv1.t, 0));
            b.addAll(((java.util.Collection) (obj)));
            obj = a.iterator();
            for (i = 0; ((Iterator) (obj)).hasNext(); i = ((crr)((Iterator) (obj)).next()).b.length() + i) { }
            flag1 = flag2;
            if (b.isEmpty())
            {
                break label0;
            }
            if (TextUtils.isEmpty(((crn)b.get(0)).f))
            {
                flag1 = flag2;
                if (TextUtils.isEmpty(((crn)b.get(0)).g))
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        if (i == 0 && !flag1)
        {
            String s = String.valueOf(isv1.d);
            isv1 = String.valueOf(isv1.a.a);
            i = iqr1.a.a.length;
            int k = iqr1.a.b.length;
            ebw.g("Babel", (new StringBuilder(String.valueOf(s).length() + 112 + String.valueOf(isv1).length())).append("Message without text or image: eventId ").append(s).append(" conversationId ").append(isv1).append(" num segments = ").append(i).append(" num attachments = ").append(k).toString());
        }
    }

    private crm(String s, List list, cey cey, long l, String s1)
    {
        super(s, cey, l, s1);
        a = list;
        b = null;
    }

    public static crm a(String s, List list, cey cey, long l, String s1)
    {
        return new crm(s, list, cey, l, s1);
    }

    static boolean d()
    {
        return v;
    }

    public List a()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(d);
        return arraylist;
    }

    public void a(int i)
    {
        w = i;
    }

    public String b()
    {
        if (a != null && a.size() == 1)
        {
            String s = ((crr)a.get(0)).b;
            if (g.w(s))
            {
                return s;
            }
        }
        return null;
    }

    public int c()
    {
        return w;
    }

    static 
    {
        hik hik = ebw.k;
    }
}
