// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class gfx
    implements Runnable
{

    final gio a;
    final gfu b;

    gfx(gfu gfu1, gio gio1)
    {
        b = gfu1;
        a = gio1;
        super();
    }

    public void run()
    {
        int i = 0;
        for (int j = b.b.size(); i < j; i++)
        {
            if (b.b.get(i) == a)
            {
                String s = String.valueOf(a.d());
                gne.a(5, "vclib", (new StringBuilder(String.valueOf(s).length() + 27)).append("VideoSource ").append(s).append(" already added.").toString());
                return;
            }
        }

        b.b.add(a);
        b.b();
    }
}
