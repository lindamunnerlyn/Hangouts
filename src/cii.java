// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Patterns;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class cii extends diq
{

    final cic a;

    cii(cic cic1)
    {
        a = cic1;
        super(cic.h(cic1));
    }

    private static void a(cfz acfz[], List list)
    {
        ArrayList arraylist1 = new ArrayList();
        int k = acfz.length;
        for (int i = 0; i < k; i++)
        {
            cfz cfz1 = acfz[i];
            if (cfz1 != null && !cfz1.z && cfz1.c != null)
            {
                arraylist1.add(cfz1.c);
            }
        }

        boolean flag = true;
        int l = acfz.length;
        int j = 0;
        while (j < l) 
        {
            cfz cfz2 = acfz[j];
            boolean flag1 = flag;
            if (cfz2 != null)
            {
                flag1 = flag;
                if (cfz2.z)
                {
                    ArrayList arraylist;
                    if (flag)
                    {
                        arraylist = arraylist1;
                    } else
                    {
                        arraylist = null;
                    }
                    list.add(amz.a(cfz2, arraylist, false));
                    flag1 = false;
                }
            }
            j++;
            flag = flag1;
        }
    }

    private void c(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(dbi.b(s, s1));
        a(RealTimeChatService.a(cic.b(a), arraylist, null, true));
    }

    protected void a(did did1)
    {
        Object obj = ((cym)did1.c()).k();
        did1 = new ArrayList(((List) (obj)).size());
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a((cfz[])((eeh)((Iterator) (obj)).next()).b, ((List) (did1)))) { }
        if (!cic.i(a))
        {
            for (int i = did1.size() - 1; i >= 0; i--)
            {
                if (!((amx)did1.get(i)).q())
                {
                    did1.remove(i);
                }
            }

        }
        if (!did1.isEmpty())
        {
            cic.e(a).a(did1);
        }
    }

    public void a(String s)
    {
        if (Patterns.EMAIL_ADDRESS.matcher(s).matches())
        {
            if (cic.i(a))
            {
                amz amz1 = (new ana()).a(s).e(s).b();
                cic.e(a).a(Collections.singletonList(amz1));
            }
            c(s, null);
            return;
        }
        String s2 = eey.m(s);
        String s1 = s2;
        if (s2 == null)
        {
            s1 = s2;
            if (g.a(cic.j(a), "babel_use_loose_number_match", true))
            {
                s1 = s2;
                if (eey.e(s))
                {
                    s1 = eey.f(s);
                }
            }
        }
        if (s1 != null)
        {
            s = (new ana()).a(s).f(s1).b();
            cic.e(a).a(Collections.singletonList(s));
            c(null, s1);
            return;
        } else
        {
            cic.e(a).a(null);
            return;
        }
    }
}
