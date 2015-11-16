// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class czd extends cyq
{

    public final List a = new ArrayList();
    public List b;
    private String c;

    public czd(ivc ivc1)
    {
        b = new ArrayList();
        StringBuilder stringbuilder = new StringBuilder();
        ivc1 = ivc1.a;
        int k = ivc1.length;
        int i = 0;
        while (i < k) 
        {
            ivw aivw[] = ivc1[i];
            if (((ivv) (aivw)).a == null)
            {
                ebw.f("Babel", "Empty conversationId in ClientMarkEventObservedNotification from the server.");
            } else
            {
                String s = ((ivv) (aivw)).a.a;
                stringbuilder.append("conid: ").append(s).append(" ");
                aivw = ((ivv) (aivw)).b;
                int l = aivw.length;
                int j = 0;
                while (j < l) 
                {
                    ivw ivw1 = aivw[j];
                    if (TextUtils.isEmpty(ivw1.a))
                    {
                        ebw.f("Babel", "Empty eventId in ClientMarkEventObservedNotification from the server.");
                    } else
                    {
                        String s1 = ivw1.a;
                        long l1 = g.a(ivw1.b, 0L);
                        a.add(new czc(s, s1, l1));
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
