// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class asn
    implements ase
{

    final ask a;

    asn(ask ask1)
    {
        a = ask1;
        super();
    }

    public void a()
    {
        ebw.c("Babel_ConvCreator", "Transport type selection dialog cancelled");
        ((ary)a.c.a(ary)).a();
    }

    public void a(int i)
    {
        ebw.c("Babel_ConvCreator", (new StringBuilder(35)).append("Selected transport type ").append(i).toString());
        for (Iterator iterator = a.d.d().iterator(); iterator.hasNext();)
        {
            ais ais1 = (ais)iterator.next();
            daw daw1 = daw.a(a.a, a.f.a(), a.e, i, ais1.b().d);
            if (!daw1.a)
            {
                String s = String.valueOf(ais1.toString());
                if (s.length() != 0)
                {
                    s = "Conversation not created due to unreachable ".concat(s);
                } else
                {
                    s = new String("Conversation not created due to unreachable ");
                }
                ebw.c("Babel_ConvCreator", s);
                daw1.a(a.a, false);
                ((ary)a.c.a(ary)).a();
                return;
            }
        }

        ask.a(a, i);
    }
}
