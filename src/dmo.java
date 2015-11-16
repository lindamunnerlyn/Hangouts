// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class dmo extends dng
{

    private static final long serialVersionUID = 1L;
    private static final boolean v = false;
    public final List a;
    public final List b;
    private int w;
    private int x;

    public dmo(iza iza1, int i, long l, iww iww1, boolean flag)
    {
        boolean flag1;
label0:
        {
            boolean flag2 = false;
            super(iza1, i, l);
            if (i == 2 && flag && g.a(Integer.valueOf(g), 0) != 10)
            {
                eev.c("Babel", ">>> Other client is active, downgrade notification to DISPLAYONLY");
                f = dgk.a();
            }
            a = dmt.a(iww1.a.a);
            lcn alcn[] = iww1.a.b;
            int j = g.a(iza1.t, 0);
            ArrayList arraylist = new ArrayList();
            if (alcn.length > 0)
            {
                int i1 = alcn.length;
                for (i = 0; i < i1; i++)
                {
                    dmp dmp1 = dmp.a(alcn[i], j);
                    if (dmp1 != null)
                    {
                        arraylist.add(dmp1);
                    }
                }

            }
            b = arraylist;
            new ArrayList();
            Object obj = dmp.a(iww1.a.a, g.a(iza1.t, 0));
            b.addAll(((java.util.Collection) (obj)));
            obj = a.iterator();
            for (i = 0; ((Iterator) (obj)).hasNext(); i = ((dmt)((Iterator) (obj)).next()).b.length() + i) { }
            flag1 = flag2;
            if (b.isEmpty())
            {
                break label0;
            }
            if (TextUtils.isEmpty(((dmp)b.get(0)).f))
            {
                flag1 = flag2;
                if (TextUtils.isEmpty(((dmp)b.get(0)).g))
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        if (i == 0 && !flag1)
        {
            String s = String.valueOf(iza1.d);
            iza1 = String.valueOf(iza1.a.a);
            i = iww1.a.a.length;
            int k = iww1.a.b.length;
            eev.g("Babel", (new StringBuilder(String.valueOf(s).length() + 112 + String.valueOf(iza1).length())).append("Message without text or image: eventId ").append(s).append(" conversationId ").append(iza1).append(" num segments = ").append(i).append(" num attachments = ").append(k).toString());
        }
    }

    private dmo(String s, List list, cgd cgd, long l, String s1)
    {
        super(s, cgd, l, s1);
        a = list;
        b = null;
    }

    public static dmo a(String s, List list, cgd cgd, long l, String s1)
    {
        return new dmo(s, list, cgd, l, s1);
    }

    static boolean e()
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
            String s = ((dmt)a.get(0)).b;
            if (g.w(s))
            {
                return s;
            }
        }
        return null;
    }

    public void b(int i)
    {
        x = i;
    }

    public int c()
    {
        return w;
    }

    public int d()
    {
        return x;
    }

    static 
    {
        hnc hnc = eev.k;
    }
}
