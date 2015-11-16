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

final class chc extends dhh
{

    final cgw a;

    chc(cgw cgw1)
    {
        a = cgw1;
        super(cgw.h(cgw1));
    }

    private static void a(ceu aceu[], List list)
    {
        ArrayList arraylist1 = new ArrayList();
        int k = aceu.length;
        for (int i = 0; i < k; i++)
        {
            ceu ceu1 = aceu[i];
            if (ceu1 != null && !ceu1.z && ceu1.c != null)
            {
                arraylist1.add(ceu1.c);
            }
        }

        boolean flag = true;
        int l = aceu.length;
        int j = 0;
        while (j < l) 
        {
            ceu ceu2 = aceu[j];
            boolean flag1 = flag;
            if (ceu2 != null)
            {
                flag1 = flag;
                if (ceu2.z)
                {
                    ArrayList arraylist;
                    if (flag)
                    {
                        arraylist = arraylist1;
                    } else
                    {
                        arraylist = null;
                    }
                    list.add(amh.a(ceu2, arraylist, false));
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
        arraylist.add(dac.b(s, s1));
        a(RealTimeChatService.a(cgw.b(a), arraylist, null, true));
    }

    protected void a(dgu dgu1)
    {
        Object obj = ((cwi)dgu1.c()).k();
        dgu1 = new ArrayList(((List) (obj)).size());
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a((ceu[])((ebj)((Iterator) (obj)).next()).b, ((List) (dgu1)))) { }
        if (!cgw.i(a))
        {
            for (int i = dgu1.size() - 1; i >= 0; i--)
            {
                if (!((amf)dgu1.get(i)).q())
                {
                    dgu1.remove(i);
                }
            }

        }
        if (!dgu1.isEmpty())
        {
            cgw.e(a).a(dgu1);
        }
    }

    public void a(String s)
    {
        if (Patterns.EMAIL_ADDRESS.matcher(s).matches())
        {
            if (cgw.i(a))
            {
                amh amh1 = (new ami()).a(s).e(s).b();
                cgw.e(a).a(Collections.singletonList(amh1));
            }
            c(s, null);
            return;
        }
        String s2 = ebz.m(s);
        String s1 = s2;
        if (s2 == null)
        {
            s1 = s2;
            if (g.a(cgw.j(a), "babel_use_loose_number_match", true))
            {
                s1 = s2;
                if (ebz.e(s))
                {
                    s1 = ebz.f(s);
                }
            }
        }
        if (s1 != null)
        {
            s = (new ami()).a(s).f(s1).b();
            cgw.e(a).a(Collections.singletonList(s));
            c(null, s1);
            return;
        } else
        {
            cgw.e(a).a(null);
            return;
        }
    }
}
