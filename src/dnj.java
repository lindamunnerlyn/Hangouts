// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class dnj extends dmw
{

    public final List a = new ArrayList();
    public List b;
    private String c;

    public dnj(jbh jbh1)
    {
        b = new ArrayList();
        StringBuilder stringbuilder = new StringBuilder();
        jbh1 = jbh1.a;
        int k = jbh1.length;
        int i = 0;
        while (i < k) 
        {
            jcb ajcb[] = jbh1[i];
            if (((jca) (ajcb)).a == null)
            {
                eev.f("Babel", "Empty conversationId in ClientMarkEventObservedNotification from the server.");
            } else
            {
                String s = ((jca) (ajcb)).a.a;
                stringbuilder.append("conid: ").append(s).append(" ");
                ajcb = ((jca) (ajcb)).b;
                int l = ajcb.length;
                int j = 0;
                while (j < l) 
                {
                    jcb jcb1 = ajcb[j];
                    if (TextUtils.isEmpty(jcb1.a))
                    {
                        eev.f("Babel", "Empty eventId in ClientMarkEventObservedNotification from the server.");
                    } else
                    {
                        String s1 = jcb1.a;
                        int i1 = g.a(jcb1.c, 0);
                        a.add(new dni(s, s1, i1));
                        b.add(s);
                        stringbuilder.append("msgid: ").append(s1).append(" ");
                    }
                    j++;
                }
            }
            i++;
        }
        c = stringbuilder.toString();
    }

    public String a()
    {
        return c;
    }
}
