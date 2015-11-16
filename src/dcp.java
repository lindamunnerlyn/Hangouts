// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;
import java.util.ArrayList;

public final class dcp extends dfa
{

    private final long a[];

    public dcp(ani ani1, long al[])
    {
        super(ani1);
        a = al;
    }

    public void a()
    {
        aoe aoe1;
        long l;
        aoe1 = new aoe(g.nS, b.h());
        aoe1.a();
        l = -1L;
        ArrayList arraylist;
        long al[];
        int j;
        arraylist = new ArrayList();
        al = a;
        j = al.length;
        int i = 0;
_L14:
        if (i >= j) goto _L2; else goto _L1
_L1:
        long l2 = al[i];
        aos aos1 = aoe1.b(l2);
        boolean flag = false;
        if (aos1 == null) goto _L4; else goto _L3
_L3:
        String s = aos1.b;
        if (!g.d(aos1.x)) goto _L6; else goto _L5
_L5:
        if (aos1.z != 1) goto _L8; else goto _L7
_L7:
        Object obj = dht.getName();
          goto _L9
_L13:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        Intent intent = RequestWriter.k();
        intent.putExtra("cancel_class", ((String) (obj)));
        obj = aos1.a;
        String s1 = b.a();
        intent.putExtra("cancel_request", (new StringBuilder(String.valueOf(obj).length() + 23 + String.valueOf(s1).length() + String.valueOf(s).length())).append(((String) (obj))).append("|").append(l2).append("|").append(s1).append("|").append(s).toString());
        g.nS.startService(intent);
        boolean flag1;
        long l1;
        l1 = l;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        arraylist.add(aos1.a);
        aoe1.f(s, l2);
        l1 = Math.max(l, aos1.h);
        boolean flag2;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        any.a(aoe1, l2);
        if (arraylist.size() > 0)
        {
            (new dco(s, l1, (String[])arraylist.toArray(new String[arraylist.size()]))).a(c);
        }
        if (s == null) goto _L11; else goto _L10
_L10:
        any.d(aoe1, s);
          goto _L11
_L8:
        obj = dhz.getName();
          goto _L9
_L6:
        if (!dbq.d(b.h()))
        {
            break MISSING_BLOCK_LABEL_398;
        }
        obj = dhq.getName();
_L12:
        if (aos1.f == dqb.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (aos1.f == dqb.e)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        break MISSING_BLOCK_LABEL_461;
        obj = cut.getName();
          goto _L12
_L2:
        aoe1.b();
        aoe1.c();
        return;
        obj;
        aoe1.c();
        throw obj;
_L4:
        obj = null;
        flag1 = false;
        flag2 = true;
        s = null;
          goto _L13
_L9:
        flag = true;
        flag1 = false;
        flag2 = true;
          goto _L13
_L11:
        i++;
        l = l1;
          goto _L14
        if (!flag && !flag1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
          goto _L13
    }
}
