// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;
import java.util.ArrayList;

public final class ddx extends dgj
{

    private final long a[];

    public ddx(aoa aoa1, long al[])
    {
        super(aoa1);
        a = al;
    }

    public void a()
    {
        aow aow1;
        long l;
        aow1 = new aow(g.nU, super.b.a);
        aow1.a();
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
        apk apk1 = aow1.b(l2);
        boolean flag = false;
        if (apk1 == null) goto _L4; else goto _L3
_L3:
        String s = apk1.b;
        if (!g.d(apk1.x)) goto _L6; else goto _L5
_L5:
        if (apk1.z != 1) goto _L8; else goto _L7
_L7:
        Object obj = djc.getName();
          goto _L9
_L13:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        Intent intent = RequestWriter.k();
        intent.putExtra("cancel_class", ((String) (obj)));
        obj = apk1.a;
        String s1 = String.valueOf(super.b.b.a());
        intent.putExtra("cancel_request", (new StringBuilder(String.valueOf(obj).length() + 23 + String.valueOf(s1).length() + String.valueOf(s).length())).append(((String) (obj))).append("|").append(l2).append("|").append(s1).append("|").append(s).toString());
        g.nU.startService(intent);
        boolean flag1;
        long l1;
        l1 = l;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_281;
        }
        arraylist.add(apk1.a);
        aow1.f(s, l2);
        l1 = Math.max(l, apk1.h);
        boolean flag2;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_292;
        }
        aoq.a(aow1, l2);
        if (arraylist.size() > 0)
        {
            (new ddw(s, l1, (String[])arraylist.toArray(new String[arraylist.size()]))).a(this);
        }
        if (s == null) goto _L11; else goto _L10
_L10:
        aoq.d(aow1, s);
          goto _L11
_L8:
        obj = djl.getName();
          goto _L9
_L6:
        if (!dcz.d(super.b.a))
        {
            break MISSING_BLOCK_LABEL_401;
        }
        obj = diz.getName();
_L12:
        if (apk1.f == dsu.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (apk1.f == dsu.e)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        break MISSING_BLOCK_LABEL_464;
        obj = cwx.getName();
          goto _L12
_L2:
        aow1.b();
        aow1.c();
        return;
        obj;
        aow1.c();
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
