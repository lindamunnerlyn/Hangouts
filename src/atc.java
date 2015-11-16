// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class atc
    implements ast
{

    final asz a;

    atc(asz asz1)
    {
        a = asz1;
        super();
    }

    public void a()
    {
        eev.c("Babel_ConvCreator", "Transport type selection dialog cancelled");
        ((asn)a.c.a(asn)).a();
    }

    public void a(int i)
    {
        eev.c("Babel_ConvCreator", (new StringBuilder(35)).append("Selected transport type ").append(i).toString());
        for (Iterator iterator = a.d.d().iterator(); iterator.hasNext();)
        {
            ail ail1 = (ail)iterator.next();
            dcc dcc1 = dcc.a(a.a, a.f.a(), a.e, i, ail1.b().d);
            if (!dcc1.a)
            {
                String s = String.valueOf(ail1.toString());
                if (s.length() != 0)
                {
                    s = "Conversation not created due to unreachable ".concat(s);
                } else
                {
                    s = new String("Conversation not created due to unreachable ");
                }
                eev.c("Babel_ConvCreator", s);
                dcc1.a(a.a, false);
                ((asn)a.c.a(asn)).a();
                return;
            }
        }

        asz.a(a, i);
    }
}
