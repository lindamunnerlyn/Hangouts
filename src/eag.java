// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

final class eag extends AsyncTask
{

    final int a;
    final int b;
    final int c = 64;
    final Resources d;
    final android.graphics.BitmapFactory.Options e;

    eag(int i, int j, int k, Resources resources, android.graphics.BitmapFactory.Options options)
    {
        a = i;
        b = j;
        d = resources;
        e = options;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        for (int i = 0; !eaf.c().a(a, b) && i < c; i++)
        {
            if (eaf.d())
            {
                int j = c;
                ebw.b("Babel", (new StringBuilder(55)).append("emoji prefill count=").append(i).append(" prefillSize=").append(j).toString());
            }
            aobj = BitmapFactory.decodeResource(d, com.google.android.apps.hangouts.R.drawable.emoji_u00a9, e);
            if (aobj != null)
            {
                eaf.c().a(((android.graphics.Bitmap) (aobj)));
            }
        }

        return Boolean.valueOf(true);
    }
}
