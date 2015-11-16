// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class gdj
    implements Runnable
{

    final gfo a;
    final gdg b;

    gdj(gdg gdg1, gfo gfo1)
    {
        b = gdg1;
        a = gfo1;
        super();
    }

    public void run()
    {
        int i = 0;
        for (int j = b.b.size(); i < j; i++)
        {
            if (b.b.get(i) == a)
            {
                String s = a.f();
                gkc.d("vclib", (new StringBuilder(String.valueOf(s).length() + 27)).append("VideoSource ").append(s).append(" already added.").toString());
                return;
            }
        }

        b.b.add(a);
        b.b();
    }
}
