// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class cik extends diq
{

    final cic a;
    private final String b;

    cik(cic cic1)
    {
        a = cic1;
        super(cic.g(cic1));
        cic1 = String.valueOf(cik.getName());
        int i = hashCode();
        b = (new StringBuilder(String.valueOf(cic1).length() + 11)).append(cic1).append(i).toString();
    }

    protected void a(did did1)
    {
        Object obj1 = (czw)did1.c();
        Object obj = new ArrayList();
        did1 = new ArrayList();
        for (obj1 = ((czw) (obj1)).k().iterator(); ((Iterator) (obj1)).hasNext();)
        {
            cfz cfz1 = (cfz)((Iterator) (obj1)).next();
            amz amz1 = amz.a(cfz1, null, false);
            if (cfz1.y)
            {
                ((List) (obj)).add(amz1);
            } else
            {
                did1.add(amz1);
            }
        }

        obj = new anc(((List) (obj)));
        cic.e(a).c(((anb) (obj)));
        did1 = new anc(did1);
        cic.e(a).d(did1);
        cic.a(a, a.getView());
    }

    public void a(String s)
    {
        a(RealTimeChatService.b(cic.b(a), s, b));
    }
}
