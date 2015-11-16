// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class atd
    implements gvb
{

    final asz a;

    atd(asz asz1)
    {
        a = asz1;
        super();
    }

    public void a(String s, gvv gvv1, gvs gvs)
    {
        int i = a.b;
        if (!s.equals((new StringBuilder(32)).append("conversation_creation").append(i).toString()))
        {
            return;
        }
        eev.c("Babel_ConvCreator", "Conversation creation background task finished");
        gvs = (asn)a.c.a(asn);
        boolean flag;
        if (gvv1 != null && gvv1.a() == 200)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            eev.c("Babel_ConvCreator", "Conversation created successfully");
            gvs.a(gvv1.d().getString("conversation_id"));
        } else
        {
            if (gvv1 != null)
            {
                s = gvv1.c();
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
            eev.g("Babel_ConvCreator", s);
            gvs.a();
        }
        a.b(flag);
    }
}
