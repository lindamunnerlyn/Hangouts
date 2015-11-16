// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

final class baq
    implements gov
{

    final ban a;

    baq(ban ban1)
    {
        a = ban1;
        super();
    }

    public void a(int i, Intent intent)
    {
        boolean flag = true;
        if (i == -1 && intent != null)
        {
            intent = (atg)intent.getParcelableExtra("result_media_attachment");
            Object obj = (aus)hgx.a(ban.e(a), aus);
            ArrayList arraylist = new ArrayList(1);
            arraylist.add(intent);
            ((aus) (obj)).a(arraylist);
            int j;
            if (((atg) (intent)).c == asz.c)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            obj = (bdp)ban.f(a).a(bdp);
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
            ((bdp) (obj)).a(2339, j, i, Integer.valueOf(((atg) (intent)).h));
            return;
        } else
        {
            ban.c(a);
            return;
        }
    }
}
