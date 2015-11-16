// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;

final class avl
    implements atb
{

    final ave a;

    avl(ave ave1)
    {
        a = ave1;
        super();
    }

    public void a()
    {
        ave.O(a);
    }

    public void a(asz asz1)
    {
        ark ark1;
        for (ark1 = ave.o(a).a(); ark1 == null || asz1 != asz.d;)
        {
            return;
        }

        bwr bwr1 = bwr.d;
        asz1 = ark1.e;
        if (ark1.h != null)
        {
            asz1 = g.a(ark1.h, true);
        }
        if (ark1.e != null)
        {
            (new bwn(ave.h(a), asz1, ark1.e, ark1.a, bwr1, ave.P(a))).a(a.getFragmentManager());
            return;
        } else
        {
            Toast.makeText(ave.Q(a), l.hB, 1).show();
            return;
        }
    }

    public void b()
    {
        if (ave.C(a) != null)
        {
            ave.a(a, false);
        }
    }

    public void c()
    {
        if (ave.C(a) != null)
        {
            ave.a(a, true);
        }
    }
}
