// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

final class bbg
    implements gtd
{

    final bbd a;

    bbg(bbd bbd1)
    {
        a = bbd1;
        super();
    }

    public void a(int i, Intent intent)
    {
        boolean flag = true;
        if (i == -1 && intent != null)
        {
            atx atx1 = (atx)intent.getParcelableExtra("result_media_attachment");
            avj avj1 = (avj)hlp.a(bbd.e(a), avj);
            ArrayList arraylist = new ArrayList(1);
            arraylist.add(atx1);
            avj1.a(arraylist);
            intent = ava.a(Uri.parse(intent.getStringExtra("photo_url")));
            ava.a(bbd.f(a).getContentResolver(), intent, atx1.c);
            int j;
            if (atx1.c == atp.c)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            intent = (beb)bbd.g(a).a(beb);
            if (i != 0)
            {
                j = 0;
            } else
            {
                j = 1;
            }
            if (i != 0)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 0;
            }
            intent.a(2339, j, i, Integer.valueOf(atx1.h));
            return;
        } else
        {
            bbd.c(a);
            return;
        }
    }
}
