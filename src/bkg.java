// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.CopyOnWriteArrayList;

final class bkg extends gdy
{

    final bke a;

    bkg(bke bke1)
    {
        a = bke1;
        super();
    }

    protected Object a()
    {
        int i = 0;
        String s = bke.a(a).getSharedPreferences("recentEmoji", 0).getString("recentEmojiKey", null);
        bke.b(a).clear();
        if (s != null)
        {
            String as[] = s.split(",");
            for (int j = as.length; i < j; i++)
            {
                String s1 = as[i];
                if (!"16".equals(s1))
                {
                    int k = Integer.parseInt(s1, bke.b());
                    bke.b(a).add(Integer.valueOf(k));
                }
            }

        }
        return null;
    }

    protected void onPostExecute(Object obj)
    {
        if (bke.c(a) != null)
        {
            bke.c(a).i_();
        }
    }
}
