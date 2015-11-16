// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class aso
    implements gqq
{

    final ask a;

    aso(ask ask1)
    {
        a = ask1;
        super();
    }

    public void a(String s, grk grk1, grh grh)
    {
        int i = a.b;
        if (!s.equals((new StringBuilder(32)).append("conversation_creation").append(i).toString()))
        {
            return;
        }
        ebw.c("Babel_ConvCreator", "Conversation creation background task finished");
        grh = (ary)a.c.a(ary);
        if (grk1 != null && grk1.a() == 200)
        {
            ebw.c("Babel_ConvCreator", "Conversation created successfully");
            grh.a(grk1.d().getString("conversation_id"));
        } else
        {
            if (grk1 != null)
            {
                s = grk1.c();
            } else
            {
                s = "null";
            }
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Conversation creation failed: ".concat(s);
            } else
            {
                s = new String("Conversation creation failed: ");
            }
            ebw.g("Babel_ConvCreator", s);
            grh.a();
        }
        a.b();
    }
}
